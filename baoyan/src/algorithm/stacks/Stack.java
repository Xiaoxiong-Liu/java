package algorithm.stacks;

import java.util.Iterator;

/**
 * Created by liuxiaoxiong on 2017/10/8.
 */
public class Stack<Item> implements Iterable<Item> {
    private Item a[];
    private int size;
    public Stack(int cap){
        a=(Item[]) new Object[cap];
    }
    //压栈
    public void push(Item i){
        if(a.length==size) resize(size*2);
        a[size++]=i;
    }
    //出栈
    public Item pop(){
        Item result = a[--size];
        a[size]=null;
        if(size>0&&size==a.length/4) resize(a.length/2);
        return result;
    }
    //重新调整大小
    private void resize(int max){
        Item[] temp=(Item[])new Object[max];
        System.arraycopy(a, 0, temp, 0, size);
        a=temp;
    }

    public int getSize(){
        return size;
    }

    public int getLen(){
        return a.length;
    }
    //逆序输出栈，从栈底到栈顶
    @Override
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            private int i=0;
            @Override
            public boolean hasNext() {
                return i<size;
            }

            @Override
            public Item next() {
                return a[i++];
            }
        };
    }

    public static void main(String[] args) {
        //################################################
        Stack stack=new Stack(5);
        //Stack<String> stack=new Stack(5);         //改成这样stack.a.length会报强转错误，百思不得解
        //################################################
        stack.push("H");
        stack.push("E");
        stack.push("L");
        stack.push("L");
        stack.push("O");
        stack.push("!");
        for (Object i : stack) {
            System.out.println(i);
        }
        System.out.println("stack的size： "+stack.getSize()+"；    stack的length： "+stack.a.length);
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("stack的size： "+stack.getSize()+"；    stack的length： "+stack.a.length);
        stack.pop();
        System.out.println("stack的size： "+stack.getSize()+"；    stack的length： "+stack.a.length);
        for (Object i : stack) {
            System.out.println(i);
        }
    }
}
