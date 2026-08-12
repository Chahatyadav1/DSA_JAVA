// public class Day7 {
//     public static void main(String[] args) {
//         int[][] arr={{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
//         int n=arr.length;
//         int m=arr[0].length;
//         int srt_row=0;
//         int srt_col=0;
//         int end_row=n-1;
//         int end_col=m-1;
//         while(srt_row<=end_row && srt_col<=end_col){
//             for(int i=srt_col;i<=end_col;i++){
//                 System.out.println(arr[srt_row][i]);
//             }
//             srt_row+=1;
//             for(int i=srt_row;i<=end_row;i++){
//                 System.out.println(arr[i][end_col]);
//             }
//             end_col-=1;
//             if(srt_row<=end_row){
//                 for(int i=end_col;i>=srt_col;i--){
//                     System.out.println(arr[end_row][i]);
//                 }
//                 end_row-=1;
//             }
//             if(srt_col<=end_col){
//                 for(int i=end_row;i>=srt_row;i--){
//                     System.out.println(arr[i][srt_col]);
//                 }
//                 srt_col+=1;
//             }
//         }
//     }
// }

/**
 * Day7
 */
// public class Day7 {
//     public static int minimizeTheDifference(int[][] mat,int sum ,int target,int row) {
//         int min=Integer.MAX_VALUE;
//         if(mat.length<=row){
//             return Math.abs(target-sum);
//         }
//         for(int i:mat[row]){
//             int ans=minimizeTheDifference(mat, sum+i, target, row+1);
//             min=Math.min(ans, min);
//         }
//         return min;
//     }
//     public static void main(String[] args) {
//         int target=100;
//         int [][] mat={{1},{2},{3}};
//         System.out.println(minimizeTheDifference(mat,0,target,0));
//     }
// }

/**
 * Day7
//  */
// public class Day7 {
//     public static int change(int amount, int[] coins,int index,int count) {
//         if(amount==0){
//             return 1;
//         }
//         if(amount<0){
//             return 0;
//         }
//         if(index>coins.length-1){
//             return 0;
//         }
//         int ans1=change(amount-coins[index], coins, index,count);
//         int ans2=change(amount, coins, index+1,count);
//         return ans1+ans2;
//     }
//     public static void main(String[] args) {
//         int amount=5;
//         int coins[] ={1,2,5};
//         System.out.println(change(amount, coins,0,0));
//     }
// }

/**
 * Day7
//  */
// public class Day7 {
//     public static int coinChange(int[] coins, int amount,int index) {
//         if(amount==0){
//             return 0;
//         }
//         if(index>=coins.length || amount<0){
//             return Integer.MAX_VALUE;
//         }
//         int take =coinChange(coins, amount-coins[index], index);
//         int skip=coinChange(coins, amount, index+1);
//         if(take!=Integer.MAX_VALUE){
//             take++;
//         }
//         return  Math.min(take, skip);
//     }
//     public static void main(String[] args) {
//         int[] coins={1,2,5};
//         int amount=11;
//         System.out.println(coinChange(coins, amount, 0));
//     }
// }

// import java.util.ArrayList;
// import java.util.List;

// /**
//  * Day7
//  */
// public class Day7 {

//     public static void main(String[] args) {
//         List<List<Integer>> triangle=new ArrayList<>();

//     }
// }

// import java.util.*;

// /**
//  * Day7
//  */
// public class Day7 {
//     public static void solve(int[] arr,List<Integer> ans,List<List<Integer>> result,int index){
//         if(index>=arr.length){
//             result.add(new ArrayList<>(ans));
//             return ;
//         }
//         ans.add(arr[index]);
//         solve(arr, ans,result,index+1);
//         ans.remove(ans.size()-1);
//         solve(arr, ans,result,index+1);
//     }
//     public static void main(String[] args) {
//         int [] arr={1,2,3};
//         List<Integer> ans =new ArrayList<>();
//         List<List<Integer>> result = new ArrayList<>();
//         solve(arr, ans,result, 0);
//         System.out.println(result);
//     }
// }

// import java.util.ArrayList;
// import java.util.List;

// /**
//  * Day7
//  */
// public class Day7 {
//     public static void solve(int[] candidates, int target,int sum,List<List<Integer>> result,List<Integer> ans,int index){
//         if(sum==target){
//             result.add(new ArrayList(ans));
//             sum=0;
//             return;
//         }
//         if(index>=candidates.length || sum>target){
//             return;
//         }
//         ans.add(candidates[index]);
//         solve(candidates,target,sum+candidates[index],result,ans,index);
//         ans.remove(ans.size()-1);
//         solve(candidates,target,sum,result,ans,index+1);
//     }
//     public static void main(String[] args) {
//         int[] candidates ={2,3,6,7};
//         int target=7;
//         List<List<Integer>> result=new ArrayList<>();
//         List<Integer> ans = new ArrayList<>();
//         solve(candidates,target,0,result,ans,0);
//         System.out.println(result);
//     }
// }
/**
 * Day7
 */
// public class Day7 {

//     public static void main(String[] args) {
//         // StringBuilder sb=new StringBuilder();
//         // // String.valueOf(sb);
//         // String h="12";
//         // char a=h.charAt(0);
//     }
// }

/**
 * Day7
//  */
// public class Day7 {
//     static int quicksort(int[] nums,int l,int r){
//         int pivot=nums[r];
//         int j=r-1;
//         int i=l;
//         while(i<=j){
//             if(pivot>nums[i]){
//                 i++;
//             }else{
//                 int temp=nums[i];
//                 nums[i]=nums[j];
//                 nums[j]=temp;
//                 j--;
//             }
//         }
//         int temp=nums[i];
//         nums[i]=nums[r];
//         nums[r]=temp;
//         return i;
//     }
//     static void sort(int[] nums,int l,int r){
//         if (l < r) {

//             int pivotIndex = quicksort(nums, l, r);

//             sort(nums, l, pivotIndex - 1);

//             sort(nums, pivotIndex + 1, r);
//         }
//     }

//     public static void main(String[] args) {
//         int[] arr={1,9,4,6,2,5};
//         sort(arr, 0, arr.length-1);
//         for(int i: arr){
//             System.out.println(i);
//         }
//     }
// }

/**
 * Day7
 */
// public class Day7 {

//     public static void main(String[] args) {
//         String s="ababa";
//         int j=s.length()-1;
//         for(int i=0;i<s.length()/2;i++){
//             if(s.charAt(i)!=s.charAt(j)){
//                 System.out.println("not palindrone");
//             }
//             j--;
//         }
//         System.out.println("Palindrome");
//     }
// }

// import java.util.ArrayList;
// import java.util.Collection;
// import java.util.Collections;
// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// /**
//  * Day7
//  */
// public class Day7 {

//     public static void main(String[] args) {
//         int[] arr={4, 6, 2, 6, 4, 4, 2};
//         HashMap<Integer, Integer> map = new HashMap<>();

//         // frequency
//         for (int x : arr) {
//             map.put(x, map.getOrDefault(x, 0) + 1);
//         }

//         // sort elements by frequency
//         List<Integer> list = new ArrayList<>(map.keySet());

//         list.sort((a, b) -> map.get(b) - map.get(a));
//         int index=0;
//         // System.out.println(list);
//         for(int i=0;i<list.size();i++){
//             int num=list.get(i);
//             int freq=map.get(list.get(i));
//             for(int j=0;j<freq;j++){
//                 arr[index]=num;
//                 index++;
//             }
//         }
//         for(int k:arr){
//             System.out.println(k);
//         }
//     }
// }

/**
 * Day7
 */
/**
 * Day7
 */
// public class Day7 {

//     public static void main(String[] args) {
//         int[] arr={0,2,3,4,5,6,7,8,1};
//         int sum=9*(10/2);
//         int count=0;
//         for(int i:arr){
//             count+=i;
//         }
//         System.out.println(sum-count);
//     }
// }

/**
 * Day7
 */
// public class Day7 {

//     public static void main(String[] args) {
//         int[] arr = { 1, 2, 2, 2, 2, 3, 3, 4 };
//         int i = 0;
//         int j = 0;
//         while (j < arr.length) {
//             arr[i]=arr[j];
//             while (j < arr.length - 1 && arr[j] == arr[j + 1]) {
//                 j++;
//             }
//             i++;
//             j++;
//         }
//         for(int k:arr){
//             System.out.println(k);
//         }
//     }
// }