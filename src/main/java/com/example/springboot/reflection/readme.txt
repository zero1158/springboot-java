1:反射:框架的设计灵魂
	框架:半成品软件,可在框架的基础上进行开发,简化编码
	反射:将类的各个组成部分封装成其他对象,这就是反射机制
	优点:
		1.可以在程序运行过程中操作这些对象
		2.可以解耦,提高程序的的可扩展性

2:获取class对象的方式:
	1.Class.forName("全类名"),将字节码文件加载进内存,返回class对象
		多用于配置文件,将类名定义在配置文件中,读取对象,加载类
	2.类名.class:通过类名的属性class获取
		多用于参数传递
	3.对象.getClass(),getClass方法在Object类中定义着

注意:同一个字节码文件(*.class)在一次程序运行中只会被加载一次,无论通过哪种方式获取的Class对象都是同一个

3:Class类对象的功能
    1.获取成员变量们
        Field[] getFields()
        Field getField(String name)
        Field[] getDeclaredFields()
        Field getDeclaredField(String name)
    2.获取构造方法们
        Constructor<?>[] getConstructors()
        Constructor<T> getConstructor(类<?>... parameterTypes)
        Constructor<?>[] getDeclaredConstructors()
        Constructor<T>[] getDeclaredConstructor(类<?>... parameterTypes)
    3.获取成员方法们
        Metgod[] getMethods()
        Metgod[] getMethod(String name,类<?> parameterTypes)
        Metgod[] getDeclaredMethods()
        Metgod[] getDeclaredMethod(String name,类<?> parameterTypes)
    4.获取类名
        String getName()

4.操作
    1.Field:成员变量
        设置值:
            void set(Object obj,Object value)
        获取值:
            get(Obejct)
        忽略访问权限修饰符的检查:
            setAccessible(true)-->暴力反射
    2.Constructor
        创建对象:
            T newInstance(Object... initargs)
            如果使用空参构造方法创建对象,操作可以简化:Class对象的newInstance()方法
    3.Method
        执行方法:
            Obejct invoke(Object obj,Object...args)
        获取方法名称:
            String getName()

案列:
写一个"框架",在不改变该类任何代码的前提下,可以帮我们创建任意类对象,并执行其中任意方法
    实现:配置文件,反射
    步骤:
        1.将需要创建的对象的全类名和需要执行的方法定义在配置文件中
        2.在程序中加载读取配置文件
        3.使用反射技术来加载类文件进内存
        4.创建对象
        5.执行方法