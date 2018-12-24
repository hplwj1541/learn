package func;


import dto.Milk;
import dto.Yili;

/**
 *
 */
public class YiliFactory implements Factory {

    @Override
    public Milk getMilk() {
        return new Yili();
    }
}
