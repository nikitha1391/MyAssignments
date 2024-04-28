package week1.day1;

public class IsPrimeNumber {
public static void main(String[] args) {
	int num=29;
	int count=0;
	for(int i=1;i<num;i++) {
		if(num%i==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.println("The number is not prime");
	}else {
		System.out.println("The number is prime");
	}
}
}
