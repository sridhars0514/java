import java.util.*;
public class Main85{
public static void main(String[] args){
int[] arr={1,2,4,7,5,10,15};
Boolean found=false;
int target=10;
int left=0;
int right=arr.length-1;
while(left<right)
{
int mid=(left+right)/2;
if(arr[mid]==target){
found=true;
break;
}
else if(arr[mid]<target){
left=mid+1;
}
else
{
right=mid;
}
}
System.out.println(found);
}
}

