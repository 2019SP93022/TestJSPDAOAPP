/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;
import java.sql.*;
/**
 *
 * @author vivek
 */
public class MyCon 
{
   static Connection con=null;
   
   static
   {
      try 
       {
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("Driver load");
       } 
       catch (ClassNotFoundException e) 
       {
           System.out.println(e);
       }
   }
   
   
   public static Connection getConnection()
   {
      try
      {   
          con=DriverManager.getConnection("jdbc:mysql://localhost/library1", "root", "root");
          System.out.println("Database Connected");
      }
      catch(Exception e)
      {
         System.out.println(e);
      }    
      return con;
   }
   
}
