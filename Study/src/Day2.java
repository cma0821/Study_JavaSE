public class Day2 {
/**
 * 方法的重载
 * 重载就是在相同的类中有相同的方法名，但是参数的类型不同
 * 方法重载的规则： 方法名称必须相同
 * 参数列表必须不同（参数个数不同，参数类型不同，参数的排列顺序不同）
 * 方法的返回类型可以相同也可以不相同
 * 仅仅返回类型不同，不足以成为方法的重载
 * */

/**
 * 命令行传参：有时候你希望运行一个程序时候在给他传递消息，这就靠命令行参数给main()函数实现的
 * 可变参数：test(int...i)
 * 递归：就是自己调用自己 例：
 * public void test(){
 *     test();
 * }
 * 递归包括两个方面：递归头：什么时候不调用自身方法，如果没有头，将陷入死循环
 *               递归体：什么时候需要调用自己
 * */
public static void main(String[] args){
 System.out.println(f(3));

/**
 * 数组:
 * */
    int sum = 0;
    int[] nums = {1,2,3,4,5,6,7,8,9,10};
    for (int i=0;i<nums.length;i++){

        sum =  sum+nums[i];

    }
    System.out.println(sum);
//冒泡排序法
//    1.比较数组中两个相邻的元素如果第一个元素比第二个大，那他们交换位置
//    2.每一次比较都会产生一个最大，或者最小的数字
//    3.下一轮则可以少一轮排序
//    4.依次循环，直到结束

int[] a ={1,43,23,64,3,18,73};
    ptintArry(sort(a));

}

//利用递归原则计算阶乘
public static int f(int n){
    if(n==1){
        return 1;
    }else {
       return n*f(n-1);
    }
}

public static int[] sort(int[] a){
    int tem =0;
    for (int i=0;i<a.length-1;i++){
        for (int j=0;j<a.length-1-i;j++){
            if(a[j+1]>a[j]){
              tem= a[j];
              a[j]=a[j+1];
              a[j+1]=tem;
            }
        }
    }
    return a;
}

public static void ptintArry(int[] a){
    for (int i=0;i< a.length;i++){
        System.out.print(a[i]+", ");
    }
}


}
