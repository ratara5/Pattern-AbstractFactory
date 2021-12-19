package com.raymond;

import com.raymond.inter.FabricaAbstracta;
import com.raymond.inter.IConexionBD;
import com.raymond.inter.IConexionREST;
import com.raymond.inter.impl.ConexionMySQL;
import com.raymond.inter.impl.ConexionNinguna;
import com.raymond.inter.impl.ConexionOracle;

public class ConexionBDFabricaAbstracta implements FabricaAbstracta {

    @Override
    public IConexionBD getBD(String motor) {
        if(motor==null){
            return new ConexionNinguna();
        } else if(motor.equalsIgnoreCase("MYSQL")){
            return new ConexionMySQL();
        } else if(motor.equalsIgnoreCase("ORACLE")) {
            return new ConexionOracle();
        }
        return new ConexionNinguna();
    }

    @Override
    public IConexionREST getREST(String area) {
        return null;
    }
}
