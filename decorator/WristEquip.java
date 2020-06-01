package pattern.decorator;

public class WristEquip implements IEquip
{

    @Override
    public int caculateAttack()
    {
        return 5;
    }

    @Override
    public String description()
    {
        return "圣战护腕";
    }

}