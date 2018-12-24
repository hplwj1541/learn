package register;

import java.io.Serializable;

/**
 * Created by www on 2018/12/24.
 * 反序列化时导致单例破坏
 */
public class Seriable implements Serializable{

    //序列化就是说把内存中的状态通过转换成字节码的形式
    //从而转换一个IO流，写入到其他地方(可以是磁盘、网络IO)
    //内存中状态给永久保存下来了

    //反序列化
    //讲已经持久化的字节码内容，转换为IO流
    //通过IO流的读取，进而将读取的内容转换为Java对象
    //在转换过程中会重新创建对象new

    private Seriable(){}

    public  static final Seriable INSTANCE = new Seriable();


    public static  Seriable getInstance(){
        return INSTANCE;
    }

    /**
     * 如果反序列化对象定义了readResolve方法
         该方法的调用返回一个数组，然后readUnshared
         返回该数组的一个浅克隆;这保证了返回
         数组对象是唯一的
     * @return
     */
    private Object readResolve() {
        System.out.println("调用readResolve");
        return INSTANCE;
    }
}
