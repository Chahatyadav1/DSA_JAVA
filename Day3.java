// public class Day3 {
//     public static int [] shift(int [] arr) {
//         int last =arr[arr.length-1];
//         for(int i=arr.length-2;i>=0;i--){
//             arr[i+1]=arr[i];
//         }
//         arr[0]=last;
//         return arr;
//     }
//     public static void main(String[] args) {
//         int [] arr ={1,2,3,4,5,6};
//         int[] arr1 = new int[arr.length];
//         arr1=shift(arr);
//         for(int i:arr1){
//             System.out.print(i);
//         }
//     }
// }

// public class Day3 {
//     public static int[] shift(int [] arr,int k) {
//         int [] temp = new int[k];
//         for(int i=arr.length-k,j=0;i<arr.length;i++,j++){
//             temp[j]=arr[i];
//         }
//         for(int i=arr.length-k-1;i>=0;i--){
//             arr[i+k]=arr[i];
//         }
//         for(int i=0;i<k;i++){
//             arr[i]=temp[i];
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int [] arr ={1,2,3,4,5,6,7,8,9};
//         int k=3;
//         int[] arr1 = new int[arr.length];
//         arr1=shift(arr,k);
//         for(int i:arr1){
//             System.out.print(i);
//         }
//     }
// }

/**
 * Day3
 */
// import java.util.*;
// public class Day3 {
//     public static void main(String[] args) {
//         int []arr={9,4,9,6,7,4};
//         HashSet<Integer> hs = new HashSet<>();
//         for(int i=0;i<arr.length;i++){
//             hs.add(arr[i]);
//         }
//         System.out.println(hs.hashCode());
//     }
// }

/**
 * Day3
 */
// import java.util.*;
// public class Day3 {

//     public static void main(String[] args) {
//             List<Integer> ls =new ArrayList<>();
//             List<Integer> ls1 =new ArrayList<>();
//             ls1.add(40);
//             ls1.add(74);
//             ls1.add(32);
//             ls.add(10);
//             ls.addFirst(20);
//             ls.addAll(ls1);
//             System.out.println(ls.get(0));

//     }
// }

// import java.util.HashSet;
// /**
//  * Day3
//  */
// public class Day3 {
// public static int repeting(int[] arr) {
//     HashSet<Integer> hs = new HashSet<>();
//     int lindex=-1;
//     for(int i=arr.length-1;i>=0;i--){
//         if(hs.contains(arr[i])){
//             lindex = i;
//         }
//         else{
//             hs.add(arr[i]);
//         }
//     }
//     return lindex;
// }
//     public static void main(String[] args) {
//         int [] arr ={9,4,9,6,7,4};
//         System.out.println(repeting(arr));
//     }
// }

// import java.util.HashSet;
/**
 * Day3
 */
// public class Day3 {
//     public static void main(String[] args) {
//         String str="abcabcbb";
//         char[] ch = new char[str.length()];
//         HashSet<Character> hs =new HashSet<>();
//         HashSet<Character> sub =new HashSet<>();
//         ch=str.toCharArray();
//         for(int i=0;i<ch.length;i++){
//             if(hs.contains(ch[i])){
//                 break;
//             }
//             else{
//                 sub.add(ch[i]);
//             }
//         }
//         System.out.println(sub);
//     }
// }

/**
 * Day3
 */
// public class Day3 {
// public static void alternat(int [] arr) {
//     int i=0;
//     int j=arr.length-1;
//     while(i<=j){
//         if(i==j){
//             System.out.print(arr[i]);
//             break;
//         }
//         else{
//             System.out.print(arr[i]);
//             i++;
//             System.out.print(arr[j]);
//             j--;
//         }

//     }
// }
//     public static void main(String[] args) {
//         int []arr={1,2,3,4,5};
//         alternat(arr);
//     }
// }

// import java.util.HashMap;
// import java.util.Iterator;
// import java.util.Map;

// /**
//  * Day3
//  */
// public class Day3 {

//     public static void main(String[] args) {
//         int []arr={5,2,3,2,3,1,2,9};
//         int count=0;
//         HashMap<Integer,Integer> freq=new HashMap<>();
//         for(int i=0;i<arr.length;i++){
//                 freq.put(arr[i],freq.getOrDefault(arr[i], 0) + 1);
//         }
//         for(int i : freq.keySet()){
//             System.out.println(i+"->"+freq.get(i));
//         }
//     }
// }

/**
 * Day3
 */
// public class Day3 {
// public static void swap(int[] arr,int i,int j){
//     int temp=arr[i];
//     arr[i]=arr[j];
//     arr[j]=temp;
// }
//     public static void main(String[] args) {
//         int[] a={1,2,0,0,1,0,2};
//         int l=0;
//         int h=a.length-1;
//         int i=0;
//         while(i<h){
//             if(a[i]==0){
//                 swap(a,l,i);
//                 l++;
//                 i++;
//             }
//             if(a[i]==2){
//                 swap(a,i,h);
//                 h--;
//             }
//             if(a[i]==1){
//                 i++;
//             }
//         }
//         for(int r:a){
//             System.out.println(r);
//         }
//     }
// }
// import java.util.*;
// class Day3 {
//     public static int removeDuplicates(int[] nums) {
//         List<Integer> temp = new ArrayList<>();
//         int i=0;
//         int j=1;
//         while(j<nums.length){
//             if(nums[i]!=nums[j]){
//                 temp.add(nums[i]);
//                 i=j;
//             } 
//             j++;
//         }
//         return temp.size()+1;
//     }
//     public static void main(String[] args) {
//         int []arr={1,1,2,3,3};
//         int ans=removeDuplicates(arr);
//         System.out.println(ans);
//     }
// }

// import java.util.*;
// /**
//  * Day3
//  */
// public class Day3 {

//     public static void main(String[] args) {
//         int [] arr={2,4,6,8,7,6,8};
//         List<Integer> temp=new ArrayList<>();
//         for(int i=0;i<arr.length;i++){
//             if(temp.contains(arr[i])){
//                 System.out.println(arr[i]);
//                 break;
//             }
//             else{
//                 temp.add(arr[i]);
//             }
//         }
//     }
// }

// class Day3 {
//     public static int pivotIndex(int[] nums) {
//         int n=nums.length;
//         int [] front_sum=new int[n];
//         int [] last_sum=new int[n];
//         int j=n-1;
//         int sum_f=0;
//         int sum_l=0;
//         for(int i=0;i<n;i++){
//             sum_f+=nums[i];
//             front_sum[i]=sum_f;
//             sum_l+=nums[j];
//             last_sum[j]=sum_l;
//             j--;
//         }
//         for(int i:front_sum){
//             System.out.print(i+" ");
//         }
//         System.out.println();
//         for(int i:last_sum){
//             System.out.print(i+" ");
//         }
//         for(int i=0;i<n;i++){
//             if(front_sum[i]==last_sum[i]){
//                 return i;
//             }
//         }
//         return -1;
//     }
//         public static void main(String []args){
//             int arr[]={1,7,3,6,5,6};
//             int ans=pivotIndex(arr);
//             System.out.println(ans);
//         }
//     }

/**
 * Day3
//  */
// public class Day3 {
//     public static int subArray(int[] arr){
//         int sum=0;
//         int n=arr.length;
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<n;i++){
//             sum=sum+arr[i];
//             if(sum<0){
//                 sum=0;
//             }
//             if(sum>max){
//                 max=sum;
//             }
//         }
//         return max;
//     }
//     public static void main(String[] args) {
//         int [] arr={-2,1,-3,4,-1,2,1,-5,4};
//         System.out.println(subArray(arr));
//     }
// }

/**
 * Day3
 */
public class Day3 {

    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 2, 4, 5, 5 };
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int act_index = Math.abs(arr[i]) - 1;
            if(arr[act_index]>0){
            arr[act_index] = -arr[act_index];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                System.out.print(i+1+" ");
            }
        }
    }
}