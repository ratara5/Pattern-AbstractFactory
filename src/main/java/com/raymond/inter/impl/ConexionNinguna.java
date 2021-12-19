package com.raymond.inter.impl;

import com.raymond.inter.IConexionBD;

public class ConexionNinguna implements IConexionBD {

    @Override
    public void conectar() {
        System.out.println("No se especificó ningún proveedor");
    }

    @Override
    public void desconectar() {
        System.out.println("No se especificó ningún proveedor");
    }
}
