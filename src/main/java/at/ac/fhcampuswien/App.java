package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld() {
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot() {
        // input your solution here
        System.out.println("0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`");

    }

        //todo Task 3
        public void sumOfLiterals () {
            // input your solution here
            int sum;
            char z = (int) 'Z';
            int a = 0xface;
            int b = 012;
            long c = (int) 80L;
            float d = (int) 44e-1f;
            double e = (int) 5.5f;
            double f = (int) 8.88e1;
            double g = (int) 99.9;

            sum = (int) (z+a+b+c+d+e+f+g);
            System.out.println(sum);
        }


        //todo Task 4
        public void addTwoNumbers () {
            // input your solution here
            Scanner sc = new Scanner(System.in);
            int a;
            int b;
            int c;

            a = sc.nextInt();
            b = sc.nextInt();

            c = a + b;
            System.out.println(c);
        }

        //todo Task 5
        public void swapTwoNumbers () {
            // input your solution here
            System.out.println("Before Swap:");
            Scanner sc = new Scanner(System.in);
            System.out.print("x: ");
            int x = sc.nextInt();
            System.out.print("y: ");

            int y = sc.nextInt();
            x = x + y;
            y = x - y;
            x = x - y;
            System.out.println("After Swap:" + System.lineSeparator() +
                    "x: " + x + System.lineSeparator() +
                    "y: " + y);
        }

        //todo Task 6
        public void compareTwoNumbers () {
            // input your solution here
            Scanner sc = new Scanner(System.in);
            System.out.print("n1: ");
            int a = sc.nextInt();
            System.out.print("n2: ");
            int b = sc.nextInt();

            if (a > b) {
                System.out.println("n1 > n2");
            }
            else if (a < b) {
                System.out.println("n2 > n1");
            }
            else if (a == b) {
                System.out.println("n1 == n2");
            }
        }

        //todo Task 7
        public void ratingSalesPerson () {
            // input your solution here
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter annual Revenue: ");
            int x = sc.nextInt();

                if ( x < 0 || x >= 100000) {
                    System.out.printf("Invalid Revenue" + System.lineSeparator());

                } else if (x >= 0 && x < 20000) {
                    System.out.printf("Poor Sales Revenue" + System.lineSeparator());

                } else if (x >= 20000 && x < 50000) {
                    System.out.printf("Average Sales Revenue" + System.lineSeparator());

                } else if (x >= 50000 && x < 80000) {
                    System.out.printf("Good Sales Revenue" + System.lineSeparator());

                } else if (x >= 80000 && x < 100000) {
                    System.out.printf("Excellent Sales Revenue" + System.lineSeparator());
                }

        }

        //todo Task 8
        public void getCommissionRate () {
            // input your solution here
            Scanner sc = new Scanner(System.in);
            double y;

            int x = sc.nextInt();

            switch (x){
                case 1:
                    y = 0.01;
                    break;
                case 2:
                    y = 0.02;
                    break;
                case 3:
                    y = 0.03;
                    break;
                case 4:
                    y = 0.04;
                    break;
                default:
                    y = 0.00;

            }
            System.out.println("Enter CommissionClass: Your Commission Rate was set to " +y);
        }

        //todo Task 9
        public void leapyear () {
            // input your solution here
            Scanner sc = new Scanner(System.in);

            System.out.print("Year: ");
            int x = sc.nextInt();

            if (x % 4 == 0 && (x % 100 != 0 || x%400 == 0)) {
                System.out.println("Leapyear");
            } else {
                System.out.println("Not a Leapyear");
            }
        }

        //todo Task 10
        public void transposedNumbers () {
            // input your solution here
            Scanner sc = new Scanner(System.in);
            int c = 0;

            System.out.print("Number: ");
            int a = sc.nextInt();

            while(a !=0)
            {
                int b = a % 10;
                c = c * 10 + b;
                a = a/10;
            }
            System.out.println(c);

        }

        public static void main (String[]args){
            App exercise1 = new App();

            System.out.println("Task 1: Say Hello World");
            exercise1.sayHelloWorld();

            System.out.println("\nTask 2: Hello Robot");
            exercise1.helloRobot();

            System.out.println("\nTask 3: Literals");
            exercise1.sumOfLiterals();

            System.out.println("\nTask 4: Add two Numbers");
            exercise1.addTwoNumbers();

            System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
            exercise1.swapTwoNumbers();

            System.out.println("\nTask 6: Compare two Numbers");
            exercise1.compareTwoNumbers();

            System.out.println("\nTask 7: Rating Sales Person");
            exercise1.ratingSalesPerson();

            System.out.println("\nTask 8: Commission Rate");
            exercise1.getCommissionRate();

            System.out.println("\nTask 9: Leapyear");
            exercise1.leapyear();

            System.out.println("\nTask 10: Transposed Numbers");
            exercise1.transposedNumbers();
        }
    }
