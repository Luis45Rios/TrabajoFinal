package views;

import java.util.Scanner;

import util.Pomodoro;

public class App {
    public static void main(String[] args) throws Exception {
        @SuppressWarnings("resource") // Suprime las advertencias

        Scanner scanner = new Scanner(System.in);

        System.out.println("BIENVENIDO AL POMODORO");

        System.out.println("Elige el nombre para tu tarea:");
        String nombreTarea = scanner.nextLine();

        System.out.println("¿Qué nivel te vas a dedicar?");
        System.out.println("(1) Enfocado = 25 min");
        System.out.println("(2) Muy Enfocado = 50 min");
        int enfoque = scanner.nextInt();

        Pomodoro pomodoro = new Pomodoro(nombreTarea, enfoque);
        pomodoro.comenzarPomodoro(scanner);
    }
}
