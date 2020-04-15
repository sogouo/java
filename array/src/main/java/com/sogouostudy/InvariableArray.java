package com.sogouostudy;


import java.util.Arrays;

public class InvariableArray {
    // tutorial
    /**
     *
     * 如何定义一个数组
     *
     * 数组是一种数据结构, 用来存储同一类型的集合。
     * 通过一个整型下标可以访问数组中的每一个值.
     *
     * 例如, 如果a是一个整型数组, a[i] 就是数组中下标为 i 的
     * 整数。
     *
     * 在声明数组变量时, 需要指出数组类型(数据元素类型紧跟在[])
     *
     * 和数组变量的名字. 下面声明了整型数组a:
     *
     * 注意:
     * 	1、array index out of bounds 访问超出数组长度
     * 	=> 变量.length 获取数组都长度
     * 	2、一旦创建了数组, 就不能再改变它都大小(尽管可以改变每
     * 		一个数组元素).
     *
     * 	3、如果经常需要再运行过程中扩展数组都大小，就应该
     * 		使用另外一种数据结构 -- 数组列表(Array list)
     *
     */
    public static void main(String[] args) {
        // 1、创建数组
        // 声明数组的语法格式: 第一种方式
        // 数组类型[] 变量名字 = new 数组类型[长度]
        // 该语句创建了一个可以存储10个整数的数组.
        // 数组长度不要求是常量: new int[n] 会创建一个长度为
        // n 的数组.
        // 数组类型[] + 变量名 + 初始化数组(new 数组类型)

        int[] a = new int[10];
        String[] languages = new String[3];
        Boolean[] bools = new Boolean[2];
//		// 第二种方式
//		// 数组类型 + 变量名
//		int[] b;
//
//		// 第二种方式
//		// 数组类型 + 变量名称[]
//		String c[];
//

        // 2、赋值: 使用循环给元素赋值

        for (int i = 0; i < 10; i++) {
            a[i] = i; // 给int 行数组每个元素赋值
            // System.out.println(a[i]);
        }
        // 输出一维数组: Arrays.toString(int[] a)
        // 未赋值之前: [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
        // 创建一个数字数组时，所有元素都初始化为0.
        //  boolean 数组都元素会初始化为 false.
        // 对象数组都元素则初始化为一个特殊值null, 这些元素(还)
        // 未存储任何对象
        // 赋值之后: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(Arrays.toString(a));
        // [null, null, null]
        System.out.println("这是测试String 值默认输出: " + Arrays.toString(languages));
        //
        System.out.println("这是测试Boolean 值默认输出: " + Arrays.toString(bools));

        // 3、给String 类型数组赋值
        // String[] languages = new String[3]
        // 创建一个包含10个字符串的数组, 所有字符串都为 null. 如果希望这个数组包含空串,
        // 可以为元素指定空串
        for (int j = 0; j < 3; j++) {
            languages[j] = "";
        }
        System.out.println("空串数组: " + Arrays.toString(languages));
//		System.out.println(c);
        // Arrays.deepToString(arr)
    }
}
