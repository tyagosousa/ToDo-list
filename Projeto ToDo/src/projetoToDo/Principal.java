package projetoToDo;
import java.util.Scanner; 

public class Principal {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        Tarefas[] lista = null;
        Agenda agenda = null;

        int opcao, tam = 0, i, delete;
        
        System.out.println("                                           Bem vindo ao WORKS's Dev, informe uma opcao para continuar\n");

        do {
        	

        	System.out.print("\n########################################");
            System.out.println("\n# 1. Adicionar nova lista de tarefa(s) #");
            System.out.println("# 2. Mostrar tarefas cadastradas       #");
            System.out.println("# 3. Excluir tarefa                    #");
            System.out.println("# 4. Marcar como concluída             #");
            System.out.println("# 0. Sair                              #");
            System.out.print("########################################\n");
            
            System.out.print("-> ");
            opcao = sc1.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe a quantidade de tarefas: ");
                    tam = sc1.nextInt();
                    lista = new Tarefas[tam];

                    agenda = new Agenda(lista);
                    System.out.println("Qual a data de hoje? ");
                    agenda.setData(sc2.nextLine());

                    for (i = 0; i < tam; i++) {
                        lista[i] = new Tarefas();
                        System.out.print("- Informe a atividade: ");
                        lista[i].setAtividade(sc2.nextLine());
                        agenda.adicionar(lista[i]);
                    }
                    break;

                case 2:
                	System.out.println("\n");
                    if (tam == 0) {
                        System.out.println("Nao ha tarefas cadastradas");
                    } else {
                        agenda.imprimir(tam, lista);
                    }
                    
                    break;

                case 3:
                	System.out.println("\n");
                    if (tam > 0) {
                        System.out.println("Informe o numero da tarefa para excluir: ");
                        delete = sc1.nextInt();
                        agenda.excluir(delete, tam, lista);
                    } else {
                        System.out.println("Nao ha tarefas cadastradas");
                    }
                    
                    break;

                case 4:
                	System.out.println("\n");
                    if (tam > 0) {
                        System.out.println("Informe uma tarefa para ser concluída ");
                        int check = sc1.nextInt();
                        agenda.check(check, tam, lista);
                    } else {
                        System.out.println("Nao ha tarefas cadastradas");
                    }
                    
                    break;

                case 0:
                	System.out.println("OBRIGADO POR USAR NOSSO PROGRAMA");
                    break;

                default:
                    System.out.println("Opcao invalida, tente de novo");
                    break;
            }

        } while (opcao != 0);
    }
} 