package bankJava01;
import cliente.cliente;

    // saldo , agencia , numero e titular
        public class contas {
        private double saldo;
        private int agencia;
        private int numero;
        private cliente titular;

       public void  deposita (double valor ){

           this.saldo += valor;
       }

       public boolean saca(double valor){
          if(this.saldo >= valor){
              this.saldo -= valor;
              return true;
          }else{
              System.out.println("nao ha saldo suficiente, saque negado");
              return false;
          }
       }
       public boolean transfere(double valor, contas destino){
           if (this.saldo >= valor) {
               this.saldo -= valor;
             destino.deposita(valor);
               System.out.println("o deposido foi  com sucesso");
               return true;
           }else{
               System.out.println("o  deposito foi negado");
               return false;
           }
       }

       public  double getSaldo(){
           return this.saldo;
       }

        public  double getnumero(){
            return this.saldo;
        }

        public void setnumero(int novonumero){
           this.numero = novonumero;
        }

        public int getagencia() {
            return agencia;
        }

        public void setagencia(int agencia) {
            this.agencia = agencia;
        }

        public void settitular(cliente titular) {
            this.titular = titular;
        }

        public  cliente gettitular() {
            return titular;
        }
    }
