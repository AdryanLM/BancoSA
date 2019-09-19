/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.classes;

/**
 *
 * @author s.lucas
 */
public class testeconta {

    public static void main(String[] args) {
        conta c = new conta();
        conta c1 = new conta(4,"ana",100);
        c.imprimir();
        c1.imprimir();
        System.out.println("Extrato\nTitular: "+c.gettitular()+"\nC.C:"+c.getnumero()+"Saldo= R$"+c.getsaldo());

    }

}
