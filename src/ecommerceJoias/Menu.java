package ecommerceJoias;

import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerceJoias.controller.ProdutoController;
import ecommerceJoias.model.JoiaFeminina;
import ecommerceJoias.model.Produto;


public class Menu {
	public static void main(String[] args) {
		ProdutoController produto = new ProdutoController();
		
		Scanner receba = new Scanner(System.in);
		int opcao, id;
		String nomeProduto, tipo, material;
		float preco;
		
		System.out.println("\nJoais cadastradas em sistema:\n ");
		Produto j1 = new JoiaFeminina("Anel","Ouro","Anel Cobra", 01,200);
		
		System.out.println("•••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••");
        System.out.println(" *************Shimmer Jewls***************");		
        System.out.println("                   1 - Cadastrar produtos                        " );
        System.out.println("                   2 - Listrar Joais                                     ");
        System.out.println("                   3 - Buscar produto por ID                  ");
        System.out.println("                   4 - Atualizar produto                          ");
        System.out.println("                   5 - Deletar produto                              ");
        System.out.println("                   6 - Sair do Menu                                   ");
        System.out.println(" *************Shimmer Jewls***************");		
		System.out.println("•••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••");
        System.out.println("Digite a opção desejada:                                        ");
		System.out.println("                                                                                    "+ Cores.TEXT_RESET);
   	try {
		opcao = receba.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("\nDigite valores inteiros!!");
			receba.nextLine();
			opcao = 0;
		}
        if (opcao == 6) {
        	System.out.println("Shimmer Jewls - Venha brilhar conosco! ✨");
        	receba.close();
        	System.exit(0);        	
        }
        switch (opcao) {
        case 1:
        	System.out.println(" Cadastrar um novo Produto: ");
        	System.out.println(" Digite o ID do Produto: ");
        	id = receba.nextInt();
        	System.out.println(" Digite o Nome do Produto: ");
        	nomeProduto = receba.nextLine();
        	System.out.println(" Digite o tipo do Produto: C - Colar; \nA - Anel; \nP - Pulseira; \nB - Brinco;  ");
        	tipo = receba.nextLine();
        	     switch(tipo) {
        	        case "C":
        		      tipo = "Colar";
        	     break;
        	       case "A":
        	     	tipo = "Anel";
        	    break;
        	       case "P":
        		    tipo = "Pulseira";
        		    break;
        	    case "B":
        		tipo = "Brinco";
        		   break;
        	}
        	System.out.println(" Digite o Material do Produto: O - Ouro; \nP - Prata; \nB- Banhado; ");
        	material = receba.next();
        	switch(material) {
        	case "O":
        		material = "Ouro";
        		break;
        	case "P":
        		material = "Prata";
        		break;
        	case "B":
        		material = "Banhado";
        		break;
        	}
        	System.out.println(" Digite o valor do Produto: R$ ");
        	preco = receba.nextFloat();
        	produto.cadastrarProdutos(j1);
        case 2: 
        	System.out.println("Listar todos as Joias Cadastradas: \n");
        	produto.listarProdutos();
        	break;
        case 3: 
        	System.out.println("Buscar Produto por ID: ");
        	System.out.println(" Informe o ID do Produto que deseja buscar: ");
        	id = receba.nextInt();
        	produto.buscarProduto(id);
        	break;
        case 4: 
        
        	System.out.println(" Atualizar os dados do Produto na lista: ");
        	System.out.println(" Informe o ID do Produto: ");
        	id = receba.nextInt();
        	var buscaProduto = produto.buscarNaCollection(id);
        	if (buscaProduto != null) {
        		System.out.println("Informe o nome do Produto: ");
        		nomeProduto = receba.nextLine();
        		System.out.println("Informe o Preço do Produto: ");
        		preco = receba.nextFloat();
        		System.out.println("Informe o Tipo do Produto: ");
        		tipo = receba.nextLine();
        		System.out.println(" Informe o Material do Produto: ");
        		material = receba.nextLine();
        }else{
       System.out.println("Produto não encontrado! Necessário cadastrar produto.");
        }
        	produto.atualizarProduto(j1);
        	break;
        case 5: 
        	System.out.println("Deletar Produto\n\n");
        	System.out.println("Informe o ID do Produto: ");
        	id = receba.nextInt();
        	produto.deletarProduto(id);
        	break;
        	
        default:
			System.out.println(Cores.TEXT_RED_UNDERLINED + Cores.ANSI_BLACK_BACKGROUND + "\nOpção Inválida!\n");
             break;
		}
     
        	
	}
}