# @Configuration 注解

#### 一、功能说明
把一个类作为一个IOC容器，它的某个方法头上如果注册了`@Bean`，就会作为这个Spring容器中的Bean。以前我们写在配置文件，配置一个个bean，现在使用这个注解即可。

#### 二、要点说明
- @Bean 默认用方法名作为bean的key，如果要自定义key，可以设置@Bean的value值。
- person方法里使用new 对象其实不是真的new出来的，是使用原型模式生成的，所以new几次都是同一实例，只会调用一次，注入拿到的Person都是同一个。