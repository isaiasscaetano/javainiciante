package cursojava;

public class ifs {
    public static void main (String[] args){
        System.out.println("Testando condicionais.");
        int idade = 20;
        int quantidadepessoa = 1;

        if (idade >= 18 ){
            System.out.println("ok, voce tem mais de 18 anos.");
            System.out.println("voce pode comprar uma bebida.");

        }else{
            if(quantidadepessoa >=2){
                System.out.println("ok,voce e menor de idade mais pode "
                        + " comprar pois vc esta acompanhado ");

            }else {
                System.out.println("voce tem menos de 18 anos ");
                System.out.println("e voce nao esta acompanhado");
            }
        }
    }

}
