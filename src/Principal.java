import PessoasGeral.Pessoa;

public class Principal {
    public static void main(String[] args) throws Exception {      
        
        PessoasGeral.AgendadePessoas listaContato = new PessoasGeral.AgendadePessoas();
        

        Pessoa pessoa1 = listaContato.new Pessoa("tereza",23,"15188181","25/12/2027","Engenheiro");
        Pessoa pessoa2 = listaContato.new Pessoa("Maria",28,"15181819","25/12/1875","Medica");
        Pessoa pessoa3 = listaContato.new Pessoa("João",35,"4948115","15/12/1975","Agricultor");
    
        
        listaContato.adicionarPessoa(pessoa1);
        listaContato.adicionarPessoa(pessoa2);
        listaContato.adicionarPessoa(pessoa3);


        Pessoa pessoaEncontrada = listaContato.buscarPessoaPorNome("Tereza");
        if(pessoaEncontrada != null) {
            System.out.println(listaContato.toString());
        } else {
            System.out.println("Não foi localizado em nosso banco nenhum usuario com esse nome!");
        }
    }

}
