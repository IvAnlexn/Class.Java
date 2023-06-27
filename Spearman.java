// Класс Копейщик, наследующий обобщенный класс Character
public class Spearman extends Character {
    public Spearman(String name, int health, int speed) {
        super(name, health, speed);
    }

    @Override
    public void attack() {
        System.out.println("Копейщик " + getName() + " наносит удар копьем!");
    }
}