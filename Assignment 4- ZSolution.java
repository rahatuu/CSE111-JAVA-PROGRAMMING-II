//Task01
public class Student{
  public String name;
  public String prog;
  public Student(String s1,String p1){
    name=s1;
    prog=p1;}
  public void updateName(String s3){
    name=s3;}
  public void updateProgram(String s2){
    prog=s2;}
  public String accessProgram(){
    return prog;}
}

//Task02
public class Toy{
  public String name;
  public int price;
  public Toy(String s1,int i1){
    name=s1;
    price=i1;
    System.out.println("A new toy has been made!");}
  public void updatePrice(int i2){
    price=i2;}
  public void updateName(String s2){
    System.out.println("Changing old name: "+name);
    name=s2;
    System.out.println("new name: "+name);}
  public void showPrice(){
    System.out.println("price : "+price+" Taka");}}
 

//Task03
public class Shape2D{
  public double area;
  public String type;
  public Shape2D(){
    type="Square";
    int len=5;
    this.area=(double)len*len;
    System.out.println("A "+type+" has been created with length: "+len);}
  public Shape2D(int i1,int i2){
    type="Rectangle";
    int len=i1;
    int bread=i2;
    this.area=(double)len*bread;
    System.out.println("A "+type+" has been created with length: "+len+" and breadth:  "+bread);}
  public Shape2D(int i1,int i2,String s1){
    type=s1;
    int hei=i1;
    int base=i2;
    this.area=0.5*hei*base;
    System.out.println("A "+type+" has been created with height: "+hei+" and base:  "+base);}
  public Shape2D(int i1,int i2,int i3){
    type="Triangle";
    int side1=i1;
    int side2=i2;
    int side3=i3;
    double s=((double)(i1+i2+i3))/2;
    this.area=Math.pow((s*(s-side1)*(s-side2)*(s-side3)),0.5);
    System.out.println("A "+type+" has been created with the following sides: "+side1+", "+side2+", "+side3);}
  public void area(){
    System.out.println("The area of the "+type+" is: "+area);}}


//Task04
import java.util.Arrays;
public class Student{
  public int id;
  public double cg;
  public int count;
  public String[] arr=new String[4];
  public Student(int i1){
    id=i1;
    System.out.println("A student with ID "+id+" has been created.");} 
  public Student (int i2,double i3){
    id=i2;
    cg=i3;
    System.out.println("A student with ID "+id+" and cgpa "+cg+" has been created.");}
  public void addCourse(String s1) {
        if (cg == 0) {
          System.out.println("Failed to add " + s1 + "\nSet CG first");}
        else if (count < 4) {
            if (cg >= 3 || (cg < 3 && count < 3)) {
                arr[count] = s1;
                count++;}
            else {
              System.out.println("Failed to add "+s1+"\nCG is low. Can't add more than 3 courses.");}}
        else {
          System.out.println("Failed to add "+s1+"\nMaximum 4 courses allowed.");}}
  public void addCourse(String[] s2) {
    for (int i = 0; i < s2.length; i++) {
        if (count < 4) {
            if (cg >= 3 || (cg < 3 && count < 3)) {
                arr[count] = s2[i];
                count++;}
            else{
                System.out.println("Failed to add " + s2[i] + "\nCG is low. Can't add more than 3 courses.");}} 
        else{
            System.out.println("Failed to add " + s2[i] + "\nMaximum 4 courses allowed.");}}}
  public void removeAllCourse(){
    for(int i=0;i<count;i++){
      arr[i]="null";count = 0;}}
  public void storeCG(double d1){
    cg=d1;}
  public void storeID(int i1){
    id=i1;}
  public void showAdvisee(){
    System.out.println("Student ID: "+id+", CGPA: "+cg);
    System.out.println("Added courses are: ");
  if (count > 0) {
     for (int i = 0; i < count; i++) {
        System.out.print(arr[i] + " ");}
     System.out.println();}
     else {System.out.println("No courses added.");}}}

    
//Task05
public class Triangle {
    public int side1;
    public int side2;
    public int side3;
    public void updateSides(int i1, int i2, int i3) {
        this.side1 = i1;
        this.side2 = i2;
        this.side3 = i3;}
    public void triangleDetails() {
        System.out.println("Three sides of the triangle are: " + side1 + ", " + side2 + ", " + side3);
        System.out.println("Perimeter: " + (side1 + side2 + side3));}
    public String printTriangleType() {
        if (side1 == side2 && side2 == side3) {
          return "This is an Equilateral Triangle.";}
        else if (side1 == side2 || side2 == side3 || side1 == side3) {
          return "This is an Isosceles Triangle.";}
        else {
          return "This is a Scalene Triangle.";}}
    public void compareTrinagles(Triangle compare) {
    if (this == compare) {
      System.out.println("These two triangle objects have the same address.");} 
    else {
       if (this.side1 == compare.side1 && this.side2 == compare.side2 && this.side3 == compare.side3) {
          System.out.println("Addresses are different but the sides of the triangles are equal.");}
       else{
          if ((this.side1 + this.side2 + this.side3) == (compare.side1 + compare.side2 + compare.side3)) {
             System.out.println("Only the perimeter of both triangles is equal.");}
          else{System.out.println("Addresses, length of the sides and perimeter all are different.");}}}}}


//Task06
public class Teacher {
    public String name;
    public String initial;
    public Course[] courses;
    public int courseCount;
    public Teacher(String s1, String s2) {
        name = s1;
        initial = s2;
        courses = new Course[3]; 
        courseCount = 0;
        System.out.println("A new teacher has been created");}
    public void addCourse(Course cour) {
        if (courseCount < 3) {
            courses[courseCount] = cour;
            courseCount++;}
        else {
          System.out.println("Cannot add more than 3 courses.");}}
    public void printDetail() {
        System.out.println("Name: " + name);
        System.out.println("Initial: " + initial);
        System.out.println("List of courses:");
        for (int i = 0; i < courseCount; i++) {
          System.out.println(courses[i].courseName);}}}
public class Course {
    String courseName;
    public Course(String courName) {
      courseName = courName;}}

//Task07
class BracuBus {
  String route;
  int maxCapacity;
  BracuStudent[] passengers;
  int passengerCount;
  public BracuBus(String route) {
    this.route = route;
    this.maxCapacity = 2; 
    this.passengers = new BracuStudent[maxCapacity];
    this.passengerCount = 0;
    System.out.println("Bus Route: " + route);
    System.out.println("Passenger Count: " + passengerCount + " (Max: " + maxCapacity + ")");
    System.out.println("Passengers on Board:");}
  public BracuBus(String route, int maxCapacity) {
    this.route = route;
    this.maxCapacity = maxCapacity;
    this.passengers = new BracuStudent[maxCapacity];
    this.passengerCount = 0;
    System.out.println("Bus Route: " + route);
    System.out.println("Passenger Count: " + passengerCount + " (Max: " + maxCapacity + ")");
    System.out.println("Passengers on Board:");}
  public void showDetails() {
    System.out.println("Bus Route: " + route);
    System.out.println("Passenger Count: " + passengerCount + " (Max: " + maxCapacity + ")");
    System.out.println("Passengers on Board:");
    for (int i = 0; i < passengerCount; i++) {
      System.out.print(passengers[i].name + " ");}
    if (passengerCount > 0) {
      System.out.println();}}
  public void board() {
    System.out.println("No passengers");}
  public void board(BracuStudent student) {
    if (!student.hasBusPass) {
      System.out.println("You don't have a bus pass!");
      return;}
    if (!student.home.equals(route)) {
      System.out.println(student.name + " got on the wrong bus!");
      return;}
    if (passengerCount < maxCapacity) {
      passengers[passengerCount] = student;
      passengerCount++;
      System.out.println(student.name + " boarded the bus.");}
    else {
      System.out.println("Bus is full!");}}
  public void board(BracuStudent student1, BracuStudent student2) {
    board(student1);
    board(student2);}}

class BracuStudent {
    String name;
    String home;
    boolean hasBusPass; 
    public BracuStudent(String name, String home) {
        this.name = name;
        this.home = home;
        this.hasBusPass = false; 
        System.out.println("Student Name: " + name);
        System.out.println("Lives in " + home);
        System.out.println("Have Bus Pass? " + hasBusPass);}
    public void showDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Lives in " + home);
        System.out.println("Have Bus Pass? " + hasBusPass);}
    public void getPass() {
      hasBusPass = true;}
    public void updateHome(String newHome) {
      home = newHome;}}


//Task08
public class Usis {
    int totalAdvisee; 
    Student[] advisees=new Student[5]; 
    public void login(Student student) {
      if(student.email==null && student.password==null){
        System.out.println("Email and password need to be set.");}
      else{System.out.println("Login successful");}}
    public void advising(Student st, String s1, String s2, String s3,String s4){
      System.out.println("You need special approval to take more than 3 courses.");}
    public void advising(Student st){
      if(st.email==null && st.password==null){System.out.println("Please login to advise courses! ");}
      else{System.out.println("You haven't selected any courses.");}}
    public void advising(Student st, String s1, String s2, String s3){
      st.advisedCourses[st.courseCount]=s1;
      st.courseCount++;
      st.advisedCourses[st.courseCount]=s2;
      st.courseCount++;
      st.advisedCourses[st.courseCount]=s3;
      st.courseCount++;
      advisees[totalAdvisee]=st;
      totalAdvisee++;
      System.out.println("Advising successful!");}
    public void allAdviseeInfo(){
      System.out.println("Total Advisee: "+totalAdvisee);
      for (int i=0;i<totalAdvisee;i++){
        System.out.println("Name: "+advisees[i].name+" ID: "+advisees[i].id+"\nDepartment: "+advisees[i].department);
        System.out.println("Advised Courses:");
        for(int j=0;j<advisees[i].courseCount;j++){
          System.out.print(advisees[i].advisedCourses[j]+" ");}
        System.out.println();
        System.out.println("==============");}}
    public Usis(){
      System.out.println("Usis is ready to use! ");}}
public class Student {
    String name;
    int id;
    String department;
    String email; 
    String password; 
    String[] advisedCourses=new String[3]; 
    int courseCount;
    public Student(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
        this.email = null;
        this.password = null;
        System.out.println("Student object is created");}}

