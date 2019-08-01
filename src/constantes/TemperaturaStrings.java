package constantes;

public enum TemperaturaStrings {

    MENSAJE_PETICION_GRADOS("Ingrese temperatura en Centigrados a convertir en Farenheit: "),
    MENSAJE_CONVERSION("La conversion de "),
    MENSAJE_FARENHEIT("C° a Farenheit es: "),
    MENSAJE_F("F°");

    private String mensaje;

    TemperaturaStrings(String s) {
        this.mensaje=s;
    }

    public String getMensaje() {
        return mensaje;
    }
}
