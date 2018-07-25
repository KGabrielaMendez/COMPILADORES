/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com_analizadorsintactico;

/**
 *
 * @author DELL
 */
public class ErroresSintacticos {
    
    private int token;
    private int pos;

    public ErroresSintacticos(int token, int pos) {
        this.token = token;
        this.pos = pos;
    }

        public int getToken() {
        return token;
    }

    public void setToken(int token) {
        this.token = token;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
     
}
