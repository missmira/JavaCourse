package chapter2;

public class ex31 {
	public static void main (String[] args) {
	
		System.out.println("Number\tsquare\tcube");//print headers
		for(int i = 0; i <= 10; i++) {
			for(int j = 0; j < 3; j++) {
				if (j==0)
					System.out.print(i + "\t");
				if (j==1)
					System.out.print((i * i) + "\t");
				if (j==2)
					System.out.print((i*i*i) + "\t");
			}	
		System.out.print("\n");
		}
	}
}
