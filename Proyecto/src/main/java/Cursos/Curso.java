/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cursos;

/**
 *
 * @author Jailer
 */
public class Curso {
    int CEstudiantes;
    int CodigoCurso;
    String Docente;
    String NombreCurso;
    int Creditos;

    public Curso(int CEstudiantes, int CodigoCurso, String Docente, String NombreCurso, int Creditos) {
        this.CEstudiantes = CEstudiantes;
        this.CodigoCurso = CodigoCurso;
        this.Docente = Docente;
        this.NombreCurso = NombreCurso;
        this.Creditos = Creditos;
    }

    public int getCEstudiantes() {
        return CEstudiantes;
    }

    public void setCEstudiantes(int CEstudiantes) {
        this.CEstudiantes = CEstudiantes;
    }

    public int getCodigoCurso() {
        return CodigoCurso;
    }

    public void setCodigoCurso(int CodigoCurso) {
        this.CodigoCurso = CodigoCurso;
    }

    public String getDocente() {
        return Docente;
    }

    public void setDocente(String Docente) {
        this.Docente = Docente;
    }

    public String getNombreCurso() {
        return NombreCurso;
    }

    public void setNombreCurso(String NombreCurso) {
        this.NombreCurso = NombreCurso;
    }

    public int getCreditos() {
        return Creditos;
    }

    public void setCreditos(int Creditos) {
        this.Creditos = Creditos;
    }
    
}
