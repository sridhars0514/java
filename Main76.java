import java.util.*;
public class Main76{
public static void main(String[] args){
String s="listen";
String t="silent";
char arr[]=s.toCharArray();
char arr2[]=t.toCharArray();
Arrays.sort(arr);
Arrays.sort(arr2);
String s1=new String(arr);
String s2=new String(arr2);
System.out.println(s.equals(t));
}
}



