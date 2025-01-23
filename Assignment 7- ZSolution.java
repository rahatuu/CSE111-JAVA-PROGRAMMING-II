//Task01
public class BBAStudent extends Student{
  public BBAStudent(String nam){
    super.setName(nam+" ");
    super.setDepartment(" BBA ");}
  public BBAStudent(){
    super.setName(" Default ");
    super.setDepartment(" BBA ");}}

//Task02
public class CheckingAccount extends Account{
  public static int count;
  public CheckingAccount(){
    super(0.0);
    count++;}
  public CheckingAccount(double amm){
    super(amm);
    count++;}}

//Task03
public class Dog extends Animal{
  public String breed;
  public void makeSound(){
    System.out.println(color+" color "+name+" is barking");}
  public Dog(String name,int age,String color,String breed){
    super(name,age,color);
    this.breed=breed;}
  public String info(){
    return super.info()+"Breed: "+breed;}}

public class Cat extends Animal{
  public String breed;
  public void makeSound(){
    System.out.println(color+" color "+name+" is meowing");}
  public Cat(String name,int age,String color,String breed){
    super(name,age,color);
    this.breed=breed;}
  public String info(){
    return super.info()+"Breed: "+breed;}}

//Task04  
public class Vehicle2010 extends Vehicle{
  public void moveLowerRight(){
    super.moveDown();
    super.moveRight();}
  public void moveUpperRight(){
    super.moveUp();
    super.moveRight();}
  public void moveUpperLeft(){
    super.moveUp();
    super.moveLeft();}
  public void moveLowerLeft(){
    super.moveDown();
    super.moveLeft();}}

//Task05   
public class ComplexNumber extends RealNumber{
   public double imaginaryPart;
   public ComplexNumber(double real,double imagine){
     super(real);
     imaginaryPart=imagine;}
   public ComplexNumber(){
     super(1.0);
     imaginaryPart=1.0;}
   public String toString(){
     return super.toString()+"\nImaginaryPart: "+imaginaryPart;}}

//Task06
public class Developer extends Employee{
  public double finalSalary;
  public String language;
  public void displayInfo() {
    super.displayInfo();
    System.out.println("Language: "+language+"\nFinal Salary: $"+finalSalary);}
  public Developer(String name, double base, int hours, String language){
    super(name,base,hours);
    this.language=language;}
  public void calculateSalary(){
    if(language.equals("Java")){
      finalSalary=super.getBaseSalary()+700;}
    else{ finalSalary=super.getBaseSalary();}}}

public class Manager extends Employee{
  public double finalSalary;
  public double bonus;
  public void displayInfo() {
    super.displayInfo();
    System.out.println("Bonus: "+bonus+" %\nFinal Salary: $"+finalSalary);}
  public Manager(String name, double base, int hours, double bonus){
    super(name,base,hours);
    this.bonus=bonus;}
  public void requestIncrement(double incre){
    if(super.getHoursWorked()>100){
      super.setBaseSalary(super.getBaseSalary()+incre);
      System.out.println("$"+incre+" Increment approved.");}
    else if (super.getHoursWorked()>80){
      super.setBaseSalary(super.getBaseSalary()+incre/2);
      System.out.println("$"+incre/2+" Increment approved.");}
    else{System.out.println("Increment denied.");}}
  public void calculateSalary(){
    finalSalary=super.getBaseSalary()+(super.getBaseSalary()*(bonus/100));}}
  
//Task07
public class CinemexTicket extends MovieTicket{
  public String id;
  public static int count ;
  public String genre;
  public String status;
  public static int getTotalTickets(){
     return count;}
  public CinemexTicket(String name, String showtime, String genre, String date, String seatType){
    super(name,date,showtime,0.0);
    super.seat=seatType;
    this.genre=genre;
    this.status = "Not paid";
    count++;
    id=super.getMovie()+"-"+super.seat.charAt(0)+"-"+CinemexTicket.count;}
  public CinemexTicket(String name, String showtime, String genre, String date){
    super(name,date,showtime,0.0);
    super.seat="Regular";
    this.genre=genre;
    this.status = "Not paid";
    count++;
    id=super.getMovie()+"-"+super.seat.charAt(0)+"-"+CinemexTicket.count;}
  public void calculateTicketPrice(){
    for(int i=0;i<MovieTicket.seatTypes.length;i++){
      if (MovieTicket.seatTypes[i].equals(super.seat)){
        int showtimeHour = Integer.parseInt(super.showtime.split(":")[0]);
        if(showtimeHour>=18 && showtimeHour<=23){
          super.setPrice(MovieTicket.seatPrices[i]+(MovieTicket.seatPrices[i]*(MovieTicket.nightShowCharge/100.0)));}
        else{super.setPrice(MovieTicket.seatPrices[i]);}}}
    System.out.println("Ticket price is calculated successfully.");}
    public String confirmPayment(){
      if(this.status.equals("Paid")){
        return "Ticket price is already paid!";}
      else{this.status="Paid";
        return "Payment Successful.";}}
    public String toString() {
      return "Ticket ID: "+id+"\n"+super.toString()+"\nGenre: "+genre+"\nSeat Type: "+ super.seat+"\nPrice(tk): "+super.getPrice()+"\nStatus: "+status;}}
        

//Task08 
public class KKTea extends Tea{
  public static int countTea;
  public static int countFlavTea;
  public static int totcount;
  public int bags;
  public int weight;
  public KKTea(int price,int bags){
     super("KK Regular Tea",price);
     this.bags=bags;
     this.weight=this.bags*2;}
  public static void updateSoldStatusRegular(KKTea obj){
    obj.status=true;
    countTea++;
    totcount++;}
  public void productDetail() {
    super.productDetail();
    System.out.println("Weight: "+weight+", Tea Bags: "+bags);}
  public static void totalSales(){
    if(countFlavTea!=0){
    System.out.println("Total Sales: "+totcount+"\nKK Regular Tea: "+countTea+"\nKK Flavoured Tea: "+countFlavTea);}
    else{System.out.println("Total Sales: "+totcount+"\nKK Regular Tea: "+countTea);}}}

public class KKFlavouredTea extends KKTea{
  public KKFlavouredTea(String name,int price,int bags){
     super(price,bags);
     super.name="KK "+name+" Tea";
     super.bags=bags;
     super.weight=super.bags*2;}
  public static void updateSoldStatusFlavoured(KKFlavouredTea obj){
    obj.status=true;
    countFlavTea++;
    totcount++;}
  public void productDetail() {
    super.productDetail();}}    
    