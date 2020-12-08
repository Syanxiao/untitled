package com.company.云动科技;

    public class First {
    public static void main(String[] args) {
        Integer a = 200;
        Integer b = 200;
        System.err.println(a==b);

        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        System.err.println(str1==str2);
        System.err.println(str1==str3);

        StringBuffer sb1 = new StringBuffer("abc");
        StringBuffer sb2 = new StringBuffer("abc");
        System.err.println(sb1==sb2);
        System.err.println(sb1.equals(sb2));

        System.err.println(str1.equals(sb1));
    }
}
