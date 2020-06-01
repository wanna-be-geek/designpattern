package pattern.statepattern;

public class NoMoneyState implements State {
    private VendingMachine vendingMachine;

    public NoMoneyState(VendingMachine vendingMachine){
        this.vendingMachine=vendingMachine;
    }
    @Override
    public void insertMoney()
    {
        System.out.println("投币成功");
        vendingMachine.setState(vendingMachine.getHasMoneyState());
    }

    @Override
    public void backMoney()
    {
        System.out.println("您未投币，想退钱？...");
    }

    @Override
    public void turnCrank()
    {
        System.out.println("您未投币，想拿东西么？...");
    }

    @Override
    public void dispense()
    {
        throw new IllegalStateException("非法状态！");
    }
}