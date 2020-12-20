关于动态代理的整理 --->基于反射机制
1.什么是动态代理
    就是一种基于反射机制动态创建对象的能力,创建的是代理类对象,而不用自己创建类文件(.java)
    动态:指在程序执行是,调用jdk提供的方法才能创建代理类对象
    注意:必须有接口,目标类必须实现接口才能创建代理类对象

2.动态代理能做什么
    可以在不改变原功能的前提下,在代码中增强自己的功能代码
    例:项目中有一个别人写好的功能a,你可以使用,但是该功能不能完全实现你的需求,你需要在功能a上增加自己的代码
        可以用代理的方式在调用功能a的同时增加自己的代码

动态代理的实现:
		1.jdk动态代理:使用java反射包中的类和接口实现动态代理功能
						反射包:java.lang.reflect,里面有三个类:InvocationHandler,Method,Proxy
		2.cglib动态代理(了解):cglib是一个第三方的工具库用来创建代理对象,其原理是继承,通过继承目标类创建它的子类
							  在子类中重写父类的同名方法,实现功能的修改,要求目标类,方法不能是final,常用于框架中

3.jdk动态代理:
    实现:反射包:java.lang.reflect,里面有三个类:InvocationHandler,Method,Proxy
    a>.InvocationHandler 接口(调用处理器):就一个方法invoke()
        invoke():表示代理对象要执行的功能代码,代理类要执行的方法就在这里
                1)调用目标类的对应方法,执行其功能
                2)调用目标类方法时对其进行功能增强

        方法原型:public Object invoke(Object proxy, Method method, Object[] args)throws Throwable;
        参数分析:
                Object proxy:jdk创建的代理对象
                Method method:目标类中的方法,jdk提供的method对象
                Object[] args:目标类中方法的参数,jdk提供

        该接口表示: 你的代理要干什么
                    创建类实现InvocationHandler接口,重写invoke()方法,把原来静态代理类中要完成的功能写在这里

    b>.Method类 表示方法,就是目标类中的方法
        作用:通过Method可以执行某个目标类的方法
            method.invoke(目标对象,方法参数);

        说明:method,invoke()就是用来执行目标方法的,等用于静态代理中的:
             //向厂家发送订单,厂家发货给商家,获得厂家的出厂价
             int price = kingsdFactory.sellUsb(amount);

    c>.Proxy类:核心对象,用来创建代理类对象,之前只用的都是类似new/构造方法等,现在使用的是Proxy
        方法:静态方法-->Proxy.newProxyInstance()
        作用:创建代理类对象,类似于(这里因为使用了@Service注解,是在程序运行时自己加载的)
            @Autowired
            private ToshibaFactoryImpl toshibaFactory;

        方法原型:public static Object newProxyInstance(ClassLoader loader,
                                                       Class<?>[] interfaces,
                                                       InvocationHandler h)
         参数分析:
            ClassLoader loader:类加载器,负责向内存中加载对象,使用反射获取对象的ClassLoader
            Class<?>[] interfaces:目标对象实现的接口->通过反射获取
            InvocationHandler:我们自己在a>步骤中生成的,代理类要完成的功能

            该方法的返回值就是------>代理对象







