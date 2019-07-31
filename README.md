# my_spring_heima_2_01

# Spring黑马教程第二天01
## 注解的配置（与xml配置对应）
    xml配置：
    <bean id="userService" class="com.hao.service.UserServiceImpl" scope=""  init-method="" destroy-method="">
            <property name="" ref="" / value=""></property>
     </bean>
### 1，创建对象:<bean></bean>

    Component:
        作用：将当前类对象作为bean存入spring容器中
        属性：value：指定bean的id，默认为当前类的首字母小写类名
        Controller  Service Repository
        作用和属性与Component一致，用于区分三层架构。
        
### 2，注入数据:<property></property>

    Autowired:
        作用：自动按类型注入，只要容器中有一个bean对象类型和要注入的变量类型匹配，就可以注入成功，
        如果Ioc容器中没有任何可以匹配的bean对象，报错
        如果有多个匹配，需要使用的变量名不同，不然报错
        位置：可以放在变量和方法上
        细节：使用注解注入，不必写set方法
    Qualifier：
        作用：在按照类中注入的基础上，再按照名称注入，给类成员注入时不能单独使用依托Atuowired，给方式注入时可以
        属性：
        value：用于指定注入bean的id
    Resource:
        作用：直接按照bean的id注入，可以独立使用
        属性：name：指定bean的id
        上三个注解，只能注入其他bean类型数据，无法注入基本类型和String类型
        集合类型只能通过xml方式注入

    Value：
        作用：用于注入基本类型和String类型
        属性：value：指定数据的值，可以使用spring的EL表达式（SpEL，表达式：$(表达式)）
        
### 3，改变作用范围:<scope></scope>
    Scope：
        作用：指定bean的作用范围
        属性：
        value：singleton(默认)，prototype
     
### 4，生命周期相关：init-method="" destroy-method=""
    PreDestroy:
      指定销毁方法
    PostConstruct:
      指定初始化方法


