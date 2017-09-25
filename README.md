# Spring Cloud Study

这是一个 Spring Boot 的Demo学习型项目。

Spring Cloud主要的组件，以及它的访问流程：

* 1、外部或者内部的非Spring Cloud项目都统一通过API网关（Zuul）来访问内部服务.
* 2、网关接收到请求后，从注册中心（Eureka）获取可用服务
* 3、由 Ribbon 进行均衡负载后，分发到后端的具体实例
* 4、微服务之间通过 Feign 进行通信处理业务
* 5、Hystrix 负责处理服务超时熔断
* 6、Turbine 监控服务间的调用和熔断相关指标


## 服务注册与发现

* [spring-cloud-eureka](https://github.com/jeikerxiao/SpringCloudStudy/tree/master/spring-cloud-eureka)
* [spring-cloud-eureka2](https://github.com/jeikerxiao/SpringCloudStudy/tree/master/spring-cloud-eureka2)
* [spring-cloud-eureka3](https://github.com/jeikerxiao/SpringCloudStudy/tree/master/spring-cloud-eureka3)
* spring-cloud-consul
* spring-cloud-zookeeper

## 服务消费

* [spring-cloud-ribbon](https://github.com/jeikerxiao/SpringCloudStudy/tree/master/spring-cloud-ribbon)
* [spring-cloud-feign](https://github.com/jeikerxiao/SpringCloudStudy/tree/master/spring-cloud-feign)

## 断路器

* [spring-cloud-ribbon-hystrix](https://github.com/jeikerxiao/SpringCloudStudy/tree/master/spring-cloud-ribbon-hystrix)
* [spring-cloud-feign-hystrix](https://github.com/jeikerxiao/SpringCloudStudy/tree/master/spring-cloud-feign-hystrix)

## 服务监控

* spring-cloud-turbine


## 服务网关

* [spring-cloud-zuul](https://github.com/jeikerxiao/SpringCloudStudy/tree/master/spring-cloud-zuul)

## 配置中心

* [spring-cloud-config](https://github.com/jeikerxiao/SpringCloudStudy/tree/master/spring-cloud-config)
* [spring-cloud-config-eureka](https://github.com/jeikerxiao/SpringCloudStudy/tree/master/spring-cloud-eureka)

## 消息总线

* [spring-cloud-rabbit](https://github.com/jeikerxiao/SpringCloudStudy/tree/master/spring-cloud-rabbitmq)
* [spring-cloud-kafka](https://github.com/jeikerxiao/SpringCloudStudy/tree/master/spring-cloud-kafka)

## 服务跟踪

* [spring-cloud-zipkin](https://github.com/jeikerxiao/SpringCloudStudy/tree/master/spring-cloud-zipkin)
