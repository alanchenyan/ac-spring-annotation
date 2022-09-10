package com.ac.annotation.demo.configures.import2;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/8
 */
public class MyImportSelector implements ImportSelector {

    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.ac.annotation.demo.configures.import2.UserComponent"};
    }
}
