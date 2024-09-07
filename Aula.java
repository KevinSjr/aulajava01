/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Aula {

    public static void main(String[] args) {
         //leitura//
        Scanner leia = new Scanner(System.in);
        
        //entrada de dados//
         int  valor;
         float pdesconto; 
         int vdesconto;
         float pjuros;
         int vjuros;
       //entrada de dados manual//
        
        System.out.println("****wiinks!!***");
        System.out.println("digite ovalor da compra:");//nome da loja//
        valor = leia.nextInt();//fazer a leitura do valor//
        System.out.println("digite a porcentagem de desconto:");
        pdesconto = leia.nextFloat();//fazer a leitura de desconto//
        System.out.println("Digite a porcentagem de juros:");
        pjuros = leia.nextFloat();//fazer a leitura de juros//
        //processamento//
        vdesconto = (int) (valor * pdesconto); // calculo de desconto//
        vjuros = (int) (valor * pjuros); //calculo de juros//
        
        //saida//
        System.out.println("compra com 10% de desconto" +vdesconto);
        System.out.println("compra com 10% de juros" +vjuros);
        
        System.out.println("Hello World!");
    }
}
