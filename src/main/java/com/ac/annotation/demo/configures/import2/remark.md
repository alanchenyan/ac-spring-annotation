# @Import 注解

#### 一、功能说明
导入外部资源，相当于手动指定第三方资源，把其实例加载到IOC容器中。

#### 二、要点说明
- 导入的类必须存在无参的构造方法
- @Import导入的组件命名是类的全限定名
- 通过@Bean导入的就是方法名

#### 三、@Import导入的三种类型
1、导入类
  - A、导入普通类（4.2版本之后）
  - B、导入带有@Configuration的配置类（4.2 版本之前只可以导入配置类）

2、ImportSelector的实现。
3、ImportBeanDefinitionRegistrar的实现。

