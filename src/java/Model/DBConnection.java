/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
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
 * @author Hamoudi
 */
public class DBConnection {
 
    
    public boolean validdataYser(Person p)
    {
      if(p.getPassword().equals("123")&&p.getUname().equals("Hamo"))
        return true;
   
    return false;

    }
     public boolean validdataYser(Instructor ins)
    {
  //  if(ins.getId().equals("20203504")&&ins.getName().equals("Hamo"))
        return true;
        
    //return false;
    
    }
     
      public boolean validdataYser( Registration r)
    {
      if(r.getClassname().equals("Zumba")&&r.getUsername().equals("Yasmina"))
        return true;
        
    return false;
    
    }
     
     public LinkedList<Class> retrieveAttendance() throws SQLException 
     {
         LinkedList<Class> classes=new LinkedList<>();
      
         String host="";
         String uName="";
         String uPass="";
         Connection con=DriverManager.getConnection(host,uName,uPass);
         
            PreparedStatement pst=null;
            ResultSet rs=null;
            
           String sqlQuery = "";
           pst= con.prepareStatement(sqlQuery);
           rs= pst.executeQuery();
           
           while(rs.next())
           {
              String  attend =rs.getString("");
              String  instN  =rs.getString("");      
              String  classN =rs.getString("");
              
           //   Class c=new Class(classN, attend, instN);
              
             // classes.add(c);
           }
           
         return classes;
     }
     
     
}


