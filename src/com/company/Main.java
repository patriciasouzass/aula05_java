package com.company;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //exec 01
        String apelido = "Gomez"; //adiçao das aspas, por ser tipo string
        int idade = 35; //retirada das aspas
        boolean check = false; //retirada das aspas e adiçao de uma variável
        double saldo = 45857.90d; //tipo de variável alterado
        String nome = "Julian"; //tipo de variável alterado


        //exec 02
        // String 1nome; incorreto, pois nao deve começar com numeral
        // int idade; correta, mas foi comentada pq a variável já foi declarada acima
        // double $aldo; incorreto,, pois inicia com caracter especial
        // String @pellido; incorreto, pois inicia com caracter especial
        String direcao; //correto
        // boolean carteira de motorista; incorreto, pois tem espaço
        // double altura da pessoa; incorreto, pois tem espaço
        // int quantidade-de-filhos; incorreto, pois tem hifen

        // Resolucao Exercicio 3

        System.out.println("Insira a quantidade de Dias:");
        Scanner vDias = new Scanner(System.in);

        int vDiasDigitado = vDias.nextInt();
        int resultado = 0;

        resultado = vDiasDigitado * 2;
        System.out.println(vDiasDigitado + " dias de campanha = " + " $2 X " + vDiasDigitado + " = $" + resultado);

        //exec 04

        Scanner teclado = new Scanner(System.in) ;
        System.out.println ("insira o valor bruto do premio: ");
        float num = teclado.nextInt();

        double imp01 = num - (0.0245 * num);
        double imp02 = imp01 - (0.15 * imp01);
        double imp03 = imp02 - (0.03 * imp02) ;
        Locale localeBR = new Locale("pt","BR");

        NumberFormat valor = NumberFormat.getCurrencyInstance(localeBR);

        System.out.println("Valor total sobre o imposto 1 de 2,45% : "+valor.format(imp01));
        System.out.println("Valor total sobre o imposto 2 de   15% : "+valor.format(imp02));
        System.out.println("Valor total sobre o imposto 3 de    3% : "+valor.format(imp03));



    }
}
