public class Tower {
    private int damage;
    private int range;
    private int fireRate;
    String representation;

    public Tower(int i, int i1, int i2) {
        this.damage = i;
        this.range = i1;
        this.fireRate = i2;
    }

    public Tower() {}

    // Constructores, getters y setters
    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRange() {
        return range;
    }

    public void setRange(int range) {
        this.range = range;
    }

    public int getFireRate() {
        return fireRate;
    }

    public void setFireRate(int fireRate) {
        this.fireRate = fireRate;
    }

    public String getRepresentation() {
        return representation;
    }
}

class CannonTower extends Tower {
    public CannonTower() {
        super(50, 2, 3); // daño, alcance, velocidad de disparo
        this.representation = "CT";
    }
}

class LaserTower extends Tower {
    public LaserTower() {
        super(25, 4, 3);
        this.representation = "LT";
    }
}

class ArrowTower extends Tower {
    public ArrowTower() {
        super(10, 3, 5);
        this.representation = "AT";
    }
}

