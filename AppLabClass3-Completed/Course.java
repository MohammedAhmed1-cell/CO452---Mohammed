/**
 * Write a description of class Course here.
 *
 * @author (Mohammed Ahmed - 21915819)
 * @version (22/10/2020)
 */
//Created a private string for each module that a stdent is taking
public class Course
{
    // instance variables - replace the example below with your own
    private String name;
    private Module co450;
    private Module co452;
    private Module co454;
    private Module co456;
    
    //A string for the course modules and naming them for m1 to m4
    /**
     * Constructor for objects of class Course
     */
    public Course(String courseName, Module m1, Module m2, Module m3, Module m4)
    {
        // initialise instance variables
        name = courseName;
        co450 = m1;
        co452 = m2;
        co454 = m3;
        co456 = m4;
    }
    //A public statement for print the type of modue for the styednt is
    //attending, plus thier grade and name.
    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void print()
    {
      
        // put your code here
        System.out.println("# course "+name);
        co450.print();
        co452.print();
        co454.print();
        co456.print();
        System.out.println("# grade"+grade());
        
    }
    // This ia string for printing the students grade for each module
    //depending on what they get.
    public String grade()
    {
        int total = co450.getMarks() + co452.getMarks() + co454.getMarks() +co456.getMarks();
        total = total/4;
        String grade = "F";
        if(total>39)grade = "D";
        if(total>49)grade ="C";
        if(total>59)grade ="B";
        if(total>69)grade = "A";
        return grade;
    }
}