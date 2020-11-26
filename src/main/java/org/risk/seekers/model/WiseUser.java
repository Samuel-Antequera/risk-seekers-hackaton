package org.risk.seekers.model;

import java.util.List;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class WiseUser extends PanacheEntity {
	
    public String name;
    public String firstName;
    public String secondName;
    public int age;
    public String mail;
    public String phone;
    public float socre; 

    public static List<WiseUser> getAllWiseUsers(String wiseUser) {
        return find("wiseUser", wiseUser).list();
    }


}
