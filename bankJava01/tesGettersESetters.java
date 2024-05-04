package bankJava01;

import cliente.cliente;

public class tesGettersESetters {
    public static void main (String[] args) {
        contas Contas = new contas();


        cliente cliente = new cliente();
        cliente.setCpf("122.865.83345-87");
        Contas.settitular(cliente);

        System.out.println(Contas.gettitular().getCpf());

    }
}

