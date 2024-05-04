package bankJava01;

public class referencia {
    public static void main (String[] args){
        contas primeiraconta = new contas();
        primeiraconta.deposita(300);

        System.out.println("O salto da primeira conta é: " +  primeiraconta.getSaldo());

        contas segundaconta = new contas();
        System.out.println("O saldo da segunda conta é: " + segundaconta.getSaldo());

        segundaconta.deposita(100);
        System.out.println("O saldo agora da segunda conta é: " + segundaconta.getSaldo());

        System.out.println(" O saldo agora da primeira  conta é " + primeiraconta.getSaldo());

        if (primeiraconta == segundaconta){
            System.out.println("sao a mesma conta");
        }else {
            System.out.println("nao sao a mesma conta ");
        }
        System.out.println(primeiraconta);
        System.out.println(segundaconta);
    }
}
