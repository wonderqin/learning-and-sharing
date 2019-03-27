# learning-and-sharing
Today, I was heard a voice like this, " Code is not only for working, is more than sharing". In the last several years, this opinion had not remained in my mind yet. But I think this situation is gonna be changed from now on.  By the way, I am review the basic knowledge  these days. And I am planing to learn data structure and algorithms, Java multi-thread and Spring. I will share my code, questions, and the settlement in git. I hope that, for the first time, I can regulate my programming habits; and share my experience for the people, and it will be the best to receive your comments and some suggestions.

## 基本的数据结构与源码实现

### ArrayList
####属性
- 版本号：

    private static final long serialVersionUID = 8683452581122892189L;

- Object数组对象，用于存放ArrayList元素：

    transient Object[] elementData;

- 数组实际元素个数

    private int size;
####构造方法
We are All know about that ArrayList has three kinds of construction method as you can see follows :

----------
1. without parameter
2. with a parameter : int capacity
3. with the parameter of Collection<E> e

无参构造：实例化数组时默认赋值大小为10

![](http://a4.qpic.cn/psb?/V10PxiNJ23dK2a/sftnsP22bfxD3dzdbgX1vQ.mZOTv2c3WIFKJn5Agf7o!/m/dDMBAAAAAAAAnull&bo=GANNAAAAAAADB3Q!&rf=photolist&t=5)

带指定初始化大小的有参构造：

如果大小赋值大于0，新建initialCapacity大小的Object数组；如果等于0，初始化为空数组，否则抛出非法参数异常
![](http://a2.qpic.cn/psb?/V10PxiNJ23dK2a/4s*XoGn8cdPRaFNtmAlWzcgP1t3eHyn0IrHlK4cOYXw!/m/dDUBAAAAAAAAnull&bo=AQOwAAAAAAADB5A!&rf=photolist&t=5)

带集合参数的有参构造：
将集合中的元素copy一份给ArrayList
![](http://a4.qpic.cn/psb?/V10PxiNJ23dK2a/UGhcZGMWrz9IItSmrVaUc3Ig8dtKrEGZKIfSQOCwICc!/m/dMMAAAAAAAAAnull&bo=5QNKAQAAAAADB48!&rf=photolist&t=5)

####重要方法
**添加元素**

- 添加一个元素到数组末尾
![](http://a4.qpic.cn/psb?/V10PxiNJ23dK2a/Yjahvaxk7ym2o0r6yI0WP70oh7LLNjXUX*nw20eBnYQ!/m/dL8AAAAAAAAAnull&bo=IgO*AAAAAAADB7w!&rf=photolist&t=5)


这里有ensureCapacityInternal(size + 1) 方法：

![](http://a2.qpic.cn/psb?/V10PxiNJ23dK2a/uvVxuUX3g7n6t8.jLLO*6teCjRAs*SawlNzLMVW3Sgk!/m/dDUBAAAAAAAAnull&bo=JQM4AQAAAAADBz0!&rf=photolist&t=5)

可以看到：

如果ArrayList数组的初始化是通过无参构造的，minCapacity则为0；

如果ArrayList数组的初始化是带initialCapacity参数的，那么minCapcity为当前元素个数+1（size + 1)

如果数据e插入后的容量(minCapacity)不大于数组长度（elementData.length)，则正常插入数据到下标为size的位置，并将数组实际元素个数+1，并返回true

否则，将需要对ArrayList进行扩容（grow(minCapacity))

![](http://a2.qpic.cn/psb?/V10PxiNJ23dK2a/pZ7LZPUCJhNrGqFUpinjjmYvE3.*BpKKtxbJkP8UcSc!/m/dDUBAAAAAAAAnull&bo=4wImAQAAAAADB.Q!&rf=photolist&t=5)

首先将旧的数组容量扩容为 ： 原来容量+（原来容量按位右移一个比特位后的大小）

如果新容量小于minCapacity,则直接将minCapacity赋值给newCapacity

如果新容量大于数组可存储的最大容量:

（1）minCapacity < 0,报OOM

（2）如果minCapcity 大于 Integer.MAX_VALUE - 8，返回Integer.MAX_VALUE；否则，返回Integer.MAX_VALUE - 8;

再进行元素的插入和size + 1

- 添加一个元素到指定下标位置
![](http://a3.qpic.cn/psb?/V10PxiNJ23dK2a/6qKtv3cfnmEtUP1hm6i6iP2CXHfvsgjhbCxIp3Ig9.A!/m/dDYBAAAAAAAAnull&bo=EAM2AQAAAAADBwY!&rf=photolist&t=5)


