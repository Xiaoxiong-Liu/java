package algorithm.sort;

import java.util.Random;

/**
 * Created by LiuXiaoxiong on 2017/12/7.
 */
public class SortUtil {
    //if a is less b
    private static boolean less(Comparable a,Comparable b){
        return a.compareTo(b)<0;
    }

    //swap two Objects in an array
    private static void swap(Comparable[] a,int i,int j){
        Comparable temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }

    //show all
    public static void show(Comparable[] array){
        for (Comparable a:array){
            System.out.print(a+" ");
        }
        System.out.println();
    }

    //if the array is sorted
    public static boolean isSorted(Comparable[] array){
        int len=array.length;
        for(int i=1;i<len;i++){
            if(less(array[i],array[i-1]))return false;
        }
        return true;
    }

    //shuffle the array
    public static void shuffle(Comparable[] a){
        int len=a.length;
        Random random=new Random();
        for(int i=0;i<len;i++){
            swap(a,random.nextInt(len),random.nextInt(len));
        }
        //****test*********
        System.out.print("After shuffle:    ");
        show(a);
        //*****************
    }

    //插入排序，可优化
    //insert sort
    public static void insertSort(Comparable[] a){
        int len=a.length;
        for(int i=1;i<len;i++){
            for(int j=i;j>0&&less(a[j],a[j-1]);j--){
                swap(a,j,j-1);
            }

        }
    }

    //选择排序
    public static void selectSort(Comparable[] a){
        for(int i=0;i<a.length;i++){
            int min=i;
            for(int j=i;j<a.length;j++){
                if(less(a[j],a[min]))min=j;
            }
            swap(a,i,min);
        }
    }

    //希尔排序
    public static void shellSort(Comparable[] a){
        int len=a.length;
        int h=1;

        while(h<len/3)h=h*3+1;

        while(h>=1){
            for(int i=h;i<len;i++){
                for(int j=i;j>=h&&less(a[j],a[j-h]);j-=h)
                    swap(a,j,j-h);
            }
            h=h/3;
        }

    }

    //二分查找
    public static int binarySearch(Comparable[] a,Comparable target){
        int len=a.length;
        int low=0;
        int high=len-1;
        int mid=(low+high)/2;
        while(low<high){
            if(less(a[mid],target)){
                low=mid+1;
                mid=(low+high)/2;
            }else if(less(target,a[mid])){
                high=mid;
                mid=(high+low)/2;
            }else{
                return mid;
            }
        }
        if(target.equals(a[low]))return mid;
        if(target.equals(a[high]))return high;

        return -1;
    }

    //归并排序
    public static void mergeSort(Comparable[] a,int low,int high){


        if(low>=high)return;
        mergeSort(a,low,(high+low)/2);
        mergeSort(a,(low+high)/2+1,high);
        merge(a,low,(low+high)/2,high);

    }

    private static void merge(Comparable[] a,int low,int mid ,int high){
        Comparable[] temp=new Comparable[a.length];
        for (int i = 0; i < a.length; i++) {
            temp[i]=a[i];
        }
        int i=low;
        int j=mid+1;
        for(int k=low;k<=high;k++){
            //左数列已经取完了，后半部分肯定是右数列，不需要更改了
            if(i>mid)                       return;
            //剩下的都是左半数列
            else if(j>high)                 a[k]=temp[i++];
            //从左边取元素
            else if(less(temp[j],temp[i]))  a[k]=temp[j++];
            else                            a[k]=temp[i++];
        }
    }

    //归并排序
    public static void mergeSort2(Comparable[] a,int low,int high){

    }

    public static void main(String[] args) {
        Integer[]a={1,2,3,6,9,0,45,7,98,55,89,30,31,32,33,34};
        show(a);
        System.out.println("is sorted?   "+isSorted(a));

        insertSort(a);
        System.out.print("After insert sort:    ");
        show(a);
        shuffle(a);
        selectSort(a);
        System.out.print("After select sort:     ");
        show(a);
        shuffle(a);
        shellSort(a);
        System.out.print("After shell sort:     ");
        show(a);
        System.out.println("Binary search test:"+binarySearch(a,98));

        shuffle(a);
        mergeSort(a,0,a.length-1);
        System.out.print("After merge sort:     ");
        show(a);

    }
}
