package exam1_0204;

public class Zealot extends Unit implements Attackable {
    private int attackPower;

    public Zealot(int hp, int attackPower) {
        super(hp, attackPower);
    }

    @Override
    public void attack(Unit unit) {
        System.out.println("근거리에서 사시미칼로 공격합니다!");
        this.reduceHp(unit.getAttackPower());
    }

    @Override
    public int getAttackPower() {
        return this.attackPower;
    }
}
