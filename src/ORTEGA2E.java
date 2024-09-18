import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ORTEGA2E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of Applications: ");
        int numApplications = scanner.nextInt();

        List<Application> applications = new ArrayList<>();

        for (int i = 1; i <= numApplications; i++) {
            System.out.println("Enter details of application " + i + ":");
            System.out.print("ID: ");
            int id = scanner.nextInt();
            System.out.print("Name: ");
            String name = scanner.next();
            System.out.print("Age: ");
            int age = scanner.nextInt();
            System.out.print("BMI: ");
            double bmi = scanner.nextDouble();
            scanner.nextLine(); 
            System.out.print("Fitness Goals: ");
            String fitnessGoals = scanner.nextLine();

            Application application = new Application(id, name, age, bmi, fitnessGoals);
            applications.add(application);
        }

        
        System.out.println("Application ID\tName\tAge\tBMI\tFitness Goals\tEligibility Status");
        for (Application application : applications) {
            String eligibilityStatus = application.getAge() > 65 ? "Not Eligible (Age too high)" : "Eligible";
            System.out.println(application.getId() + "\t" + application.getName() + "\t" + application.getAge() + "\t" + application.getBmi() + "\t" + application.getFitnessGoals() + "\t" + eligibilityStatus);
        }

        
        while (true) {
            System.out.println("Enter operation to perform:");
            System.out.println("1. Update fitness goals");
            System.out.println("2. Display applications by fitness goals");
            System.out.println("3. Exit");
            int operation = scanner.nextInt();
            scanner.nextLine(); 

            switch (operation) {
                case 1:
                    System.out.print("Enter application ID to update fitness goals: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Enter new fitness goals: ");
                    String newFitnessGoals = scanner.nextLine();

                    for (Application application : applications) {
                        if (application.getId() == updateId) {
                            application.setFitnessGoals(newFitnessGoals);
                            System.out.println("Fitness goals updated successfully!");
                            break;
                        }
                    }

                    break;
                case 2:
                    System.out.print("Enter fitness goals to display applications: ");
                    String fitnessGoalsToDisplay = scanner.nextLine();

                    System.out.println("Application ID\tName\tAge\tBMI\tFitness Goals\tEligibility Status");
                    for (Application application : applications) {
                        if (application.getFitnessGoals().equals(fitnessGoalsToDisplay)) {
                            String eligibilityStatus = application.getAge() > 65 ? "Not Eligible (Age too high)" : "Eligible";
                            System.out.println(application.getId() + "\t" + application.getName() + "\t" + application.getAge() + "\t" + application.getBmi() + "\t" + application.getFitnessGoals() + "\t" + eligibilityStatus);
                        }
                    }

                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid operation. Please try again.");
            }
        }
    }

    private static class Application {

        public Application() {
        }
    }
}