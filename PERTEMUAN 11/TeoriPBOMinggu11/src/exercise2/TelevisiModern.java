/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise2;

/**
 *
 * @author Lenovo
 */
public class TelevisiModern extends Elektronik{
    private String modeInput;
    
    public TelevisiModern(){
        this.modeInput = "HDMI";
    }

    public String getModeInput() {
        return modeInput;
    }
}
