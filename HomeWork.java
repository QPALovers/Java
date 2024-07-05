import java.util.*;
public class HomeWork {
    public static void main(String[] args) {
       /* String[] arr = new String[] {"haha","18"};
        System.out.println(myToString(arr));*/  //模拟实现Arrays.toString
//        System.out.println(Arrays.toString(arr));//用方法输出数组并打印

//        double[] array = new double[] {1.2,10.5,3.3};
//        boolean[] arr = null;  //null的使用
//        System.out.println(Arrays.toString(array) + "  " + Arrays.toString(arr));
    }
    /*
    public static String myToString(String[] arr) {  //模拟实现Arrays.toString
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];
            if (i < arr.length-1) {
                ret += ",";
            }
        }
        ret += "]";
        return ret;
    }*/
//    public static void main1(String[] args) {
//        int[] arr = {1, 2, 3};
//        int[] arr1 = new int[]{4, 5};
//        int[] arr2 = new int[2];
//        arr2[0] = 1;
//        arr2[1] = 5;
//        //System.out.println(arr[0] + " "+ arr[1]);
//        //System.out.println(&arr);
//
//        String[] array = new String[] {"bite","18岁"};  //字符串数组
//        String[] a = print(array);   //字符串数组作返回值
//        System.out.println(Arrays.toString(a));  //以字符串形式输出并打印
//        //swap(arr);
//    }
//    public static String[] print(String[] array) {  //将数组作为参数和返回值类型
//        for (int i = 0; i < array.length; i++) {
//            array[i] = "haha";  //对字符串数组内容进行修改
//            System.out.print(array[i] + " ");
//
//        }
//        return array;
//    }
    //交换两个变量
//    public static void swap (int[] arr) {
//        int tmp = arr[0];
//        arr[0] = arr[1];
//        arr[1] = tmp;
//        System.out.println("==============");
//        System.out.println(arr[0] + " " + arr[1]);
//
//    }

//    public static void print(int[] array) {//写一个方法遍历数组
//        System.out.println(Arrays.toString(array));  //[1, 2, 3]
////        for (int i = 0; i < array.length; i++) {  法一
////            System.out.println(array[i]);
////        }
////        for (int a:array) {  法二
////            //System.out.println(Arrays.toString(array));
////            System.out.print(a + " ");
////        }
//    }
}
//    public static void print (int n ) {
//        if (n > 9) {
//            print(n/10);
//        }
//        System.out.print(n%10+" ");
//    }
//    public static void main(String[] args) {
//        int scan = 1234;
//        print(scan);



//        for (int i = 1; i <=9 ; i++) {
//            for (int j = 1; j <=i ; j++) {
//                System.out.print(i+"*"+j+"="+i*j+" ");
//            }
//            System.out.println(" ");
//        }

        
        //求阶乘和
//        int j = 0;
//        int sum = 0;
//        for (j = 1; j <=5 ; j++) {
//            sum += fac(j);
//        }
//        public static int fac (int k) {
//            int i = 0;
//            int num = 1;
//            for (i = 0; i <=k ; i++) {
//                num *= i;
//            }
//            return num;
//        }
//            int sum = 0;
//            for (int i = 0; i <= 5; i++) {
//                sum += fac(i);
//            }
//            System.out.println(sum);
        //求1/1-1/2+1/3-1/4...
//        int flag = 1;
//        int i = 0;
//        double sum = 0;
//        for (i = 1; i <=100; i++) {
//            sum += (1.0/i)*flag;
//            flag = - flag;
//        }
//        System.out.println(sum);
        //一个数的二进制的奇数项和偶数项并打印
//        int a = 6;
//        int i = 0;
//
////        for (i = 0; i <=31 ; i+=2) {
////            System.out.print((a>>i)&1 );
////        }
////        System.out.println( );
////        for (i = 1; i <30 ; i+=2) {
////            System.out.print(((a>>i)&1)+" ");
////        }
//
//        for (i = 31; i >=1 ; i-=2) {
//            System.out.print((a>>i)&1 );
//        }
//        System.out.println( );
//        for (i = 30; i >=0 ; i-=2) {
//            System.out.print((a>>i)&1 );
//        }

//    public static int fac (int num){
//        int ret = 1;
//        for (int i = 1; i <= num; i++) {
//            ret *= i;
//        }
//        return ret;
//    }

