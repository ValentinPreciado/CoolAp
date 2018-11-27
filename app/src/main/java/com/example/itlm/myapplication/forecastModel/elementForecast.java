package com.example.itlm.myapplication.forecastModel;

public class elementForecast {

    public elementForecast(String dia, String icono, String tempMxMIN, String pronostico, String probabDelluvia) {
        Dia = dia;
        Icono = icono;
        this.tempMxMIN = tempMxMIN;
        this.pronostico = pronostico;
        this.probabDelluvia = probabDelluvia;
    }

    public String getDia() {
        return Dia;
    }

    public void setDia(String dia) {
        Dia = dia;
    }

    public String getIcono() {
        return Icono;
    }

    public void setIcono(String icono) {
        Icono = icono;
    }

    public String getTempMxMIN() {
        return tempMxMIN;
    }

    public void setTempMxMIN(String tempMxMIN) {
        this.tempMxMIN = tempMxMIN;
    }

    public String getPronostico() {
        return pronostico;
    }

    public void setPronostico(String pronostico) {
        this.pronostico = pronostico;
    }

    public String getProbabDelluvia() {
        return probabDelluvia;
    }

    public void setProbabDelluvia(String probabDelluvia) {
        this.probabDelluvia = probabDelluvia;
    }

    public elementForecast() {
    }



    String Dia;
        String Icono;
   String tempMxMIN;
   String pronostico;
   String probabDelluvia;
}
