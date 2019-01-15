package func;


import dto.Milk;
import dto.Telunsu;

/**
 * 事情变得越来越专业
 *
 */
public class TelunsuFactory implements Factory {

    @Override
    public Milk getMilk() {
        return new Telunsu();
    }
}
