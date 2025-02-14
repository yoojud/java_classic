package exam1_0204;

public class Zergling extends Unit implements Attackable {
    private int attackPower;

    public Zergling(int hp, int attackPower) {
        super(hp, attackPower);
    }

    @Override
    public void attack(Unit unit) {
        System.out.println("근거리에서 갈고리로 공격합니다!");
        this.reduceHp(unit.getAttackPower());
    }

}
