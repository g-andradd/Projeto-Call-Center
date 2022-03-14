package estrutura.projeto.fila.model;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    //Atributo Fila de Contatos
    Queue<Contato> fila = new LinkedList<>();

    //Metodo que insere um Contato na Fila
    public void inserirContato(Contato contato) {
        this.fila.add(contato);
        System.out.println("Você adicionou o Contato: " + contato);
    }

    //Metodo que mostra o primeiro Contato da lista da Fila e exclui o mesmo
    public String proximoContato() {
        return String.format("Próximo Contato: %s", String.valueOf(this.fila.remove()));
    }

    //Metodo que lista os Contatos contidos na Fila
    public String listarContatos() {
        return String.format("Lista de Contatos:\n %s", String.valueOf(this.fila));
    }

    //Metodo que recupera em inteiro o tamano da Fila
    public int size() {
        return this.fila.size();
    }

    //Metodo que coloca o valor da Fila no toString
    @Override
    public String toString() {
        return String.valueOf(this.fila);
    }
}
