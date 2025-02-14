package exam1_0204;

class Dragon extends Unit implements Attackable {
    private int attackPower;

    public Dragon(int hp, int attackPower) {
        super(hp, attackPower);
    }

    @Override
    public void attack(Unit unit) {
        System.out.println("원거리에서 레이저포로 공격합니다!");
        this.reduceHp(unit.getAttackPower());
    }

    @Override
    public int getAttackPower() {
        return this.attackPower;
    }
}
