package model;

public class CuentaCorriente {
    //atributo --> cualifica / otorga una caracteristica
    //saldo, numero de cuenta, titular, PIN
    //modificador de acceso (public, protected, private

    private double saldo;
    private int pin;
    private String titular;

    //CONSTRUCTORES
    public CuentaCorriente(){}

    public CuentaCorriente(String titular, double saldo, int pin){
        this.titular=titular;
        this.saldo=saldo;
        this.pin=pin;
    }

    public CuentaCorriente(String titular){
        this.titular=titular;
        this.pin=(int)Math.random()*100;
        this.saldo=500;

    }

    public CuentaCorriente(String titular, double saldo){
        this.titular=titular;
        this.saldo=saldo;
        this.pin=(int)Math.random()*500;
    }

    // METODOS - No tiene, solo refleja, una cuenta corriente como tal no saca dinero.


    //GETER AND SETTERS
    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

