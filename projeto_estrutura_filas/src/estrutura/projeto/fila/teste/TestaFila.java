package estrutura.projeto.fila.teste;

import estrutura.projeto.fila.model.Contato;
import estrutura.projeto.fila.model.Fila;

import java.util.Scanner;

public class TestaFila {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Fila fila = new Fila();

        //Variavel que recebe qual acao o usuario irá fazer
        String acao = "";
        //Variavel que recebe o nome do cliente para a lista de Contato
        String nome = "";
        //Variavel que recebe o telefone do cliente para a lista de Contato
        String telefone = "";

        System.out.println("----------------------------------------");
        System.out.println("Bem Vindo ao Call Center!!");
        System.out.println("----------------------------------------\n");

        //Enquanto o usuario não digitar 4, o loop continua
        while (!acao.equals("4")) {
            System.out.println("Digite o número da ação que deseja fazer: ");
            System.out.println("1 - Inserir Contato");
            System.out.println("2 - Próximo Contato");
            System.out.println("3 - Listar todos os Contato");
            System.out.println("4 - Sair \n");

            //Recebe o valor da ação digitada pelo usuario
            acao = input.next();

            switch (acao) {
                //Cria apenas até 10 contatos
                case "1":
                    if (fila.size() <= 10) {
                        System.out.println("Digite o nome do Contato: ");
                        nome = input.next();
                        System.out.println("Digite o telefone do Contato: ");
                        telefone = input.next();

                        //grava as variaveis nome e telefone no objeto Contato
                        Contato contato = new Contato(nome, telefone);
                        //adiciona o contato na FIla
                        fila.inserirContato(contato);
                    } else {
                        System.out.println("Não é possível adicionar mais contatos.\n");
                    }
                    break;
                //mosta o fila.remove e caso nao tenha contato mostra mensagem de erro
                case "2":
                    try {
                        System.out.println(fila.proximoContato());
                    } catch (Exception e) {
                        System.out.println("Sem contatos na fila!\n");
                    }
                    break;
                //Lista os contatos contidos na Fila, e caso nao tenha contato mostra mensagem de erro
                case "3":
                    if (fila.size() != 0) {
                        System.out.println(fila.listarContatos());
                    } else {
                        System.out.println("Sem contatos na fila!\n");
                    }
                    break;
                //Sai da aplicação
                case "4":
                    System.out.println("Saindo...");
                    break;
                //Mensagem de erro para caso o usuario nao digite o esperado
                default:
                    System.out.println("Argumento inválido!");
                    System.out.println("Digite um dos números da lista.");
            }
        }
    }
}