package Java01;

public class referencia {
    public static void main (String[] args){
        contas primeiraconta = new contas();
        primeiraconta.saldo = 300;

        System.out.println("O salto da primeira conta é: " +  primeiraconta.saldo);

        contas segundaconta = new contas();
        System.out.println("O saldo da segunda conta é: " + segundaconta.saldo);

        segundaconta.saldo += 100;
        System.out.println("O saldo agora da segunda conta é: " + segundaconta.saldo);

        System.out.println(" O saldo agora da primeira  conta é " + primeiraconta.saldo);

        if (primeiraconta == segundaconta){
            System.out.println("sao a mesma conta");
        }else {
            System.out.println("nao sao a mesma conta ");
        }
        System.out.println(primeiraconta);
        System.out.println(segundaconta);
    }
}
