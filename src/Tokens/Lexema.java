
package Tokens;


public class Lexema {
    private String[] WORDSRESERVADAS = {
    "function","end","parse(UInt8,readline(STDIN))","readline(STDIN)","println","print","in", "range","$","import","Base:","Base",
    };
    private String[] LIBRERIA = {"GenericIOBuffer"};
    private String[] CICLOWHILE = {"while"};
    private String[] CICLOIF = {"if",};
    private String[] CICLOELSEIF = {"elseif"};
    private String[] CICLOFOR = {"for"};
    private String[] CONDICIONAND = {"&&"};
    private String[] CONDICIONOR = {"||"};
    private String[] INCREMENTOS = {"+=","++"};
    private String[] DECREMENTOS = {"-=","--"};
    private String[] FUNCIONES = {
        "precompile","div","typeof","bits","convert","isdefined","identity","super","hash","isequal"};
    private String[] AYUDA = {"?"};
    private String[] FORPARAMETERS = {
    "(",")"};
    private String[] ASIGNACION ={
    "=",};
    private String[] OPERADORCONDICION = {
        "<",">","<=",">=","==","!=",
    };
    private String[] OPERADOR = {
    "+","-","*","/","^",
    };
    private String[] SEPARADOR = {
    ",","{","}","[","]","\"",":",
    };

    public String[] getLIBRERIA() {
        return LIBRERIA;
    }

    public String[] getFUNCIONES() {
        return FUNCIONES;
    }

    public void setFUNCIONES(String[] FUNCIONES) {
        this.FUNCIONES = FUNCIONES;
    }

    
    public void setLIBRERIA(String[] LIBRERIA) {
        this.LIBRERIA = LIBRERIA;
    }

    public String[] getINCREMENTOS() {
        return INCREMENTOS;
    }

    public void setINCREMENTOS(String[] INCREMENTOS) {
        this.INCREMENTOS = INCREMENTOS;
    }

    public String[] getDECREMENTOS() {
        return DECREMENTOS;
    }

    public void setDECREMENTOS(String[] DECREMENTOS) {
        this.DECREMENTOS = DECREMENTOS;
    }

    public String[] getFORPARAMETERS() {
        return FORPARAMETERS;
    }
    
    public void setFORPARAMETERS(String[] FORPARAMETERS) {
        this.FORPARAMETERS = FORPARAMETERS;
    }

    
    public String[] getASIGNACION() {
        return ASIGNACION;
    }

    public void setASIGNACION(String[] ASIGNACION) {
        this.ASIGNACION = ASIGNACION;
    }

    public String[] getAYUDA() {
        return AYUDA;
    }

    public void setAYUDA(String[] AYUDA) {
        this.AYUDA = AYUDA;
    }
    
       
    public String[] getWORDSRESERVADAS() {
        return WORDSRESERVADAS;
    }

    public void setWORDSRESERVADAS(String[] WORDSRESERVADAS) {
        this.WORDSRESERVADAS = WORDSRESERVADAS;
    }

    public String[] getCICLOWHILE() {
        return CICLOWHILE;
    }

    public void setCICLOWHILE(String[] CICLOWHILE) {
        this.CICLOWHILE = CICLOWHILE;
    }

    public String[] getCICLOIF() {
        return CICLOIF;
    }

    public void setCICLOIF(String[] CICLOIF) {
        this.CICLOIF = CICLOIF;
    }

    public String[] getCICLOELSEIF() {
        return CICLOELSEIF;
    }

    public void setCICLOELSEIF(String[] CICLOELSEIF) {
        this.CICLOELSEIF = CICLOELSEIF;
    }

    public String[] getCICLOFOR() {
        return CICLOFOR;
    }

    public void setCICLOFOR(String[] CICLOFOR) {
        this.CICLOFOR = CICLOFOR;
    }

    public String[] getCONDICIONAND() {
        return CONDICIONAND;
    }

    public void setCONDICIONAND(String[] CONDICIONAND) {
        this.CONDICIONAND = CONDICIONAND;
    }

    public String[] getCONDICIONOR() {
        return CONDICIONOR;
    }

    public void setCONDICIONOR(String[] CONDICIONOR) {
        this.CONDICIONOR = CONDICIONOR;
    }

    public String[] getOPERADORCONDICION() {
        return OPERADORCONDICION;
    }

    public void setOPERADORCONDICION(String[] OPERADORCONDICION) {
        this.OPERADORCONDICION = OPERADORCONDICION;
    }

    public String[] getOPERADOR() {
        return OPERADOR;
    }

    public void setOPERADOR(String[] OPERADOR) {
        this.OPERADOR = OPERADOR;
    }

    public String[] getSEPARADOR() {
        return SEPARADOR;
    }

    public void setSEPARADOR(String[] SEPARADOR) {
        this.SEPARADOR = SEPARADOR;
    }
    
}
