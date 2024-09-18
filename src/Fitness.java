public class Fitness {
    private int id;
    private String name;
    private int age;
    private double bmi;
    private String fitnessGoals;

    public Fitness(int id, String name, int age, double bmi, String fitnessGoals) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.bmi = bmi;
        this.fitnessGoals = fitnessGoals;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBmi() {
        return bmi;
    }

    public void setBmi(double bmi) {
        this.bmi = bmi;
    }

    public String getFitnessGoals() {
        return fitnessGoals;
    }

    public void setFitnessGoals(String fitnessGoals) {
        this.fitnessGoals = fitnessGoals;
    }
}