import java.util.Scanner;
public class UserInputApp {
    private Scanner scanner;
    public UserInputApp() {
        scanner = new Scanner(System.in);
    }
        public void collectUserData() {
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Enter your favorite colour");
            String colour = scanner.nextLine();
            displayUserData(name, age, colour);
        }
            public void displayUserData(String name,int age,String colour){
              System.out.println("\nUserdata: ");
              System.out.println("name: "+ name);
              System.out.println("Age:" + age);
              System.out.println("colour:" + colour);
            }
            public static void main(String[] args){
                UserInputApp app=new UserInputApp();
                app.collectUserData();

            }
        }
