# @Autowired 注解

#### 一、功能说明
用来完成组件的装配，可以结合@Qualifier注解一起使用组件的装配。

#### 二、要点说明
- `@Autowired`为Spring提供的注解，需要导入包`org.springframework.beans.factory.annotation.Autowired`。
- 默认按byType自动注入，是Spring的注解。
- 默认情况下必须要求依赖对象必须存在，如果要允许null值，可以设置它的required属性为false，@Autowired(required = false)。
- 按类型装配的过程中，如果发现找到多个bean，则又按照byName方式进行比对，如果还有多个，则报出异常。

