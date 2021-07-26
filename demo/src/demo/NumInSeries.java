package demo;

import java.util.Scanner;

public class NumInSeries {
public static int num(int n) {
	int m=0;
	int p=0;
	int a=0;
	for(int i=3;i<=n;i++) {
		if(i%2!=0) {
			m=m+7;
			a=m;
		}
		else {
			p=p+6;
			a=p;
		}
	}
	if(n==1||n==2) {
		a=0;
	}
	return a;
}
public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int num=s.nextInt();
	System.out.println(num(num));
}
}
