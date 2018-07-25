/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com_analizadorlexico;
/**
 * Clase para identificar letras numeros e identificadores
 * @author Gaby
 */
import Tokens.Token;
import java.util.regex.Pattern;


public class Expresion {
    
    Token tk = new Token();
    public TokenAnalizador getIdentificador(String lexema, Integer i, Integer contarLines){
    
        String regexp = "[A-Za-z]+|([A-Za-z]+([0-9]|_)*)+";
        boolean result = Pattern.matches(regexp, lexema);
        if (result) {
            return new TokenAnalizador(tk.getIDENTIFICADOR(),lexema,i,contarLines);
            
        }
        return null;
    }
    


    public TokenAnalizador getDigito(String lexema, Integer i, Integer contarLineas) {

        
        //expresion regular para identif.
        String regexp = "[0-9]";
        boolean resultado = Pattern.matches(regexp, lexema);
        if (resultado == true) {

            return new TokenAnalizador(tk.getDIGITO(), lexema, i, contarLineas);
        }

        return null;
    }
    
    public TokenAnalizador getNumero(String lexema, Integer i, Integer contarLineas) {

        return null;
    }
}

class identificador extends Expresion{
    
}

class numeroEntero extends Expresion { //Herencia clase getNumero  
    //Polimorfismo misma clase getNumero
    @Override
    public TokenAnalizador getNumero(String lexema, Integer i, Integer contarLineas) {
        String regexp = "[0-9]+";
        boolean resultado = Pattern.matches(regexp, lexema);
        if (resultado) {

            return new TokenAnalizador(tk.getNUMEROE(), lexema, i, contarLineas);
        }

        return null;
    }
    
    
}

class numeroReal extends Expresion{

    

    //Polimorfismo misma clase getNumero
    @Override
    public TokenAnalizador getNumero(String lexema, Integer i, Integer contarLineas) {
        String regexp = "([0-9]+\\.[0-9]+)";
        boolean resultado = Pattern.matches(regexp, lexema);
        if (resultado) {

            return new TokenAnalizador(tk.getNUMEROR(), lexema, i, contarLineas);
        }

        return null;
    }
    
     
}



