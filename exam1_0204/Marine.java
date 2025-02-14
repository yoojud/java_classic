package exam1_0204;

public class Marine extends Unit implements Attackable {
    private int attackPower;

    public Marine(int hp, int attackPower) {
        super(hp, attackPower);
    }

    @Override
    public void attack(Unit unit) {
        System.out.println("원거리에서 기관총으로 공격합니다!");
        this.reduceHp(unit.getAttackPower());
    }

    @Override
    public int getAttackPower() {
        return this.attackPower;
    }

}
