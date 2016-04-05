import java.util.Random;


public class Client {

	
	private static int MAX = 100000000;
	
	public static void linear_time(int [] a) {
		for(int i = 0; i < a.length; ++i) {
			if(i == 0) {
				if(a[i+1] < a[i]) {
					System.out.println("Peak Found at " + i);
					break;
				}
			} else if(i == a.length-1) {
				if(a[i] > a[i-1]) {
					System.out.println("Peak Found at " + i);
					break;
				}
			} else {
				if(a[i] > a[i-1] && a[i] > a[i+1]) {
					System.out.println("Peak Found at " + i);
					break;
				}
			}
		}
	}
	
	public static int log_time(int [] a, int f, int l) {
		int mid = (f+l)/2;
		if(a[mid] < a[mid-1])
			return log_time(a, f, mid-1);
		if(a[mid] < a[mid+1])
			return log_time(a, mid+1, l);
		
		return mid;
	}
	
	public static void main(String args[]) {
		int [] a = new int [MAX];
		Random r = new Random();
			
		for(int i = 0; i < MAX; ++i)
			a[i] = 1 + r.nextInt(1000);
		
//		for(int i = 0; i < a.length; ++i)
//			System.out.print(a[i] + " ");
//		System.out.println();
		
		linear_time(a);
		System.out.println("Peak Found at " + log_time(a, 0, MAX-1));
	}
}
