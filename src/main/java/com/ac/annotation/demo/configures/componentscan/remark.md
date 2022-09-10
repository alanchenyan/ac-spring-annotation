# @ComponentScan 注解

#### 一、功能说明
就跟之前xml 中的`<context:component-scan>`效果一样，注解在某类上时会扫描该类所在包下的所有类。

如果你定义了包路径的话就扫描该路径下的所有组件,记住是组件，不是所有类，比如`@Controller`、`@Service`、`@Repository`这种，或者`@Component`这种。

总的来说就是扫描一些类，将这些类的实例放到IoC容器中，然后我要用的时候不需要new，使用依赖注入即可。
#### 二、要点说明
1、Filter类型：
```java
public enum FilterType {
    ANNOTATION,  //按照注解
    ASSIGNABLE_TYPE, //扫描指定的类型
    ASPECTJ,
    REGEX,   //使用正则表达式
    CUSTOM   //自定义过滤规则
}
```
