# @Lazy 注解

#### 一、功能说明
延时初始化

#### 二、要点说明
- 默认不延时加载，如果加上此注解则使当前类延时加载。
- 延时加载只针对单例Bean（即@Scope为singleton的Bean）起作用。
- 加上此注解后容器启动时不创建对象，调用对象的功能时才创建对象。

