/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estudiante;

import IPersona.IPersona;

/**
 *
 * @author Jailer
 */
public class Estudiante implements IPersona {
    int creditos;
    double Promedio;

    public Estudiante(int creditos, double Promedio) {
        super();
        this.creditos = creditos;
        this.Promedio = Promedio;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public double getPromedio() {
        return Promedio;
    }

    public void setPromedio(double Promedio) {
        this.Promedio = Promedio;
    }
    
}
