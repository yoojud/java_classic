package exam1_0204;

abstract class Unit { // 상속을 위한 클래스 abstract
    private int hp;
    // private int attackPower;
    private Point location;

    public Unit(int hp, int attackPower) {
        this.hp = hp;
        // this.attackPower = attackPower;
    }

    public void move(Point location) {
        this.location = location;
    }

    // public abstract void attack(Unit unit); // 추상메서드

    protected void reduceHp(int attackPower) {
        this.hp -= attackPower;
    }

    public int getAttackPower() {
        return this.getAttackPower();
    }

    public int getHp() {
        return this.hp;
    }

    public Point getLocation() {
        return this.location;
    }
}
