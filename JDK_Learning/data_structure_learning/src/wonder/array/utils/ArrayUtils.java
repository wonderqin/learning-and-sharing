package wonder.array.utils;

import wonder.array.exception.IsNotTheSameInstanceException;

/**
 * @ClassName ArrayUtils
 * @Description the comment operation of array
 * @Author wonderQin
 * @Date 2019-03-18 0:00
 **/
public class ArrayUtils {


    private Exception IsNotTheSameInstance;

    /**
     * @Author wonderqin
     * @Description adjust the array if is full
     * @Date
     * @Param
     * @return
    **/
    public boolean isFull(Object[] obj){
        boolean flag = true;
        for(Object o : obj){
            if(o == "" || o ==null){
                flag = false;
                break;
            }
        }
        return flag;
    }

    /*
     * @Author wonderqin
     * @Description only consider that the newArray is empty at the first time
     * @Date
     * @Param
     * @return
    **/
    public Object[] copyArray(Object[] oldArray){

        Object[] newArray = new Object[oldArray.length + 1];
        for(int i = 0; i <= oldArray.length - 1; i++){
            for (int j = 0; j <= newArray.length - 1; j++){
                newArray[j] = oldArray[i];
            }
        }
        return newArray;
    }
}
