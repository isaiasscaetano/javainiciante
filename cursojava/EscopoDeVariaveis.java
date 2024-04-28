package cursojava;

public class EscopoDeVariaveis {
    public static void main(String[] args) {
        System.out.println("Testando condicionais.");
        int idade = 10;
        int quantidadepessoa = 1;

       // boolean acompanhado = quantidadepessoa >= 2;
        boolean acompanhado;

        if(quantidadepessoa >= 2){
             acompanhado = true;
        }else{
             acompanhado = false;
        }
        System.out.println("valor de acompanhado é " + acompanhado);
        if (idade >= 18 && acompanhado) {
            System.out.println("voce pode comprar uma bebida.");
        } else {
            System.out.println("voce nao pode compar bebidas ");
        }
    }
}

