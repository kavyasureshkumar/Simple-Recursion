package recursion;

public class Power {
public static float power(int n, int p) {
	if(p==0) {
		return 1;
	}
	else if(p > 0 && p%2 == 0) {
		float nb2 = power(n,p/2);
		return nb2*nb2;
	}
	else if(p > 0 && p%2 != 0) {
		return n*power(n,p-1);
	}
	else {
		return 1/power(n,-p);
	}
}
public static void main(String[] args) {
	System.out.println(power(2,-2));
}
}
