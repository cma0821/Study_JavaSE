import java.util.Scanner;

public class Day1 {
//    注释，标识符，关键字
//    数据类型    基本类型：整数类型，byte,short,int,long  浮点型：float,double, 字符类型：char, boolean类型
//              引用类型：类，接口，数组
//    类型转换
//    变量，常量
//    运算符
//    包机制，JavaDoc ——java的帮助文档
//    return的作用之一，结束该方法

    public static void main(String[] args){

//        Scanner获取键盘输入
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()){
            String str = scanner.next();
        }
        scanner.close();

        //for 循环 打印9*9乘法表
        for(int i =1; i<10;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+i+"="+(i*j)+"\t");
            }
            System.out.println();
        }
    }

/**
 *
 * */


}
