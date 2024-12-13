package util;

public class Tiempo {

    public static void esperar(int minutos) {
        try {

            for (int i = minutos; i > 0; i--) {
                System.out.println("Esperando " + i + " minutos...");
                Thread.sleep(1000L);
            }

        } catch (InterruptedException error) {
            System.out.println("Se interrumpió la cuenta regresiva");
        }
    }
}
