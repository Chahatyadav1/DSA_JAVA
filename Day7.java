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