import java.io.*;

public class CodeEx1
{
      public static void checkNumber (int number)
     {
             if (number>0)
                    System.out.println("Positive");
             else if(number<0)
                    System.out.println("Negetive");
             else
                    System.out.println("Number entered is 0");
       }
      
     public static void main(String args[])
     {
             checkNumber(2);
             checkNumber(-3);
             checkNumber(0);
     }
}