package func;


import dto.Milk;
import dto.Sanlu;

/**
 *
 */
public class SanluFactory implements  Factory {
    @Override
    public Milk getMilk() {
        return new Sanlu();
    }
}
