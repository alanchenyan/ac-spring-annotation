# @Scope 注解

#### 一、功能说明
该注解用于指定作用域，用在类上。

#### 二、要点说明
Scope有四种范围：
- singleton：单例，默认scope
- prototype：原型，多例，每次都会是新的一个对象
- request：主要用于web模块，同一次请求值创建一个实例
- session：主要用于web模块， 同一个session只创建一个实例