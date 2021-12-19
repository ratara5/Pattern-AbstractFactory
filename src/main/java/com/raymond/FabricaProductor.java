package com.raymond;

import com.raymond.inter.FabricaAbstracta;

public class FabricaProductor {

    public static FabricaAbstracta getFactory(String fabrica) {
        if (fabrica.equalsIgnoreCase("BD")) {
            return new ConexionBDFabricaAbstracta();
        } else if (fabrica.equalsIgnoreCase("REST")) {
            return new ConexionRESTFabricaAbstracta();
        } else {
            System.out.println("No se seleccionó fábrica");
        }
        return null;
    }
}
