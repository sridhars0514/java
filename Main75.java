public class Main75{
public static void main(String[] args){
String s1="listen";
String s2="silent";
checkAnagrams(s1);
checkAnagrams(s2);
}
static void checkAnagrams(String s){
int i=0;
int j=s.length()-1;
Boolean isAnagrams=true;
while(i<j){
if(s.charAt(i)!=s.charAt(j)){
isAnagrams=false;
break;
}
i++;
j--;
}
if(isAnagrams){
System.out.println(s+"is a Anagrams");
}else{
System.out.println(s+"is not a Anagrams");
}
}
}

