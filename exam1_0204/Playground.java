package exam1_0204;

public class Playground {
    public static void main(String[] args) {
        Unit d1 = new Dragon(20, 2);
        Unit z1 = new Zealot(30, 3);
        Unit m1 = new Marine(15, 2);
        Unit m2 = new Medic(15, 0);

        Unit[] units = { d1, z1, m1, m2 };

        for (Unit u : units) {
            if (u instanceof Attackable) {
                ((Attackable) u).attack(d1);
            }
        }

        // m1.attack(d1);
        // z1.attack(m1);
    }
}
