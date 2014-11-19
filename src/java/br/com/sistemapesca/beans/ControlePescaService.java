/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemapesca.beans;

import br.com.sistemapesca.models.ControlePesca;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author John
 */
@ManagedBean
@SessionScoped
public class ControlePescaService {
    
    ControlePesca controlePesca = new ControlePesca();

    public ControlePesca getControlePesca() {
        return controlePesca;
    }

    public void setControlePesca(ControlePesca controlePesca) {
        this.controlePesca = controlePesca;
    }
    
    
    

    /**
     * Creates a new instance of ControlePescaService
     */
    public ControlePescaService() {
    }
    
}
