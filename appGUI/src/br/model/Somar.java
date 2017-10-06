/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.model;

/**
 *
 * @author utfpr
 */
public class Somar {
    
    public int somar(String a, String b){
        int x=Integer.parseInt(a);
        int y=Integer.parseInt(b);
        return x+y;
    }
    
    public int multiplicar(String a, String b){
        int x=Integer.parseInt(a);
        int y=Integer.parseInt(b);
        return x*y;
    }
}
