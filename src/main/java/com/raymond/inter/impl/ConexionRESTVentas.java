package com.raymond.inter.impl;

import com.raymond.inter.IConexionREST;

public class ConexionRESTVentas implements IConexionREST {

    @Override
    public void leerURL(String url) {
        System.out.println("Conectándose a "+url);
    }
}
