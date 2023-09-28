/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pds_actividad_02_01_grupo05_escenario02_adapter;

/**
 *
 * @author Edison
 */
public class ControladorDispositivo {
    MedidorTemperatura adaptadorCelsius = new AdaptadorCelsius(new DispositivoCelsius());
        MedidorTemperatura adaptadorFahrenheit = new AdaptadorFahrenheit(new DispositivoFahrenheit());

        public double obtenerTemperaturaCelsius() {
            // Obtener y trabajar con las temperaturas
            double temperaturaCelsius = adaptadorCelsius.obtenerTemperatura(39);
            System.out.println("Temperatura en Celsius: " + temperaturaCelsius + " °C");
            return temperaturaCelsius;
        }
        
        public double obtenerTemperaturaFahrenheit() {
            double temperaturaFahrenheit = adaptadorFahrenheit.obtenerTemperatura(125);
            System.out.println("Temperatura en Fahrenheit: " + temperaturaFahrenheit + " °F");
            return temperaturaFahrenheit;
        }
}