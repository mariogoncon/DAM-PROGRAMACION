package controller;

import model.CuentaCorriente;

import java.util.InputMismatchException;

public class Banco {

    //direccion, nombre, numeroEntidad, caja

    // lista de cuentas (usuario, dineor, pin)

    private CuentaCorriente cuenta;
    private String nombre;



    //CONSTRUCTORES

    public Banco(){}

    public Banco(String nombre){
        this.nombre=nombre;
    }



    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }



    // funcionalidades -> ingresarDinero, sacarDinero, consultarSaldo, resetearPin, transferirSaldo, darAltaCuenta

    public void darAltaCuenta(CuentaCorriente cuenta){
        this.cuenta=cuenta;

    }

    public void ingresarDinero(double saldoIngreso, int pin, String titular) throws NullPointerException {

        if (cuenta != null && cuenta.getPin()==pin && cuenta.getTitular().equalsIgnoreCase(titular)){

        } else {
            System.out.println("Datos erróneos, acceso denegado.");
        }

    }

}



