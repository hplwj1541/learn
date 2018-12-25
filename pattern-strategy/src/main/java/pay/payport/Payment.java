package pay.payport;

import pay.PayState;

/**
 * Created by www on 2018/12/25.
 */
public interface Payment {

    PayState pay(String uid, double amount);

}
