package com.ac.annotation.demo.configures.componentscan;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
/**
 * @author Alan Chen
 * @description
 * @date 2022-08-30
 */
public class MyTest {

    @Test
    public void test(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyComponentScan.class);
        printBeanNames(app);

        /**
         * 运行结果：
         * myComponentScan
         * myComponentScan2
         * myComponentScan3
         * myComponentScan4
         * myComponentScan5
         * myComponentScan6
         * personController
         * person
         * personVO
         * worker
         */
    }

    @Test
    public void test2(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyComponentScan2.class);
        printBeanNames(app);

        /**
         * 运行结果：
         * myComponentScan2
         * myComponentScan
         * myComponentScan3
         * myComponentScan4
         * myComponentScan5
         * myComponentScan6
         * personController
         * person
         * personVO
         * worker
         */

        /**
         * 说明：按理说personVO是不会被扫描出来的，这运行结果里却有personVO，
         * 是因为MyComponentScan4里把personVO扫描出来了，而MyComponentScan2又扫描了MyComponentScan4，所以personVO就出来了。
         * 如果MyComponentScan4注释掉，personVO就不会出来了。
         */
    }

    @Test
    public void test3(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyComponentScan3.class);
        printBeanNames(app);

        /**
         * 运行结果：
         * myComponentScan3
         * personController
         */
    }

    @Test
    public void test4(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyComponentScan4.class);
        printBeanNames(app);

        /**
         * 运行结果：
         * myComponentScan4
         * personVO
         * person
         * worker
         */
    }

    @Test
    public void test5(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyComponentScan5.class);
        printBeanNames(app);

        /**
         * 运行结果：
         * myComponentScan5
         * personController
         */
    }

    @Test
    public void test6(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyComponentScan6.class);
        printBeanNames(app);

        /**
         * 运行结果：
         * myComponentScan6
         */
    }

    private void printBeanNames(ApplicationContext app){
        String[] beanNames = app.getBeanDefinitionNames();
        for(String beanName : beanNames){
            if(!beanName.contains("springframework")){
                System.out.println(beanName);
            }
        }
    }
}
