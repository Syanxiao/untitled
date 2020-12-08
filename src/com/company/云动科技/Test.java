package com.company.云动科技;

public class Test {
    public static void main(String[] args){
        int k = 0;
        int ret = ++k + k++ + ++k + k++;
        System.err.println(ret);
//        ret = 8
    }
}
