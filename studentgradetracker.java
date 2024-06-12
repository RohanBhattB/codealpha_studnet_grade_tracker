import java.util.*;
 public class studentgradetracker{
    public static void main(String[] args) 
    {
        //initalizing scanner 
        Scanner s = new Scanner(System.in);

        //ask the user to enter no os students 
        System.out.println("Enter the number of students: ");
        int numberofstudents = s.nextInt();

        //taking a array of size no of students to collect their grades
        double[] grades = new double[numberofstudents];

        //for loop to collect the grades of students one by one
        for(int i=0;i<numberofstudents;i++)
        {
            System.out.print("Enter the grades of student"+(i+1)+": ");
            grades[i] = s.nextDouble(); 
        }
        double total =0;
        double highest = grades[0];
        double lowest = grades[0];

        //taking for loop to find height and lowest grades and total for average
        for(double grade : grades)
        {
            total +=grade;
            if(grade >highest)
            {
                highest = grade;
            }
            if(grade < lowest)
            {
                lowest = grade;
            }
        }

        //calulating average
        double average = total/numberofstudents;

        //displaying the results 

        System.out.println("Average grade: " + average);
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);

        s.close();

        
    }
 }