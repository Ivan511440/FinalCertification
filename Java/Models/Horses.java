package Java.Models;

public class Horses extends PackAnimals {
    public Horses() {
        setTitle("Лошадь");
    }

    @Override
    public String toString() {
        return getPackAnimals() + " - " + getTitle() + ": кличка " + getName() + ", порода " + getBreed() + ", дата рождения " + getDateOfBirth();
    }

    public String toStringNew() {
        return getName() + "," + getBreed() + "," + getDateOfBirth();
    }
}
