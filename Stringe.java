import java.util.*;
import java.util.Scanner;
public class Stringe{
    public static void MatchingSum(String str1,String str2){
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        int count=0;
        int sum=0;
        for(int i=0;i<arr2.length;i++){
            count =0;
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    count++;
                    
                }
            }
            sum+=count;
        }
        System.out.println(sum);
    }
    public static void main(String[] args){
     Scanner sc = new Scanner (System.in);
     int t=sc.nextInt();
     String str1 = sc.next();
     String str2 = sc.next();
     while(t>0){
        MatchingSum(str1,str2);
        t--;
     }

    }
}