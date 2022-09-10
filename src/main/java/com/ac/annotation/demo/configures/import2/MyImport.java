package com.ac.annotation.demo.configures.import2;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author Alan Chen
 * @description
 * @date 2022/9/8
 */
@Import({UserEntity.class,UserConfig.class,MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
@Configuration
public class MyImport {

}
