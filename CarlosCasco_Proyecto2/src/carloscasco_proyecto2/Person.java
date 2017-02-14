/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carloscasco_proyecto2;

/**
 *
 * @author k_k_r
 */
public class Person {

    private String nombre;
    private int edad;
    private int salario;
    private String puesto;

    public Person(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public Person(String nombre, int edad, int salario, String puesto) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.puesto = puesto;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    Person() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "NOMBRE: " + nombre + " |EDAD: " + edad + " |SALARIO: " + salario+" |PUESTO: "+puesto;
    }

}
