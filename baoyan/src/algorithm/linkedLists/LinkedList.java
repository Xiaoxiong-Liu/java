package algorithm.linkedLists;

/**
 * Created by liuxiaoxiong on 2017/10/8.
 */
public class LinkedList<Item> {
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

    //在单链表尾加上一个元素
    public void addLast(Item item){
        if(first==null) {
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

    public void remove(int index){
        Node<Item> temp=first;
        if(index==0){
            if(first==null){
                throw new IndexOutOfBoundsException("remove()越界异常！");
            }
            first=first.next;
        }
        while(--index>0&&temp!=null&&temp.next!=null){
            temp=temp.next;
        }
    }
}
