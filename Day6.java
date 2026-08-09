/**
 * Day6
 */
// public class Day6 {

//     public static void main(String[] args) {
//         String sentenc="hello dostoh kiyah haal chal h";
// String news="";
// String [] arr =sentenc.split(" ");
// int i=0,j=arr.length-1;
// while(i<=j){
//     String temp=arr[i];
//     arr[i]=arr[j];
//     arr[j]=temp;
//     j--;i++;
// }
// for(String a:arr){
//     news = news+" "+a;
// }
//         System.out.println(news);
//     }
// }

// import java.util.HashMap;
// import java.util.Map;

// import javax.xml.stream.events.Characters;

// /**
//  * Day6
//  */
// public class Day6 {

//     public static void main(String[] args) {
//        String str="hello dostoh kya haal chal";
//        HashMap<Character,Integer> freq =new HashMap<>();
//        for(int i=0;i<str.length();i++){
//         char cha=str.charAt(i);
//         if(freq.containsKey(cha)){
//             freq.put(cha,freq.get(cha)+1);
//         }else{
//             freq.put(cha,1);
//         }
//        }
//        int max=0;
//        for(Map.Entry<Character,Integer> entry: freq.entrySet()){
//         max=Math.max(max,entry.getKey());
//        }
//         for(Map.Entry<Character,Integer> entry: freq.entrySet()){
//         if(entry.getValue()==max){
//             System.out.println(entry.getKey());
//         }
//        }
//     //    System.out.println(freq);
//     }
// }

/**
 * Day6
 */

// import java.util.*;

// /**
//  * Day6
//  */
// public class Day6 {

//     public static void main(String[] args) {
//         char[] chars = { 'a', 'a', 'b', 'b', 'c', 'c', 'c','d' };
//         HashMap<Character, Integer> map = new HashMap<>();
//         List<Character> ls = new ArrayList<>();
//         for (int i = 0; i < chars.length; i++) {
//             map.put(chars[i], (map.getOrDefault(chars[i], 0) + 1));
//         }
//         int k = 0;
//         for (Map.Entry<Character, Integer> entry : map.entrySet()) {
//             if (entry.getValue() == 1) {
//                 ls.add('1');
//             } else {
//                 ls.add(entry.getKey());
//                 ls.add((char) ('0' + entry.getValue()));
//             }
//         }
//         char[] ans = new char[ls.size()];

//         for (int i = 0; i < ls.size(); i++) {
//             ans[i] = ls.get(i);
//         }
//         for(char l : ans){
//             System.out.println(l);
//         }
//         String a="hello";
//     }
// }

/**
 * Day6
 */
// public class Day6 {
//     public static int display(int[] arr,int n){
//         if(n==arr.length-1){
//             return arr[arr.length-1] ;
//         }
//         return arr[n]+display(arr,n+1);
//     }
//     public static void main(String[] args) {
//         int [] arr={1,2,3,4,5,6};
//         int n =arr.length-1;
//         System.out.println("sum: "+display(arr, 0));
//     }
// }

/**
 * Day6
 */
// public class Day6 {
//     public static void display(int n){
//         if(n<0){
//             return;
//         }
//         System.out.println(n);
//         display(n-1);
//     }
//     public static void main(String[] args) {
//         display(5);
//     }
// }

/**
 * Day6
 */
// public class Day6 {
//     public static  int  find(int[] arr , int i,int count,int target){
//         if(i>=arr.length){
//             return count;
//         }
//         if(arr[i]==target){
//             count++;
//         }
//         int ans=find(arr, i+1, count,target);
//         return ans;
//     }
//     public static void main(String[] args) {
//         int [] arr= {1,6,3,6,5,6};
//         int target=6;
//         System.out.println(find(arr,0,0,target));
//     }
// }

/**
 * Day6
 */
// public class Day6 {
//     public static void display(int n){
//         if(n==0){
//             return;
//         }
//         display(n/10);
//         System.out.println(n%10);
//     }
//     public static void main(String[] args) {
//         display(123);
//     }
// }

/**
 * Day6
 */
// public class Day6 {
//     public static int binary(int[] arr ,int l ,int r,int target){
//         int ans=-1;
//         if(l<=r){
//             int mid=l+(r-l)/2;
//             if(arr[mid]==target){
//                 return mid;
//             }
//             if(arr[mid]>target){
//                 ans=binary(arr, l, mid-1, target);
//             }
//             else{
//                 ans=binary(arr, mid+1, r, target);
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int arr[]={1,2,3,5,8};
//         int target=5;
//         System.out.println(binary(arr,0, arr.length-1, target));
//     }
// }

/**
 * Day6
 */
// public class Day6 {

//     public static void main(String[] args) {
//         String s ="hello";
//         s.charAt(0);
//         char ch = 'a';
//         StringBuilder a=new StringBuilder();
//         a.append("ji");
//         String b=String.valueOf(a);
//         System.out.println(b);
//         // s.contains("h");
//     }
// }