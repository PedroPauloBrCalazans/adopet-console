package br.com.alura;

public class CommandExecutor {

    public void executeCommand(Command command) {
        command.execute();
    }
}


//classe responsavel por chama o comando que vai ser executado
//implementação da interface, polimorfismo