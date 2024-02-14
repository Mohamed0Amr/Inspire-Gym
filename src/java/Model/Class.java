/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Model;

/**
 *
 * @author hp
 */
public class Class {

    

   
    
    private String classname;
    private String classtime;
    private String classday;
    private String roomno;
    
    
   

    public Class(String classname, String classtime, String classday, String roomno) {
        this.classname = classname;
        this.classtime = classtime;
        this.classday = classday;
        this.roomno = roomno;
    }

    /**
     * @return the classname
     */
    public String getClassname() {
        return classname;
    }

    /**
     * @param classname the classname to set
     */
    public void setClassname(String classname) {
        this.classname = classname;
    }

    /**
     * @return the classtime
     */
    public String getClasstime() {
        return classtime;
    }

    /**
     * @param classtime the classtime to set
     */
    public void setClasstime(String classtime) {
        this.classtime = classtime;
    }

    /**
     * @return the classday
     */
    public String getClassday() {
        return classday;
    }

    /**
     * @param classday the classday to set
     */
    public void setClassday(String classday) {
        this.classday = classday;
    }

    /**
     * @return the roomno
     */
    public String getRoomno() {
        return roomno;
    }

    /**
     * @param roomno the roomno to set
     */
    public void setRoomno(String roomno) {
        this.roomno = roomno;
    }

   
      
    

}
