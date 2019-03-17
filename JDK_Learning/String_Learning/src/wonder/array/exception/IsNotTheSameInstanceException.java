package wonder.array.exception;

/**
 * @ClassName IsNotTheSameInstance
 * @Description the exception settlement of array
 * @Author wonderQin
 * @Date 2019-03-18 0:56
 **/
public class IsNotTheSameInstanceException extends RuntimeException {
    public IsNotTheSameInstanceException(){};
    public IsNotTheSameInstanceException(String excepMsg){
        super(excepMsg);
    }
}
