package pds_actividad_02_01_grupo05_escenario02_adapter;

public class AdaptadorCelsius implements MedidorTemperatura {
    private DispositivoCelsius dispositivoCelsius;

    public AdaptadorCelsius(DispositivoCelsius dispositivoCelsius) {
        this.dispositivoCelsius = dispositivoCelsius;
    }

    @Override
    public double obtenerTemperatura(double temperatura) {
        // Realiza la adaptación de Celsius a la interfaz común
        dispositivoCelsius.setTemperatura(temperatura);
        double temperaturaCelsius = dispositivoCelsius.medirTemperatura();
        return temperaturaCelsius;
    }
}