//package com.jhcoder.top.config;
//
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
//@Component
//@Configuration
//public class MvcConfig implements WebMvcConfigurer {
//
//    @Value("${spring.resources.static-locations}")
//    private String filePath;  //获取上传地址
//
//
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        String[] split = filePath.split(",");
////        for (int i = 0; i < split.length; i++) {
////            System.out.println(split[i]);
////        }
//        registry.addResourceHandler("/**").addResourceLocations(split);
//
//    }
//}