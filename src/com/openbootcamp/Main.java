package com.openbootcamp;

public class Main {
    public static void main(String[] args) {
        Cliente nuevoCliente = new Cliente();

        nuevoCliente.setNombre("Andre");
        nuevoCliente.setEdad(33);
        nuevoCliente.setTelefono("51999994444");
        nuevoCliente.setCredito(5260);

        System.out.println("DATOS DEL CLIENTE:");
        System.out.println("Nombre: " + nuevoCliente.getNombre());
        System.out.println("Edad: " + nuevoCliente.getEdad());
        System.out.println("Teléfono: " + nuevoCliente.getTelefono());
        System.out.println("Crédito: " + nuevoCliente.getCredito());

        Trabajador nuevoTrabajador = new Trabajador();

        nuevoTrabajador.setNombre("Junior");
        nuevoTrabajador.setEdad(25);
        nuevoTrabajador.setTelefono("51999992222");
        nuevoTrabajador.setSalario(3800);

        System.out.println("\nDATOS DEL TRABAJADOR:");
        System.out.println("Nombre: " + nuevoTrabajador.getNombre());
        System.out.println("Edad: " + nuevoTrabajador.getEdad());
        System.out.println("Teléfono: " + nuevoTrabajador.getTelefono());
        System.out.println("Salario: " + nuevoTrabajador.getSalario());
    }
}

class Persona {
    protected int edad;
    protected String nombre;
    protected String telefono;

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }
}

class Cliente extends Persona {
    private double credito;

    public void setCredito(double credito) {
        this.credito = credito;
    }

    public double getCredito() {
        return credito;
    }
}

class Trabajador extends Persona {
    private double salario;

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }
}