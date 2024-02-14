/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.SQLException;
import java.util.LinkedList;
import Model.Client;

/**
 *
 * @author hp
 */
public interface SecretaryDao {
    
    
    
     public int retrieveAttendance() throws SQLException ;
         public boolean deleteClient(String name) throws SQLException ;
  public boolean addclass(Class c) throws SQLException;

     
    
}
