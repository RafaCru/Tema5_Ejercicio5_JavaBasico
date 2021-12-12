package Tema5_Ejercicio5;

import java.util.ArrayList;
import java.util.List;

public class Coche{
    //Atributos
    String marca;
    String modelo;
    String tipo;
    String combustible;
    int potencia;
    int parmotor;
    int velocidad_max;
    int peso;
    //Constructores

    public Coche() {
    }

    public Coche(String marca, String modelo, String tipo, String combustible,
                 int potencia, int parmotor, int velocidad_max, int peso) {
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.combustible = combustible;
        this.potencia = potencia;
        this.parmotor = parmotor;
        this.velocidad_max = velocidad_max;
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", combustible='" + combustible + '\'' +
                ", potencia=" + potencia +
                ", parmotor=" + parmotor +
                ", velocidad_max=" + velocidad_max +
                ", peso=" + peso +
                '}';
    }
}
