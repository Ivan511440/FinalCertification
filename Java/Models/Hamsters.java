package Java.Models;

public class Hamsters extends Pets {
    public Hamsters() {
        setTitle("Хомяк");
    }

    @Override
    public String toString() {
        return getPet() + " - " + getTitle() + ": кличка " + getName() + ", порода " + getBreed() + ", дата рождения " + getDateOfBirth();
    }

    public String toStringNew() {
        return getName() + "," + getBreed() + "," + getDateOfBirth();
    }
}
