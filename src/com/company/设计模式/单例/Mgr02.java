package com.company.设计模式.单例;
/*
* 懒汉式
* 虽然达到了按需初始化的目的,但却带来线程不安全的问题
* 需要时创建实例不需要则不创建
 */
public class Mgr02 {
    private static Mgr02 INSTANCE;

    private Mgr02(){}

    public static Mgr02 getInstance(){
        if (INSTANCE == null) {
            INSTANCE = new Mgr02();
        }
        return INSTANCE;
    }
}
