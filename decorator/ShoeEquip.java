package pattern.decorator;

public class ShoeEquip implements IEquip
{

    @Override
    public int caculateAttack()
    {
        return 5;
    }

    @Override
    public String description()
    {
        return "圣战靴子";
    }

}