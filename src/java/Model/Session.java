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
public class Session {
    
    private String classname;
    private String instructoremail;

    public Session(String classname, String instructoremail) {
        this.classname = classname;
        this.instructoremail = instructoremail;
    }

    public Session() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
     * @return the instructoremail
     */
    public String getInstructoremail() {
        return instructoremail;
    }

    /**
     * @param instructoremail the instructoremail to set
     */
    public void setInstructoremail(String instructoremail) {
        this.instructoremail = instructoremail;
    }
    
    
    
    
}
