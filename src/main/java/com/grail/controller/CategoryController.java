package com.grail.controller;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.grail.common.Result;
import com.grail.entity.Category;
import com.grail.service.ICategoryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * <p>
 * 菜品及套餐分类 前端控制器
 * </p>
 *
 * @author MixJade
 * @since 2022-11-21
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    private static final Logger log = LoggerFactory.getLogger(CategoryController.class);
    @Resource
    private ICategoryService categoryService;

    /**
     * 新增分类
     */
    @PostMapping
    public Result<String> save(@RequestBody Category category) {
        log.info("category:{}", category);
        categoryService.save(category);
        return Result.success("新增分类成功");
    }

    /**
     * 分页查询
     */
    @GetMapping("/page")
    public Result<Page<Category>> page(int page, int pageSize) {
        //分页构造器
        Page<Category> pageInfo = new Page<>(page, pageSize);
        //条件构造器
        LambdaQueryWrapper<Category> queryWrapper = new LambdaQueryWrapper<>();
        //添加排序条件，根据sort进行排序
        queryWrapper.orderByAsc(Category::getSort);
        //分页查询
        categoryService.page(pageInfo, queryWrapper);
        return Result.success(pageInfo);
    }

    /**
     * 根据id删除分类
     */
    @DeleteMapping
    public Result<String> delete(Long id) {
        log.info("删除分类，id为：{}", id);
//        categoryService.removeById(id);
//        categoryService.remove(id);
        return Result.success("分类信息删除成功");
    }

    /**
     * 根据id修改分类信息
     */
    @PutMapping
    public Result<String> update(@RequestBody Category category) {
        log.info("修改分类信息：{}", category);
        categoryService.updateById(category);
        return Result.success("修改分类信息成功");
    }
}
