/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.*;

/**
 *
 * @author dci
 */
public class CalculadoraTest {

    int priNum, segNum;

    CalculadoraTest(int n1, int n2) {
        this.priNum = n1;
        this.segNum = n2;
    }

    CalculadoraTest() {
        this.priNum = 5;
        this.segNum = 12;
    }

    int leer() {
        Scanner leer = new Scanner(System.in);
        int n = leer.nextInt();
        return n;
    }
    
    

    int Suma() {
        return this.priNum + this.segNum;
    }

    int Resta() {
        return this.priNum - this.segNum;
    }

    int Multiplicacion() {
        return this.priNum * this.segNum;
    }

    double Divicion() {
        return this.priNum / this.segNum;
    }

    void Mostrar() {
        String msj;
        msj = "Primer numero: " + this.priNum + "\n";
        msj += "Segundo numero: " + this.segNum + "\n";
        msj += "Suma: " + this.Suma() + "\n";
        msj += "Resta: " + this.Resta() + "\n";
        msj += "Multiplicacion: " + this.Multiplicacion() + "\n";
        msj += "Divicion: " + this.Divicion() + "\n";
        System.out.println(msj);
    }

    void Menu() {
        Scanner leer = new Scanner(System.in);
        int n;
        do {
            System.out.println("1.Mostrar");
            System.out.println("2.Salir");
            n = leer.nextInt();
            switch (n) {
                case 1: {
                    Mostrar();
                }
                break;
                case 2: {
                    System.out.println("Adios.");
                }
                break;
            }
        } while (n != 2);

    }
}
