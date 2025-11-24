import java.util.*;
public class Insertion_sort
{
  public static void main(String[] args)
  {    
      Scanner S=new Scanner(System.in);
      int n=S.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=S.nextInt();    
      }
      for(int i=1;i<n;i++)
      {
        int key=arr[i];
        int j=i-1;
        while(j>=0 && arr[j]>key)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
      }
   for(int x : arr){
       System.out.println(x+" ");
   }
      
  }
  
}