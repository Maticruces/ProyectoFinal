package code;

public class Horarios {
    public Horarios() {
    }

    public String Horario(int opcion){
        String horario;

        switch (opcion) {
            case 1:
                horario = "Salida: 13:00 - Llegada: 15:00";
                break;
            case 2:
                horario = "Salida: 15:00 - Llegada: 17:00";
                break;
            case 3:
                horario = "Salida: 17:00 - Llegada: 19:00";
                break;
            default:
                horario = "Horario no disponible";
                break;
        }
        return horario;
    }
}
