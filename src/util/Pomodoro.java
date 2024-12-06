package util;

public class Pomodoro {
    private String tarea;
    private final int TIEMPO_POMODORO;
    private final int TIEMPO_DESCANSO_CORTO;
    private final int TIEMPO_DESCANSO_LARGO;
    private int CICLOS_COMPLETOS;

    public Pomodoro(String tarea, int enfoque) {
        // INICIALIZADOR DE LA CLASE
        this.tarea = tarea;
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
}