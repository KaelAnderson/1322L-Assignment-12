package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        JobLeadsList list = new JobLeadsList();
	boolean cont = true;
        Scanner scan = new Scanner(System.in);
    do{
        System.out.println("1 – Add lead to head of list\n" +
                "2 – Add lead to tail of list\n" +
                "3 – Delete a lead\n" +
                "4 – Print list from head to tail\n" +
                "5 – Print list from tail to head\n" +
                "6 – Exit\n" +
                "Enter Choice: ");
        int choice = Integer.parseInt(scan.nextLine());
        switch (choice){
            case 1:
                System.out.print("Enter Company Name: ");
                String companyName = scan.nextLine();
                System.out.print("Enter Contact Person Name: ");
                String contactName = scan.nextLine();
                System.out.print("Enter Contact Person Phone:");
                String contactPhone = scan.nextLine();
                System.out.print("Enter Job Title: ");
                String jobTitle = scan.nextLine();
                System.out.print("Enter Job Description: ");
                String jobDesc = scan.nextLine();
                System.out.print("");
                list.add_to_front(companyName,contactName,contactPhone,jobTitle,jobDesc);
                break;
            case 2:
                System.out.print("Enter Company Name: ");
                String companyName1 = scan.nextLine();
                System.out.print("Enter Contact Person Name: ");
                String contactName1 = scan.nextLine();
                System.out.print("Enter Contact Person Phone:");
                String contactPhone1 = scan.nextLine();
                System.out.print("Enter Job Title: ");
                String jobTitle1 = scan.nextLine();
                System.out.print("Enter Job Description: ");
                String jobDesc1 = scan.nextLine();
                System.out.print("");
                list.add_to_tail(companyName1,contactName1,contactPhone1,jobTitle1,jobDesc1);
                break;
            case 3:
                System.out.println("Enter Company Name: ");
                String companyName2 = scan.nextLine();
                System.out.println("Enter Job Title: ");
                String jobTitle2 = scan.nextLine();
                list.remove_lead(companyName2,jobTitle2);
                break;
            case 4:
                list.print_head_to_tail();
                break;
            case 5:
                list.print_tail_to_head();
                break;
            case 6:
                cont = false;
                break;
            default:
                if(choice < 1 || choice > 6){
                    System.out.println("Error: Please enter a valid choice (1 thru 6)");
                }

        }
    }while(cont);
    }
}
