package bankJava01;

public class metodo {
    public static void main (String[] args){
        contas contadoisaias = new contas();
        contadoisaias.deposita(100);
        contadoisaias.deposita(55);
        System.out.println(contadoisaias.getSaldo());

        contadoisaias.saca(50);
        System.out.println(contadoisaias.getSaldo());

        contadoisaias.saca(200);
        System.out.println("o salto do isaias antes da tranferencia é: " + contadoisaias.getSaldo());

        contas contadaana = new contas();
        contadaana.deposita(1000);
        System.out.println("o saldo da ana antes da tranferencia é: " + contadaana.getSaldo());

        contadaana.transfere(300, contadoisaias);

        System.out.println("o saldo do isaias depois da transferencia é: " + contadoisaias.getSaldo());
        System.out.println("o saldo da ana é depois da tranferencia é: " + contadaana.getSaldo());

    }
}
