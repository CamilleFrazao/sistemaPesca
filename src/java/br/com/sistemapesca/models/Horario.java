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
public enum Horario {

    DIA,
    NOITE,
    DIA_NOITE;

    @Override
    public String toString() {
        switch (this) {
            case DIA:
                return "Dia";
            case NOITE:
                return "Noite";
            case DIA_NOITE:
                return "Dia e Noite";

        }

        return null;
    }

}
