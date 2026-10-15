import java.util.*;
public class Main49{
public static void main(String[] args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
for(int i=1;i<=n;i+=2){
for(int j=1;j<=(n-i)/2;j++){
System.out.println("");
}
for(int j=1;j<=i;j++){
System.out.println("*");
}
System.out.println();
}
for(int i=n-2;i>=1;i-=2){
for(int j=1;j<=(n-i)/2;j++){
System.out.println("");
}
for(int j=1;j<=i;j++){
System.out.println("*");
}
System.out.println();
}
}
}
