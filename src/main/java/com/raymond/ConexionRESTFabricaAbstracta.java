package com.raymond;

import com.raymond.inter.FabricaAbstracta;
import com.raymond.inter.IConexionBD;
import com.raymond.inter.IConexionREST;
import com.raymond.inter.impl.ConexionRESTCompras;
import com.raymond.inter.impl.ConexionRESTNoArea;
import com.raymond.inter.impl.ConexionRESTVentas;

public class ConexionRESTFabricaAbstracta implements FabricaAbstracta {

    @Override
    public IConexionREST getREST(String area) {
        if(area==null){
            return new ConexionRESTNoArea();
        } else if(area.equalsIgnoreCase("COMPRAS")){
            return new ConexionRESTCompras();
        } else if(area.equalsIgnoreCase("VENTAS")){
            return new ConexionRESTVentas();
        }
        return new ConexionRESTNoArea();
    }

    @Override
    public IConexionBD getBD(String motor) {
        return null;
    }
}
