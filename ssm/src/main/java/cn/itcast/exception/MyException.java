package cn.itcast.exception;

/**
 * @author kpwang
 * @create 2020-07-24 14:44
 */
public class MyException extends RuntimeException {
    private String message;

    public MyException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
