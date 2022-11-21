package com.grail;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * 通过MP来逆向生成代码
 * 没事不要动
 */
public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/grail?useSSL=true", "root", "root")
                .globalConfig(builder -> {
                    builder.author("MixJade")
                            .disableOpenDir()
                            .outputDir("./src/main/java"); // 指定输出目录
                }).packageConfig(builder -> {
                    builder.parent("com.grail")
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "./src/main/resources/com/grail/mapper"));
                }).templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .strategyConfig(builder -> {
                    builder.entityBuilder().enableFileOverride()
                            .mapperBuilder().enableFileOverride().enableMapperAnnotation()
                            .serviceBuilder().enableFileOverride()
                            .controllerBuilder().enableFileOverride().enableRestStyle();
                })
                .execute();
    }
}
