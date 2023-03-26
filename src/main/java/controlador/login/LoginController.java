/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador.login;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import controlador.login.ListaLoginSerializable.LoginSerializable;

/**
 *
 * @author Usuario
 */
public class LoginController {
    
    public void prepararJson(LoginSerializable loginSerializable) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(loginSerializable);

    }
    
}
