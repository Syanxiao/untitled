package com.company.云动科技;

public class Two {
    // 单例代码哪里出问题了
//    public test instance = null;
//    public static test getInstance(){
//        if (instance == null){
//            instance = new test();
//            return instance;
//        }
//    }
    // 单例模式要满足三个条件: 1 私有化构造方法 2.创建私有化静态对象 3. 提供公有静态方法获取唯一实例
    // 错误为 1. 构造函数没有私有化 2. 对象非私有静态 3.获取实例的方法中return不应包含在条件中
}
