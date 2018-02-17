/*
import java.util.ArrayList;
import java.util.Scanner;

public class DogRegister {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<DogType> allDogs = new ArrayList<>();

        boolean carryOnWith = false;
        while (!carryOnWith){

            System.out.print("Menu Options \n1 \u2014 register new dog \n2 \u2014 increase age \n" +
                    "3 \u2014 list dogs \n4 \u2014 remove dog \n5 \u2014 exit\n" +
                    "Please choose one: ");
            String command = sc.nextLine();
            System.out.println(" ");
            switch (command) {
                case "register new dog":
                    DogType Dog = new DogType();
                    System.out.print("Name of the dog: ");
                    Dog.setName(sc.next());
                    System.out.print("Race of the dog: ");
                    Dog.setRace(sc.next());
                    System.out.print("Age of the dog: ");
                    int age = sc.nextInt();
                    Dog.setAge(age);
                    System.out.print("Weight of the dog (kg): ");
                    int weight = sc.nextInt();
                    Dog.setWeight(weight);
                    allDogs.add(Dog);
                    System.out.println(" ");
                    sc.nextLine();
                    break;
                case "increase age":
                    System.out.print("Increase selected dogs age with one(1) year. \n" +
                            "Type the name of the dog: ");
                    String increaseAge = sc.next();
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
                        System.out.printf("Error. %s does not exist in the system", increaseAge);
                        System.out.println(" ");
                    }
                    sc.nextLine();
                    break;
                case "list dogs":
                    System.out.print("List dogs. Pick minimum tail length: ");
                    int minDogTail = sc.nextInt();
                    sc.nextLine();
                    for (DogType tailDog : allDogs) {
                        if (tailDog.getTailLength() > minDogTail) {
                            System.out.println(tailDog);
                            System.out.println(" ");
                        }
                    }
                    break;
                case "remove dog":
                    System.out.print("Type the dog do you want to remove from the list: ");
                    String tempDog = sc.next();
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
                    break;
                case "exit":
                    System.out.print("Program is now shutting down");
                    carryOnWith = true;
                    break;
                default:
                    System.out.println("Error. Unknown command");
                    System.out.println(" ");
            }
        }
        sc.close();
    }
}*/

// lägg till i DogType för att få denna att fungera.
//public void setName(String name) {
//        this.name = name;
//        }
//
//public void setRace(String race) {
//        this.race = race;
//        }
//
//public void setAge(int age) {
//        this.age = age;
//        }
//
//public void setWeight(double weight) {
//        this.weight = weight;
//        }
