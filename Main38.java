import java.util.Scanner;
public class Main38{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int Month=scan.nextInt();
System.out.println("Enter the Month:");
switch(Month) {
case 1,2,3,4,5,6->System.out.println("may");
case 7,8,9,10,11,12->System.out.println("september");
default->System.out.println("invalide");
}
}
}