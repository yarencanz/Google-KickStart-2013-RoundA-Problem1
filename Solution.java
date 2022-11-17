import java.util.ArrayList;
import java.util.Collections;

//https://codingcompetitions.withgoogle.com/kickstart/round/0000000000434ba1/0000000000434ad6
public class Solution {
    public static void main(String[] args) {
        int arr[] = {9,89,56,62,3,54,9,9,79,56,65,8,545,654,56,64564,1212,3235,69887,6,31,4,22,6868,32,5,88,10,21};
        System.out.println(sortingMethod(arr));
    }
    public static ArrayList<Integer> sortingMethod(int arr[]){

        ArrayList<Integer> listOdd = new ArrayList<>();
        ArrayList<Integer> listEven = new ArrayList<>();
        int a = 0;
        int b = 0;
        for(int i = 0; i<arr.length; i++){
         if(arr[i] %2 == 0){
             listEven.add(arr[i]);
         }else{
             listOdd.add(arr[i]);
         }
        }
        Collections.sort(listOdd);
        Collections.sort(listEven);
        Collections.reverse(listEven);
        ArrayList<Integer> newList = new ArrayList<>();
        for(int i =0; i<arr.length; i++){
         if(arr[i] %2 ==0){
             newList.add(listEven.get(a));
             a++;
         }else{
             newList.add(listOdd.get(b));
             b++;
         }
        }
         return newList;
     }
}
