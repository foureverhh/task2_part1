package controller;

import model.Facade;
import model.observable.WeatherReport;

public class Controller {
    private WeatherReport weatherReport;
    private Facade facade;

    public Controller() {
        weatherReport = new WeatherReport();
        facade = new Facade();
        addObservers();
    }

    public WeatherReport getWeatherReport() {
        return weatherReport;
    }

    public void setWeatherReport(WeatherReport weatherReport) {
        this.weatherReport = weatherReport;
    }

    public void setWeatherTemperature(int temperature){
        this.weatherReport.setTemperature(temperature);
    }

    public void addObservers(){
        this.getWeatherReport().addObserver(facade.getRetiredJack());
        this.getWeatherReport().addObserver(facade.getStudentJack());
        this.getWeatherReport().addObserver(facade.getWorkerJack());
    }

    public Facade getFacade() {
        return facade;
    }
}
