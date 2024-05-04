package bankJava01;

public class criarcontas {
    public static void main (String[] args){
        contas primeiraconta = new contas();
         primeiraconta.deposita(200);
          System.out.println("O Saldo Da Primeira Conta È: " + primeiraconta.getSaldo() + " Reais.");


          primeiraconta.deposita(100);
          System.out.println(primeiraconta.getSaldo());

          contas segundaconta = new contas();
          segundaconta.deposita(50);

          System.out.println("Primeira conta = " + primeiraconta.getSaldo());
          System.out.println("Segunda conta = " + segundaconta.getSaldo());

          System.out.println(segundaconta.getnumero());
    }
}
