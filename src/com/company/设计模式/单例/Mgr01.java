package com.company.设计模式.单例;
/*
* 饿汉式
* 类加载到内存后,就实例化一个单例,jvm保证线程安全
* 简单实用,推荐使用!
* 唯一缺点: 不管用到与否,类加载时就完成实例化
* (话说你不用的,你转载它干啥)
* 每次都创建实例化
*/
public class Mgr01 {
    private final static Mgr01 INSTANCE = new Mgr01();

    private Mgr01() {}

    public static Mgr01 getInstance(){return INSTANCE;}

    public static void main(String[] args) {
        Mgr01 m1 = Mgr01.getInstance();
        Mgr01 m2 = Mgr01.getInstance();
        System.out.println(m1 == m2);
    }
}
