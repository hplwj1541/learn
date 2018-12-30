package upgrade;

import old.RegisterService;
import old.RegisterServiceImpl;

public class SignUpgradeServiceImpl implements SignUpgradeService {

    private RegisterService registerService = new RegisterServiceImpl();


    public void newAdd() {

    }

    public void newUpdate() {

    }

    public void add() {
        registerService.add();
    }

    public void update() {
        registerService.update();
    }
}
