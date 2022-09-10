# 生命周期控制

#### 一、四种方式
##### 1.1 方式一
`@Bean(initMethod = "start",destroyMethod = "stop")`

##### 1.2 方式二
实现接口InitializingBean, DisposableBean

##### 1.3 方式三
在方法上使用生命周期注解：
- @PostConstruct用于指定初始化方法（用在方法上）
- @PreDestroy用于指定销毁方法（用在方法上）
- @DependsOn定义Bean初始化和销毁的顺序

##### 1.4 方式四
实现接口BeanPostProcessor