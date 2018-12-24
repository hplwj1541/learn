package cglib;

import net.sf.cglib.core.DebuggingClassWriter;

/**
 * Created by www on 2018/12/24.
 */
public class CglibTest {

    public static void main(String[] args) {
        //设置源码输出地址
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "D://tmp");
        ZhangSan zhangSan = (ZhangSan) new CglibMeipo().getInstance(ZhangSan.class);
        System.out.println(zhangSan.getClass());
        zhangSan.findLove();


/*        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }



}
