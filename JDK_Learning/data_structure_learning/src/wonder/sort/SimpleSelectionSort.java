package wonder.sort;

/**
 * @ClassName SimpleSelectionSort
 * @Description TODO
 * @Author wonderQin
 * @Date 2019-04-24 23:26
 **/
public class SimpleSelectionSort {

    public void SelectionSort(int[] a){
        int i, j, min;
        for (i = 0; i < a.length; i++){
            min = i;
            for (j = i + 1; j < a.length; j++){
                if( a[min] > a[j]){
                    min = j;
                }
            }
            if(min != i){
                int temp = a[i];
                a[i] = a[min];
                a[min] = temp;
            }
        }
    }
}
