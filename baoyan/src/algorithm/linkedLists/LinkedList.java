package algorithm.linkedLists;

import java.util.Iterator;

/**
 * Created by liuxiaoxiong on 2017/10/8.
 */
public class LinkedList<Item> implements Iterable<Item>{
    Node<Item> first;

    private class Node<Item>{
        Item item;
        Node<Item> next;

        public Node(Item i){
            item=i;
        }
        public Node(){}
    }

    public  LinkedList(){}

    public  LinkedList(Item item){
        first=new Node<>(item);
    }

    //判断是否为空
    public boolean isEmpty(){
        return first==null;
    }

    //判断链表大小
    public int size(){
        if(isEmpty())return 0;
        Node<Item> temp=first;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }


    //在单链表尾加上一个元素
    public void addLast(Item item){
        if(isEmpty()) {
            first=new Node<>(item);
        }else{
            Node<Item> temp=first;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new Node<>(item);
        }
    }
    //在单链表头加上一个元素
    public void addFirst(Item item){
        Node<Item> temp=new Node<>(item);
        temp.next=first;
        first=temp;
    }

    //在制定位置添加元素
    public void add(int index,Item item){
        Node<Item> temp=first;
        if(index==0){
            addFirst(item);
            return;
        }
        while(--index>0&&temp!=null&&temp.next!=null){
            temp=temp.next;
        }
        if(index>0){
            throw new IndexOutOfBoundsException("add()越界异常！");
        }
        Node<Item> now=new Node<>(item);
        now.next=temp.next;
        temp.next=now;
    }
    //移除指定位置元素
    public void remove(int index){
        Node<Item> temp=first;
        if(index==0){
            if(first==null){
                throw new IndexOutOfBoundsException("remove()越界异常！");
            }
            first=first.next;
            return;
        }
        while(--index>0&&temp!=null&&temp.next!=null){
            temp=temp.next;
        }
        if(index!=0)throw new IndexOutOfBoundsException("remove()越界异常！");
        temp.next=temp.next.next;
    }
    //获取第index个元素
    public Item get(int index){
        Node<Item> temp=first;
        if(index==0){
            if(first==null){
                throw new IndexOutOfBoundsException("get()越界异常！");
            }
            return first.item;
        }
        while(--index>0&&temp!=null&&temp.next!=null){
            temp=temp.next;
        }
        if(index!=0)throw new IndexOutOfBoundsException("get()越界异常！");

        return temp.next.item;
    }
    //迭代器
    public Iterator<Item> iterator(){
        return new Iterator<Item>() {
            Node<Item> temp=first;
            @Override
            public boolean hasNext() {
                return temp!=null;
            }

            @Override
            public Item next() {
                Item result=temp.item;
                temp=temp.next;
                return result;
            }
        };
    }

    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<>();
        linkedList.addLast("Hello");
        linkedList.addLast(",");
        linkedList.addLast("world");
        linkedList.add(0,"****");
        linkedList.add(0,"&&&&");
//        linkedList.add(6,"em");
        linkedList.addFirst("Ha");
        linkedList.remove(2);
        linkedList.remove(1);
        for(String s:linkedList){
            System.out.println(s);
        }
        System.out.println("is Empty?\t"+linkedList.isEmpty()+"\nsize\t"+linkedList.size());
        System.out.println(linkedList.get(3));
    }
}
