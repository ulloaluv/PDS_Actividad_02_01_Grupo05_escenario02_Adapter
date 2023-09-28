package pds_actividad_02_01_grupo05_escenario02_adapter;

public class DispositivoCelsius {
    
    private double temperatura;

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }    
    
    public double medirTemperatura() {
        // Simulación de medición en Celsius
        return temperatura;
    }
}
