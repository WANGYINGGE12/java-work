package lianxi;

import java.util.Scanner;

public class T {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sim s=new Sim();
		Scanner sc=new Scanner(System.in);
		System.out.println("�����붯�����");
		int k=sc.nextInt();
		A a[]=new A[k];
		System.out.println(" ���ͣ�1-----��  2-----è");
		for(int i=0;i<a.length;i++) {
			System.out.println("�����붯������");
			int t=sc.nextInt();
			if(t==1) {
				System.out.println("�����빷������");
				String name=sc.next();
				System.out.println("���ٱ�עһ������");
				int stic=sc.nextInt(); 
				a[i]=new G(name,stic);
			}
			else if(t==2) {
				System.out.println("������è������");
				String name=sc.next();
				System.out.println("���ٱ�עһ������");
				int stic=sc.nextInt(); 
				a[i]=new C(name,stic);
			}
			else {
				System.out.println("����������");
				i--;
			}
		}
		System.out.println("���ֻ���ù��У��밴1 ");
		System.out.println("���ֻ����è�У��밴2 ");
	//	System.out.println("���������һ��У��밴3 ");
		int l=sc.nextInt();
		
		for(int i=0;i<a.length;i++) {
			if(l==a[i].stic)
			s.playsound(a[i]);
			
		}

	}

}
