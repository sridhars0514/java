import java.util.*;
public class Main81{
public static void main(String[] args){
int []arr={64,25,12,22,11};
for(int i=0;i<arr.length-1;i++)
{
int minIndex=i;
for(int j=i;j<arr.length;j++)
{
if(arr[j]<arr[minIndex])
{
minIndex=j;
}
}
int temp=arr[i];
arr[i]=arr[minIndex];
arr[minIndex]=temp;
}
System.out.println("sorted Array:");
System.out.println(Arrays.toString(arr));
}
}