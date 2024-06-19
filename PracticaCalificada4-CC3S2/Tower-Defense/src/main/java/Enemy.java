
public class Enemy {
    private int speed; // número de celdas por turno
    private int health;
    private int reward;

    public Enemy(int i, int i1, int i2) {
        this.speed = i;
        this.health = i1;
        this.reward = i2;
    }

    // Constructores, getters y setters
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getReward() {
        return reward;
    }

    public void setReward(int reward) {
        this.reward = reward;
    }
}

class BasicEnemy extends Enemy {
    public BasicEnemy() {
        super(1, 100, 10); // velocidad, vida, recompensa
    }
}

class FastEnemy extends Enemy{
    public FastEnemy(){
        super(2, 50, 15);
    }
}

class BossEnemy extends Enemy{
    public BossEnemy() {
        super(1, 200, 30);
    }
}

