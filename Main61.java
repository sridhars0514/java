import java.util.*;
public class Main61{
public static void main(String[] args) {
int[] arr1 = {5, 3, -1, 2, 1, 8};
int[] arr2 = {6, 1, 0, 2, 9, 5, 6, 3, 7, 4};
System.out.println("test case 1:");
findfirstMissingPositive(arr1);
System.out.println("test case 2:");
findfirstMissingPositive(arr2);
}
public static void findfirstMissingPositive(int arr[]){
for(int i=0;i<9;i++){
boolean found= false;
for(int j=0;j<arr.length;j++){
if(arr[j]==i){
found=true;
break;
}
}
if (!found){
System.out.println("first Missing Positive number="+i);
}
}
}
}
