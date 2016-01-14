import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Input: ");
        int x=in.nextInt();
        int p=0;
        for (int i = 1; i < x; i++) {
            if(x%i==0)
                p=p+1;
        }
        if(p==1)
            System.out.println("Prima");
        else   
            System.out.println("Bukan Prima");
    }
}
