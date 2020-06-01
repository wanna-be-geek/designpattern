package pattern.strategy;

public class Test {
    public static void main(String[] args) {
        Role roleA=new RoleA("A");
        roleA.setAttackBehavior(new AttackJY())
                .setDefendBehavior(new DefendTBS())
                .setDisplayBehavior(new RunJCTQ());
        System.out.println(roleA.name+":");
        roleA.attack();
        roleA.defend();
        roleA.display();
    }
}
