import java.util.Scanner;

class a  {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Radius to Area Calculator");
        double r = sc.nextDouble();
        
        Double a = Math.PI * Math.pow(r, 2);
        System.out.print("Area: ");
        System.out.println(a);
    }
}
