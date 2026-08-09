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