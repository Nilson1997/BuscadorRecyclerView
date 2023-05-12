package com.yagami.buscadorrecyclerview;

public class Usuario {
    String Nombre;
    String Telefono;
    String email;

    public Usuario (String Nombre, String Telefono, String email){
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.email = email;
    }

    public String getNombre(){
        return Nombre;
    }
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }

    public  String getTelefono(){
        return Telefono;
    }
    public  void  setTelefono(String Telefono){
        this.Telefono=Telefono;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String Email){
        this.email=email;
    }


}
