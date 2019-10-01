import java.util.Scanner;

class b  {
    public static void main(String[] args)    {
        Scanner sc = new Scanner(System.in);
        System.out.println("DistForumla");
        //X1------------------------------------
        System.out.print("x1: ");
        double x1 = sc.nextDouble();
        System.out.println(x1);
        //y1-------------------------------------
        System.out.print("y1: ");
        double y1 = sc.nextDouble();
        System.out.println(y1);
        //X2------------------------------------
        System.out.print("x2: ");
        double x2 = sc.nextDouble();
        System.out.println(x2);
        //Y2----------------------------------
        System.out.print("y2: ");
        double y2 = sc.nextDouble();
        System.out.println(y2);
        
        System.out.print("Dist: ");
        double f = Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
        System.out.println(f);
    }
}
