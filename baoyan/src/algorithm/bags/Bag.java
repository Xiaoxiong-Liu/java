package algorithm.bags;

import algorithm.linkedLists.LinkedList;

/**
 * Created by LiuXiaoxiong on 2017/12/6.
 * Using linkedList.LinkedList
 */
public class Bag<Item> {
    LinkedList<Item> bag;
    Bag(){
        bag=new LinkedList<>();
    }
    public void add(Item item){
        bag.addLast(item);

    }

    public boolean isEmpty(){
        return bag.isEmpty();
    }

    public int size(){
        return bag.size();
    }

    public static void main(String[] args) {
        Bag<String> bag=new Bag<>();
        System.out.println("Is it empty?   "+bag.isEmpty());
        bag.add("Hello");
        System.out.println("Is it empty?   "+bag.isEmpty());
        System.out.println("size:    "+bag.size());
        System.out.println("TEST");
    }

}
