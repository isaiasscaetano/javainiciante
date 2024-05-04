package bankJava01;

public class sacanegado {
    public static  void main (String[] args){
        contas contas = new contas();
        contas.deposita(100);
        contas.saca(200);
        System.out.println(contas.getSaldo());
    }
}
