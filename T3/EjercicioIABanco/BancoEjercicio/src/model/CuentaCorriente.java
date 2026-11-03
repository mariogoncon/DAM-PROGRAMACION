package model;

public class CuentaCorriente{
    private int pin;
    private double saldo;
    private String titular;

    public CuentaCorriente(){}

    public CuentaCorriente(String titular, int pin){
        this.titular=titular;
        this.pin=pin;
    }
    public CuentaCorriente(String titular, int pin, double saldo){
        this.saldo=saldo;
        this.titular=titular;
        this.pin=pin;
    }


    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }



    //MÉTODOS DE LA CLASE CuentaCorriente
        //Ingresar dinero y consultar saldo.

    public void ingresarDinero(double cantidad){
        this.saldo=saldo + cantidad;
        System.out.println("Se ha ingresado un total de "+cantidad+"€");
    }

    public double consultarSaldo(){
        System.out.println("El saldo actual de la cuenta corriente de "+getTitular()+" es de "+getSaldo()+"€");
        return this.saldo;
    }

    public boolean retirarDinero(double cantidad){
        if(saldo>=cantidad){
            this.saldo-=cantidad;
            System.out.println("Se ha efectuado una retirada de "+cantidad+"€");
            System.out.println("El saldo actual de la cuenta es de "+getSaldo()+"€");
            return true;
        } else {
            System.out.println("No hay suficiente saldo para la retirada de dinero");
            return false;
        }
    }
}
