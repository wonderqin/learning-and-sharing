package wonder.sort;

/**
 * @ClassName BubbleSort
 * @Description describe the implement and optimization of the bubble sort
 * @Author wonderQin
 * @Date 2019-04-24 0:54
 **/
public class BubbleSort {

    /**
     * @Author wonderqin
     * @Description 冒泡排序初级版：其实这只是两两数据的交换而已，效率极其低下
     * @Date 1:10 2019-04-24
     * @Param [a]
     * @Return void
    **/
    public void bubbleSortOne(int[] a){
        int i, j;
        for(i = 0; i < a.length; i++){
            for(j = i+1; j < a.length; j++){
                if(a[i]>a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
    /**
     * @Author wonderqin
     * @Description 这是较为正宗的冒泡排序实现，效率明显高于上一种
     * @Date 1:15 2019-04-24
     * @Param [a]
     * @Return void
    **/
    public void bubbleSortTwo(int[] a){
        int i, j;
        for (i = 0; i < a.length; i++){
            for(j = a.length - 2; j >= i; j--){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }
    /**
     * @Author wonderqin
     * @Description 避免了已经排好序的元素进行多余的比较
     * @Date 1:20 2019-04-24
     * @Param [a]
     * @Return void
    **/
    
    public void bubbleSortThree(int[] a){
        int i, j;
        /**初始化flag为false**/
        boolean flag = true;
        for(i = 0; i < a.length && flag; i++){
            flag = false;
            for(j = a.length - 2; j >= i; j--){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    flag = true;
                }
            }
        }
    }
}
