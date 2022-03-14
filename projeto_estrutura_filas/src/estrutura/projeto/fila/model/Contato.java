package estrutura.projeto.fila.model;

public class Contato {
    private String nome;
    private String telefone;

    //Metodo construtor que recebe o nome e o telefone
    public Contato(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }

    //Metodo to String para pegar o nome do contato
//    @Override
//    public String toString() {
//        return String.format("\nNome: %s Telefone: %s\n", this.nome, this.telefone);
//    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", telefone='" + telefone + '\'' +
                '}';
    }
}
