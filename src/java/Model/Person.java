/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Hamoudi
 */
public class Person {
    String uname;
    String password;
  private static Person single =new Person();
  
    public Person(String uname, String password) {
        this.uname = uname;
        this.password = password;
    }
    

    public String getUname() {
        return uname;
    }

    public String getPassword() {
        return password;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public void setPassword(String password) {
        this.password = password;
    }
     private Person() {

    }

    public static Person getInstance() {
        if (single == null) {
            synchronized (Person.class) {
                if (single == null) {

                    single = new Person();
                }
            }
        }
        return single;
    }


}
    
