package com.xyh;

import java.awt.*;
import java.text.NumberFormat;
import java.util.*;
import java.util.Stack;

public class Main {
//    public static  void reverse(Queue<Integer> queue) {
//        // add
//        // remove
//        // isEmpty
//        Stack<Integer> stack = new Stack<>();
//
//        while (!queue.isEmpty()) {
//            stack.push(queue.remove());
//        }
//
//        while (!stack.isEmpty()) {
//            queue.add(stack.pop());
//        }
//
//    }

    public static void main(String[] args) {
        // Implicit casting
        // byte(can be auto convert to ) > short > int > long > float > double

        // double x =1;
        // int y = (int) x + 2; // 2.0

//        String x = "1.1";
//        double y = Double.parseDouble(x) + 2.1;
//
//

//        int result = (int) Math.round(Math.random()*100);
//        String result = NumberFormat.getPercentInstance().format(.471);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name = scanner.nextLine().trim();
//        System.out.println("You are " + name);

//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Principal: ");
//        int principal = scanner.nextInt();
//
//        System.out.print("Annual Interest Rate: ");
//        float annualInterest = scanner.nextFloat();
//        double monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
//
//        System.out.print("Period (Years): ");
//        byte years = scanner.nextByte();
//        int numberOfPayments = years * MONTHS_IN_YEAR;
//
//        double mortgage = principal * ()

//        int x = 1;
//        int y = 1;
//        System.out.println(x == y);
//            int temperature = 22;
//            boolean isWarm = temperature > 20 && temperature < 30;
//
//        System.out.println(isWarm);


        // for loop
//        Array numbers = new Array(3);
//        numbers.inset(1);
//        numbers.inset(12);
//        numbers.inset(13);
//        numbers.inset(14);
//        numbers.inset(15);
//        numbers.print();
////        numbers.removeAt(-1);
//        numbers.indexOf((14));
//        numbers.print();


        // Linked List
//
//        LinkedList list = new LinkedList();
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addFirst(60);
//        System.out.println(list.contains(10));
//        System.out.println(list.indexOf(10));
//        System.out.println(list.size());
//        var array = list.toArray();
//        System.out.println(Arrays.toString(array));
//        System.out.println(list);


//        var list = new LinkedList();
//
//        list.addLast(10);
//        list.addLast(20);
//        list.addLast(30);
//        list.addLast(40);
//        list.addLast(50);
//
////        list.reverse();
////        var array = list.toArray();
//
//        System.out.println(list.getKthFromTheEnd(2));

//        Stack<Integer> stack = new Stack<>();
//        stack.push(10);
//        stack.push(20);
//        stack.push(30);
//        System.out.println(stack);
//        var top = stack.pop();
//        System.out.println(top);
//        System.out.println(stack);
//        top = stack.peek();
//        System.out.println(top);
//        String str = "apple";
//        var reverser = new StringReverser();
//        var reStr = reverser.reverse(str);
//        System.out.println(reStr);

//        String str = "[(a )]";
//
//        var exp = new Expression();
//        System.out.println(exp.isBalance(str));

        // [10, 0, 0, 0]

//        Stack stack = new Stack();
//        stack.push(1);
//        stack.push(2);
//        stack.push(3);
//        stack.push(4);
//        stack.pop();
//        System.out.println(stack);

//        Queue<Integer> queue = new ArrayDeque<>();
//        queue.add(10);
//        queue.add(20);
//        queue.add(30);
        // queue.remove();
//        reverse(queue);
//        System.out.println(queue);

//        ArrayQueue queue = new ArrayQueue(5);
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        var front = queue.dequeue();
//        queue.enqueue(40);
//        queue.enqueue(50);
//        queue.enqueue(60);
//        System.out.println(front);
//        System.out.println(queue);

//        QueueWithTwoStacks queue = new QueueWithTwoStacks();
//        queue.enqueue(10);
//        queue.enqueue(20);
//        queue.enqueue(30);
//        queue.dequeue();
//        queue.dequeue();
//        queue.dequeue();
//        var first = queue.dequeue();
//        System.out.println(first);


//        PriorityQueue<Integer> queue = new PriorityQueue<>();
//        queue.add(1);
//        queue.add(10);
//        queue.add(2);
//        queue.add(6);
//        while (!queue.isEmpty()) {
//            System.out.println(queue.remove());
//        }
//        System.out.println(queue);

//        PriorityQueue queue = new PriorityQueue();
//        queue.add(5);
//        queue.add(3);
//        queue.add(6);
//        queue.add(1);
//        queue.add(4);
//        System.out.println(queue);
//        while (!queue.isEmpty()) {
//            System.out.println(queue.remove());
//        }

//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "yz");
//        map.put(2, "sz");
//        map.put(3, "xz");
//        map.put(3, "mary");
//        System.out.println(map);
//        map.put(4, null);
//        map.put(99, null);
//        System.out.println(map.get(4));
//        map.containsKey(3); // O(1)
//        map.containsValue(null); // O(n)
//        map.put(null, "false");
//        map.remove(null);
//        System.out.println(map);
//        for (var item : map.keySet()) {
//            System.out.println(item);
//        }
//
//        for (var item : map.entrySet()) {
//            System.out.println(item);
//            System.out.println(item.getKey());
//            System.out.println(item.getValue());
//        }

        // First non-repeating character
        // a green apple
//        String str = "a green apple";

////        Map<Integer, Character>  map = new HashMap<>();
////
////        for (int i = 0; i < str.length(); i ++) {
////            char a = str.charAt(i);
////            map.put(i, a);
////        }
////
////        for (var item : map.entrySet()) {
//////            if (!map.isEmpty()) {
//////                map.remove(item.getKey());
//////            }
////            map.remove(item.getKey(), item.getValue());
////        }
//
//        int[] array = new int[str.length()];
//        for (int i = 0; i < str.length(); i ++) {
//            char a = str.charAt(i);
//            array[i] = a;
//        }
//        String str = "a green apple";
//
//        Map<Character, Integer> map = new HashMap<>();
//
//        var chars = str.toCharArray();
//        for (var ch : chars) {
////            if (map.containsKey(item)) {
////                var count = map.get(item);
////                map.put(item, count);
////            }else  {
////                map.put(item, 1);
////            }
//
//            var count = map.containsKey(ch) ? map.get(ch) : 0;
//            map.put(ch, count + 1);
//        }
//
//        for (var ch : chars) {
//            if (map.get(ch) == 1) {
//                System.out.println(ch);
//                break;
//            }
//        }

//        Set<Integer> set = new HashSet<>();
//        int[] numbers = { 1, 2, 3, 5, 9, 2};
//
//        for (var number: numbers) {
//            set.add(number);
//        }
//
//        System.out.println(set);
//        set.remove(2);
//        System.out.println(set);

        // First repeating character
//        String str = "a green apple";
//
//        Set<Character> set = new HashSet<>();
//        for (var ch: str.toCharArray()) {
//            if (set.contains(ch)) {
//                System.out.println(ch);
//                break;
//            } else {
//                set.add(ch);
//            }
//        }
//
//        System.out.println(Character.MIN_VALUE);

//        CharFinder finder = new CharFinder();
//
//        var ch = finder.findFirstNonRepeatingChar("a green apple");
//        System.out.println(ch);
//        CharFinder finder = new CharFinder();
//        System.out.println(finder.findFirstRepeatedChar("hello hello"));

//        HashTable table = new HashTable();
//        table.put(6, "apple");
//        table.put(8, "orange");
//        table.put(11, "peal");
//        table.put(6, "apple+");
//        table.put(3, "peach");
//
//        System.out.println(table.get(3));

//        Set<Integer> set = new HashSet<>();
//        int [] numbers = { 1, 2, 3, 4, 4, 2, 1};
//        for (var number: numbers) {
//            set.add(number);
//        }
//        System.out.println(set);
        Tree tree = new Tree();
        tree.insert(7);
        tree.insert(4);
        tree.insert(9);
        tree.insert(1);
        tree.insert(6);
        tree.insert(8);
        tree.insert(10);
        tree.insert(5);
//        tree.traversePreOrder();
//        tree.traverseInOrder();

        System.out.println(tree.height());

//        System.out.println(tree.find(13));



    }


    public static int fun(int n) {
        if (n == 0) return 1;
        return n * fun(n-1);
    }

}
