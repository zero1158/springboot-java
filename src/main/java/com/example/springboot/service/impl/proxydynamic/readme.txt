实现动态代理的步骤
1.创建接口,定义目标类要完成的功能
2.创建目标类实现接口
3.创建InvocationHandler接口实现类,在invoke()方法中完成代理类的功能
    a.调用目标类方法
    b.增强功能
4.使用Proxy类中的静态方法Proxy.newProxyInstance(),创建代理类对象,并把返回值转为接口类型