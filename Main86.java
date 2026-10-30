import java.util.*;
public class Main86{
public static void main(String[] args){
Student s1=new Student();
Student s2=new Student();
int sum=s1.sum(5,5);
int sum2=s2.sum(10,5);
System.out.println(sum);
System.out.println(sum2);
}
}
class Student {
int sum(int a, int b) {
return a + b;
}
}

