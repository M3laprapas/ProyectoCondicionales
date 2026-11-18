import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int gun = 0;
        System.out.println("Despiertas en un sótano");
        System.out.println("1.Salir 2.Volver a dormir");
        int d1 = sc.nextInt();
        if ( d1 == 1) {
            System.out.println("Sales y te encuentras a Adriel con una pistola");
            System.out.println("1.Quitarle la pistola 2.Salir corriendo");
            int d2 = sc.nextInt();

            if (d2 == 2) {
                System.out.println("De algun modo has logrado escapar, pero ahora no sabes donde estás");
                System.out.println("1.Seguir con tu camino 2.Volver y pedirle indicaciones a Adriel");
                int d3 = sc.nextInt();

                if (d3 == 1){
                    System.out.println("Te caes y mueres. Vuelve a empezar");
                }
                else if (d3 == 2) {
                    System.out.println("Vuleves y le pides indicaciones,sorprendentemente no era malo y te da indicaciones para ir a Digitech");
                    System.out.println("1.Ir a Digitech 2.Seguir por tu cuenta");
                    int d5 = sc.nextInt();

                    if (d5 == 1) {
                        System.out.println("Acabas en el mejor centro educativo de todo el mundo");
                        System.out.println("¡Has ganado!");
                    }
                    else if (d5 == 2) {
                        System.out.println("Te encuentras una pistola en el suelo");
                        System.out.println("1.La recoges 2.La ignoras");
                        int d6 = sc.nextInt();

                        if (d6 == 1 ){
                            gun = 1;
                            System.out.println("Recoges la pistola y sigues con tu camino");
                        }
                        else {
                            System.out.println("Sigues con tu camino");
                        }
                        System.out.println("Ves a un criminal amenazando a un niño indefenso");
                        System.out.println("1.Lo defiendes 2.Lo ignoras");
                        int d7 = sc.nextInt();

                        if (d7 == 1){
                            if (gun == 1){
                                System.out.println("Le disparas al loco, pero era un rodaje de una película francesa");
                                System.out.println("Te empiezan a gritar todos en frances y no entiendes nada");
                                System.out.println("1. Te calmas y te entregas 2.Te vuelves loco y empiezas a disparar a todos");
                                int d8 = sc.nextInt();

                                if (d8 == 1){
                                    System.out.println("Se vuelven todos locos y te pegan con Baguettes y mueres. Vuelve a empezar");
                                }
                                else if (d8 == 2) {
                                    System.out.println("¿Cual es tu problema bro? Ahora por sádico ya no juegas, estas castigado");
                                    System.out.println("Vuelve a empezar");
                                }
                                else{
                                    System.out.println("Vueve a empezar");
                                }
                            }
                            else {
                                System.out.println("Intentas pegar al loco pero era un rodaje de una pelicula francesa");
                                System.out.println("Se vuelven todos locos y te pegan con Baguettes y mueres. Vuelve a empezar");
                            }
                        }
                        else{
                            System.out.println("Te mueres de la culpa. Vuelve a empezar");
                        }
                    }
                }
                else {
                    System.out.println("Vuelve a empezar");
                }
            }
            else if (d2==1) {
                System.out.println("¡La has liado parda, ahora te quiere disparar!");
                System.out.println("1.Le intentas pegar 2.Esquivar todas las balas");
                int d4 = sc.nextInt();

                if (d4 == 1){
                    System.out.println("Consigues molerlo a golpes y te quedas con su pistola");
                    System.out.println("1.Hacer el bien 2.Hacer el mal");
                    int d9 = sc.nextInt();

                    if (d9 == 1){
                        System.out.println("Te conviertes en un vigilante. Has ganado");
                    }
                    else if (d9 == 2){
                        System.out.println("Te conviertes en un tio malo. Puede ser una victoria para algunos");
                    }
                    else {
                        System.out.println("Vuelve a empezar");
                    }
                }
                else if (d4 == 2) {
                    System.out.println("Te ha vaciado todo el cartucho y te ha dejado como un colador. Vuelve a empezar");
                }
                else{
                    System.out.println("Vuelve a empezar");
                }
            }
        }
        else {
            System.out.println("Vuelve a empezar");
        }
    }
}
