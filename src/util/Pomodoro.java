package util;

public class Pomodoro {
    private String TAREA = "";
    private int TIEMPO_POMODORO = 0;
    private int TIEMPO_DESCANSO_CORTO = 0;
    private int TIEMPO_DESCANSO_LARGO = 0;
    private int CICLOS_COMPLETOS = 0;

    public Pomodoro(String tarea, int enfoque) {
        // INICIALIZADOR DE LA CLASE
        this.TAREA = tarea;
        switch (enfoque) {
            case 1:
                this.TIEMPO_POMODORO = 25;
                this.TIEMPO_DESCANSO_CORTO = 5;
                this.TIEMPO_DESCANSO_LARGO = 15;
                break;
            default:
                System.out.println("Opción no válida. Se le asignará un enfoque por defecto");
                this.TIEMPO_POMODORO = 25;
                this.TIEMPO_DESCANSO_CORTO = 5;
                this.TIEMPO_POMODORO = 15;
                break;
        }
    }
}