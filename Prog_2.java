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
        int x=0,diff=0;
        for(int i=1;i<n;i++){
            if(arr[i-1]>arr[i]){
                diff=arr[i-1]-arr[i];
                arr[i]=arr[i]+diff;
                x=x+diff;
            }
        }
        return x;
        
    }
}
