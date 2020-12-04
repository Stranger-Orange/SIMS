package com.orange.config;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Orange
 * @create 2020-11-07 11：36
 */

@Configuration
@EnableSwagger2
@EnableSwaggerBootstrapUI
public class Swagger {
    @Bean
    public Docket getUserDocket(){
        return new Docket(DocumentationType.SWAGGER_2)//文档类型（swagger2）
                .apiInfo(apiInfo())//设置包含在json ResourceListing响应中的api元信息
                .select()//启动用于api选择的构建器
                .apis(RequestHandlerSelectors.basePackage("com.orange.controller"))//扫描接口的包
                .paths(PathSelectors.any())//路径过滤器（扫描所有路径）
                .build();
    }
    private ApiInfo apiInfo(){
        //作者信息
        return new ApiInfoBuilder()
                // 页面标题
                .title("学生管理系统")
                .description("学生管理系统")
                .version("1.0.0")
                .build();
    }
}
