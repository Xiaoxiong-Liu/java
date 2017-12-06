package algorithm.stacks;

import algorithm.linkedLists.LinkedList;

import java.util.Iterator;

/**
 * Created by LiuXiaoxiong on 2017/12/6.
 * using my LinkedList
 */
public class Stack2 <Item> implements Iterable<Item>{
    LinkedList<Item> stack;
    Stack2(){
        stack=new LinkedList<>();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        return stack.size();

    }

    public void push(Item item){
        stack.addLast(item);
    }

    public Item pop(){
        Item item=stack.get(size()-1);
        stack.remove(size()-1);
        return item;
    }


    @Override
    public Iterator<Item> iterator() {
        return stack.iterator();
    }


    //test**************
    public static void main(String[] args) {
        Stack2<String> stack2=new Stack2<>();
        stack2.push("I");
        stack2.push(" ");
        stack2.push("Love");
        for(String s:stack2){
            System.out.println(s);
        }

        System.out.println("POP:    "+stack2.pop()+"   remain:"+stack2.size());

    }
}
