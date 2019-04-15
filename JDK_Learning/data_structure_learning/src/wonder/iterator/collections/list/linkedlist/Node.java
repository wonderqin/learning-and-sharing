package wonder.iterator.collections.list.linkedlist;

/**
 * @ClassName Node
 * @Description 为使操作方便，这里的属性不用private修饰
 * @Author wonderQin
 * @Date 2019-04-14 0:19
 **/
public class Node<T> {

    /**存放数据的变量**/
    public T data;

    /**存放结点数据的变量**/
    public Node<T> next;

    public Node(){}

    public Node(T data, Node next){
        this.data = data;
        this.next = next;
    }
}
