/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemapesca.models;

/**
 *
 * @author John
 */
public enum Habitat {

    MONTANTE,
    JUSANTE,
    RESERVATORIO,
    RIO,
    LAGOA,
    GALHADA,
    ENTRE_ILHAS,
    PLANTAS_AQUA,
    BOCA_IGARA,
    PRAIA,
    MEIO_REPRESA,
    VARIOS,
    OUTROS;

    @Override
    public String toString() {
        switch (this) {
            case MONTANTE:
                return "Montante";
            case JUSANTE:
                return "Jusante";
            case RESERVATORIO:
                return "Reservatório";
            case RIO:
                return "Rio";
            case LAGOA:
                return "Lagoa";
            case GALHADA:
                return "Galhada";
            case ENTRE_ILHAS:
                return "Entre ilhas";
            case BOCA_IGARA:
                return "Boca de Igarapé";
            case PRAIA:
                return "Praia";
            case MEIO_REPRESA:
                return "Meio da represa";
            case VARIOS:
                return "Vários";
            case OUTROS:
                return "Outros";

        }
        return null;

    }
}
