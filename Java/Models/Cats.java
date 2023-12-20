package Java.Models;

public class Cats extends Pets {
    public Cats() {
        setTitle("Кошка");
    }

    @Override
    public String toString() {
        return getPet() + " - " + getTitle() + ": кличка " + getName() + ", порода " + getBreed() + ", дата рождения " + getDateOfBirth();
    }

    public String toStringNew() {
        return getName() + "," + getBreed() + "," + getDateOfBirth();
    }
}
