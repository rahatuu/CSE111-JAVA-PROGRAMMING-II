//Task01
public class Product{
  private String name;
  private double price;
  private int quantity;
  public Product(){
    name="Unknown";
    price=0.0;}
  public Product(String name,double price){
    this.name=name;
    this.price=price;}
  public void setQuantity(int quantity){
    this.quantity=quantity;}
  public double getPrice(){
    return price;}
  public int getQuantity(){
    return quantity;}
  public void displayInfo(boolean bool){
    if (bool==true){
      System.out.println("Product Name: "+name+"\nPrice: $"+price+"\nQuantity: "+quantity);}}
  public void displayInfo(){
    System.out.println("Product Name: "+name+"\nPrice: $"+price);}}


//Task02
public class Passenger{
  public static int no_of_passenger;
  public static double total_fare;
  public String name;
  public double fare; 
  public Passenger(String name,double distance){
    this.name=name;
    no_of_passenger++;
    fare+=(20*distance);
    total_fare+=(20*distance);}
  public void storeBaggageWeight(double bagg){
    fare+=(10*bagg);
    total_fare+=(10*bagg);}
  public void passengerDetails(){
    System.out.println("Name: "+name+"\nFare: "+fare+" TK");}}

//Task03
public class Book{
  public static int total_books_sold;
  public static double total_revenue;
  public String name;
  public double price; 
  public Book(String name,int percentage){
    this.name=name;
    total_books_sold++;
    price+=calcu(percentage);
    total_revenue+=calcu(percentage);}
  public void bookDetails(){
    System.out.println("Title: "+name+"\nPrice after Discount: "+price+" TK");}
  public double calcu(int i1){
    return 150-(150*(i1/100.0));}}

//Task04
public class Circle{
   public static int count;
   private double radius;
   public void setRadius(double rad){
     this.radius=rad;}
   public double getRadius(){
     return radius;}
   public double area(){
     return 3.1416*radius*radius;}
   public Circle(int radius){
     count++;
     setRadius((double)radius);}}

//Task05
public class Borrower{
  public static int book_count[] = {3, 3, 3};
  public static String book_name[] = {"Pather Panchali","Durgesh Nandini", "Anandmath"};
  public String name;
  public String borrowedBooks[]=new String[9];
  public int count;
  public static String remainingBooks(String bookremain){
    String rtn=null;
    for(int i=0;i<3;i++){
      if(book_name[i]==bookremain){
        rtn=(book_count[i]+" ");
        break;}}
    return rtn;}
  public static void bookStatus(){
    System.out.println("Available Books:");
    for(int i=0;i<3;i++){
      System.out.println(book_name[i]+": "+book_count[i]);}}
  public void borrowBook(String book){
    for(int i=0;i<3;i++){
      if(book_name[i]==book){
        if(book_count[i]>0){
          borrowedBooks[count]=book_name[i];
          book_count[i]--;
          count++;}
        else{System.out.println("This book is not available.");}}}}
  public Borrower(String name){
    this.name=name;}
  public void borrowerDetails(){
    System.out.println("Name: "+name+"\nBooks Borrowed:");
    for (int i=0;i<9;i++){
      if(borrowedBooks[i]!=null){
        System.out.println(borrowedBooks[i]);}}}}

//Task06
public class Cargo{
  public static double capacity=10;
  public static int totcargo;
  public String content;
  public double weight;
  public boolean loaded=false;
  public int cargonumber;
  public static double capacity(){
    return capacity;}
  public Cargo(String content,double weight){
     this.content=content;
     this.weight=weight;
     totcargo++;cargonumber=totcargo;}
  public void details(){
    System.out.println("Cargo ID: "+cargonumber+", Contents: "+content+", Weight: "+weight+", Loaded: "+loaded);}
  public void load(){
    if(capacity-weight>0){
      loaded=true;
      capacity=capacity-weight;
      System.out.println("Cargo "+cargonumber+" loaded for transport.");}
    else{
      System.out.println("Cannot load cargo, exceeds weight capacity.");}}
  public void unload(){
    loaded=false;
    capacity=capacity+weight;
    System.out.println("Cargo "+cargonumber+" unloaded.");}}

//Task07
public class Student{
  public String name;
  public double cgpa;
  public String dept;
  public static int totstu;
  public static int csestu;
  public static int othstu;
  public static void printDetails(){
    System.out.println("Total Student(s): "+totstu+"\nCSE Student(s): "+csestu+"\nOther Department Student(s): "+othstu);}
  public void individualDetail(){
    System.out.println("ID: "+totstu+"\nName: "+name+"\nCGPA: "+cgpa+"\nDepartment: "+dept);}
  public Student(String name,double cgpa){
    this.name=name;
    this.cgpa=cgpa;
    this.dept="CSE";
    csestu++;totstu++;}
  public Student(String name,double cgpa,String dept){
    this.name=name;
    this.cgpa=cgpa;
    this.dept=dept;
    othstu++;totstu++;}}

//Task08
public class Player{
  public static String playersenlisted[]=new String[11];
  public static int total;
  public String name;
  public String country;
  public int jersynum;
  public Player(String name,String country,int jersynum){
    this.name=name;
    this.country=country;
    this.jersynum=jersynum;
    playersenlisted[total]=name;
    total++;}
  public String player_detail(){
    return "Player Name: "+name+"\nJersey Number: "+jersynum+"\nCountry: "+country; }
  public static void info(){
    System.out.println("Total number of players: "+total); 
    System.out.print("Players enlisted so far: ");
    for(int i=0;i<total;i++){
      if(playersenlisted[i+1]!=null){
         System.out.print(playersenlisted[i]+", ");}
      else{System.out.print(playersenlisted[i]);}}
    System.out.println();}}


