package com.ac.annotation.demo.configures.import2;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/8
 */
public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        boolean hadEntity = registry.containsBeanDefinition("com.ac.annotation.demo.configures.import2.UserEntity");
        System.out.println("hadEntity=" + hadEntity);

        //假装加了一段逻辑，当然也可以直接注入UserDao
        if (hadEntity) {
            RootBeanDefinition root = new RootBeanDefinition(UserDao.class);
            registry.registerBeanDefinition("userDao", root);
        }
    }
}
