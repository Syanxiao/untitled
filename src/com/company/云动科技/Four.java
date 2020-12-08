package com.company.云动科技;

public class Four extends TestA {
    public static void main(String[] args) {
        new Test();
    }
    public void Test(){
        System.out.println("Test");
    }
    {
        System.out.println("I'm Test class");
    }
    static {
        System.out.println("static Test");
    }
}
// 输出结果为 static TestA , static Test
class TestA{
    public TestA(){
        System.out.println("TestA");
    }
    {
        System.out.println("I'm TestA class");
    }
    static {
        System.out.println("static TestA");
    }
}
