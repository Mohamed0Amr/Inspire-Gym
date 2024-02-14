/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author hp
 */
public class SecretaryDaoImpl implements SecretaryDao{

    @Override
    public int retrieveAttendance() throws SQLException {
        
          String host="jdbc:derby://localhost:1527/Inspire";
          String uName="yasmina";
          String uPass="12345";
         Connection con=DriverManager.getConnection(host,uName,uPass);
         
            PreparedStatement pst=null;
            ResultSet rs=null;
            
           String sqlQuery = "SELECT COUNT(*) FROM SESSION  ";
           pst= con.prepareStatement(sqlQuery);
           rs= pst.executeQuery();
           
           rs.next();
           
           int number=rs.getInt(1);
        
        return number;
           
    }

    
    public boolean deleteClient(String name) throws SQLException {
        
         String host="jdbc:derby://localhost:1527/Inspire";
          String uName="yasmina";
          String uPass="12345";
         Connection con=DriverManager.getConnection(host,uName,uPass);
         
        String myQuery = "DELETE from CLIENT where CLIENTNAME = ?";

        PreparedStatement pst = con.prepareStatement(myQuery);

        pst.setString(1, name);
   
        if (pst.execute()) {
            return true;
        }
        return false;

        
        
        
        
        
    }

    
  public static void main(String arg[]) throws SQLException
  {
     SecretaryDaoImpl x=new SecretaryDaoImpl();
     
      ;
      System.out.println(x.retrieveAttendance());
     
  }

    @Override
    public boolean addclass(Class c) throws SQLException {
        
           String host="jdbc:derby://localhost:1527/Inspire";
         String uName="yasmina";
         String uPass="12345";
         Connection con = DriverManager.getConnection(host,uName,uPass);
        
         
         
            PreparedStatement pst=null;
            ResultSet rs=null;
            
           String sqlQuery = "INSERT INTO CLASS(CLASSNAME , CLASSTIME , CLASSDAY , ROOMNO ) VALUES ( ? ,? ,? ,?) ";
           pst= con.prepareStatement(sqlQuery);
           
           pst.setString(1, c.getClassname());
           pst.setString(2, c.getClasstime());
            pst.setString(3,c.getClassday());
           pst.setString(4, c.getRoomno());
            
           pst.executeUpdate();
           con.close();
           
           return true;
    }
    
}
