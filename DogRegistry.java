//Kristoffer Rova Ketola, krke0142

import java.util.ArrayList;

public class DogRegistry {
    private ScannerDog sc = new ScannerDog();
    private ArrayList<DogType> allDogs = new ArrayList<>();

    private void registerNewDog(){
        String dogName = sc.readString("Name of the dog: ");
        String dogRace = sc.readString("Race of the dog: ");
        int dogAge = sc.readInt("Age of the dog: ");
        double dogWeight = sc.readDouble("Weight of the dog: ");

        DogType Dog = new DogType(dogName, dogRace, dogAge, dogWeight);
        allDogs.add(Dog);
        System.out.println(" ");
    }
    private void increaseAge(){
        String increaseAge = sc.readString("Increase selected dogs age with one(1) year. \n " +
                "Type the name of the dog: ");
        boolean dogAgeIncrease = false;
        for (int i = 0; i <allDogs.size(); i++){
            if (allDogs.get(i).getName().equalsIgnoreCase(increaseAge)){
                dogAgeIncrease = true;
                allDogs.get(i).incDogAge();
                System.out.printf("%s is now older", increaseAge );
                System.out.println(" ");
            }
        }
        if(!dogAgeIncrease) {
            System.out.printf(" error . %s does not exist in the system", increaseAge);
            System.out.println(" ");
        }
    }
    private void listDogs(){
        double minDogTail = sc.readDouble("List dogs. Pick minimum tail length: ");
        for (DogType tailDog : allDogs) {
            if (tailDog.getTailLength() > minDogTail) {
                System.out.println(tailDog);
                System.out.println(" ");
            }
        }
    }
    private void removeDog(){
        String tempDog = sc.readString("Type the dog do you want to remove from the list: ");
        boolean tempDogFound = false;
        for (int i = 0; i <allDogs.size(); i++){
            if (allDogs.get(i).getName().equalsIgnoreCase(tempDog)){
                allDogs.remove(i);
                tempDogFound = true;
                System.out.printf("%s is now removed", tempDog );
                System.out.println(" ");
            }
        }
        if(!tempDogFound) {
            System.out.printf("Error. %s does not exist in the system", tempDog);
            System.out.println(" ");
        }
    }
    private String readCommand(){
        return sc.readString("Menu Options \n1 \u2014 register new dog \n2 \u2014 increase age \n" +
                "3 \u2014 list dogs \n4 \u2014 remove dog \n5 \u2014 exit\n" +
                "Please choose one: ");
    }
    private boolean handleCommand(String command){ {
            switch (command) {
                case "register new dog":
                    registerNewDog();
                    break;
                case "increase age":
                    increaseAge();
                    break;
                case "list dogs":
                    listDogs();
                    break;
                case "remove dog":
                    removeDog();
                    break;
                case "exit":
                    return false;
                default:
                    System.out.println("Error. Unknown command.");
            }
        }
        return true;
    }


    private void run() {
        boolean carryOnWith;
            do {
                String command = readCommand();
                carryOnWith = handleCommand(command);
            } while (carryOnWith);
    }
    public static void main (String[] args){
        new DogRegistry().run();
    }
}