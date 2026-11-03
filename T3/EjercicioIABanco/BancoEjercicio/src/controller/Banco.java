package controller;

import model.CuentaCorriente;

public class Banco {
    private String nombre;
    private CuentaCorriente cuenta;

    public Banco(){}

    public Banco(String nombre, CuentaCorriente cuenta){
        this.nombre=nombre;
        this.cuenta=cuenta;
    }
    //METODOS

    public void ingresarDinero(double cantidad){
        cuenta.ingresarDinero(cantidad);
    }

    public void retirarDinero(double cantidad){
        cuenta.retirarDinero(cantidad);
    }

    public void transferirDinero(CuentaCorriente origen, CuentaCorriente destino, double cantidad) {
        if (origen.retirarDinero(cantidad) == true){
            destino.ingresarDinero(cantidad);
            System.out.println("Se ha realizado la transferencia con éxito");
        } else {
            System.out.println("No es posible realizar la transferencia");
        }
    }

    // GETTERS SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public CuentaCorriente getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaCorriente cuenta) {
        this.cuenta = cuenta;
    }
}
