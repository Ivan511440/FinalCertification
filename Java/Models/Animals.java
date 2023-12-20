package Java.Models;

public class Animals {
    private String title;

    public String getPet() {
        return "Домашнее животное";
    }

    public String getPackAnimals() {
        return "Вьючное животное";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
