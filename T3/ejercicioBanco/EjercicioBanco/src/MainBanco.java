import controller.Banco;
import model.CuentaCorriente;

public class MainBanco {

    static void main(String[] args) {

        Banco bbva = new Banco("bbva");

        CuentaCorriente c1 = new CuentaCorriente("Mario", 1000, 1111);
        CuentaCorriente c2 = new CuentaCorriente("Dayana", 500, 2222);
        CuentaCorriente c3 = new CuentaCorriente("Dayana", 500);
        CuentaCorriente c4 = new CuentaCorriente("Dayana");

        try {
            bbva.darAltaCuenta(new CuentaCorriente("Mario", 1200, 313));
        } catch (NullPointerException e) {
            System.out.println("No hay cuenta del banco");
        }



    }
}