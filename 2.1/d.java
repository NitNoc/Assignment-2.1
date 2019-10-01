import java.util.Scanner;

public class d  {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        System.out.println("D6");
        
        int n = 0;
        double rng = 0;
        while(n < 6)    {
           rng = Math.random();
           if(rng <= 0.16)   {
               rng = 1;
            }
           if(rng > 0.16 && rng <= 0.32)   {
               rng = 2;
            }
           if(rng > 0.32 && rng <= 0.48)   {
               rng = 3;
            }
           if(rng > 0.48 && rng <= 0.64)   {
               rng = 4;
            }
           if(rng > 0.64 && rng <= 0.8)   {
               rng = 5;
            }
           if(rng > 0.8 && rng <= 1)   {
               rng = 6;
            }
           System.out.println(rng);
           n++;
        }
    }
}
