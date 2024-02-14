/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

import java.sql.SQLException;

/**
 *
 * @author hp
 */
public interface InstracutorDEO {
    
    boolean add_Instracutor(Instructor i)throws SQLException;

    
}
