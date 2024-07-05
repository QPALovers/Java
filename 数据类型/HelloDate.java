import java.util.Scanner;

public class HelloDate {
	public static void main (String [] args ) {
		
		/*
	    求n个阶乘的和       ？？？？
		Scanner scan = new Scanner (System.in);
		int n = scan.nextInt();
		int i = 0;
		int sum = 0;
		for (i=1;i<n;i++) {
			int num = 1;
			int a1 = 1;
			for (a1=1;a1<i;a1++) {
				num *= a1;
			}
			sum += num;
		}
		System.out.println(sum);  */
	}
}
	/*
	//循环判断闰年
		Scanner scan = new Scanner (System.in);
		while (true) {
			int year = scan.nextInt();
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("是闰年！");
			}
			else {
				System.out.println("不是闰年！");
			}
		}
	判断闰年
	Scanner scan = new Scanner (System.in);
		int year = scan.nextInt();
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("是闰年！");
		}
		
	//输入数字和字符串
	Scanner scan = new Scanner (System.in);
		int a = scan.nextInt();
		System.out.println(a);
		
		String str = scan.nextLine();
		String str1 = scan.next();
	    System.out.println(str1);
	*/
	
	/*//交换两个变量
	public static void main (String [] args ) {
		int a = 1;
		int b = 2;
		int c = a;
		a = b;
		b = c;
		System.out.println(a + " " + b);
	}*/
	
	
	/* void mian (int a,int b) {    写法错误
		int c = a;
		a = b;
		b = c;
	}*/
	
	/*
	//算术运算符
	
	public static void main2 (String[] args ) {
		System.out.println(1/2);
		//System.out.println(2/0);  //无法运行
		System.out.println(1/2.0);
		System.out.println(2%1.5);
		System.out.println(1%2);
		System.out.println(11.5%2.0);
		
		int a = 10;
		a += 1;
		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		int b = ++a;
		System.out.println(b + " " + a);
		System.out.println("b=" + b);
	
	}
	
	
	public static void main1 (String [] args) {
		
		//整型
		int a = 100;
		System.out.println(a);  //换行
		System.out.print(a);   //不换行
		System.out.printf("%d\n",a);  //C式打印   所以 ln 相当于 \n ?
		
		//打印最大值和最小值
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		//长整型
		long b = 12L;
		System.out.println(b);
		
		//
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		
		//双精度浮点型
		double c = 1.1;
		System.out.println(c);
		
		//
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		
		//单精度浮点型
		float d = 1.2f;
		System.out.println(d);
		
		//
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		
		//字符型
		char q = 'a';
		System.out.println(q);
		
		//
					  System.out.println(Character.MAX_VALUE);//没有显示
					  System.out.println(Character.MIN_VALUE);
		
				  //字符串类型
		
		
		//
		byte w = 2;
		System.out.println(w);
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		
		//短整型
		short e = 3;
		System.out.println(e);

		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		
		
		//
		boolean r = false;
		System.out.println(r);
	
	}*/