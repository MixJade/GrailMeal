package com.grail.common;

import org.springframework.dao.DuplicateKeyException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {

    /**
     * 重复插入
     */
    @ExceptionHandler(DuplicateKeyException.class)
    public Result<String> doDuplicateKeyException() {
        return Result.error("不能重复插入");
    }

    /**
     * 业务异常
     */
    @ExceptionHandler(CustomException.class)
    public Result<String> exceptionHandler(CustomException ex) {
        return Result.error(ex.getMessage());
    }

}