/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.SQLDataException;
import java.sql.SQLException;

/**
 *
 * @author hp
 */
public interface ClassDao{
    
  public boolean registerclass(Session s) throws SQLException;
  public boolean checkisfull()throws SQLException;
   public boolean requestclass(RequestClass r) throws SQLException;
  
  
  
  
  
}
