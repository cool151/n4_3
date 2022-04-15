package n43;

import java.util.Scanner;

public class cau1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	int month = sc.nextInt();
	int year =sc.nextInt();
	if(month==1||month==3||month==5||month==7||month==8||month==10||month==12) {
		System.out.println(month +"/"+year+" has 31 days");
	}
	if(month==4||month==6||month==9||month==11) {
		System.out.println(month +"/"+year+" has 30 days");
	}
	if(month==2) {
		if(((year % 4 == 0) && (year % 100 != 0)) || 
		        (year % 400 == 0)) System.out.println(month +"/"+year+" has 29 days");
		else System.out.println(month +"/"+year+" has 28 days");
	}
	}

}
