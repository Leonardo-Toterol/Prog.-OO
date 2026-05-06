import java.util.ArrayList;

public class Menu {
    public void inicio(){
        int opcao;
        ArrayList<Cliente> clientes = new ArrayList<>();

        do{
            IO.println("Menu\nDigite a opcao desejada:\n1 - Adicionar contato\n2 - Editar contato\n3 - Remover contato\n4 - Listar contatos\n0 - Sair");

            opcao = Integer.parseInt(IO.readln("Opcao escolhida: "));

            switch (opcao){
                case 1:
                    this.adicionarCliente(clientes);
                    break;
                case 2:
                    this.editarCliente(clientes);
                    break;
                case 3:
                    this.removerCliente(clientes);
                    break;
                case 4:
                    this.listarCliente(clientes);
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }while (opcao != 0);
    }

    public void adicionarCliente(ArrayList<Cliente>clientes){

        ArrayList<Endereco> enderecos = new ArrayList<>();

        String nome = IO.readln("Qual o nome do CLiente? ");
        String cpf = IO.readln("Qual o cpf do cliente? ");
        String dataNascimento = IO.readln("Qual a data de nascimento? dia/mês/ano");
        String logradouro = IO.readln("Qual o logradouro? ");
        String bairro = IO.readln("Qual o bairro? ");
        String cidade = IO.readln("Qual sua cidade? ");
        String cep = IO.readln("Qual seu CEP? ");
        String descricao = IO.readln("Qual é este endereço? ");

        Endereco endereco = new Endereco(logradouro, bairro, cidade, cep, descricao);
        enderecos.add(endereco);

        Cliente cliente = new Cliente(nome, cpf, dataNascimento, enderecos);
        clientes.add(cliente);




    }

    public void editarCliente(ArrayList<Cliente>clientes){
        IO.println("Escolha um Cliente para editar: ");
        for (int i = 0; i < clientes.size(); i++) {
            IO.readln("Indice " + i + " " + clientes.get(i));
        }

        int indice = Integer.parseInt(IO.readln("Digite o indice do cliente que deseja editar: "));

        String nome = IO.readln("Qual o nome do CLiente? ");
        String cpf = IO.readln("Qual o cpf do cliente");
        String dataNascimento = IO.readln("Qual a data de nascimento? dia/mês/ano");

        clientes.get(indice).setNome(nome);
        clientes.get(indice).setCpf(cpf);
        clientes.get(indice).setDataNascimento(dataNascimento);
    }

    public void removerCliente(ArrayList<Cliente>clientes){
        IO.println("Escolha um Cliente para editar: ");
        for (int i = 0; i < clientes.size(); i++) {
            IO.readln("Indice" + i + " " + clientes.get(i));
        }

        int indice = Integer.parseInt(IO.readln("Digite o indice do cliente que deseja remover: "));

        Cliente cliente = clientes.get(indice);
        clientes.remove(cliente);



    }

    public void listarCliente(ArrayList<Cliente>clientes){
            IO.println("Lista de Clientes");

        for (int i = 0; i < clientes.size(); i++) {
            System.out.println((clientes.get(i).toString()));

            }
        }

    }

    public void menuEndereco(){
        do{
            IO.println("Menu\nDigite a opcao desejada:\n1 - Adicionar endereço\n2 - Editar endereço\n3 - Remover endereço\n4 - Listar contatos\n0 - Sair");

            opcao = Integer.parseInt(IO.readln("Opcao escolhida: "));

            switch (opcao){
                case 1:
                    this.adicionarCliente(clientes, enderecos);
                    break;
                case 2:
                    this.editarCliente(clientes, enderecos);
                    break;
                case 3:
                    this.removerCliente(clientes, enderecos);
                    break;
                case 4:
                    this.listarCliente(clientes, enderecos);
                    break;
                case 0:
                    break;
                default:
                    break;
            }
        }while (opcao != 0);

    }
}


