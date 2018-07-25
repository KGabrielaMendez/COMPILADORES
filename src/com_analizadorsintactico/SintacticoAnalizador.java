/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com_analizadorsintactico;

import com_analizadorlexico.TokenAnalizador;
import java.util.ArrayList;
import Tokens.Token;
/**
 *
 * @author DELL
 */
public class SintacticoAnalizador {
    
    private String[][] Matriz;
    private ArrayList<TokenAnalizador> tokensAnalizador;
    ArrayList es = new ArrayList();
    
    /*
    Recibir la tabla de transiciones y la lista de los tokens
    */

    public SintacticoAnalizador(String[][] Matriz, ArrayList<TokenAnalizador> tokensAnalizador) {
        this.Matriz = Matriz;
        this.tokensAnalizador = tokensAnalizador;
    }
   
    public boolean analizadorSintactico(){
        ArrayList es = new ArrayList();
        
        int siguiente = 0;
        int anterior = 0;
        int error = -1;
        for (int i = 0; i < tokensAnalizador.size(); i++) {
            String lexema = tokensAnalizador.get(i).getLexema();
            String ex = tokensAnalizador.get(i).getToken();
            String[] tokens = tokens(lexema, ex);
            for (int j = 0; j <tokens.length; j++) {
                String t = tokens[j];
                for (int k = 0; k < Matriz.length; k++) {
                    error = -1;
                    String m = Matriz[k][siguiente];
                    
                    if(t.equals(m)){
                        anterior = siguiente;
                        siguiente = Integer.parseInt(m);
                        error = 0; // error es igual a cero cuando si hay coincidencia 
                        break;
                    }
                }
                
                if(error == 0){
                break;}
               
            }
            
            if(error == -1){ // no hay coincidencia y comprueba si hay retorno
            String retro = Matriz[25][siguiente];
            if(!retro.equals("x")){
                siguiente = Integer.parseInt(retro);
                i--;
                error = 0;
            }
            }
            if (error == -1) {
                int col=0;
                for (int j = 0; j < Matriz.length; j++) {
                    if (!Matriz[j][siguiente].equals("x")) {
                        col=Integer.parseInt(Matriz[j][siguiente]);
                    }
                }
                this.es.add(new ErroresSintacticos(col, tokensAnalizador.get(i).getLinenext()-1)); //Si existe error
                return false;
            }
        }
        if (Matriz[25][anterior].equals("67")) {
            return true;
        }else{
            //Si hay un error y existe el end
                this.es.add(new ErroresSintacticos(anterior, tokensAnalizador.get(anterior).getLinenext()));
                return false;
        }
        //Si termina en el estado 82 marca el final
    }
    
    public String[] tokens(String lexema, String ex) {
        switch (lexema) {
            case "function":
                return new String[]{"1"};
            case "identificador":
                return new String[]{"2","4","7","26","15","17","20","22","28","31","33","35","38","40","42","45","47"
                ,"49","53","55","57","59"};
                case "letras":
                return new String[]{"12","30","37","50","52"};
            case "(":
                return new String[]{"3", "10", "14", "62"};
                
            case ")":
                return new String[]{"6", "12","23","66"};
            case "=":
                return new String[]{"8","32","39","46","54"};
            case ",":
                return new String[]{"3","19"};
            
            case "numeros":
                return new String[]{"12","30","33","35","37","40","42","50","47","52","55","57","63","65"};
            case "println":
            case "print":
                return new String[]{"13"};
            case "\"":
                return new String[]{"16","18"};
            case "operador":
                return new String[]{"21", "27", "34", "41", "48", "54"};
            case "if":
                case "elseif":
                return new String[]{"29"};
            case "operador_condicion":
                return new String[]{"36", "51"};
            case "&&":
            case "||":
                return new String[]{"29"};
            case "else":
                return new String[]{"43"};
            case "while":
                return new String[]{"44"};
            case "for":
                return new String[]{"58"};
            case "in":
                return new String[]{"60"};
            case "range":
                return new String[]{"61"};
            case ":":
                return new String[]{"64"};
            case "end":
                return new String[]{"6","67"};
            default:

                break;

        }

        Token tk = new Token();
        if (ex.equals(tk.getIDENTIFICADOR())) {
            return new String[]{"2","4","7","26","15","17","20","22","28","31","33","35","38","40","42","45","47"
                ,"49","53","55","57","59",}; //80 como texto
        }
        if (ex.equals(tk.getDIGITO())) {
            return new String[]{"12","30","33","35","37","40","42","50","47","52","55","57","63","65"};
        }
        if (ex.equals(tk.getNUMEROE()) || ex.equals(tk.getNUMEROR())) {
            return new String[]{"12","30","33","35","37","40","42","50","47","52","55","57","63","65"};
        }

        return null;
    }

    public ArrayList getEs() {
        return es;
    }
}
