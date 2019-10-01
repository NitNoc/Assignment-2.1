import java.util.Scanner;

public class c  {
    public static void main(String[] args)  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Compounded Yearly");
    
    System.out.print("Principle: ");
    double p = sc.nextDouble();
    System.out.println(p);
    
    System.out.print("Rate: ");
    double r = sc.nextDouble();
    System.out.println(r);
    
    System.out.print("Years: ");
    double n = sc.nextDouble();
    System.out.println(n);
    
    double p1 = Math.pow(1 + r, n);
    double f = p * p1;
    System.out.print("Ammount: $");
    System.out.println(f);
}
}
