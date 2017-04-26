/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author farah
 */
@Entity
public class ManagerBiblio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    private String login;
    private String password;

    public ManagerBiblio() {
    }

    public ManagerBiblio(String login) {
        this.login = login;
    }

    public ManagerBiblio(String login, String password) {
        this.login = login;
        this.password = password;
    }

    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.login);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ManagerBiblio other = (ManagerBiblio) obj;
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        return true;
    }

   
    
}
