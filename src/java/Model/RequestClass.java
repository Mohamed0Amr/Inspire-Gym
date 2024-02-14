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
public class RequestClass {
    
    private String classname;
    private String clientname;

    public RequestClass(String classname, String clientname) {
        this.classname = classname;
        this.clientname = clientname;
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
     * @return the clientname
     */
    public String getClientname() {
        return clientname;
    }

    /**
     * @param clientname the clientname to set
     */
    public void setClientname(String clientname) {
        this.clientname = clientname;
    }
    
    
    
}
