package com.raymond.inter.impl;

import com.raymond.inter.IConexionBD;

public class ConexionMySQL implements IConexionBD {

    private String host;
    private String puerto;
    private  String usuario;
    private String contraseña;

    public ConexionMySQL(){
        this.host="";
        this.puerto="";
        this.usuario="";
        this.contraseña="";
    }


    @Override
    public void conectar() {
        System.out.println("Se conectó a MySQL");
    }

    @Override
    public void desconectar() {
        System.out.println("Se desconectó de MySQL");
    }
}
