package Java01;

public class criarcontas {
    public static void main (String[] args){
        contas primeiraconta = new contas();
         primeiraconta.saldo = 200;
          System.out.println("O Saldo Da Primeira Conta È: " + primeiraconta.saldo + " Reais.");


          primeiraconta.saldo += 100;
          System.out.println(primeiraconta.saldo);

          contas segundaconta = new contas();
          segundaconta.saldo = 50;

          System.out.println("Primeira conta = " + primeiraconta.saldo);
          System.out.println("Segunda conta = " + segundaconta.saldo);

    }
}
