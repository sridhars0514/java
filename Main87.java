import java.util.*;
public class Main87{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Calculator c=new Calculator();
System.out.println("Enter first number:");
int a=sc.nextInt();
System.out.println("Enter Second number:");
int b=sc.nextInt();
System.out.println("Addition:"+c.add(a,b));
System.out.println("Subtraction:"+c.sub(a,b));
System.out.println("multiplication:"+c.mul(a,b));
System.out.println("Division:"+c.div(a,b));
sc.close();
}
}
class Calculator
{
int add(int a,int b){
return a+b;
}
int sub(int a,int b){
return a-b;
}
int mul(int a,int b){
return a*b;
}
int div(int a,int b){
return a/b;
}
}


