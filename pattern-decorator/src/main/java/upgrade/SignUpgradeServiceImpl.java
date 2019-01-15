package upgrade;

import old.RegisterService;
import old.RegisterServiceImpl;

public class SignUpgradeServiceImpl implements SignUpgradeService {

    private RegisterService registerService = new RegisterServiceImpl();


    @Override
    public void newAdd() {

    }

    @Override
    public void newUpdate() {

    }

    @Override
    public void add() {
        registerService.add();
    }

    @Override
    public void update() {
        registerService.update();
    }
}
