package main;

import conversion.TemperaturaLogica;

import javax.swing.*;

import static constantes.TemperaturaStrings.*;

public class Main {

    public static void main(String[] args){

        TemperaturaLogica temperaturaLogica = new TemperaturaLogica();

        double valorTemperatura=Double.parseDouble(JOptionPane.showInputDialog(null,
                MENSAJE_PETICION_GRADOS.getMensaje()));

        temperaturaLogica.setCentigrados(valorTemperatura);

        JOptionPane.showMessageDialog(null,MENSAJE_CONVERSION.getMensaje()+
                temperaturaLogica.getCentigrados()+MENSAJE_FARENHEIT.getMensaje()+
                temperaturaLogica.calcularTemperaturaFarenheit()+MENSAJE_F.getMensaje());


    }

}
