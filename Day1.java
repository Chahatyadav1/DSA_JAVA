
// public class Day1 {
//     public static void main(String [] args){
//         for(int i=0;i<4;i++){
//             for (int j=0;j<4;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Day1 {
//     public static void main(String [] args){
//         for(int i=0;i<4;i++){
//             for (int j=0;j<i;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

// public class Day1 {
//     public static void main(String [] args){
//         int n=5;
//         for(int i=1;i<=n;i++){
//             for (int j=1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j=1;j<=n;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * Day1
 */
// public class Day1 {

//     public static void main(String[] args) {
//         int n=5;
//         for (int row=1;row<=n;row++){
//             for(int col=1;col<=n-row+1;col++){
//                 System.out.print("* ");
//             }
//             System.out.println(" ");
//         }
//     }
// }

/**
 * Day1
 */
// public class Day1 {

//     public static void main(String[] args) {
//         int n=23;
//         for (int row=1;row<=(n+1)/2;row++){
//             for (int j=1;j<=(n+1)/2-row;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=row;j++){
//                 System.out.print("* ");
//             }
//             for(int j=1;j<=row-1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     }
// }

/**
 * Day1
 */
// public class Day1 {

//     public static void main(String[] args) {
//         int n=4;
//         for (int row=1;row<=n;row++){
//             for(int j=1;j<=row-1;j++){
//                 System.out.print("  ");
//             }
//             for(int j=1;j<=2*(n-row)+1;j++){
//                 System.out.print("* ");
//             }
//             System.out.println();
//         }
//     } 
// }           

/**
 * Day1
 */
/**
 * Day1
 */
public class Day1 {

    public static void main(String[] args) {
        // int n=6;
        // int m =9;
        // for(int row=1;row<=n;row++){
        // for(int col=1;col<=m;col++){
        // if(row==1||row==n||col==1||col==m){
        // System.out.print("* ");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }
        // int n=10;
        // for (int row=1;row<=n;row++){
        // for (int j=1;j<=n;j++){
        // if(row==j||j==1||row==n){
        // System.out.print("* ");
        // }
        // else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // int n=7;
        // int m=(n+1)/2;
        // for(int row=1;row<=n;row++){
        // for(int j=1;j<=m-row;j++){
        // System.out.print(" ");
        // }
        // if(row==1){
        // for(int j=1;j<=(2*row)-1;j++){
        // System.out.print("* ");
        // }
        // }
        // else if(row<=m){
        // System.out.print("* ");
        // for(int j=1;j<=(2*row)-3;j++){
        // System.out.print(" ");
        // }
        // System.out.print("* ");
        // }
        // else{
        // for(int j=1;j<=row-4;j++){
        // System.out.print(" ");
        // }
        // if(row==n){
        // System.out.print("* ");
        // }
        // else{
        // System.out.print("* ");
        // for(int j=1;j<=2*(n-row)-1;j++){
        // System.out.print(" ");
        // }
        // System.out.print("* ");
        // }
        // }
        // System.out.println();
        // }

        // int n=8;
        // int m=n/2;
        // for(int row=1;row<=n;row++){
        // if(row<=m){
        // for(int j=1;j<=row;j++){
        // System.out.print("* ");
        // }
        // for(int j=1;j<=2*(m-row);j++){
        // System.out.print(" ");
        // }
        // for(int j=1;j<=row;j++){
        // System.out.print("* ");
        // }
        // }
        // else{
        // for(int j=1;j<=n-row+1;j++){
        // System.out.print("* ");
        // }
        // for(int j=1;j<=2*row-n-2;j++){
        // System.out.print(" ");
        // }
        // for(int j=1;j<=n-row+1;j++){
        // System.out.print("* ");
        // }
        // }
        // System.out.println();
        // }

        // int n=5;
        // for(int r=1;r<=n;r++){
        // for(int j=1;j<=r;j++){
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }


        // int n = 5;
        // for (int r = 1; r <= n; r++) {
        //     for (int j = 1; j <= r; j++) {
        //         int a = ('A' - 1);
        //         int b = a + j;
        //         char ans = (char) b;
        //         System.out.print(ans + " ");
        //     }
        //     System.out.println();
        // }
        // int n = 5;
        // for (int r = 1; r <= n; r++) {
        //     for (int j = 1; j <= r; j++) {
        //         int a = n-j;
        //         int b = a + 'A';
        //         char ans = (char) b;
        //         System.out.print(ans + " ");
        //     }
        //     System.out.println();
        // }

        // int n=4;
        // for(int r=1;r<=n;r++){
        //     for(int j=1;j<=n-r;j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1;j<=2*r-1;j++){
        //         System.out.print(r+" ");
        //     }
        //     System.out.println();
        // }


        int n=4;
        for(int r=1;r<=n;r++){
            for(int j=1;j<=n-r;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=r;j++){
                int a= 'A'-1;
                int b= a+j;
                char ans=(char)b;
                System.out.print(ans);
            }
            for(int j=1;j<=r-1;j++){
                int a= 'A'-1;
                int b= a+(r-j);
                char ans=(char)b;
                System.out.print(ans);                               
            }
            System.out.println();
        }
    }
}