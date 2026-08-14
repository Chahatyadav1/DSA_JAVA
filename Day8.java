// import java.util.*;
// import java.util.stream.Collectors;

// import javax.print.attribute.HashDocAttributeSet;

// public class Day8 {
//     static class Node{
//         private int data;
//         private Node next;
//         private Node prev;
//         Node(int data){
//             this.data=data;
//             this.next=null;
//             this.prev=null;
//         }

//     }
//     public static void main(String[] args) {
//         // ArrayList <Integer> a=new ArrayList<>();
//         // ArrayList <Integer> b=new ArrayList<>();
//         // a.add(1);
//         // a.add(2);
//         // System.out.println(a);
//         // Collections.reverse(a);
//         // System.out.println(a);
//         Map<Integer,Boolean> map = new HashMap<>();
//         map.put(1, true);
//         // System.out.println(map.containsKey(1));
//         System.out.println(map.get(1));
//         String num="1";
//         System.out.println(Integer.parseInt(num)+2);
//         int a=10;
//         String b=String.valueOf(a);
//         System.out.println(b+2);
//     }
// }

import java.util.*;

/**
 * Day8
 */
// public class Day8 {

//     public static void main(String[] args) {
//         List<Integer> ans = new ArrayList<>();
//         ans.add(20);
//         ans.s
//     }
// }

/**
 * Day8
 */
// public class Day8 {
//     public static void merge(int[] arr,int l,int mid,int r){
//         int [] temp=new int[r-l+1];
//         int i=l;
//         int j=mid+1;
//         int k=0;
//         while(i<=mid &&j<=r){
//             if(arr[i]<arr[j]){
//                 temp[k]=arr[i];
//                 k++;i++;
//             }else{
//                 temp[k]=arr[j];
//                 k++;j++;
//             }
//         }
//         while(i<=mid){
//             temp[k]=arr[i];
//             k++;i++;
//         }
//         while(j<=r){
//             temp[k]=arr[j];
//             k++;j++;
//         }
//         for(int m=0;m<temp.length;m++){
//             arr[l+m]=temp[m];
//         }
//     }
//     public static void mergesort(int[] arr,int l,int r){
//         if(l<r){
//             int mid=l+(r-l)/2;
//             mergesort(arr, l, mid);
//             mergesort(arr, mid+1, r);
//             merge(arr, l,mid, r);
//         }
//     }
//     public static void main(String[] args) {
//         int[] arr={4,5,6,7,8,2,14,67,1,-3};
//         mergesort(arr,0,arr.length-1);
//         for(int x:arr){
//             System.out.println(x);
//         }
//     }
// }

/**
 * Day8
 */
// public class Day8 {
//     public static void main(String[] args) {
//         int[] arr={4,5,6,7,8,2,14,67,1,-3};
//         if(arr.length-1==1){
//             System.out.println("already sorted");
//         }
//             int pivot=arr[arr.length-1];
//             int l=0;
//             int r=arr.length-2;
//             while(l<=r){
//                 if(arr[r]<pivot){
//                     int temp=arr[l];
//                     arr[l]=arr[r];
//                     arr[r]=temp;
//                     l++;
//                 }else{
//                     r--;
//                 }
//             }
//             int temp=arr[r+1];
//             arr[r+1]=arr[arr.length-1];
//             arr[arr.length-1]=temp;
//         for(int x:arr){
//             System.out.println(x);
//         }
//     }
// }

/**
 * Day8
 */
// public class Day8 {

//     public static void main(String[] args) {
//         int[] arr = { 4, 5, 6, 7, 8, 2, 14, 67, 1, -3 };
//         for (int j = 0; j < arr.length; j++) {
//             for (int i = 0; i < arr.length-j-1; i++) {
//                 if (arr[i] > arr[i + 1]) {
//                     int temp = arr[i];
//                     arr[i] = arr[i + 1];
//                     arr[i + 1] = temp;
//                 }
//             }
//         }
//         for(int x:arr){
//             System.out.println(x);
//         }
//     }
// }

