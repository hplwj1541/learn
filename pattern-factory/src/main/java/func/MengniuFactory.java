package func;


import dto.Mengniu;
import dto.Milk;

/**
 *
 */
public class MengniuFactory implements  Factory {


    @Override
    public Milk getMilk() {
        return new Mengniu();
    }
}
