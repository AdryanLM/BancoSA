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
public class conta {

    public int numero;
    public String titular;
    public double saldo;
    
    public conta(){
        System.out.println("Conta Criada");
        numero = 1;
        titular = "pafuncio";
        saldo = 20000;
    }
    public conta( int numero, String titular, double saldo){
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void imprimir() {
        System.out.println("Saldo atual é:" + saldo);
    }

    public void setnumero(int numero) {
        this.numero = numero;
    }

    public int getnumero() {
        return numero;
    }

    public void settitular(String titular) {
        this.titular = titular;

    }

    public String gettitular() {
        return titular;

    }

    public void setsaldo(double saldo) {
        this.saldo = saldo;

    }
    public double getsaldo(){
        return saldo;
    }
}
