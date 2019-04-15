package wonder.iterator.collections.list.linkedlist;

/**
 * @ClassName LinkedList
 * @Description TODO
 * @Author wonderQin
 * @Date 2019-04-14 2:24
 **/
public class LinkedList<T> {

    /**链表表长**/
    protected int size;
    /**头结点**/
    protected Node head;
    /**尾结点**/
    protected Node tail;

    /**无参构造，其实就是初始化一个空链**/
    public LinkedList(){
        size = 0;
        head = null;
        tail = null;
    }

    /**判空**/
    public boolean isEmpty(){
        return size==0?true:false;
    }


}
