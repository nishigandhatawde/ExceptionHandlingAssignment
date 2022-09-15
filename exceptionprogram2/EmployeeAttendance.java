package exceptionprogram2;
//WAP to take Employee daily attendance in an array of int with name presentdays. You also take 
//salary per month of the Employee. You need to calculate the total day an employee is present. 
//Employee will input in following format P for present, L for leave it will be paid leave, A for absent, 
//N for no information about this day. 
//An employee can not take more than 2 leaves in a month if he takes more than two leave you need 
//to throw the exception. LeaveExceedLimitException. 
//If for any employee N is continuously for four days you need to throw exception 
//EmployeeAbscondingException. In this case salary will not be calculated. 
//If all goes good you need to print the total salary of employee for that particular month.
import java.util.Scanner;

public class EmployeeAttendance {
	public static void main(String[] args) {
        char presentDays[] = new char[30];
        System.out.println("Enter the attendance:");
        Scanner sc = new Scanner(System.in);
        int present = 0, leave = 0;
        for (int i = 0; i < presentDays.length; i++) {
            System.out.println("Enter the attendance:" + (i + 1));
            presentDays[i] = sc.next().charAt(0);
            if (presentDays[i] == 'P') {
                present++;
            }
            if (presentDays[i] == 'L') {
                leave++;
            }
            if (i > 3) {
                try {
                    if (presentDays[i - 4] == presentDays[i - 3] && presentDays[i - 3] == presentDays[i - 2]
                            && presentDays[i - 2] == presentDays[i - 1] && 'A' == presentDays[i - 1])
                        throw new AbscondingException("ABSCONDING");
                } catch (AbscondingException e) {
                    System.out.println(e);
                }
            }
            if (leave > 2) {
                try {
                    throw new LeaveLimitExceedException();
               } catch (LeaveLimitExceedException e) {
                    System.out.println(e);
                }
           }
        }
       System.out.println("Salary:" + present * 1000);
        System.exit(0);
   }

}
