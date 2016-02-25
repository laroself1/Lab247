import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter value(sec):  ");
        Scanner input = new Scanner(System.in);
        double n = input.nextInt();
        GravityCalculator.calcDist(n); }}
