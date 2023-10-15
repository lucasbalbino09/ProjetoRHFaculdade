package PessoasGeral;

public class Pessoa {
    
    private String nome;
    private int idade;
    private String cpf;
    private String dataNascimento;
    private String profissao; 

    public Pessoa () {

    }
    public Pessoa(String nome , int idade, String cpf, String dataNascimento, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.profissao = profissao;
    }

    public String getNome() {
        return this.nome;
    }
    public int getIdade() {
        return this.idade;
    }
    public String getCpf() {
        return this.cpf;
    }
    public String getProfissao() {
        return this.profissao;
    }

    public void setNome(String nome) {
         this.nome = nome;
    }
    public void setIdade( int idade) {
        this.idade = idade;
    }
    public void setCpf(String cpf) {
         this.cpf = cpf;
    }

    public void setProfissao(String profissao) {
         this.profissao = profissao;
    }

    public String toString() {
        return 
        "Nome: " + nome 
        +" Idade: " + idade
         + " O CPF: " + cpf 
         + " Sua data de Nascimento é: " + dataNascimento; 
    }

}
