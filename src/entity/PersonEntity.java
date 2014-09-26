/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 *
 * @author Jonas
 */
@Entity
public class PersonEntity implements Serializable
{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "s1")
    @SequenceGenerator(name = "s1", sequenceName = "PERS_SEQ",
                initialValue = 200000, allocationSize = 1)
    private int id;

    String fName;
    String lName;
    String phone;

    public int getId() {
      return id;
    }

    public void setId(int id) {
      this.id = id;
    }

    public PersonEntity(String fName, String lName, String phone)
    {
        this.fName = fName;
        this.lName = lName;
        this.phone = phone;
    }
    
    public PersonEntity(){}

    public String getfName() {
      return fName;
    }

    public void setfName(String fName) {
      this.fName = fName;
    }

    public String getlName() {
      return lName;
    }

    public void setlName(String lName) {
      this.lName = lName;
    }

    public String getPhone() {
      return phone;
    }

    public void setPhone(String phone) {
      this.phone = phone;
    }

    @Override
    public String toString() {
      return "Person{" + "fName=" + fName + ", lName=" + lName + ", phone=" + phone + ", id=" + id + '}';
    }

    
    
}
