package com.raymond;

import com.raymond.inter.FabricaAbstracta;
import com.raymond.inter.IConexionBD;
import com.raymond.inter.IConexionREST;

public class App {

    public static void main(String[] args){
        FabricaAbstracta fabricaBD=FabricaProductor.getFactory("BD"); //Objeto de la interface FabricaAbstracta...
        //...retornado por el método getFactory de la clase FabricaProductor
        IConexionBD cxBD1=fabricaBD.getBD("MYSQL"); //Objeto de la clase ConexionMySQL, retornado por el método...
        //getBD de la interface FabricaAbstacta que a su vez retorna un objeto de la Interface IConexionBD

        cxBD1.conectar();

        FabricaAbstracta fabricaREST=FabricaProductor.getFactory("REST");
        IConexionREST cxREST1=fabricaREST.getREST("COMPRAS");

        cxREST1.leerURL("https://www.google.com");
    }
}
