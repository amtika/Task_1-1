import java.util.Scanner;

public class IndexPoint {
    public static void main(String[] args) {
        Scanner uts=new Scanner(System.in);
        System.out.println("Nilai Uts : ");
        int x=uts.nextInt();
        Scanner uas=new Scanner(System.in);
        System.out.println("Nilai Uas : ");
        int y=uas.nextInt();
        Scanner quiz=new Scanner(System.in);
        System.out.println("Nilai Quiz : ");
        int z=quiz.nextInt();
        
        double t=((0.35*x)+(0.4*y)+(0.25*z));
        
        if(t>=85)
           System.out.println("Excelient");
        else if((t>=74)&&(t<=84))
            System.out.println("Very Good");
        else if((t>=65)&&(t<=74))
            System.out.println("Good");
        else if((t>=50)&&(t<=64))
            System.out.println("Accepted");
        else
            System.out.println("Failed");
    }
}
