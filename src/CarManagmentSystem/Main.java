package CarManagmentSystem;

import java.util.Scanner;

interface utility{
    public void get_details();

    public void set_details();
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Showroom showroom[] = new Showroom[5];
        Employees employees[] = new Employees[5];
        Cars cars[] = new Cars[5];
        int car_counter = 0;
        int showroom_counter = 0;
        int employees_counter = 0;
        int choice = 100;

        while(choice != 0){
            main_menu();
            choice = sc.nextInt();

            while (choice != 9 && choice != 0){
                switch (choice){
                    case 1:
                        showroom[showroom_counter] = new Showroom();
                        showroom[showroom_counter].set_details();
                        showroom_counter++;
                        System.out.println();
                        System.out.println("1] Add New Showroom");
                        System.out.println("9] Go Back To Main Menu");
                        choice = sc.nextInt();
                        break;

                    case 2:
                        employees[employees_counter] = new Employees();
                        employees[employees_counter].set_details();
                        employees_counter++;
                        System.out.println();
                        System.out.println("2] Add New Employee");
                        System.out.println("9] Go Back To Main Menu");
                        choice = sc.nextInt();
                        break;

                    case 3:
                        cars[car_counter] = new Cars();
                        cars[car_counter].set_details();
                        car_counter++;
                        System.out.println();
                        System.out.println("3] Add New Car: ");
                        System.out.println("9] Go Back To Main Menu");
                        choice = sc.nextInt();
                        break;

                    case 4:
                        for(int i=0; i<showroom_counter; i++){
                            showroom[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9] Go Back TO Main Menu: ");
                        System.out.println("0] Exit");
                        choice = sc.nextInt();
                        break;

                    case 5:
                        for (int i = 0; i < employees_counter; i++) {
                            employees[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9] Go Back To Main Menu");
                        System.out.println("0] Exit");
                        choice = sc.nextInt();
                        break;

                    case 6:
                        for (int i = 0; i < car_counter; i++) {
                            cars[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9] Go Back To Main Menu");
                        System.out.println("0] Exit");
                        choice = sc.nextInt();
                        break;

                    default:
                        System.out.println("Enter Valid Choice: ");
                        break;
                }
            }
        }
    }
    public static void main_menu(){
        System.out.println();
        System.out.println("=============== *** Welcome To Showroom Management System *** ===========");
        System.out.println();
        System.out.println("============= *** Enter Your Choice *** =========================");
        System.out.println();
        System.out.println("1]. ADD SHOWROOMS \t\t\t 2]. ADD EMPLOYEES \t\t\t 3]. ADD CARS");
        System.out.println();
        System.out.println("4]. GET SHOWROOMS \t\t\t 2]. GET EMPLOYEES \t\t\t 3]. GET CARS");
        System.out.println();
        System.out.println(" ================= Enter 0 to exit ==========================");

    }
}
