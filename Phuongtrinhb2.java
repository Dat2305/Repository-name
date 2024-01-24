import java.util.Scanner;

public class Phuongtrinhb2 {
  public static void main(String[] args) {
     double a, b, c, x1, x2, A;
    try (Scanner dtiput = new Scanner(System.in)){
      System.out.print("Nhap a:");
      a = dtiput.nextDouble();
      System.out.print("Nhap b:");
      b = dtiput.nextDouble();
      System.out.print("Nhap c:");
      c = dtiput.nextDouble();
    }
    A = Math.pow(b, 2) - 4*a*c;
    if (A < 0) {
      System.out.print("vô Nghiệm");
    } else {
      System.out.println("A =" + A );
      x1 = (-b + Math.sqrt(A)) / 2*a;
      x2 = (-b - Math.sqrt(A)) / 2*a;
      System.out.println("x1 =" + x1 );
      System.out.println("x2 =" + x2 );
    }

    
  }
  
}
