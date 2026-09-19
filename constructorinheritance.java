//Write a java program create a base class teacher and derived student and accept info using constructor and display.

import java.util.Scanner;
class Teacher
{
    Scanner sc=new Scanner(System.in);
    int id;
    String tname;
   Teacher()
  {
     System.out.println("enter teacher id:");
     id=sc.nextInt();
      System.out.println("enter teacher name:");
     tname=sc.next();

  }
} 
class Student extends Teacher
{
     int sid;
      String name;
     Student()
     {
         System.out.println("enter student id");
         sid=sc.nextInt();
          System.out.println("enter student name");
         name=sc.next();        
      }
      void disp()
      {
          System.out.println("teacher id ="+id);
         System.out.println("teacher name="+tname);
          System.out.println("student id ="+sid);
          System.out.println("student name  ="+name);
         
       }
      public static void main(String args[])
      {
          Student ob=new Student();
         ob.disp();
       }
}