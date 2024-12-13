package util;

import java.util.Scanner;

public class Pomodoro {
    private String tarea;
    private final int TIEMPO_POMODORO;
    private final int TIEMPO_DESCANSO_CORTO;
    private final int TIEMPO_DESCANSO_LARGO;
    private int CICLOS_COMPLETOS;
    private int enfoque;

    public Pomodoro(String tarea, int enfoque) {
        // INICIALIZADOR DE LA CLASE
        this.tarea = tarea;
        this.enfoque = enfoque;
        switch (enfoque) {
            case 1:
                this.TIEMPO_POMODORO = 25;
                this.TIEMPO_DESCANSO_CORTO = 5;
                this.TIEMPO_DESCANSO_LARGO = 15;
                break;
            case 2:
                this.TIEMPO_POMODORO = 50;
                this.TIEMPO_DESCANSO_CORTO = 10;
                this.TIEMPO_DESCANSO_LARGO = 30;
                break;
            default:
                System.out.println("Sólo opciones 1 y 2. Se le asignará un enfoque por defecto");
                this.TIEMPO_POMODORO = 25;
                this.TIEMPO_DESCANSO_CORTO = 5;
                this.TIEMPO_DESCANSO_LARGO = 15;
                break;
        }
    }

    public void comenzarPomodoro(Scanner scanner) {
        while (true) {
            System.out.println("Tarea: " + this.tarea);
            System.out.println("Comenzando Pomodoro (" + this.TIEMPO_POMODORO + " min)");
            Tiempo.esperar(TIEMPO_POMODORO);

            this.CICLOS_COMPLETOS++;

            if (this.CICLOS_COMPLETOS % 4 == 0) {
                System.out.println("Descanso largo (" + this.TIEMPO_DESCANSO_LARGO + " min)");
                Tiempo.esperar(TIEMPO_DESCANSO_LARGO);
            } else {
                System.out.println("Descanso corto (" + this.TIEMPO_DESCANSO_CORTO + " min)");
                Tiempo.esperar(TIEMPO_DESCANSO_CORTO);
            }

            System.out.println("¿Desea continuar? si/no");
            scanner.nextLine();
            String continuar = scanner.nextLine();

            if (continuar.equalsIgnoreCase("no")) {
                System.out.println("Pomodoro terminado");

                break;
            }
        }
    }
}