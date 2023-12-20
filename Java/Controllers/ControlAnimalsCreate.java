package Java.Controllers;

import Java.Models.*;
import Java.Views.*;

import java.time.LocalDate;

public class ControlAnimalsCreate {
    UserInterface userInterface = new UserInterface();
    private String[] dateAnimals;
    DataBase dataBase = new DataBase();

    public void createRecordsAnimals(int numberMenuAnimals, String title) {
        switch (numberMenuAnimals) {
            case 1 -> {
                Dogs dogs = new Dogs();
                dateAnimals = userInterface.enteringDataAnimal();
                dogs.setName(dateAnimals[0]);
                dogs.setBreed(dateAnimals[1]);
                dogs.setDateOfBirth(LocalDate.parse(dateAnimals[2]));
                dataBase.fileRecording(title, true, dogs.toStringNew());
            }
            case 2 -> {
                Cats cats = new Cats();
                dateAnimals = userInterface.enteringDataAnimal();
                cats.setName(dateAnimals[0]);
                cats.setBreed(dateAnimals[1]);
                cats.setDateOfBirth(LocalDate.parse(dateAnimals[2]));
                dataBase.fileRecording(title, true, cats.toStringNew());
            }
            case 3 -> {
                Hamsters hamsters = new Hamsters();
                dateAnimals = userInterface.enteringDataAnimal();
                hamsters.setName(dateAnimals[0]);
                hamsters.setBreed(dateAnimals[1]);
                hamsters.setDateOfBirth(LocalDate.parse(dateAnimals[2]));
                dataBase.fileRecording(title, true, hamsters.toStringNew());
            }
            case 4 -> {
                Horses horses = new Horses();
                dateAnimals = userInterface.enteringDataAnimal();
                horses.setName(dateAnimals[0]);
                horses.setBreed(dateAnimals[1]);
                horses.setDateOfBirth(LocalDate.parse(dateAnimals[2]));
                dataBase.fileRecording(title, true, horses.toStringNew());
            }
            case 5 -> {
                Camels camels = new Camels();
                dateAnimals = userInterface.enteringDataAnimal();
                camels.setName(dateAnimals[0]);
                camels.setBreed(dateAnimals[1]);
                camels.setDateOfBirth(LocalDate.parse(dateAnimals[2]));
                dataBase.fileRecording(title, true, camels.toStringNew());
            }
            case 6 -> {
                Donkeys donkeys = new Donkeys();
                dateAnimals = userInterface.enteringDataAnimal();
                donkeys.setName(dateAnimals[0]);
                donkeys.setBreed(dateAnimals[1]);
                donkeys.setDateOfBirth(LocalDate.parse(dateAnimals[2]));
                dataBase.fileRecording(title, true, donkeys.toStringNew());
            }
        }
    }
}
