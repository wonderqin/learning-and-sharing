package wonder.sort;

/**
 * @ClassName StraightInsertionSort
 * @Description 直接插入排序的两种实现（设置哨兵/不设置哨兵）
 * @Author wonderQin
 * @Date 2019-04-25 1:08
 **/
public class StraightInsertionSort {

    /**
     * @Author wonderqin
     * @Description 带哨兵的直接插入排序算法实现
     * @Date 1:19 2019-04-25
     * @Param [a]
     * @Return void
    **/

    public void insertionSortOne(int[] a){
        if(a.length <= 1){return;}
        int i, j;
        for(i = 2; i < a.length; i++){
            /**如果后一项比前一项小，则需要进行排序操作**/
            if(a[i] < a[i - 1]){
                /**设置哨兵为a[i]，此时的哨兵的值即为需要进行插入的元素的值**/
                a[0] = a[i];
                /**如果待插入元素对比有序区的元素更小，则将有序区的元素往后移，直到找到插入位置为止**/
                for(j = i - 1; a[j] > a[0]; j--){
                    a[j + 1] = a[j];
                }
                /**元素插入**/
                a[j + 1] = a[0];
            }
        }
    }

    /**
     * @Author wonderqin
     * @Description 不带哨兵的直接插入排序
     * @Date 1:20 2019-04-25
     * @Param [a]
     * @Return void
    **/

    public void insertionSortTwo(int[] a){
        if(a.length <= 1){return;}
        for(int i = 1; i < a.length; i++){
            int value = a[i];
            int j = i - 1;
            for(; j >= 0; j--){
                if(a[j] > value){
                    a[j + 1] = a[j];
                }
            }
            a[j + 1] = value;
        }
    }
}
