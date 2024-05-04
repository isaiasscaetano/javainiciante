package cliente;
import bankJava01.contas;
public class tesbanco {
    public static void main(String[] args){
        cliente isaias  = new cliente();
        isaias.nome = "isaias";
        isaias.cpf = "234.456.876.43";
        isaias.profissao = "auxiliar de produçao ainda";

        contas contadoisaias = new contas();
        contadoisaias.deposita(100);
    }
}
