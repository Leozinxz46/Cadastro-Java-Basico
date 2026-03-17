
import java.util.Locale;
import java.util.Scanner;

public class CadastroUsuario {
    public static void main (String[] args) {

        //Criando Scanner
        Scanner scanner = new Scanner (System.in).useLocale(Locale.US);


        /// Cadastrando Usuario

        System.out.println("MENU DE CADASTRO");

        System.out.println("Digite Seu Nome Completo: ");
        String nomeUsuario = scanner.next();

        System.out.println("Digite Seu Gmail: ");
        String gmailUsuario = scanner.next();

        System.out.println("Crie Uma Nova Senha");
        String senhaUsuario = scanner.next();

        System.out.println("Data De Nascimento: ");
        String dataNascimentoUsuario = scanner.next();

        System.out.println("Digite Seu CPF: (Apenas Numeros): ");
        String cpfUsuario = scanner.next();

        System.out.println("Cadastro Concluido");





       /// Exibindo Dados Para Usuario

        System.out.println("Deseja Exibir Algum Dado Escrito: (S/N) ");
        String exibirDado = scanner.next();

        boolean alternativaExibirDado;

        if (exibirDado.equalsIgnoreCase("S")){
            alternativaExibirDado = true;

            System.out.println("Digite o Numero do Dado que Gostaria de Exibir: \n" +
                                "\n 1 - Nome\n 2 - Gmail\n 3 - Data De Nascimento\n 4 - CPF");
            int SelecionandoDadoExibir = scanner.nextInt();

            if (SelecionandoDadoExibir == (1)){
                System.out.println(nomeUsuario);
            }
            else if (SelecionandoDadoExibir == (2)){
                System.out.println(gmailUsuario);
            }
            else if (SelecionandoDadoExibir == (3)){
                System.out.println(dataNascimentoUsuario);
            }
            else if (SelecionandoDadoExibir == (4)){
                System.out.println(cpfUsuario);
            }
            else {
                System.out.println("Cadastro Realizado");
            }

        }
        else {
            alternativaExibirDado = false;
            System.out.println("Cadastro Realizado");
        }







        /// Alterando Dados

        System.out.println("Voce deseja alterar algun Dado: (S/N): ");
        String ecolhaUsuarioAlterandoDado = scanner.next();

        boolean alternativaAlterandoDado;

        if (ecolhaUsuarioAlterandoDado.equalsIgnoreCase("S")){
            alternativaAlterandoDado = true;

            System.out.println("Para alterar o Dado voce deve Inserir a Senha");
            System.out.println("Insira a Senha: ");
            String senhainsirida = scanner.next();

            if (senhainsirida.equals (senhaUsuario)){
                System.out.println("Senha Correta");
                System.out.println("Qual dado deseja Mudar: \n" +
                        "\n 1 - Nome\n 2 - Gmail\n 3 - Senha\n 4 - Data de nascimento\n 5 - CPF");
                int alterandoDado = scanner.nextInt();

                if (alterandoDado == (1)){
                    System.out.println("Digite o Novo Nome Desejado: ");
                    nomeUsuario = scanner.next();
                    System.out.println("Nome Alterado para " + nomeUsuario);
                }
                else if (alterandoDado == (2)){
                    System.out.println("Digite o Novo Gmail Desejado: ");
                    gmailUsuario = scanner.next();
                    System.out.println("Gmail Alterado para " + gmailUsuario);
                }
                else if (alterandoDado == (3)){
                    System.out.println("Digite sua Nova Senha: ");
                    senhaUsuario = scanner.next();
                    System.out.println("Senha Alterada Para " + senhaUsuario);
                }
                else if (alterandoDado == (4)){
                    System.out.println("Digite Sua Data de Nascimento ");
                    dataNascimentoUsuario = scanner.next();
                    System.out.println("Data de Nascimento Alterada para " + dataNascimentoUsuario);
                }
                else if (alterandoDado == (5)) {
                    System.out.println("Digite o Seu CPF (Apenas Numeros): ");
                    cpfUsuario = scanner.next();
                    System.out.println("Numero de CPF Alterado para " + cpfUsuario);
                }
                else {
                    System.out.println("Cadastro Realizado");
                }

            }
            else {
                System.out.println("Senha incorreta!!");
            }

        }
        else{
            alternativaAlterandoDado = false;
            System.out.println("Cadastro Realizado Sem Alterações");
        }

    }
}
