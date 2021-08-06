python3 爬虫-[崔庆才](https://cuiqingcai.com/5052.html)



S crapy

- [官网](https://scrapy.org/ )
- [github](https://github.com/scrapy/scrapy)
- [知乎](https://zhuanlan.zhihu.com/p/40650078)
- 关键字
  - python3 爬虫框架
- [github spider](https://github.com/search?q=spider)
- [python-spider](https://github.com/Jack-Cherish/python-spider)
- [spyder](https://github.com/spyder-ide/spyder)
- [Python3-Spider-Practice](https://github.com/TRHX/Python3-Spider-Practice)

Java 项目

- ​	[PassJava-Platfrom](https://github.com/Jackson0714/PassJava-Platform)
  - 一款面试刷题的 Spring Cloud 开源系统。零碎时间利用小程序查看常见面试题，夯实Java基础。 该项目可以教会你如何搭建SpringBoot项目，Spring Cloud项目。 采用流行的技术，如 SpringBoot、MyBatis、Redis、 MySql、 MongoDB、 RabbitMQ、Elasticsearch，采用Docker容器化部署。
- [JavaKeeper](https://github.com/Jstarfish/JavaKeeper)
  - ✍️ Java 工程师必备架构体系知识总结：涵盖分布式、微服务、RPC等互联网公司常用架构，以及数据存储、缓存、搜索等必备技能
- [spring-tutorial](https://github.com/dunwu/spring-tutorial)
  - 📖 Spring Framework 教程
- [spring-boot-demo](https://github.com/xkcoding/spring-boot-demo)
  - 该项目已成功集成 actuator(监控)、admin(可视化监控)、logback(日志)、aopLog(通过AOP记录web请求日志)、统一异常处理(json级别和页面级别)、freemarker(模板引擎)、thymeleaf(模板引擎)、Beetl(模板引擎)、Enjoy(模板引擎)、JdbcTemplate(通用JDBC操作数据库)、JPA(强大的ORM框架)、mybatis(强大的ORM框架)、通用Mapper(快速操作Mybatis)、PageHelper(通用的Mybatis分页插件)、mybatis-plus(快速操作Mybatis)、BeetlSQL(强大的ORM框架)、upload(本地文件上传和七牛云文件上传)、redis(缓存)、ehcache(缓存)、ema…
- [[cim](https://github.com/rickiyang/cim)](https://github.com/rickiyang/cim)
  - Netty 学习的相关示例
  - [[Go orm框架gorm学习](https://www.cnblogs.com/rickiyang/p/11074162.html)](https://www.cnblogs.com/rickiyang/p/11074162.html)

Go

- [dev go](https://dev.to/t/go/)



TypeScript

- [官方文档](https://www.tslang.cn/)
- [React](https://react.docschina.org/)
  - [dev](https://dev.to/t/react)
- React
- [React Native Github](https://github.com/facebook/react-native)











微服务

- [大数据开发实战系列-《Spring Cloud 微服务分布式架构开发实战》-案例及作业答案下载](https://www.ekgc.cn/bbs/post/233855.shtml)





Java 面试题/java 基础面试题

- [Java基础知识面试题（2020最新版](https://blog.csdn.net/ThinkWon/article/details/104390612)
- [2w 字长文！手撸一套 Java 基础面试题](https://xie.infoq.cn/article/3d161e7b8229892184160ba07)
- [用10天时间整理Java基础面试题，2021年还怕拿不到offer吗](https://juejin.cn/post/6909369974184378382)
- [Java核心技术面试精讲](https://time.geekbang.org/column/intro/82)
  - [第25讲 | 谈谈JVM内存区域的划分，哪些区域可能发生 OutOfMemoryError?](https://hyperj.net/talk.growth/geekbang/java-core-technology/)
  - [java核心技术-（总结自杨晓峰-java核心技术36讲](https://msd.misuland.com/pd/11860979435483422)
  - [可能是国内第一篇全面解读 Java 现状及趋势的文章](https://zhuanlan.zhihu.com/p/86928563)
  - [[杨晓峰：开发者其实不太需要关注 Java 收不收费](https://www.oschina.net/question/3820517_2303301)](https://www.oschina.net/question/3820517_2303301)
  - [Java核心技术36讲 杨晓峰](http://weikeqin.com/2019/08/18/java-core-technology-36-lectures/)



算法

- [06 | 链表（上）：如何实现LRU缓存淘汰算法?](https://time.geekbang.org/column/article/41013)
- [07 | 链表（下）：如何轻松写出正确的链表代码？](https://time.geekbang.org/column/article/41149)



Java 库

- Apache

  - [commons-text](https://github.com/apache/commons-text)

    > Mirror of Apache Commons Text
    >
    > Apache Commons Text is a library focused on algorithms working on strings.
    >
    > Apache Commons Text是一个专注于字符串算法的库。

    - [Doc](https://commons.apache.org/proper/commons-text/apidocs/)
    - [Commons Text](https://commons.apache.org/proper/commons-text/)
    - [Mvnrepository](https://mvnrepository.com/artifact/org.apache.commons/commons-text)
    - lastest version: 1.9
    - [[TEXT-186] StringSubstitutor map constructor throws NPE on 1.9 with null](https://github.com/apache/commons-text/commit/3c4d37d68a18aa5c93b95f27645c7589c58e54e8)







<span style="color:#FF4500; font-size: 1.2rem">针对 vue 多页面刷新找不到地址基本配置如下</span>

```nginx
server {
    listen 80;
    server_name project_name_domain_or_ip;
    root /project_path_url/;
    index index.html index.htm;
    location / {
        try_files $uri $uri/ /index.html;
    }
}
```



