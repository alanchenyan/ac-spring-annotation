package com.ac.annotation.demo.configures.componentscan;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @author Alan Chen
 * @description 自定义过滤规则
 * @date 2022-09-07
 */
public class MyScanFilter implements TypeFilter {

    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory){
        // 获取当前类所有的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        // 获取当前扫描到的类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        // 获取到当前类的所有资源
        Resource resource = metadataReader.getResource();
        String className = classMetadata.getClassName();
        if (className.contains("Controller")) {
            return true;
        }
        return false;
    }
}
