//Task1
import java.util.Scanner;
public class ASSIGNMENT01{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int summ=0;
    int min=0;
    int max=0;
    int count=0;
    for (int i=0; i<10; i++){
       int inp= sc.nextInt();
       if (inp>0 && inp%2!=0){
          summ+=inp;
          count++;
          if (min==0 && max==0){
             min=inp;
            max=inp;}
          else{
            if(inp>max){
              max=inp;}
            else if (inp<min){
              min=inp;}}}}
    if(summ!=0){
        System.out.println("Sum = "+summ);
        System.out.println("Minimum = "+min);
        System.out.println("Maximum = "+max);
        System.out.println("Average = "+(double)summ/count);}
    else {
       System.out.println("No odd positive numbers found");}}}

//Task2
import java.util.Scanner;
public class ASSIGNMENT01{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int prime=0;
    if (num1<num2){
     for(int i=num1+1;i<num2;i++){
       int count=0;
       for(int j=1;j<=i;j++){
         if(i%j==0){
           count++;}}
       if (count==2){
         prime++;}}}
    else{
     for(int i=num2+1;i<num1;i++){
      int count=0;
      for(int j=1;j<=i;j++){
        if(i%j==0){
          count++;}}
      if (count==2){
        prime++;}}}
    System.out.println("There are "+prime+" prime numbers between "+num1+" and "+num2);}}
      
//Task3
import java.util.Scanner;
public class ASSIGNMENT01{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String string1=sc.nextLine();
    String string2=sc.nextLine();    
    String newstring=string1+" "+string2;
    int num=0;
    for(int i=0;i<newstring.length();i++){
      if ((newstring.charAt(i)>='A' && newstring.charAt(i)<='Z') || (newstring.charAt(i)>='a' && newstring.charAt(i)<='z')){
        num+=newstring.codePointAt(i);}}
    System.out.println(newstring);
    System.out.println(num);}}
        
//Task4
import java.util.Scanner;
public class ASSIGNMENT01{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    String stri=sc.nextLine();
    String newstri="";
    for(int i=0;i<stri.length();i++){
      if (stri.charAt(i)=='a'){
        newstri+='z';}
      else{ 
        newstri+=(char)(stri.codePointAt(i)-1);}}
    System.out.println(newstri);}}
      
//Task5
import java.util.Arrays;
import java.util.Scanner;
public class ASSIGNMENT01{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the length of the array: ");
    int size=sc.nextInt();
    int[] arr=new int [size];
    for (int i=0; i<arr.length; i++){
      arr[i]=sc.nextInt();}
    for (int j=arr.length-1;j>-1;j--){
      System.out.print(arr[j]+" ");}}}

//Task06
import java.util.Arrays;
import java.util.Scanner;
public class ASSIGNMENT01{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N= ");
    int size=sc.nextInt();
    int[] arr=new int [size];
    for (int i=0; i<arr.length; i++){
      arr[i]=sc.nextInt();}
    for(int j=0;j<arr.length;j++){ int num=arr[j]; int count=0;
      boolean isDuplicate = false;
      for (int m = 0; m < j; m++) {
        if (arr[m] == num) {
          isDuplicate = true;
          break;}}
      if (!isDuplicate) {
        for(int k=0;k<arr.length;k++){
          if(arr[k]==num){
            count++;}}
        System.out.println(num+" - "+count+" times ");}}}}


//Task07 
import java.util.Arrays;
import java.util.Scanner;
public class ASSIGNMENT01{
  public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N= ");
    int size=sc.nextInt();
    double[] arr=new double [size];
    System.out.println("Please enter the elements of the array:");
    for (int i=0; i<arr.length; i++){ 
      arr[i]=sc.nextDouble();}
    int removed=0;
    System.out.println(arr[0]+" ");
    for (int j=1; j<arr.length; j++){
        if (arr[j]!=arr[j-1]){
          System.out.println(arr[j]+" ");}
        else{
          removed++;}}
    System.out.println();
    System.out.println("Removed elements : "+removed);}}

//Task08
import java.util.Scanner;
import java.util.Arrays;
public class ASSIGNMENT01{
  public static void main(String[]args){
    Scanner sc =new Scanner (System.in);
    System.out.print("row = ");
    int rows= sc.nextInt();
    System.out.print("column = ");
    int col=sc.nextInt();
    int[][] arr2D= new int [rows][col];
    for (int i=0;i<rows;i++){
      for (int j=0;j<col;j++){
        arr2D[i][j]=sc.nextInt();}
      System.out.println();}
    System.out.println("2D Array; ");
    for (int i=0;i<rows;i++){
      for (int j=0;j<col;j++){
        System.out.print(arr2D[i][j]+" ");}
      System.out.println();}
    System.out.println("1D Array; ");
    for (int i=0;i<rows;i++){
      for (int j=0;j<col;j++){
        System.out.print(arr2D[i][j]+" ");}}}}
 
//Task09
import java.util.Scanner;
import java.util.Arrays;
public class ASSIGNMENT01{
  public static void main(String[]args){
    Scanner sc =new Scanner (System.in);
    int [ ] [ ] A = {{1, 0, 0, 1},{0, 1, 0, 0},{1, 0, 1, 0}, {0, 1, 0, 1}}; 
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[i].length; j++) {
        System.out.print(A[i][j] + " ");}
      System.out.println();}
    boolean flag=false;
    for (int i = 0; i < A.length; i++) {
      for (int j = 0; j < A[i].length; j++) {
        if (i == j) {
          if (A[i][j] != 1) {
            flag = true;
            break;}}
        else {
          if (A[i][j] != 0) {
            flag = true;
            break;}}}
      if (flag) {
        break;}}  
    if (flag==false){
      System.out.println("Identity Matrix");}
    else {
      System.out.println("Not an Identity Matrix");}}}
     
//Task10
import java.util.Scanner;
public class ASSIGNMENT01{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [][] arr2D = {{0, 0, 10, 0, -1},
                      {0, -1, 0, 0, -1},
                      {-1, 0, -1, 0, 0},
                      {0, -1, 7, 0, -1},
                      {0, -1, 0, -1, 0}
    };
    System.out.println("Initial Map:");
    printMap(arr2D);
    int row = arr2D.length;
    int col = arr2D[0].length;
    int row_pos = -1, col_pos = -1;
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < col; j++) {
        if (arr2D[i][j]==7) {
           row_pos=i;
           col_pos=j;}}}
    int turns = 5;
    while (turns > 0) {
      int new_row = row_pos, new_col = col_pos;
      System.out.printf("Enter move %d: ",(6-turns));
      String inp = sc.nextLine();
      boolean flag=false;
      if (inp.equals("RIGHT")) {
         col_pos++;
         if ((row_pos >= 0 && row_pos < row) && (col_pos >= 0 && col_pos < col) && arr2D[row_pos][col_pos] != -1 && arr2D[row_pos][col_pos] != 10) {
           int store = arr2D[row_pos][col_pos];
           arr2D[row_pos][col_pos] = arr2D[row_pos][col_pos - 1];
           arr2D[row_pos][col_pos - 1] = store;}
         else {
           if ((row_pos < 0 || row_pos >= row) || (col_pos < 0 || col_pos >= col)) {
             System.out.println("Player fell outside the playing area. Game over!"); break;}
           else if (arr2D[row_pos][col_pos] == -1) {
             System.out.println("Player stepped on mine. Game Over!"); break;}
           else if (arr2D[row_pos][col_pos] == 10) {
             System.out.println("Treasure found. You win!"); flag = true;
             arr2D[row_pos][col_pos] = arr2D[row_pos][col_pos - 1];
             arr2D[row_pos][col_pos - 1] = 0;
             turns = 0; }}}  
      else if (inp.equals("LEFT")) {
         col_pos--;
         if ((row_pos >= 0 && row_pos < row) && (col_pos >= 0 && col_pos < col) && arr2D[row_pos][col_pos] != -1 && arr2D[row_pos][col_pos] != 10) {
           arr2D[row_pos][col_pos] = arr2D[row_pos][col_pos + 1];
           arr2D[row_pos][col_pos + 1] = 0;}
         else {
           if ((row_pos < 0 || row_pos >= row) || (col_pos < 0 || col_pos >= col)) {
             System.out.println("Player fell outside the playing area. Game over!"); break;}
           else if (arr2D[row_pos][col_pos] == -1) {
             System.out.println("Player stepped on mine. Game Over!"); break;}
           else if (arr2D[row_pos][col_pos] == 10) {
             System.out.println("Treasure found. You win!"); flag = true;
             arr2D[row_pos][col_pos] = arr2D[row_pos][col_pos + 1];
             arr2D[row_pos][col_pos + 1] = 0;
             turns = 0;}}}
      else if (inp.equals("UP")) {
         row_pos--;
         if ((row_pos >= 0 && row_pos < row) && (col_pos >= 0 && col_pos < col) && arr2D[row_pos][col_pos] != -1 && arr2D[row_pos][col_pos] != 10) {
           int store = arr2D[row_pos][col_pos];
           arr2D[row_pos][col_pos] = arr2D[row_pos + 1][col_pos];
           arr2D[row_pos + 1][col_pos] = store;}
         else {
           if ((row_pos < 0 || row_pos >= row) || (col_pos < 0 || col_pos >= col)) {
             System.out.println("Player fell outside the playing area. Game over!"); break;}
           else if (arr2D[row_pos][col_pos] == -1) {
             System.out.println("Player stepped on mine. Game Over!"); break;}
           else if (arr2D[row_pos][col_pos] == 10) {
             System.out.println("Treasure found. You win!");
             flag = true;
             arr2D[row_pos][col_pos] = arr2D[row_pos + 1][col_pos];
             arr2D[row_pos + 1][col_pos] = 0;
             turns = 0;}}}
      else if (inp.equals("DOWN")) {
         row_pos++;
         if ((row_pos >= 0 && row_pos < row) && (col_pos >= 0 && col_pos < col) && arr2D[row_pos][col_pos] != -1 && arr2D[row_pos][col_pos] != 10) {
           int store = arr2D[row_pos][col_pos];
           arr2D[row_pos][col_pos] = arr2D[row_pos - 1][col_pos];}
         else {
           if ((row_pos < 0 || row_pos >= row) || (col_pos < 0 || col_pos >= col)) {
             System.out.println("Player fell outside the playing area. Game over!"); break;}
           else if (arr2D[row_pos][col_pos] == -1) {
             System.out.println("Player stepped on mine. Game Over!"); break;}
           else if (arr2D[row_pos][col_pos] == 10) {
             System.out.println("Treasure found. You win!");
             flag = true;
             arr2D[row_pos][col_pos] = arr2D[row_pos - 1][col_pos];
             arr2D[row_pos - 1][col_pos] = 0;
             turns = 0;}}}
      System.out.println("Current state:");
      printMap(arr2D);
      turns--;
      if(flag==true){break;}
    }
    if (turns == 0) {
      System.out.println("Failed to find the treasure.");}
  }
  
  public static void printMap(int[][] arr) { 
    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j]+ "  ");}
      System.out.println();}}
}