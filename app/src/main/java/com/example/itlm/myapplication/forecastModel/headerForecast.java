package com.example.itlm.myapplication.forecastModel;

public class headerForecast {
    public headerForecast() {
    }

    public headerForecast(String diayfecha, String pronostico, String temperatura, String icono, String probabDeLluvia, String velDeviento, String humedad) {
        this.diayfecha = diayfecha;
        this.pronostico = pronostico;
        this.temperatura = temperatura;
        this.icono = icono;
        this.probabDeLluvia = probabDeLluvia;
        this.velDeviento = velDeviento;
        this.humedad = humedad;
    }

    public String getDiayfecha() {

        return diayfecha;
    }

    public void setDiayfecha(String diayfecha) {
        this.diayfecha = diayfecha;
    }

    public String getPronostico() {
        return pronostico;
    }

    public void setPronostico(String pronostico) {
        this.pronostico = pronostico;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getIcono() {
        return icono;
    }

    public void setIcono(String icono) {
        this.icono = icono;
    }

    public String getProbabDeLluvia() {
        return probabDeLluvia;
    }

    public void setProbabDeLluvia(String probabDeLluvia) {
        this.probabDeLluvia = probabDeLluvia;
    }

    public String getVelDeviento() {
        return velDeviento;
    }

    public void setVelDeviento(String velDeviento) {
        this.velDeviento = velDeviento;
    }

    public String getHumedad() {
        return humedad;
    }

    public void setHumedad(String humedad) {
        this.humedad = humedad;
    }

    String diayfecha;
    String pronostico;
    String temperatura;
    String icono;
    String probabDeLluvia;
    String velDeviento;
    String humedad;
}
