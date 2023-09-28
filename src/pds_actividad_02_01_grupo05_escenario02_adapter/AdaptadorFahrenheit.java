package pds_actividad_02_01_grupo05_escenario02_adapter;

public class AdaptadorFahrenheit implements MedidorTemperatura {
    private DispositivoFahrenheit dispositivoFahrenheit;

    public AdaptadorFahrenheit(DispositivoFahrenheit dispositivoFahrenheit) {
        this.dispositivoFahrenheit = dispositivoFahrenheit;
    }

    @Override
    public double obtenerTemperatura(double temperatura) {
        // Realiza la adaptación de Fahrenheit a la interfaz común
        dispositivoFahrenheit.setTemperatura(temperatura);
        double temperaturaFahrenheit = dispositivoFahrenheit.medirTemperatura();
        // Convierte la temperatura de Fahrenheit a Celsius
        double temperaturaCelsius = (temperaturaFahrenheit - 32) * 5/9;
        return temperaturaCelsius;
    }
}
