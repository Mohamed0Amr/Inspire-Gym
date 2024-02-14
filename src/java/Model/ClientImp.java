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
import javax.ws.rs.client.Client;

/**
 *
 * @author hp
 */
public class ClientImp implements ClientDAO{
  
    
      @Override
    public LinkedList<Class> retrieveClassData() throws SQLException {
        
          LinkedList<Class> classes=new LinkedList<>();
      
          String host="jdbc:derby://localhost:1527/Inspire";
          String uName="yasmina";
          String uPass="12345";
         Connection con=DriverManager.getConnection(host,uName,uPass);
         
            PreparedStatement pst=null;
            ResultSet rs=null;
            
           String sqlQuery = "SELECT * FROM CLASS";
           pst= con.prepareStatement(sqlQuery);
           rs= pst.executeQuery();
           
           while(rs.next())
           {
              String  clname =rs.getString("CLASSNAME");
              String  cltime  =rs.getString("CLASSTIME");      
              String  clday =rs.getString("CLASSDAY");
              String   rno =rs.getString("ROOMNO");
              
              Class c=new Class(clname, cltime, clday, rno);
              
              classes.add(c);
           }
           
         return classes;
        
        
        
        
    }

    @Override
    public boolean choose_package(Model.Client c) throws SQLException {
         String host="jdbc:derby://localhost:1527/Inspire";
          String uName="yasmina";
          String uPass="12345";
         Connection con=DriverManager.getConnection(host,uName,uPass);
        PreparedStatement pst = null;
        ResultSet rs= null;
        String sqlQuery="INSERT INTO instracutor(CLIENTID,CLIENTNAME,CLIENTPACKAGE,) VALUES (?,?,?,?)";
        pst= con.prepareStatement(sqlQuery);
        pst.setString(1,c.getName());
        pst.setString(2,c.getId());
        pst.setString(3,c.getCpackage());
        pst.executeUpdate();
        con.close();
     
        return true;

    }
}
