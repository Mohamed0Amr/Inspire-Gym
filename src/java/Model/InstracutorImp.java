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

/**
 *
 * @author hp
 */
public class InstracutorImp implements InstracutorDEO{

    @Override
    public boolean add_Instracutor(Instructor i) throws SQLException {
  String host ="jdbc:derby://localhost:1527/Inspire";
         String uName="yasmina";
         String uPass="12345";
            Connection con = DriverManager.getConnection(host, uName, uPass);


        PreparedStatement pst = null;
        ResultSet rs= null;
        String sqlQuery ="INSERT INTO instracutor(INSTRUCTORNAME,INSTRUCTOREMAIL,PHONENO,PASSWPRD) VALUES (?,?,?,?)";
//        String sqlQuery = "SELECT * FROM instracutor where InstracutorName='"+i.getName()+"'and InstracutorEmail='"+i.getEmail()+
//                "'and InstracutorNumber='"+i.getPhone()+"'and InstracutorPass'"+i.getPass();
        pst = con.prepareStatement(sqlQuery);
        
            pst.setString(1,i.getEmail());
            pst.setString(2,i.getName());
            pst.setString(3,i.getPass());
            pst.setString(4,i.getPhone());
            pst.executeUpdate();
            con.close();
//            rs = pst.executeQuery();
//             this.add_Instracutor();
     
        
        return true;
    }
//    public static void main(String args[])throws SQLException
//    {
//    InstructorImp db = new InstructorImp();
//    Instructor i = new Instructor("Hamo","123","011","123");
//        System.out.println(db.add_Instracutor(i));
//    }

  
  
    
}
