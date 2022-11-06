/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AbstractRubrica;

/**
 *
 * @author Jailer
 */
public abstract class Rubrica {
    char estado;
    String NombreA;
    int codigo;
    double valor;

    public Rubrica(char estado, String NombreA, int codigo, double valor) {
        this.estado = estado;
        this.NombreA = NombreA;
        this.codigo = codigo;
        this.valor = valor;
    }

    
    public abstract void definir();
}
