public class Main74{
public static void main(String[] args){
String s1="mam";
String s2="leeteel";
String s3="leeterettl";
checkPalindrome(s1);
checkPalindrome(s2);
checkPalindrome(s3);
}
static void checkPalindrome(String s){
int i=0;
int j=s.length()-1;
Boolean ispalindrome=true;
while(i<j){
if(s.charAt(i)!=s.charAt(j)){
ispalindrome=false;
break;
}
i++;
j--;
}
if (ispalindrome) {
System.out.println(s+"is a palindrome");
}else{
System.out.println(s+"is not a palindrome");
}
}
}
