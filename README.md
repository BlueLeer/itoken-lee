# itoken-lee
SpringCloud的项目实践

SpringCloud的简单入门,项目包括:

- Eureka：服务注册与发现
- Ribbon：服务发现
- Feign：服务发现，比Ribbon更好用
- Hystrix：熔断器
- Hystrix-Dashboard：熔断器监控板
- Zuul：API网关
- Spring-Config：SpringCloud的注册中心
- Zipkin：分布式追踪系统
- SpringBoot-Admin：SpringBoot模块监控



《Spring Cloud微服务实战》一书：
* Spring Cloud Config:配置管理工具,支持使用Git 存储配置内容,可以使用它实现
应用配置的外部化存储,并支持客户端配置信息刷新、加密/解密配置内容等。
* Spring Cloud Netflix:核心组件,对多个Netflix OSS开源套件进行整合。
    * Eureka:服务治理组件,包含服务注册中心、服务注册与发现机制的实现。
    * Hystrix:容错管理组件,实现断路器模式,帮助服务依赖中出现的延迟和为故障
提供强大的容错能力.
    * Ribbon:客户端负载均衡的服务调用组件。

    * Feign:基于 Ribbon和Hystrix 的声明式服务调用组件.
    * Zuul:网关组件,提供智能路由、访问过滤等功能.
    * Archaius:外部化配置组件
* Spring Cloud Bus:事件,消息总线.用于传播集群中的状态变化政事件,以触发后
续的处理,比如用来动态刷新配置等.
Spring Cloud Cluster:针对 ZooKeeper、Redis、Hazelcast、Consul 的选举算法和通用
状态模式的实现.
* Spring Cloud Cloudfoundry:与Pivotal Cloudfoundry 的整合支持.
* Spring Cloud Consul:服务发现与配置管理工具
* Spring Cloud Stream:通过Redis,Rabbit或者Kafka 实现的消费微服务,可以通过
简单的声明式模型来发送和接收消息。
* Spring Cloud AWS:用于简化整合Amazon Web Service 的组件.
* Spring Cloud Security:安全工具包,提供在Zuul代理中对OAuth2客户端请求的中
继器
* Spring Cloud Sleuth:Spring Cloud应用的分布式跟踪实现,可以完美整合Zipkin.
* Spring Cloud ZooKeeper:基于ZooKeeper的服务发现与配置管理组件.
* Spring Cloud Starters:Spring Cloud的基础组件,它是基于 Spring Boot 风格项目的
基础依赖模块.
* Spring Cloud CLI用于在Groovy中快速创建Spring Cloud用的Spring Boot 
插件.
* .....
