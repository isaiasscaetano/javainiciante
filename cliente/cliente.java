package cliente;

public class cliente {


    public String cpf;
    public String profissao;
    public String nome;

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String Cpf) {
        cpf = Cpf;
    }
    public String getnome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public String getprofissao() {
        return profissao;
    }

    public void setprofissao(String profissao) {
        this.profissao = profissao;
    }
}
