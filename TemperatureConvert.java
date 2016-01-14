import java.util.Scanner;

public class TemperatureConvert {
    public static void main(String[] args) {
        Scanner cel=new Scanner(System.in);
        System.out.println("Celcius = ");
        int c=cel.nextInt();
        
        System.out.println("Konversi ke: ");
        System.out.println("1. Reamur");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        Scanner pil=new Scanner(System.in);
        System.out.println("Masukkan Pilihan: ");
        int k=pil.nextInt();
        switch (k) {
            case 1:
                double r=(c*4/5);
                System.out.println("nilai reamur adalah " + r);
                break;
            case 2:
                double f=((c*9/5)+32);
                System.out.println("nilai fahrenheit adalah" + f);
                break;
            case 3:
                double kel=(c+273);
                System.out.println("nilai kelvin adalah" + kel);
                break;
            
            default:
                throw new AssertionError();
        }
    }
}
