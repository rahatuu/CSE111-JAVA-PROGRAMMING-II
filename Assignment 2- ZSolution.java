//Task1(a)
public class UniversityTester{
  public static void main(String[]args){
     University uni1=new University();
     University uni2=new University();
     System.out.println(uni1);
     System.out.println(uni2);
     System.out.println(uni1.name);
     System.out.println(uni1.country);
     System.out.println(uni2.name);
     System.out.println(uni2.country);
     System.out.println("No, The location of the objects are not same.");
     //Task1(b)
     uni1.name="Imperial College London";
     uni1.country="England";
     uni2.name="Brac University";
     uni2.country="Bangladesh";
     System.out.println(uni1.name);
     System.out.println(uni1.country);
     System.out.println(uni2.name);
     System.out.println(uni2.country);
     System.out.println("Yes, The instance variables of both objects have changed & the instance variables of both objects are not of the same value.");
     System.out.println(uni1);
     System.out.println(uni2);
  }
}

//Task2
public class Student{
    public String name="Default";
    public int id=0;
}

//Task3
public class CSECourse{
   public String courseName="Programming Language II" ;
   public String courseCode="CSE111";
   public int credit=3;
}

//Task4
public class ImaginaryNumber{
    public int realPart=0;
    public int imaginaryPart=0;
    public void printNumber(){
      System.out.println(realPart+" + "+imaginaryPart+"i"); 
    }
}

//Task5
public class Course{
    public String course="";
    public String code="";
    public int credit=0;
    public void updateDetails(String c1,String c2,int c3){
       course=c1;
       code=c2;
       credit=c3;}
    public void displayCourse(){
        System.out.println("Course Name: "+course);
        System.out.println("Course Code: "+code);
        System.out.println("Course Credit: "+credit);
     }
}

//Task6 
public class Assignment {
    public int tasks=0;
    public String difficulty;
    public boolean submission=false;
    public void printDetails(){
      System.out.printf("Number of tasks: %d%nDifficulty level: %s%nSubmission required: %b%n",tasks,difficulty,submission);}
    public String makeOptional(){
      if(submission==true){
         submission=false;
         return "Assignment will not require submission";}
      else{
        return "Submission is already not required ";}}
}

//Task7
public class CellPhone{
   public String model="unknown";
   public int store=0;
   public String[] arr=new String[3];
   public int arrindex=0;
   public void printDetails(){
       System.out.println("Phone Model "+model+"\n"+"Contact stored "+store);
       if (store>0){
         System.out.println("Stored Contacts: ");
         for (int i=0;i<store;i++){
           System.out.println(arr[i]);
       }}
   }
   public void storeContact(String s1){
      if(arrindex<3){
        System.out.println("Contact Stored ");
        arr[arrindex]=s1; 
        arrindex++;
        store++;}
      else{System.out.println("Memory full. New contact can't be stored.");}
     }
}

//Task8
import java.util.Scanner;
public class Employee{
   public String name;
   public double salary=30000;
   public String designation="junior";
   public void newEmployee(String n){
     name=n;}
   public void displayInfo(){
     System.out.println("Employee Name: "+name+"\n"+"Employee Salary: "+salary+" Tk"+"\n"+"Employee Designation: "+designation);}
   public void promoteEmployee(String s1){
     if(s1=="manager"){
         salary+=75000;
         designation="manager";}
     else if(s1=="lead"){
        salary+=50000;
        designation="lead";}
     else if (s1=="senior"){
        salary+=25000;
        designation="senior";}
     System.out.println(name+" has been promoted to "+designation+"\n"+"New Salary: "+salary+" Tk");}
   public void calculateTax(){
     if(salary>50000){
       System.out.println(name+" Tax Amount: "+(salary*0.3)+" Tk");}
     else if (salary>30000){
        System.out.println(name+" Tax Amount: "+(salary*0.1)+" Tk");}
     else {System.out.println("No need to pay tax");}}
}
