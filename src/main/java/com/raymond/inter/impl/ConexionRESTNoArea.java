package com.raymond.inter.impl;

import com.raymond.inter.IConexionREST;

public class ConexionRESTNoArea implements IConexionREST {
    @Override
    public void leerURL(String url) {
        System.out.println("No se conectó a ningún área específica");
    }
}
