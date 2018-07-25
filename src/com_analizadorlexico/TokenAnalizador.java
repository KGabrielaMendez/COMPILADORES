/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com_analizadorlexico;

/**
 *
 * @author Gaby
 */
public class TokenAnalizador {
    private String token, lexema;
    private Integer lineactual, linenext;

    public TokenAnalizador(String token, String lexema, Integer lineactual, Integer linenext) {
        this.token = token;
        this.lexema = lexema;
        this.lineactual = lineactual;
        this.linenext = linenext;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    public Integer getLineactual() {
        return lineactual;
    }

    public void setLineactual(Integer lineactual) {
        this.lineactual = lineactual;
    }

    public Integer getLinenext() {
        return linenext;
    }

    public void setLinenext(Integer linenext) {
        this.linenext = linenext;
    }
    
    
}
