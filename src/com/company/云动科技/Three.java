package com.company.云动科技;

public class Three {
    public static void main(String[] args) {
        int i = get();
        System.out.println(i);
        // 输出结果为 数组越界 1
    }
    public static int get(){
        int i = 0;
        try {
            String[] array = new String[0];
            String str = array[1];
            return ++i;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组越界");
        } catch (Exception e){
            System.out.println("系统异常");
            return ++i;
        }finally {
            return ++i;
        }
    }
}
