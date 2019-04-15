package wonder.iterator.collections.list.linkedlist;

/**
 * @ClassName LinkedOperation
 * @Description 链表的基本操作
 * @Author wonderQin
 * @Date 2019-04-14 0:55
 **/
public class LinkedOperation<T> {
    /**链表引用**/
    private LinkedList linkedList;

    /**
     * @Author wonderqin
     * @Description 向链表的表尾插入一个结点
     * @Date 2:02 2019-04-14
     * @Param [node]
     * @Return void
    **/
    public void addNode (Node node){
        Node temp = linkedList.head;
        /**遍历链表，找到链表的最后一个结点**/
        while (temp.next != null){
            temp = temp.next;
        }
        /**将末结点的指针指向新增的元素，并将新增元素的指针指向空，表长加1**/
        temp.next = node;
        node.next = null;
        linkedList.size ++;
    }

    /**
     * @Author wonderqin
     * @Description 34   在index位置后插入结点node
     * @Date 15:28 2019-04-14
     * @Param [node, index]
     * @Return void
    **/

    public void addElementByIndex(Node<T> node, int index){

        /**如果链表为空**/
        if(linkedList.isEmpty()){
            if(index != 0){throw new IndexOutOfBoundsException();}
            node.next = null;
            linkedList.head = node;
            linkedList.size++;
        }

        /**首先判断插入位置是否合法**/
        if(index <= -1 || index > linkedList.size - 1){
            throw new IndexOutOfBoundsException("the index is out of linkedList");
        }
        /**维护一个可变的成员变量**/
        Node<T> temp = linkedList.head;
        /**维护遍历时的结点位置**/
        int nodeIndex = 0;
        /**遍历链表，找到插入位置**/
        while (temp.next != null){
            nodeIndex++;
            if(nodeIndex == index){
                /**说明该位置为插入位置**/
                node.next = temp.next;
                temp.next = node;
            }
            temp = temp.next;
        }
        linkedList.size++;
    }

    /**
     * @Author wonderqin
     * @Description 73 头插法
     * @Date 16:09 2019-04-14
     * @Param [node]
     * @Return void
    **/
    public void addEleAtHead(Node<T> node){
        node.next = linkedList.head.next;
        linkedList.head.next = node;
        linkedList.size++;
    }
    
    /**
     * @Author wonderqin
     * @Description 86  尾插法:
     * @Date 16:11 2019-04-14
     * @Param [node]
     * @Return void
    **/
    public void addEleAtTail(Node<T> node){
        node.next = null;
        linkedList.tail.next = node;
        /**改变链表的末结点**/
        linkedList.tail = node;
        linkedList.size ++;
    }

    public Node<T> deleteByIndex(int index){
        Node<T> temp = linkedList.head;
        int nodeIndex = 0;
        /**待删除结点**/
        Node<T> deleteNode = linkedList.head;
        /**检查删除位置是否合理**/
        if(index < -1 || index > linkedList.size){throw new IndexOutOfBoundsException();}

        /**如果删除结点就是第一个结点，则将头指针指向下一个结点，并返回第一个元素**/
        if(index == 0){
            linkedList.head = linkedList.head.next;
            deleteNode = linkedList.head.next;
            linkedList.head.next = null;
            linkedList.size--;
        }
        /**遍历链表，找到删除位置**/
        while(temp.next != null){
            if(nodeIndex == index){
                temp.next = temp.next.next;
                deleteNode = temp;
                temp.next.next = null;
            }
            temp = temp.next;
            linkedList.size--;
        }
        /**如果index为尾结点的位置,此时temp为尾结点**/
        if(temp.next == null){
            deleteNode = findNodeByIndex(index - 1);
            linkedList.tail = findNodeByIndex(index - 2);
            linkedList.tail = null;
            linkedList.size--;
        }
        return deleteNode;
    }

    /**
     * @Author wonderqin
     * @Description 根据索引寻找结点
     * @Date 20:37 2019-04-15
     * @Param [index]
     * @Return wonder.iterator.collections.list.linkedlist.Node<T>
    **/

    public Node<T> findNodeByIndex(int index){
        int tempIndex = 0;
        Node<T> tempNode = linkedList.head;
        Node<T> targetNode = linkedList.head;
        /**遍历链表，找到index的位置**/
        while (tempNode.next != null){
            if(tempIndex == index){
                targetNode = tempNode;
            }
            tempIndex++;
            tempNode = tempNode.next;
        }
        return targetNode;
    }

    /**
     * @Author wonderqin
     * @Description 根据索引获取该索引位置的数据
     * @Date 20:43 2019-04-15
     * @Param [index]
     * @Return T
    **/
    public T getDataByIndex(int index){
        return findNodeByIndex(index).data;
    }

}
