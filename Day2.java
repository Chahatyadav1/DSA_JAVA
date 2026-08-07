// public class Day2 {
//     public static void main(String[] args) {
//         int min = Integer.MAX_VALUE;
        // int [] arr ={3,2,-5,21,-10};
        // for(int i:arr){
        // if(i<min){
        // min=i;
        // }
        // }
        // System.out.println(min);
        // int [][]arr ={{1,2,-5,6},{2,8,-8}};
        // for(int i=0;i<arr.length;i++){
        // for(int j=0;j<arr[i].length;j++){
        // if(arr[i][j]<min){
        // min=arr[i][j];
        // }
        // }
        // }
        // System.out.println(min);

        // String input="Hello Dostoh My name is chahat";
        // String a =input.trim();
        // char[] b =a.toCharArray();
        // int count=0;
        // for(char s: b){
        // if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
        // count++;
        // }
        // }
        // System.out.println(count);

        // int num=123567;
        // while(num>0){
        // System.out.println(num%10);
        // num=num/10;
        // }
        // String a= String.valueOf(num);
        // char []b = a.toCharArray();
        // for(char i:b){
        // System.out.println(i);
        // }
        // int num=1256521;
        // int front=num;
        // int digit,reverse=0;
        // while(num>0){
        // digit=num%10;
        // reverse=(reverse*10)+digit;
        // num=num/10;
        // }
        // if(reverse==front){
        // System.out.println("palindrome");
        // }
        // else{
        // System.out.println("not palindrome");
        // }

//         int n = 1;
//         int count = 0;
//         if (n <= 1) {
//             System.out.println("not prime");
//         } else {
//             for (int i = 2; i < n; i++) {
//                 if (n % i == 0) {
//                     count++;
//                 }
//             }
//             if (count == 0) {
//                 System.out.println("the number is prime");
//             } else {
//                 System.out.println("not the prime");
//             }
//         }
//     }
// }

/**
 * Day2
 */
// public class Day2 {
//     public static int armstrongNumber(int num){
//         int sum=0;
//         while(num>0){
//             int digit=num%10;
//             sum=sum+(digit*digit*digit);
//             num=num/10;
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         int num=153;
//         if(num == armstrongNumber(num)){
//             System.out.println("armstrong");
//         }
//     }
// }

/**
 * Day2
//  */
// public class Day2 {
//     public static boolean isPrime(int num){
//         for(int i=2;i*i<=num;i++){
//             if(num%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void prime_num(int end){
//         for(int i=1;i<=end;i++){
//             if(isPrime(i)){
//                 System.out.println(i);
//             }
//         }
//     }
//     public static void main(String[] args) {
//         prime_num(54);
//     }
// }

// import java.util.LinkedList;

// /**
//  * Day2
//  */
// public class Day2 {
//     public static void main(String[] args) {
//         LinkedList<Integer> ll =new LinkedList<>();
//         ll.add(20);
//         ll.add(10);
//         ll.add(6);
//         System.out.println(ll.peek());
//     }
// }

/**
 * Day2
 */
// public class Day2 {

//     public static void main(String[] args) {
//         int a=10;
//         // if((a & (a-1)) == 0){
//         //     System.out.println("power of two");
//         // }
//         int count=0;
//         while(a!=0){
//         if((a&1)==1){
//             count++;
//         }
//         a=a>>1;
//     }
//         System.out.println(count);
//     }
// }

/**
 * Day2
 */
// public class Day2 {

//     public static void main(String[] args) {
//         int n=4;
//         String m="";
//         while(n!=0){
//             if((n&1)==1){
//                 m=m+1;
                
//             }
//             else{
//                 m=m+0;
                
//             }
//             n=n>>1;
//         }
//         char [] rev =m.toCharArray();
//         char[] rev1 = new char[rev.length];
//         for(int i=rev.length-1 ,j=0;i>=0;i--,j++){
//             rev1[j]=rev[i];
//         }
//         for(char i:rev1){
//             System.out.print(i);
//         }
//     }
// }

/**
 * Day2
 */
// public class Day2 {

//     public static void main(String[] args) {
//         int n=10;
//         StringBuilder sb =new StringBuilder();
//         if(n==0){
//             System.out.println(0);
//             return;
//         }
//         while(n!=0){
//             sb.append(n&1);
//             n=n>>1;
//         }
//         System.out.println(sb.reverse());
//     }
// }

/**
 * Day2
 */
// public class Day2 {

//     public static void main(String[] args) {
//         int [] arr ={1,3,5,6,7,4,3};
//         int sum=0;
//         for(int i=0;i<arr.length;i++){
//             sum+=i;
//         }
//         System.out.println("averge: " + (sum/arr.length));
//     }
// }

/**
 * Day2
 */
// public class Day2 {

//     public static void main(String[] args) {
//         int [] arr ={1,3,5,6,7,4,3};
//         for(int i=0;i<arr.length;i++){
//             arr[i]=arr[i]*10;
//         }
//         for(int i:arr){
//             System.out.println(i);
//         }
//     }
// }

/**
 * Day2
 */
// public class Day2 {

//     public static void main(String[] args) {
//         int [] arr ={1,3,5,6,7,4,3};
//         int target=7;
//         for(int i:arr){
//             if(i==target){
//                 System.out.println("found");
//             }
//         }
//     }
// }

/**
 * Day2
 */

// public class Day2 {
// public static int sum(int[] arr){
//     int pos_sum=0;
//     int neg_sum=0;
// for(int i=0;i<arr.length;i++){
//     if(arr[i]>=0){
//         pos_sum+=arr[i];
//     }
//     else{
//         neg_sum+=arr[i];
//     }
// }
// return pos_sum ;
// }
//     public static void main(String[] args) {
//         int []arr={1,-3,5,6,7,-4,3};
//         System.out.println(sum(arr));
//     }
// }

/**
 * Day2
 */
// public class Day2 {
// public static int fault(int[] arr) {
//     for(int i=0;i<arr.length-1;i++){
//         if(arr[i]>arr[i+1]){
//             return arr[i+1];
//         }
//     }
//     return -1;
// }
//     public static void main(String[] args) {
//         int [] arr ={1,3,5,6,7,2};
//         System.out.println(fault(arr));
//     }
// }

/**
 * Day2
 */

// public class Day2 {
// public static void swap(int [] arr,int a,int b){
//     int temp=arr[a];
//     arr[a]=arr[b];
//     arr[b]=temp;
    
// }
// // public static int[] array_swap(int [] arr) {
// //     for(int i=0;i<arr.length-1;i+=2){
// //         swap(arr, i, i+1);
// //     }
// //     return arr;
// // }
// public static int [] reverse(int [] arr){
//     int j=arr.length-1;
//     for(int i=0;i<(arr.length)/2;i++){
//         swap(arr, i, j);
//         j--;
//     }
//     return arr;
// }
//     public static void main(String[] args) {
//         int []arr={1,2,3,4,5,6,7};
//         arr=reverse(arr);
//         for(int i:arr){
//             System.out.print(i);
//         }
//     }
// }