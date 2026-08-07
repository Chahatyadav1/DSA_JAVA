/**
 * Day4
 */
// public class Day4 {
//     public static void main(String[] args) {
//         int[][] matrix = { { 7, 2, 1 }, { 6, 4, 2 }, { 6, 5, 3 }};
//         for(int i=0;i<matrix.length;i++){
//             for(int j=i;j<matrix.length;j++){
//                 int temp=matrix[i][j];
//                 matrix[i][j]=matrix[j][i];
//                 matrix[j][i]=temp;
//             }
//         }
//         for(int i=0;i<matrix.length;i++){
//             int k= matrix.length-1;
//             for(int j=0;j<matrix.length/2;j++){
//                 int temp=matrix[i][j];
//                 matrix[i][j]=matrix[i][k];
//                 matrix[i][k]=temp;    
//                 k--;           
//             }
//         }
//         for(int i=0;i<matrix.length;i++){
//             for(int j=0;j<matrix.length;j++){
//                 System.out.print(matrix[i][j]+" ");
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * Day4
 */
//  ------- bubble sort----------
// public class Day4 {

//     public static void main(String[] args) {
//         int [] arr= {-11,44,12,89,7,5};
//         int n=arr.length;
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-1-i;j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp=arr[j];
//                     arr[j]=arr[j+1];
//                     arr[j+1]=temp;
//                 }
//             }
//         }
//         for(int a:arr){
//             System.out.println(a);
//         }
//     }
// }

// ---selection sort----

/**
 * Day4
 */
// public class Day4 {

//     public static void main(String[] args) {
//         int []arr= {-11,44,12,89,7,5};
//         int n=arr.length;
//         int min;
//         for(int i=0;i<n-1;i++){
//             min=i;
//             for(int j=i;j<n;j++){
//                 if(arr[j]<arr[min]){
//                     min=j;
//                 }
//             }
//             int temp=arr[min];
//             arr[min]=arr[i];
//             arr[i]=temp;
//         }
//         for(int i:arr){
//             System.out.println(i);
//         }
//     }
// }

/**
 * Day4
 */
//------insertion-sort------
// public class Day4 {

//     public static void main(String[] args) {
//          int []arr= {-11,44,12,89,7,5};
//          int n=arr.length;
//          for(int i=1;i<n;i++){
//             int key=arr[i];
//             int prev=i-1;
//             while(arr[prev]> key&& prev>=0){
//                 arr[prev+1]=arr[prev];
//                 prev--;
//             }
//             arr[prev+1]=key;
//          }
//          for(int i:arr){
//             System.out.println(i);
//          }
//     }
// }

/**
 * Day4
//  */
// public class Day4 {

//     public static void main(String[] args) {
//         int [] arr={-11,3,55,67,87,99};
//         int target=87;
//         int n=arr.length;
//         int l=0;
//         int h=n-1;
//         while(l<=h){
//             int mid=l+(h-l)/2;
//             if(arr[mid]==target){
//                 System.out.println("found at index: "+ mid);
//                 break;
//             }
//             else if (arr[mid]>target) {
//                 h=mid-1;
//             }
//             else{
//                 l=mid+1;
//             }
//         }
//     }
// }

/**
 * Day4
 */
// public class Day4 {
//     public static int search(int[] arr, int target, int l, int h) {
//         if (l < h) {
//             int mid = l + (h - l) / 2;
//             if (arr[mid] == target) {
//                 return mid;
//             } else if (arr[mid] > target) {
//                 return search(arr, target, l, mid - 1);
//             } else {
//                 return search(arr, target, mid + 1, h);
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] arr = { -11, 3, 55, 67, 87, 99 };
//         int target = 87;
//         System.out.println(search(arr, target, 0, arr.length - 1));
//     }
// }

/**
 * Day4
//  */
// public class Day4 {

//     public static void main(String[] args) {
//         int arr[] ={10,20,20,20,20,20,30,30,40,50,50};
//         int n=arr.length;
//         int l=0;
//         int h=n-1;
//         int target=20;
//         int val=-1;
//         while(l<=h){
//             int mid=l+(h-l)/2;
//             if(arr[mid]<=target){
//                 val=mid;
//                 l=mid+1;
//             }
//             else{
//                 h=mid-1;
//             }
//         }
//         // System.out.println(val);
//         int i=0;
//         int j=n-1;
//         int val1=-1;
//         while(i<=j){
//             int mid=i+(j-i)/2;
//             if(arr[mid]>=target){
//                 val1=mid;
//                 j=mid-1;
//             }
//             else{
//                 i=mid+1;
//             }
//         }
//         System.out.println(val-val1);
//     }
// }

/**
 * Day4
 */
// -------- hill problem--------
// public class Day4 {

//     public static void main(String[] args) {
//         int[] arr={0,2,3,4,1,0};
//          int max=0;
//          int r=arr.length;
//          int l=0;
//          while(l<=r){
//             int mid=l+(r-l)/2;
//             if(arr[mid]>=arr[mid+1]){
//                 max=mid;
//                 r=mid-1;
//             }
//             else{
//                 l=mid+1;
//             }
//          }
//          System.out.println(max);
//     }
// }

// public class Day4 {
// public static void swap(char[] arr,int i,int j) {
//     char temp=arr[i];
//     arr[i]=arr[j];
//     arr[j]=temp;
// }
//     public static void main(String[] args) {
//         String name ="Chahat";
//         char[] arr = new char[name.length()];
//         String new_name="";
//         arr=name.toCharArray();
//         int i=0;
//         int j=arr.length-1;
//         while(i<j){
//             swap(arr,i,j);
//             i++;
//             j--;
//         }
//         for(int k=0;k<arr.length;k++){
//             if(arr[k]=='a'||arr[k]=='e'||arr[k]=='i'||arr[k]=='o'||arr[k]=='u'){
//                 arr[k]='-';
//             }
//         }
//         for(char k:arr){
//             new_name=new_name+""+k;
//         }
//         System.out.println(new_name);
//     }
// }

/**
 * Day4
//  */
// public class Day4 {

//     public static void main(String[] args) {
//         int[] arr ={1,4,6,-11,45,3,2};
//         int n=arr.length;
//         int max=0;
//         int k=n-1;
//         for(int i=0;i<n-1;i++){
//              max=0;
//             for(int j=0;j<n-i-1;j++){
//                 if(arr[j]>arr[max]){
//                     max=j;
//                 }
//             }
//             int temp=arr[max];
//             arr[max]=arr[k];
//             arr[k]=temp;
//             k--;
//         }
//         for(int i: arr){
//             System.out.println(i);
//         }
//     }
// }

/**
 * Day4
 */
// public class Day4 {

//     public static void main(String[] args) {
//         int[] arr ={1,4,6,-11,45,3,52};
//         int n=arr.length;
//         for(int i=0;i<n-1;i++){
//             for(int j=0;j<n-i-1;j++){
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
 * Day4
 */
/**
 * Day4
 */
// public class Day4 {

//     public static void main(String[] args) {
//         int[] arr={3,5,1,76,23,12,-11};
//         int n=arr.length;
//         for(int i=0;i<n-1;i++){
//             int key=arr[i+1];
//             int prev=i;
//             while (prev>=0 && key<arr[prev]) {
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
 * Day4
 */
// public class Day4 {

//     public static void main(String[] args) {
//         int n=5,r=3;
//         for(int i=1;i<=r;i++){
//             for(int j=1;j<=n-i-2;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=(2*i)-1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//         int r1=r-1;
//         for(int i=1;i<=r1;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=n-(2*i);j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

