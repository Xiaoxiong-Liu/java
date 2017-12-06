package algorithm.queue;

import algorithm.linkedLists.LinkedList;

import java.util.Iterator;

/**
 * Created by LiuXiaoxiong on 2017/12/6.
 * using my LikedList
 */
public class FIFOQueue<Item> implements Iterable<Item>{
    LinkedList<Item> queue;
    public FIFOQueue(){
        queue=new LinkedList<>();
    }
    //
    public void enqueue(Item item){
        queue.addLast(item);
    }

    public Item dequeue(){
        Item item=queue.get(0);
        queue.remove(0);
        return item;
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size(){
        return queue.size();
    }

    @Override
    public Iterator<Item> iterator() {
        return queue.iterator();
    }


    //test*********************

    public static void main(String[] args) {
        FIFOQueue<String> fifoQueue=new FIFOQueue<>();
        fifoQueue.enqueue("F");
        fifoQueue.enqueue("I");
        fifoQueue.enqueue("F");
        fifoQueue.enqueue("O");
        for(String s:fifoQueue){
            System.out.println(s);
        }
        System.out.println("dequeue:"+fifoQueue.dequeue());
        for (String s :
                fifoQueue) {
            System.out.println(s);
        }
    }


}
