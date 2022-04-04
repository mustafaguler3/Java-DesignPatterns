package singleton;

import java.io.Serializable;

public class DateUtil implements Serializable,Cloneable {

    private static final long serialVersionUID = 3497801066706367457L;
    private static DateUtil instance;

    private DateUtil(){

    }

    public static DateUtil getInstance(){
        synchronized (DateUtil.class){
            if(instance == null){
                instance = new DateUtil();
            }
        }

        return instance;
    }

    public Object readResolve(){
        return instance;
    }

}




















