package practice.practice_Day01;

import java.util.Scanner;

public class Q12_IfStatements {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lüfen is unvaninizi girniz");
        String jobTitle = scan.nextLine().toLowerCase();

        if (jobTitle.equals("qa")) {
            System.out.println("Quality Analyst");
        } else if (jobTitle.equals("dev")) {
            System.out.println("Developer");

        } else if (jobTitle.equals("ba")) {
            System.out.println("Business Analyst");

        } else if (jobTitle.equals("pm")) {
            System.out.println("Project Manager");

        } else {
            System.out.println("LÜtfen gecerli bir unvan giriniz");

        }

        switch (jobTitle) {
            case "qa":
                System.out.println("Quality Analyst");
                break;

            case "dev":
                System.out.println("Developer");
                break;

            case "ba":
                System.out.println("Business Analyst");
                break;
            case "pm":
                System.out.println("Projekt Manager");
                break;
            default:
                System.out.println("lütfen gecerli bir unvan giriniz");


        }


    }

}


