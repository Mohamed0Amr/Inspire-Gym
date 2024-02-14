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
public class Client {
   String name,id,cpackage;

    public Client(String name, String id, String cpackage) {
        this.name = name;
        this.id = id;
        this.cpackage = cpackage;
    }

   

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCpackage() {
        return cpackage;
    }

    public void setCpackage(String cpackage) {
        this.cpackage = cpackage;
    }
    
}   
