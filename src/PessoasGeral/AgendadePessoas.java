package PessoasGeral;
import java.util.ArrayList;
import java.util.List;

public class AgendadePessoas extends Pessoa {
    
    private List<Pessoa> ListadeContatos;

    public AgendadePessoas() {
        this.ListadeContatos = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        ListadeContatos.add(pessoa);
    }


    public Pessoa buscarPessoaPorNome(String nome) {
     
        for( Pessoa pessoa : this.ListadeContatos ) {
            if( pessoa.getNome().equals(nome)) {
                return pessoa;
            }
        }
        return null;
    }

    public List<Pessoa> buscarPessoaPorProfissao(String Profissao) {
        List<Pessoa> pessoaComProfissao = new ArrayList();
        
        ListadeContatos.forEach(profissional -> {
            if(profissional.getProfissao().equals(Profissao)) {
                pessoaComProfissao.add(profissional);
            }
        }); 

        return pessoaComProfissao;
    }
}
