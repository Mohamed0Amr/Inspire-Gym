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
import java.sql.SQLDataException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hp
 */
public class ClassDaoImpl implements ClassDao{

    @Override
    public boolean registerclass(Session s) throws SQLException {
         
         String host="jdbc:derby://localhost:1527/Inspire";
         String uName="yasmina";
         String uPass="12345";
         Connection con = DriverManager.getConnection(host,uName,uPass);
        
         
         
            PreparedStatement pst=null;
            ResultSet rs=null;
            
           String sqlQuery = "INSERT INTO SESSION(CLASSNAME , INSTRUCTOREMAIL ) VALUES ( ? ,?) ";
           pst= con.prepareStatement(sqlQuery);
           
           pst.setString(1, s.getClassname());
           pst.setString(2, s.getInstructoremail());
            
           pst.executeUpdate();
           con.close();
           
           return true;
        }

    @Override
    public boolean checkisfull() throws SQLException {
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
            int num=rs.getInt(1);
           if( num >=5)
           {
             return true ;
           }
      return false;
           
          
        
    }

    @Override
    public boolean requestclass(RequestClass r) throws SQLException { 
        
         String host="jdbc:derby://localhost:1527/Inspire";
         String uName="yasmina";
         String uPass="12345";
         Connection con = DriverManager.getConnection(host,uName,uPass);
        
         
         
            PreparedStatement pst=null;
            ResultSet rs=null;
            
           String sqlQuery = "INSERT INTO REQUESTEDCLASS(CLASSNAME , CLIENTNAME ) VALUES ( ? ,?) ";
           pst= con.prepareStatement(sqlQuery);
           
           pst.setString(1, r.getClassname());
           pst.setString(2, r.getClientname());
            
           pst.executeUpdate();
           con.close();
           
           return true;
        
        
        
        
    }

   

    
    
}  