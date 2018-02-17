
public class DogType {

    private String name;
    private String race;
    private int age;
    private double weight;
    private double tailLength;

    public DogType(String dogName, String dogRace, int dogAge, double dogWeight){
        name = dogName;
        race = dogRace;
        age = dogAge;
        weight = dogWeight;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public void incDogAge(){
        this.age += 1;
    }

    public double getTailLength() {
        if (race.equalsIgnoreCase("tax")){
            return tailLength = 3.7;
        }
        else if (race.equalsIgnoreCase("dachshund")){
            return tailLength = 3.7;
        }
        else{
            return tailLength = age * weight /10;
        }
    }

    @Override
    public String toString() {
        return name + " " + race + " " + age +" years" + " " + weight + "kg" + " " + tailLength + "cm";
    }

}

