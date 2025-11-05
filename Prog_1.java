import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();       
        }
        System.out.println(res(arr,n));
        
    }
    public static int res(int[] arr,int n){
        int arr1[]=new int[n];
        int max=0,res=0;
        for(int i=0;i<n;i++){
            arr1[i]=arr[i]-i;
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr1[i]==arr1[j]){
                    res=arr[i]+arr[j];
                }
            }
            if(res>max){
               max=res; 
            } 
        }
        return max;
        
    }
}
