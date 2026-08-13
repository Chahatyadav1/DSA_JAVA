import java.util.*;
import java.util.stream.Collectors;

import javax.print.attribute.HashDocAttributeSet;

public class Day8 {
    static class Node{
        private int data;
        private Node next;
        private Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
        
    }
    public static void main(String[] args) {
        // ArrayList <Integer> a=new ArrayList<>();
        // ArrayList <Integer> b=new ArrayList<>();
        // a.add(1);
        // a.add(2);
        // System.out.println(a);
        // Collections.reverse(a);
        // System.out.println(a);
        Map<Integer,Boolean> map = new HashMap<>();
        map.put(1, true);
        // System.out.println(map.containsKey(1));
        System.out.println(map.get(1));
        String num="1";
        System.out.println(Integer.parseInt(num)+2);
        int a=10;
        String b=String.valueOf(a);
        System.out.println(b+2);
    }
}
