package lianxi;

import java.util.Scanner;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sim s=new Sim();
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入动物个数");
		int k=sc.nextInt();
		A a[]=new A[k];
		System.out.println(" 类型：1-----狗  2-----猫");
		for(int i=0;i<a.length;i++) {
			System.out.println("请输入动物类型");
			int t=sc.nextInt();
			if(t==1) {
				System.out.println("请输入狗的名字");
				String name=sc.next();
				System.out.println("请再标注一下类型");
				int stic=sc.nextInt(); 
				a[i]=new G(name,stic);
			}
			else if(t==2) {
				System.out.println("请输入猫的名字");
				String name=sc.next();
				System.out.println("请再标注一下类型");
				int stic=sc.nextInt(); 
				a[i]=new C(name,stic);
			}
			else {
				System.out.println("请重新输入");
				i--;
			}
		}
		System.out.println("如果只想让狗叫，请按1 ");
		System.out.println("如果只想让猫叫，请按2 ");
	//	System.out.println("如果让他们一起叫，请按3 ");
		int l=sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(l==a[i].stic)
			s.playsound(a[i]);
			
		}

	}

}
