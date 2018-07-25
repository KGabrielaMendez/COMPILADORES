package com_analizadorlexico;

import Tokens.Lexema;
import Tokens.Token;
import java.util.ArrayList;
import java.util.Arrays;

public class LexicoAnalizador {

    private Lexema lexemas = new Lexema();
    private Token tokens = new Token();

    private ArrayList<String> cadenaArchivo;
    private Integer contLines;

    public LexicoAnalizador(String cadena) {
        
        try {
            cadenaArchivo = new ArrayList<String>(Arrays.asList(cadena.split("\n"))); //Separa en lineas por cada enter
        } catch (Exception ex) {

        }
        contLines = 0; //las lineas totales
    }

    /*
    Metodo para controlar los espacions en exceso 
    */
    public String quitaEspacios(String texto) {
        java.util.StringTokenizer tokens = new java.util.StringTokenizer(texto);
        StringBuilder buff = new StringBuilder();
        while (tokens.hasMoreTokens()) {
            if (buff.equals("\n")) {

            } else {
                buff.append(" ").append(tokens.nextToken());
            }
        }
        return buff.toString().trim();
    }
    //
    //
    public ArrayList<TokenAnalizador> analizarCodigo() {
        //Crea un arrat de la clase tokenAnalziador
        ArrayList<TokenAnalizador> tokens = new ArrayList();
        int i = 0;
        for (String line : cadenaArchivo) {
            contLines++;
            String[] sublinea = line.split(" ");
            for (int j = 0; j < sublinea.length; j++) {

                if (sublinea[0].charAt(0) == '#') {
                    break;
                }

                TokenAnalizador token = getTokens(sublinea[j], i);
                tokens.add(token);
                i = token.getLineactual();
            }
            i++;
        }
        return tokens;
    }

    public TokenAnalizador getToken(String[] lexemas, String categoria, String linea, Integer i) {

        for (int k = 0; k < lexemas.length; k++) {
            if (linea.equals(lexemas[k])) {
                return new TokenAnalizador(categoria, lexemas[k], i, contLines);
            }

        }

        return null;
    }

    public TokenAnalizador getTokens(String lexema, Integer i) {
        TokenAnalizador token;
        token = getToken(lexemas.getWORDSRESERVADAS(), tokens.getWORDSRESERVADAS(), lexema, i);
        if (token != null) {
            return token;
        }
        token = getToken(lexemas.getCICLOWHILE(), tokens.getCICLOWHILE(), lexema, i);
        if (token != null) {
            return token;
        }
        token = getToken(lexemas.getCICLOIF(), tokens.getCICLOIF(), lexema, i);
        if (token != null) {
            return token;
        }
        token = getToken(lexemas.getCICLOELSEIF(), tokens.getCICLOELSEIF(), lexema, i);
        if (token != null) {
            return token;
        }
        token = getToken(lexemas.getCICLOFOR(), tokens.getCICLOFOR(), lexema, i);
        if (token != null) {
            return token;
        }
        token = getToken(lexemas.getCONDICIONAND(), tokens.getCONDICIONAND(), lexema, i);
        if (token != null) {
            return token;
        }
        token = getToken(lexemas.getCONDICIONOR(), tokens.getCONDICIONOR(), lexema, i);
        if (token != null) {
            return token;
        }
        token = getToken(lexemas.getOPERADORCONDICION(), tokens.getOPERADORCONDICION(), lexema, i);
        if (token != null) {
            return token;
        }
        token = getToken(lexemas.getOPERADOR(), tokens.getOPERADOR(), lexema, i);
        if (token != null) {
            return token;
        }
        token = getToken(lexemas.getASIGNACION(), tokens.getASIGNACION(), lexema, i);
        if (token != null) {
            return token;
        }
        token = getToken(lexemas.getFORPARAMETERS(), tokens.getFORPARAMETERS(), lexema, i);
        if (token != null) {
            return token;
        }
        token = getToken(lexemas.getSEPARADOR(), tokens.getSEPARADOR(), lexema, i);
        if (token != null) {
            return token;
        }
        token = getToken(lexemas.getAYUDA(), tokens.getAYUDA(), lexema, i);
        if (token != null) {
            return token;
        }
        token = getToken(lexemas.getDECREMENTOS(), tokens.getDECREMENTO(), lexema, i);
        if (token != null) {
            return token;
        }
        token = getToken(lexemas.getINCREMENTOS(), tokens.getINCREMENTO(), lexema, i);
        if (token != null) {
            return token;
        }
        token = getToken(lexemas.getFUNCIONES(), tokens.getFUNCION(), lexema, i);
        if (token != null) {
            return token;
        }
        token = getToken(lexemas.getLIBRERIA(), tokens.getLIBRERIA(), lexema, i);
        if (token != null) {
            return token;
        }

        Expresion id, r, e;
        id = new Expresion();
        token = id.getIdentificador(lexema, i, contLines);
        if (token != null) {
            return token;
        }
        e = new numeroEntero();
        token = e.getNumero(lexema, i, contLines);
        if (token != null) {
            return token;
        }
        r = new numeroReal();
        token = r.getNumero(lexema, i, contLines);
        if (token != null) {
            return token;
        }

        token = getNoReconocido(lexema, i);
        return token;
    }

    public TokenAnalizador getNoReconocido(String linea, Integer i) {

        return new TokenAnalizador(tokens.getSIMBOLOSNORECONOCIDOS(), linea, i, contLines);
    }
    
    
    

}
