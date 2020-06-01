package pattern.decorator;

public class ArmEquip implements IEquip {
    /**
     * 武器
     * 攻击力20
     * @author timmy
     */
    @Override
    public int caculateAttack() {
        return 20;
    }

    @Override
    public String description() {
        return "屠龙刀";
    }
}
