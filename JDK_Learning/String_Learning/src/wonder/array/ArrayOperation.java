package wonder.array;

import wonder.array.exception.IsNotTheSameInstanceException;
import wonder.array.utils.ArrayUtils;

import java.util.Date;
import java.util.logging.Logger;

public class ArrayOperation {
    private static Logger logger = Logger.getLogger(ArrayOperation.class.getName());
    ArrayUtils ArrayUtils;
    private Object Exception;

    /*
     * @Author wonderqin
     * @Description //init
     * @Date
     * @Param
     * @return
    **/
    public Object[] initArray(int arrayLenth){
        return new Object[arrayLenth];
    }


    public Object[] insert(Object[] array, Object input, int insertLoc){

        //if the instance of array's element is not the same as input
        if(!array[0].getClass().isInstance(input.getClass())){
            throw new IsNotTheSameInstanceException("the input element is not the same as the array which is prepare to insert");
        }

        //if the location of insertion is illegal, throw exceptions
        if(insertLoc >= array.length -1 || insertLoc < 0){
            logger.info("the location of insertion is illegal.");
        }

        Object[] newArray = ArrayUtils.copyArray(array);
        //if the array is full, extend its capacity
        if(ArrayUtils.isFull(array)){
            newArray[newArray.length -1] = array[insertLoc];
            newArray[insertLoc] = input;
        }

        return newArray;
    }
}
