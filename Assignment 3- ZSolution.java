public class BankAccount{
   public int acc=0;
   public String typo="Not set";
   public void setInfo(int d, String s1){
      acc=d;
      typo=s1;
      System.out.println("Account information updated!");}
   public String printDetails(){
     return "Account No: "+acc+"\n"+"Type: "+typo;}}
  


public class Shape{
  public String shapename;
  public double area;
  public void setParameters(String s1, int d1){
    shapename=s1;
    area=3.1416*d1*d1;}
  public void setParameters(String s1, int d1, int d2){
    shapename=s1;
    area=0.5*d1*d2;}
  public void setParameters(String s1, double d1,double d2){
    shapename=s1;
    area=d1*d2;}
  public String details(){
    return ("Shape Name: "+shapename+"\n"+"Area: "+area);}}

public class Shelf{
   public int capacity;
   public int books;
   public void addBooks(int addbook){
     if (capacity==0){
       System.out.println("Zero capacity. Cannot add books.");}
     else if (capacity>books+addbook){
       System.out.println(addbook+" books added to shelf.");
       books+=addbook;}
     else if (capacity<books+addbook){
       System.out.println("Exceeds capacity");}}
   public void showDetails(){
      System.out.println("Shelf capacity: "+capacity+"\n"+"Number of books: "+books);}
   
}

public class Library{
   public int maxcap;
   public String [] booklist= new String[maxcap];
   public int books;
   public int count;
   public void setBookCapacity(int a){
     maxcap=a;booklist = new String[a];}
   public void addBook(String s1){
     if (maxcap-1>=count){System.out.println("Book "+s1+" added to the library"); 
        booklist[count]=s1;count++; books++;}
     else {
       System.out.println("Maximum capacity exceeds. You can't add more than "+maxcap+" books");}}
   public void printDetail(){
     System.out.println("Maximum Capacity: "+maxcap+"\n"+"Total Books: "+books+"\n"+"Book list: ");
     for (int i=0; i<count;i++){
       System.out.println(booklist[i]);}}
}
  
public class TaxiLagbe{
   public String taxinumber;
   public String area;
   public int totpass;
   public int totfare;
   public String [] passlist=new String [4];
   public int count;
   public void addPassenger(String s1,int d1){
     if (count < 4) {
            System.out.println("Dear " + s1 + "! Welcome to TaxiLagbe");
            passlist[count] = s1;
            count++;
            totpass++;
            totfare += d1;}
     else {
            System.out.println("Taxi Full! No more passengers can be added");}}
   public void addPassenger(String s1,int d1,String s2, int d2){
        if (count < 4) {
            System.out.println("Dear " + s1 + "! Welcome to TaxiLagbe");
            passlist[count] = s1;
            count++;
            totpass++;
            totfare += d1;}
        if (count < 4) {
            System.out.println("Dear " + s2 + "! Welcome to TaxiLagbe");
            passlist[count] = s2;
            count++;
            totpass++;
            totfare += d2;}
        else if (count == 4) {
            System.out.println("Taxi Full! No more passengers can be added");}}
     
   public void storeInfo(String t1, String a1){
     taxinumber=t1; area=a1;}
   public void printDetails(){
     System.out.println("Taxi number: "+taxinumber+"\n"+"This taxi can cover "+area+" area"+"\n"+"Total Passenger: "+totpass);
     System.out.println("Passenger Lists: ");
     for (int i=0;i<count;i++){
        System.out.print(passlist[i]+" ");}
     System.out.println();
     System.out.println("Total collected fare: "+totfare+" Taka");}   
}
  
public class Student{
  public String name="Not set";
  public String dept="CSE";
  public double cg=0.0;
  public int credits=9;
  public String scholar="Not set";
  public void updateDetails(String s1,double cg1){
    name=s1;
    cg=cg1;}
  public void updateDetails(String s1,double cg1,int c1){
    name=s1;
    cg=cg1;credits=c1;}
  public void updateDetails(String s1,double cg1, int c1, String s2){
    name=s1;
    cg=cg1;credits=c1; dept=s2;}
  public void checkScholarshipEligibility(){
    if (cg>=3.7){System.out.println(name+" is eligible for Merit-based scholarship.");scholar="Merit-based scholarship.";}
    else if (cg>=3.5 && cg<3.7){System.out.println(name+" is eligible for Need-based scholarship.");scholar="Need-based scholarship.";}
    else if (cg>=3.5 && credits>10){System.out.println(name+" is eligible for scholarship.");}
    else{System.out.println(name+" is not eligible for scholarship.");scholar="No scholarship.";}}
  public void showDetails(){System.out.println("Name: "+name+"\n"+"Department: "+dept+"\n"+"CGPA: "+cg+"\n"+"Credits: "+credits+"\n"+"Scholarship Status: "+scholar);}}
   

public class Cart{
   public double discount=0.0;
   public void giveDiscount(double a1){discount=a1;}
   public int count;
   public int cartnumber; 
   public double totprice;
   public String [] arritem=new String[3];
   public double[] itemprice=new double[3];
   public void create_cart(int i1){cartnumber=i1;}
   public void addItem(String s1,double d1){
     if (count<3){System.out.println(s1+" added to your cart "+cartnumber);
        System.out.println("You have "+(count+1)+" item(s) in your cart now.");
        arritem[count]=s1;
        itemprice[count]=d1;
        totprice+=itemprice[count];
        count++;}
     else{System.out.println("You have already "+count+" item(s) in your cart now.");}}
   public void addItem(double d1,String s1){
     if (count<3){System.out.println(s1+" added to your cart "+cartnumber);
        System.out.println("You have "+(count+1)+" item(s) in your cart now.");
        arritem[count]=s1;
        itemprice[count]=d1;
        totprice+=itemprice[count];
        count++;}
     else{System.out.println("You have already "+count+" item(s) in your cart now.");}}  
   public void cartDetails(){
     System.out.println("Your cart("+cartnumber+") :");
     for(int i=0;i<count;i++){
         System.out.println(arritem[i]+" - "+itemprice[i]);}
     System.out.println("Discount Applied: "+discount+"%");
     System.out.println("Total price: "+(totprice-(totprice*(discount/100))));}}
     
public class Reader{
   public int readercap;
   public String readername="New user";
   public String[] booklist;
   public String createReader(String s1, int i1){
     readername=s1;
     readercap=i1;
     booklist=new String[readercap];
     return "A new reader is created!" ;}
   public int count;
   public void readerInfo(){
     System.out.println("Name: "+readername+"\n"+"Capacity: "+readercap+"\n"+"Books: ");
     if (count==0){
       System.out.println("No books added yet");}
     else{
       for (int i=0;i<count;i++){
         if (booklist[i]!=null){
          System.out.println("Book "+(i+1)+": "+booklist[i]);}
         else{break;}}}}
   public void addBook(String s1){
     if (count<readercap){
       booklist[count]=s1;
       count++;}
     else{System.out.println("No more capacity");}}}
  