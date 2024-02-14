/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.SQLException;
import java.util.LinkedList;

/**
 *
 * @author hp
 */
public interface ClientDAO {
    
    boolean choose_package(Client c)throws SQLException;
    public LinkedList<Class> retrieveClassData() throws SQLException ;

}
