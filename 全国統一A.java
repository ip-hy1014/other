import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = a+b;
    int ans_1 = Math.min(a,b);
    System.out.println(ans_1 + " " + Math.max(0,c-n));
  }
}