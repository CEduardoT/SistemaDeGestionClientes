/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadegestiondeclientes.models;

/**
 *
 * @author eduar
 */
public class Cliente {
    private String id;
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
   
public String getNombre(){
    return nombre;
}
public String getApellido(){
    return apellido;
}
public String getEmail (){
    return email;
}
public String setNombre(String valor){
    nombre=valor;
        return null;
}
public String setApellido(String valor){
    apellido=valor;
        return null;
}
public String getNombreCompleto(){
    return nombre + " "+ apellido;
} 
public String setEmail(String valor){
    email = valor;
    return null;
}

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}

