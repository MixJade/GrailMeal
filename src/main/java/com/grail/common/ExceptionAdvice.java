package com.grail.common;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

    @ExceptionHandler(DuplicateKeyException.class)
    public Result<String> doDuplicateKeyException() {
        return Result.error("不能重复插入");
    }

}