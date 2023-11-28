package ecommerceAcessórios;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import ecommerceAcessórios.controller.ProdutoController;
import ecommerceAcessórios.model.Bijuteria;
import ecommerceAcessórios.model.Joia;
import ecommerceAcessórios.model.Produto;


public class Menu {
	public static void main(String[] args) {
		ProdutoController produto = new ProdutoController();
		
		Scanner receba = new Scanner(System.in);
		int opcao, id, tipo, material, materialBiju, categoria;
		String nomeProduto;
		float preco;
		
	/*	System.out.println("\nAcessórios cadastrados em sistema:\n ");
		Bijuteria b1 = new Bijuteria(produto.gerarId(),2, "Colar RBD", 1,50,3);
		produto.cadastrarProdutos(b1);
	    Joia j1 = new Joia(produto.gerarId(),1,"Anel vivara",2,300,2);
		produto.cadastrarProdutos(j1);
		Bijuteria b2 = new Bijuteria(produto.gerarId(),2, "Colar Gravata Pingente Azul", 1,300,2);
		produto.cadastrarProdutos(b2);
		Bijuteria b3 = new Bijuteria(produto.gerarId(),2, "Brinco Argola Média", 4,150,1);
		produto.cadastrarProdutos(b3);
		Bijuteria b4 = new Bijuteria(produto.gerarId(),2, "Anel Falange", 2,70,1);
		produto.cadastrarProdutos(b4);
	    Joia j2 = new Joia(produto.gerarId(),1,"Brinco Gota",4,276,1);
		produto.cadastrarProdutos(j2);
	    Joia j3= new Joia(produto.gerarId(),1,"Colar Gargantilha com Zircônias",1,422,1);
		produto.cadastrarProdutos(j3);
		Bijuteria b5 = new Bijuteria(produto.gerarId(),2, "Pulseira Corações", 3,127,2);
		produto.cadastrarProdutos(b5);
	    Joia j4= new Joia(produto.gerarId(),1,"Bracelete",3,284,1);
		produto.cadastrarProdutos(j4);
	    Joia j5= new Joia(produto.gerarId(),1,"Colar Gravata Swavaroski",1,760,2);
	    produto.cadastrarProdutos(j5);
	    produto.listarProdutos();*/
while(true) {
		System.out.println("•••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••");
        System.out.println(" *************Shimmer Jewls***************");		
        System.out.println("                   1 - Cadastrar produtos                        " );
        System.out.println("                   2 - Listrar Acessórios                           ");
        System.out.println("                   3 - Buscar produto por ID                  ");
        System.out.println("                   4 - Atualizar produto                          ");
        System.out.println("                   5 - Deletar produto                              ");
        System.out.println("                   6 - Mostrar dados de um Produto    ");
        System.out.println("                   7 - Sair do Menu                                   ");
        System.out.println(" *************Shimmer Jewls***************");		
		System.out.println("•••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••••");
        System.out.println("Digite a opção desejada:                                        ");
		System.out.println("                                                                                    "+ Cores.TEXT_RESET);
   	try {
		opcao = receba.nextInt();
		}catch(InputMismatchException e) {
			System.out.println("\nInforme uma opção que esteja no Menu indicado!");
			receba.nextLine();
			opcao = 0;
		}
        if (opcao == 7) {
        	System.out.println("Encerrando Menu....\n");
        	System.out.println("Shimmer Jewls - Venha brilhar conosco! ✨");
        	receba.close();
        	System.exit(0);        	
        }
        switch (opcao) {
        case 1:
        	System.out.println(" Cadastrar um novo Produto: ");
        	System.out.println(" Digite o ID do Produto: ");
        	id = receba.nextInt();
        	var buscaProduto = produto.buscarNaCollection(id);
        	if (buscaProduto == null) {
        	System.out.println(" Digite o Nome do Produto: \n");
			receba.skip("\\R?");
			nomeProduto = receba.nextLine();
         	System.out.println(" Digite o valor do Produto: R$ ");
        	preco = receba.nextFloat();
        	System.out.println(" Digite o tipo do Produto: 1 - Colar; \n2 - Anel; \n3 - Pulseira; \n4 - Brinco;  ");
        	categoria  = receba.nextInt();
         	do{ System.out.println(" Digite a Categoria do Produto: 1 - Joia; \n2  - Bijuteria ");
        	tipo = receba.nextInt();
        	}while(tipo== 1 && tipo ==2);
        	switch (tipo) {
        	case 1:
        		System.out.println("Informe qual o material da sua Jóia: \n1- Ouro, \n2 - Prata, \n3 - Zircônia");
        		material = receba.nextInt();
        		produto.cadastrarProdutos(new Joia(id,tipo, nomeProduto, categoria, preco, material));
              break;
        	case 2:
        		System.out.println("Informe o material da sua Bijuteria:\n 1 - Aço Inoxídavel; \n2 - Folheada em Dourado; \n3 - Folheada em Prata;");
        		materialBiju = receba.nextInt();
        		produto.cadastrarProdutos(new Bijuteria(id,tipo, nomeProduto, categoria, preco, materialBiju));
        		break;
        		default:
     			   System.out.println(Cores.TEXT_RED_UNDERLINED + Cores.ANSI_BLACK_BACKGROUND + "\nOpção Inválida!");
     			   keyPress();
                   break;
        	}
        	}else {
        		System.out.println(Cores.ANSI_WHITE_BACKGROUND+Cores.TEXT_RED_BOLD+"Já existe um Produto com esse ID cadastrado em sistema!! \nCadastre um novo Produto...");
        	    System.out.println("                                                            "+Cores.TEXT_RESET);
        	}
        case 2: 
        	System.out.println("Listar todos as Joias Cadastradas: \n");
        	produto.listarProdutos();
        	keyPress();
        	break;
        case 3: 
        	System.out.println("Buscar Produto por ID: ");
        	System.out.println(" Informe o ID do Produto que deseja buscar: ");
        	id = receba.nextInt();
        	produto.buscarProduto(id);
        	keyPress();
        	break;
        case 4: 
        	System.out.println(" Atualizar os dados do Produto na lista: ");
        	 keyPress();
        	System.out.println(" Informe o ID do Produto: ");
        	id = receba.nextInt();
        	 keyPress();
        	var buscaProduto2 = produto.buscarNaCollection(id);
        	if (buscaProduto2 != null) {
        		id = buscaProduto2.getId();
        		System.out.println(" Digite o Nome do Produto: ");
            	nomeProduto = receba.nextLine();
             	System.out.println(" Digite o valor do Produto: R$ ");
            	preco = receba.nextFloat();
            	System.out.println(" Digite o tipo do Produto: \n1- Colar; \n2 - Anel; \n3 - Pulseira; \n4 - Brinco;  ");
            	categoria  = receba.nextInt();
            	System.out.println(" Digite a Categoria do Produto: 1 - Joia; \n2  - Bijuteria ");
            	tipo = receba.nextInt();
            	switch (tipo) {
            	case 1:
            		System.out.println("Informe qual o material da sua Jóia: \n1- Ouro, \n2 - Prata, \n3 - Zircônia");
            		material = receba.nextInt();
            		produto.atualizarProduto(new Joia(id,tipo, nomeProduto, categoria, preco, material));
            		 keyPress();
                  break;
            	case 2:
            		System.out.println("Informe o material da sua Bijuteria:\n 1 - Aço Inoxídavel; \n2 - Folheada em Dourado; \n3 - Folheada em Prata;");
            		materialBiju = receba.nextInt();
            		produto.atualizarProduto(new Bijuteria(id,tipo, nomeProduto, categoria, preco, materialBiju));
            		keyPress();
            		break;
            		default:
         			   System.out.println(Cores.TEXT_RED_UNDERLINED + Cores.ANSI_BLACK_BACKGROUND + "\nOpção Inválida!");
                       keyPress();
                       break;
            	}
            
        }else{
       System.out.println("Produto não encontrado! Necessário cadastrar produto.");
        }
        	keyPress();
        	break;
        case 5: 
        	System.out.println("Deletar Produto\n\n");
        	 keyPress();
        	System.out.println("Informe o ID do Produto: ");
        	id = receba.nextInt();
        	produto.deletarProduto(id);
        	keyPress();
        	break;
        case 6:
        	System.out.println("Informe o ID do Produto que deseja visualizar:\n");
        	id = receba.nextInt();
        	produto.visualizarProduto(id);
        		keyPress();
        		break;
        default:
			System.out.println(Cores.TEXT_RED_UNDERLINED + Cores.ANSI_BLACK_BACKGROUND + "\nOpção Inválida!\n");
           keyPress();
			break;
        }
	}}
	public static void keyPress() {
		try {
			System.out.println(Cores.TEXT_RESET+"\n\nPressione Enter para Continuar...");
			System.in.read();
		}catch(IOException e) {
			System.out.println("Você pressionou uma tecla diferente de Enter!");
		}
		
	}
}