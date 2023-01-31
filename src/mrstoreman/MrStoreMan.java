/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrstoreman;

/**
 *
 * @author Mahdi & Peom
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;



public class MrStoreMan {
    
    public Connection connection;
    //this.setLocationRelativeTo(null);
            
    public void connectDB() throws ParseException {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(
                    "jdbc:sqlserver://localhost:1433;databaseName=MrStoreMan;selectMethod=cursor", "sa", "123456");

            System.out.println("DATABASE NAME IS:" + connection.getMetaData().getDatabaseProductName());

            Statement statement1 = connection.createStatement();
            Statement statement2 = connection.createStatement();
            Statement statement3 = connection.createStatement();
            
            ResultSet resultSet1 = statement1
                    .executeQuery("SELECT OwnerName FROM Owner");
            
            ResultSet resultSet2 = statement2
                    .executeQuery("SELECT EmployeeName FROM Employee");
            
            ResultSet resultSet3 = statement3
                    .executeQuery("SELECT CustomerName FROM Customer");
            
            while (resultSet1.next()) {
                
                System.out.println("Owner NAME:" + 
                        resultSet1.getString("OwnerName"));
                if(resultSet1.getString("OwnerName")=="Peom Dutta")
                {
                    break;
                }
            }
            
            while (resultSet2.next()) {
                
                System.out.println("Employee NAME:" + 
                        resultSet2.getString("EmployeeName"));
            }
            
            while (resultSet3.next()) {
                
                System.out.println("Customer NAME:" + 
                        resultSet3.getString("CustomerName"));
            }
            
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
        
        Date present = new Date();
        java.sql.Date presentdate = new java.sql.Date(present.getTime());
        System.out.println(present);
        System.out.println(presentdate);
        
        String seconddate = "2021-03-20";
        Date date2=new SimpleDateFormat("yyyy-MM-dd").parse(seconddate);
        java.sql.Date newdate = new java.sql.Date(date2.getTime());
        System.out.println(seconddate+"\t"+date2);
        System.out.println(seconddate+"\t"+newdate);
        
        System.out.println("present date = "+presentdate);
        System.out.println("new date = "+newdate);
        
        long diff = present.getTime()-date2.getTime();
        long sec = diff/1000;
        long min = sec/60;
        long hours = min/60;
        long days = hours/24;
        
        System.out.println("diff = "+diff);
        System.out.println("sec = "+sec);
        System.out.println("min = "+min);
        System.out.println("hours = "+hours);
        System.out.println("days = "+days);
        
        if(presentdate.compareTo(newdate)<=0)
        {
            System.out.println("Not expired");
        }
        
        if(presentdate.compareTo(newdate)>0)
        {
            System.out.println("expired");
        }
        
        if(presentdate.compareTo(newdate)==0)
        {
            System.out.println("3");
        }
        
    
        String a = "asdqwe";
        String b = "asdqwe";
        
        if(!(a.equals(b)))
        {
            System.out.println("yes");
        }
        else
        {
            System.out.println("no");
        }
        
        /*DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu/mm/dd");
        Date date = new Date();
        String firstdate = date.toString();
        String seconddate = "2021-03-18";
        
        
        LocalDate date1 = LocalDate.parse(firstdate,formatter);
        LocalDate date2 = LocalDate.parse(seconddate,formatter);
        
        if(date1.compareTo(date2)<0)
        {
            System.out.println("1");
        }
        
        if(date1.compareTo(date2)>0)
        {
            System.out.println("2");
        }
        
        if(date1.compareTo(date2)==0)
        {
            System.out.println("3");
        }*/
        
        /*(Date now = new Date(  ); 
 
        long t = now.getTime(  ); 
        
        long x = t+10;
 
        System.out.println("t="+t);
        System.out.println("x="+x);
        
        t -= 700*24*60*60*1000; 
 
        Date then = new Date(t); 
 
        System.out.println("Seven hundred days ago was " + then);*/

        /*Date present = new Date();
        java.sql.Date presentdate = new java.sql.Date(present.getTime());
        System.out.println("Present date is "+presentdate);
        long prd = present.getTime();
        System.out.println(prd);
        System.out.println("Present date in Milisecond is "+prd);
        
        long pastd = present.getTime();
        pastd-= 25*24*60*60*1000;
        Date past = new Date(pastd);
        System.out.println("past date in full format is "+past);
        java.sql.Date pastdate = new java.sql.Date(past.getTime());
        System.out.println("past date is "+pastdate);*/
        //long md = date.getTime();
        //System.out.println(md);
        //long ed = date.getTime()+(60*24*60*60*1000);
        //System.out.println(ed);
        //Date date2 = new Date(ed);
        //java.sql.Date d2 = new java.sql.Date(date2.getTime());
        //System.out.println(date2);
        //System.out.println(d2);
        
        
        
        /*Date date2 = new Date();
        String firstdate = "2020-03-20";
        long ed = date2.getTime()+(30*24*60*60*1000);
        System.out.println(ed);*/
        
    
        /*
        Date date1 = new Date();
        java.sql.Date d1 = new java.sql.Date(date1.getTime());
        
        Date date2 = new Date();
        java.sql.Date d2 = new java.sql.Date(date2.getTime());
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        Date finaldate1 = sdf.parse(d1.toString());
        Date finaldate2 = sdf.parse(d2.toString());
        
        if(finaldate1.compareTo(finaldate2)>0)
        {
            System.out.println("d1 = "+d1);
            System.out.println("d2 = "+d2);
            System.out.println("finaldate1 = "+finaldate1);
            System.out.println("finaldate2 = "+finaldate2);
            System.out.println("Finaldate1 is greater than finaldate2");
        }
        else if(finaldate1.compareTo(finaldate2)<0)
        {
            System.out.println("d1 = "+d1);
            System.out.println("d2 = "+d2);
            System.out.println("finaldate1 = "+finaldate1);
            System.out.println("finaldate2 = "+finaldate2);
            System.out.println("Finaldate1 is less than finaldate2");
        }
        else if(finaldate1.compareTo(finaldate2)==0)
        {
            System.out.println("d1 = "+d1);
            System.out.println("d2 = "+d2);
            System.out.println("finaldate1 = "+finaldate1);
            System.out.println("finaldate2 = "+finaldate2);
            System.out.println("Finaldate1 and finaldate2 are same date");
        }
        */
    }
    
    public static void main(String[] args) throws ParseException{
        MrStoreMan cnObj = new MrStoreMan();
        cnObj.connectDB();
    }
    
}
