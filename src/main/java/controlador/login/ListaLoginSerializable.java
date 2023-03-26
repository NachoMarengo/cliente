/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.login;

import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author Usuario
 */
public class ListaLoginSerializable {
    
    private LoginSerializable listaLogin;

    public ListaLoginSerializable() {
    }

    public LoginSerializable getListaLogin() {
        return listaLogin;
    }

    public void setListaLogin(LoginSerializable listaLogin) {
        this.listaLogin = listaLogin;
    }
    
    @Entity
    public class LoginSerializable {

        private String usuario;
        private String contra;

        public LoginSerializable() {
        }

        public String getUsuario() {
            return usuario;
        }

        public String getContra() {
            return contra;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public void setContra(String contra) {
            this.contra = contra;
        }
    }
}
