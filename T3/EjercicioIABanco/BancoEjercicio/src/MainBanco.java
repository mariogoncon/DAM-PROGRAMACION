import controller.Banco;
import model.CuentaCorriente;

public class MainBanco {
    static void main(String[] args){

        CuentaCorriente cuentaMario = new CuentaCorriente("Mario", 1998, 1000);
        CuentaCorriente cuentaDayana = new CuentaCorriente("Dayana", 2004, 500);

        Banco caixabank = new Banco("CaixaBank", cuentaMario);

        System.out.println("");
        System.out.println("DATOS DEL BANCO "+caixabank.getNombre());
        System.out.println("TITULAR ASOCIADO A LA CUENTA "+caixabank.getCuenta().getTitular());
        System.out.println("SALDO DISPONIBLE: "+caixabank.getCuenta().getSaldo());
        System.out.println("");
        caixabank.ingresarDinero(500);
        System.out.println("NUEVO SALDO DISPONIBLE: "+caixabank.getCuenta().getSaldo());
        System.out.println("");
        System.out.println("SE VA A PROCEDER A UNA RETIRADA DE DINERO");
        caixabank.retirarDinero(900);
        System.out.println("");
        System.out.println("");
        System.out.println("");

        cuentaMario.consultarSaldo();
        cuentaDayana.consultarSaldo();

        System.out.println("SE VA A REALIZAR UNA TRANSFERENCIA");
        caixabank.transferirDinero(cuentaMario, cuentaDayana, 100);


    }
}
