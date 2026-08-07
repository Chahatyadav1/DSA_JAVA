// public class Day5 {
//     public static void main(String[] args) {
//         int arr[] = { 2, 2, 3, 4, 5 };
//         int n = arr.length;
//         for (int i = 0; i < n; i++) {
//             int index = Math.abs(arr[i]);
//             if (arr[index - 1] > 0) {
//                 arr[index - 1] = -arr[index - 1];
//             }
//         }
//         int j = 0;
//         while (j < n) {
//             if (arr[j] > 0) {
//                 System.out.println(j + 1);
//             }
//             j++;
//         }
//     }
// }

/**
 * Day5
//  */
// public class Day5 {

//     public static void main(String[] args) {
//         int [] arr={1,3,5,7,19,4,1};
//         int n=arr.length;
//         int i=0,j=n-1;
//         int ans=0;
//         while(i<j){
//             int mid=i+(j-i)/2;
//             if(arr[mid]<=arr[mid+1]){
//             ans=arr[mid+1];
//             i=mid+1;
//             }
//             else{
//                 j=mid-1;
//             }
//         }
//         System.out.println(ans);
//     }
// }

/**
 * Day5
 */
// public class Day5 {

//     public static void main(String[] args) {
//         int arr[]={4,5,6,7,0,1,2};
//         int n=arr.length;
//         int l=0,r=n-1;
//         int pivot=-1;
//         while(l<r){
//             int mid=l+(r-l)/2;
//             if(arr[mid]<arr[n-1]){
//                 r=mid-1;
//             }
//             else{
//                 pivot=mid;
//                 l=mid+1;
//             }
//         }
//         System.out.println(pivot);
//     }
// }

/**
 * Day5
 */
//------------------painter partiton and book page allocaton problem------

// public class Day5 {
//     public static boolean isValid(int[] boards,int k,int maxtime){
//         int time=0;
//         int painter=1;
//         for(int i=0;i<boards.length;i++){
//             if(time+boards[i]<=maxtime){
//                 time+=boards[i];
//             }
//             else{
//                 painter++;
//                 if(painter>k||boards[i]>maxtime){
//                     return false;
//                 }
//                 else{
//                     time=boards[i];
//                 }
//             }
//         }
//         return true;
//     }
//     public static int minTime(int[] boards,int k){
//         int l=0,r=0;
//         int ans=-1;
//         int n=boards.length;
//         for(int i=0;i<n;i++){
//             r+=boards[i];
//         }
//         if(k>boards.length){
//             return -1;
//         }
//         while(l<=r){
//             int mid=l+(r-l)/2;
//             if(isValid(boards,k,mid)){
//                 ans=mid;
//                 r=mid-1;
//             }
//             else{
//                 l=mid+1;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int k=3;
//         int[] boards={5,10,30,35,25 };
//         System.out.println(minTime(boards, k));
//     }
// }

////----------roti paratha problem-----------

/**
 * Day5
 */
// public class Day5 {
//     public static boolean valid(int[] cook,int p,int n,int mid){
//         int total=0;
//         for(int i=0;i<cook.length;i++){
//             int rank=cook[i];
//             int paratha=0;
//             int time=0;
//             int j=1;
//             while(mid>=time){
//                 if(time+j*rank<=mid){
//                     paratha++;
//                     time+=j*rank;
//                     j++;
//                 }
//                 else{
//                     break;
//                 }
//             }
//             total+=paratha;
//         }
//         if(total>=p){
//             return true;
//         }
//         else{
//             return false;
//         }
//     }
//     public static int  mintineToCookPratas(int p, int[] cook, int n) {
//         // p -> no of parathas
//         // n -> no of cooks

//         int s=0,max_len=0;
//         int ans=-1;
//         for(int i=0;i<cook.length;i++){
//             max_len=Math.max(max_len, cook[i]);
//         }
//         int e=max_len*(p*(p+1)/2);
//         while(s<=e){
//             int mid=s+(e-s)/2;
//             if(valid(cook,p,n,mid)){
//                 ans=mid;
//                 e=mid-1;  
//             }
//             else{
//                 s=mid+1;
//             }
//         }
//         return ans;
//     }
//     public static void main(String[] args) {
//         int[] cook ={1,2,3};
//         int p=10;
//         int n=3;
//         System.out.println(mintineToCookPratas(p, cook, n));
//     }
// }

/**
 * Day5
 */
// public class Day5 {

//     public static void main(String[] args) {
//         int[] arr={1,2,3,6,8,9,5,1};
//         int l=0;
//         int r=arr.length-1;
//         int ans=0;
//         while(l<=r){
//             int mid=l+(r-l)/2;
//             if(arr[mid]>arr[mid+1]){
//                 ans=mid;
//                 r=mid-1;
//             }else{
//                 l=mid+1;
//             }
//         }
//         System.out.println(ans);
//     }
// }

/**
 * Day5
 */
// public class Day5 {

//     public static void main(String[] args) {
//         int []arr ={3,4,1,77,45,1};
//         for(int i=0;i<arr.length-1;i++){
//             for(int j=0;j<arr.length-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         for(int i:arr){
//             System.out.println(i);
//         }
//     }
// }
/**
 * Day5
//  */
// public class Day5 {

//     public static void main(String[] args) {
//          int []arr ={3,4,1,77,45,1};
//          int small;
//          for(int i=0;i<arr.length-1;i++){
//             small=i;
//             for(int j=i;j<arr.length;j++){
//                 if(arr[small]>arr[j]){
//                     small=j;
//                 }
//             }
//             int temp=arr[i];
//             arr[i]=arr[small];
//             arr[small]=temp;
//          }
//          for(int i:  arr){
//             System.out.println(i);
//          }
//     }
// }

/**
 * Day5
 */
// public class Day5 {

//     public static void main(String[] args) {
//         int[] arr = { 2, -1, 45, 2, 7, 6, 9 };
//         int prev = 0;
//         int key=0;
//         for (int i = 1; i < arr.length; i++) {
//             prev=i-1;
//             key = arr[i];
//             while (prev>=0 && arr[prev] > arr[i]) {
//                 arr[prev+1]=arr[prev];
//                 prev--;
//             }
//             arr[prev+1]=key;
//         }
//         for(int i:arr){
//             System.out.println(i);
//         }
//     }
// }

/**
 * Day5
 */
// public class Day5 {

//     public static void main(String[] args) {
//         int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
//         int i=0,j=0;
//         int target=3;
//         while(i<=arr.length-1){
//             j=0;
//             while (j<=(arr[0].length-1)) {
//                 System.out.print(arr[i][j]+" ");
//                 j++;
//             }
//             i++;
//             System.out.println();
//         }
//     }
// }
/**
 * Day5
 */
// public class Day5 {
//     public static boolean valid(int[][] arr, int target, int i) {
//         int l = 0;
//         int r = arr[0].length - 1;
//         while (l <= r) {
//             int mid = l + (r - l) / 2;
//             if (arr[i][mid] == target) {
//                 return true;
//             }
//             if (arr[i][mid] > target) {
//                 r = mid - 1;
//             } else {
//                 l = mid + 1;
//             }
//         }
//         return false;
//     }

//     public static boolean search(int[][] arr, int target) {
//         int i = 0;
//         int last_col=arr[0].length - 1;
//         if(arr[0][0]>target){
//             return false;
//         }
//         while (i < arr.length) {
//             if (target < arr[i][last_col]) {
//                 if (valid(arr, target, i)) {
//                     return true;
//                 }
//             } else if (target == arr[i][last_col]) {
//                 return true;
//             } else {
//                 i++;
//                 continue;
//             }
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int[][] arr = { {1,3,5,7},{10,11,16,20},{23,30,34,60} };
//         int target = 3;
//         System.out.println(search(arr, target));
//     }
// }

/**
 * Day5
 */
// public class Day5 {

//     public static void main(String[] args) {
//         int[] arr={0,0,0,1};
//         int l=0;
//         int r=arr.length-1;
//         if(arr[0]==1){
//             System.out.println(0);
//         }
//         while(l<=r){
//             int mid=l+(r-l)/2;
//             if(mid>0 && arr[mid]==1 && arr[mid-1]!=1){
//                 System.out.println(mid);
//                 break;
//             }
//             else if(mid>0 && arr[mid]==1 && arr[mid-1]==1){
//                 r=mid-1;
//             }
//             else{
//                 l=mid+1;
//             }
//         }
//     }
// }

/**
 * Day5
 */
// public class Day5 {
//     public static int once(int[][] arr){
//         int totalrow=arr.length;
//         int totalcol=arr[0].length;
//         int maxcount=0;
//         for(int i=0;i<totalrow;i++){
//             int count=0;
//             int l=0,r=totalcol-1;
//             int value = totalcol; 
//             while(l<=r){
//                 int mid=l+(r-l)/2;
//                 if(arr[i][mid]<1){
//                     l=mid+1;
//                 }else{
//                     value=mid;
//                     r=mid-1;
//                 }
//             }
//             count=totalcol-value;
//             maxcount=Math.max(maxcount, count);
//         }
//         return maxcount;
//     }
//     public static void main(String[] args) {
//         int[][] mat = {
//             {0, 1, 1, 1},
//             {0, 0, 1, 1},
//             {1, 1, 1, 1},
//             {0, 0, 0, 0}
//         };
//         System.out.println(once(mat));
//     }
// }