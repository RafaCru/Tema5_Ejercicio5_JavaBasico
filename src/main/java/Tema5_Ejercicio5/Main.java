package Tema5_Ejercicio5;


import java.util.Objects;
import java.util.Scanner;

public class Main {

    static CocheCRUD cocheCRUD= new CocheCRUDImpl();


    public static void main (String[] args){
        Object continuar="s";
        while ((Objects.equals(continuar, "s")) || (Objects.equals(continuar, "S"))) {
            int opcion = 0;
            System.out.println("Seleccione un opción: "
                    +"\n 1      Introducir un coche nuevo"
                    +"\n 2      Listar Coches"
                    +"\n 3      Elimina Coche"
                    +"\n 4      Actualiza Coche"
                    +"\n 5      Salir");

            Scanner sc = new Scanner(System.in);
                opcion= sc.nextInt();
            switch (opcion) {
                case 1:
                    String nuevo = "S";
                    while ((Objects.equals(nuevo, "s")) || (Objects.equals(nuevo, "S"))) {
                        Coche coche = new Coche();
//                Scanner sc = new Scanner(System.in);
                        System.out.println("Introduce Coche (marca, modelo, tipo, Combustible,Potencia, Par Motor, Velocidad Max, Peso)");
                        coche.marca = sc.next();
                        sc.reset();
                        coche.modelo = sc.next();
                        sc.reset();

                        coche.tipo = sc.next();
                        sc.reset();

                        coche.combustible = sc.next();
                        sc.reset();

                        coche.potencia = sc.nextInt();
                        sc.reset();

                        coche.parmotor = sc.nextInt();
                        sc.reset();

                        coche.velocidad_max = sc.nextInt();
                        sc.reset();

                        coche.peso = sc.nextInt();
                        sc.reset();
                        cocheCRUD.save(coche);
                        System.out.println("desea introducir un coche nuevo");
                        nuevo = sc.next();
                        sc.reset();
                        System.out.println(nuevo);
                    }
                    break;
                case 2:
                    //Lista Todos los Coches
                    cocheCRUD.findAll();
                    System.out.println(cocheCRUD);
                    break;
                case 3:
                    System.out.println("Introduce el modelo del vehiculo a eliminar");
                   //Elimina Todos los Coches
                    Coche coche = new Coche();
                    coche.modelo = sc.next();
                    cocheCRUD.delete(coche);
                    cocheCRUD.findAll();
                break;
                case 4:
                    System.out.println("Indica el parametro a modificar:\n (1 Marca, 2 Modelo, 3 tipo, 4 Combustible, 5 Potencia, 6 Par Motor, 7 Velocidad Max, 8 Peso )");
                    int parametro=0;
                    parametro= sc.nextInt();
                    coche = new Coche();
                    switch (parametro) {
                        case 1:
                            sc.reset();
                            System.out.println("Introduce marca");
                            coche.marca=sc.next();
                            break;
                        case 2:
                            sc.reset();
                            System.out.println("Introduce modelo");
                            coche.modelo=sc.next();
                            break;
                        case 3:
                            sc.reset();
                            System.out.println("Introduce tipo");
                            coche.tipo=sc.next();
                            break;
                        case 4:
                            sc.reset();
                            System.out.println("Introduce combustible");
                            coche.combustible=sc.next();
                            break;
                        case 5:
                            sc.reset();
                            System.out.println("Introduce potencia");
                            coche.potencia=sc.nextInt();
                            break;
                        case 6:
                            sc.reset();
                            System.out.println("Introduce  Par Motor");
                            coche.parmotor=sc.nextInt();
                            break;
                        case 7:
                            sc.reset();
                            System.out.println("Introduce Velocidad Max");
                            coche.velocidad_max=sc.nextInt();
                            break;
                        case 8:
                            sc.reset();
                            System.out.println("Introduce peso");
                            coche.peso=sc.nextInt();
                            break;
                    }
                    //Actualiza Coche modificado
                    System.out.println(cocheCRUD);
                    cocheCRUD.Update(coche);
                    break;

                case 5:
                    continuar="N";
                    break;
            }

        }



//

    }
}


