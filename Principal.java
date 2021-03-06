package provaPOO;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
		Distribuidora d1=new Distribuidora("Distribuidora Disk", "79911112222");
		Distribuidora d2=new Distribuidora("Distribuidora Delivery", "79933334444");
		String opcao2,sair="4";
System.out.println("Qual menu deseja acessar:\r\n"
		+ "1. Distribuidora Disk\r\n"
		+ "2. Distribuidora Delivery");
int opcao1=entrada.nextInt();
switch(opcao1) {
	case 1:
		do {
		System.out.println("Menu de opções:\r\n"
		+ "1. Cadastrar um produto\r\n"
		+ "2. Atualizar estoque de um produto:\r\n"
		+ "3. Imprimir Relatórios:\r\n"
		+ "4. Sair do Sistema");
		opcao2=entrada.next();
		switch(opcao2) {
		case "1":
			System.out.println("Digite o nome do produto: ");
			String nomep=entrada.next();
			if((d1.buscarProduto(nomep))==null) {
				Produto x=new Produto();
				d1.cadastrarProduto(x);
			}else {
				System.out.println("Produto já cadastrado.");
			}
			break;
		case "2":
			System.out.println("Opções:\r\n"
					+ "1. Atualizar a partir do nome do produto\r\n"
					+ "2. Atualizar a partir do código do produto\r\n");
			int opcaoa=entrada.nextInt();
			if(opcaoa==1) {
				System.out.println("Digite o nome do produto:");
				nomep=entrada.next();
				if((d1.buscarProduto(nomep)==null)) {
					System.out.println("Produto não cadastrado");
				}else {
					System.out.println("Digite:\r\n"
							+ "1. Adicionar ao estoque\r\n"
							+ "2. Retirar do estoque");
					opcaoa=entrada.nextInt();
					if(opcaoa==1) {
						System.out.println("Digite a quantidade que deseja");
						int quantidadex=entrada.nextInt();
						(d1.buscarProduto(nomep)).colocarEmEstoque(quantidadex);
					}else {
						System.out.println("Digite a quantidade que deseja");
						int quantidadex=entrada.nextInt();
						(d1.buscarProduto(nomep)).retirarDoEstoque(quantidadex);
					}
				}
			}else {
				System.out.println("Digite o código do produto:");
				int codigop=entrada.nextInt();
				if((d1.buscarProduto(codigop)==null)) {
					System.out.println("Produto não cadastrado");
				}else {
					System.out.println("Digite:\r\n"
							+ "1. Adicionar ao estoque\r\n"
							+ "2. Retirar do estoque");
					opcaoa=entrada.nextInt();
					if(opcaoa==1) {
						System.out.println("Digite a quantidade que deseja");
						int quantidadex=entrada.nextInt();
						(d1.buscarProduto(codigop)).colocarEmEstoque(quantidadex);
					}else {
						System.out.println("Digite a quantidade que deseja");
						int quantidadex=entrada.nextInt();
						(d1.buscarProduto(codigop)).retirarDoEstoque(quantidadex);
					}
				}
			}
			break;
		case "3":
			System.out.println("Opções:\r\n"
					+ "1. Completo\r\n"
					+ "2. Por tipo de produto\r\n"
					+ "3. Por produto\r\n"
					+ "4. Por marca de produto");
			int opcaor=entrada.nextInt();
			switch(opcaor) {
			case 1:
				for(int i=0;i<(d1.listaDeProdutos).size();i++) {
					System.out.println(d1.listaDeProdutos.get(i).toString());
				}
				for(int i=0;i<(d1.listaDeProdutosP).size();i++) {
					System.out.println(d1.listaDeProdutosP.get(i).toString());
				}
				break;
			case 2:
				System.out.println("Opções:\r\n"
						+ "1. Produtos não perecíveis\r\n"
						+ "2. Produtos perecíveis");
				int opcaopp=entrada.nextInt();
				if(opcaopp==1) {
					for(int i=0;i<(d1.listaDeProdutos).size();i++) {
						System.out.println(d1.listaDeProdutos.get(i).toString());
					}
				}else {
					for(int i=0;i<(d1.listaDeProdutosP).size();i++) {
						System.out.println(d1.listaDeProdutosP.get(i).toString());
					}
				}
				break;
			case 3:
				System.out.println("Opções:\r\n"
						+ "1. Buscar por nome\r\n"
						+ "2. Buscar por código");
				opcaopp=entrada.nextInt();
				if(opcaopp==1) {
					System.out.println("Digite o nome do produto:");
					String nomepp=entrada.next();
					System.out.println((d1.buscarProduto(nomepp)).toString());
				}else {
					System.out.println("Digite o código do produto:");
					int codigopp=entrada.nextInt();
					System.out.println((d1.buscarProduto(codigopp)).toString());
				}
				break;
			case 4:
				for(int i=0;i<(d1.listaDeProdutos).size();i++) {
					System.out.println("Digite o nome da marca:");
					String marcapp=entrada.next();
					if(d1.listaDeProdutos.get(i).getMarca().equals(marcapp)) {
					System.out.println(d1.listaDeProdutos.get(i).toString());
					}
				}
				for(int i=0;i<(d1.listaDeProdutosP).size();i++) {
					System.out.println("Digite o nome da marca:");
					String marcapp=entrada.next();
					if(d1.listaDeProdutos.get(i).getMarca().equals(marcapp)) {
					System.out.println(d1.listaDeProdutos.get(i).toString());
					}
				}
			}
		}
		}while(!opcao2.equalsIgnoreCase(sair));
	break;
	case 2:
		do {
			System.out.println("Menu de opções:\r\n"
			+ "1. Cadastrar um produto\r\n"
			+ "2. Atualizar estoque de um produto:\r\n"
			+ "3. Imprimir Relatórios:\r\n"
			+ "4. Sair do Sistema");
			opcao2=entrada.next();
			switch(opcao2) {
			case "1":
				System.out.println("Digite o nome do produto: ");
				String nomep=entrada.next();
				if((d2.buscarProduto(nomep))==null) {
					Produto x=new Produto();
					d2.cadastrarProduto(x);
				}else {
					System.out.println("Produto já cadastrado.");
				}
				break;
			case "2":
				System.out.println("Opções:\r\n"
						+ "1. Atualizar a partir do nome do produto\r\n"
						+ "2. Atualizar a partir do código do produto\r\n");
				int opcaoa=entrada.nextInt();
				if(opcaoa==1) {
					System.out.println("Digite o nome do produto:");
					nomep=entrada.next();
					if((d2.buscarProduto(nomep)==null)) {
						System.out.println("Produto não cadastrado");
					}else {
						System.out.println("Digite:\r\n"
								+ "1. Adicionar ao estoque\r\n"
								+ "2. Retirar do estoque");
						opcaoa=entrada.nextInt();
						if(opcaoa==1) {
							System.out.println("Digite a quantidade que deseja");
							int quantidadex=entrada.nextInt();
							(d2.buscarProduto(nomep)).colocarEmEstoque(quantidadex);
						}else {
							System.out.println("Digite a quantidade que deseja");
							int quantidadex=entrada.nextInt();
							(d2.buscarProduto(nomep)).retirarDoEstoque(quantidadex);
						}
					}
				}else {
					System.out.println("Digite o código do produto:");
					int codigop=entrada.nextInt();
					if((d2.buscarProduto(codigop)==null)) {
						System.out.println("Produto não cadastrado");
					}else {
						System.out.println("Digite:\r\n"
								+ "1. Adicionar ao estoque\r\n"
								+ "2. Retirar do estoque");
						opcaoa=entrada.nextInt();
						if(opcaoa==1) {
							System.out.println("Digite a quantidade que deseja");
							int quantidadex=entrada.nextInt();
							(d2.buscarProduto(codigop)).colocarEmEstoque(quantidadex);
						}else {
							System.out.println("Digite a quantidade que deseja");
							int quantidadex=entrada.nextInt();
							(d2.buscarProduto(codigop)).retirarDoEstoque(quantidadex);
						}
					}
				}
				break;
			case "3":
				System.out.println("Opções:\r\n"
						+ "1. Completo\r\n"
						+ "2. Por tipo de produto\r\n"
						+ "3. Por produto\r\n"
						+ "4. Por marca de produto");
				int opcaor=entrada.nextInt();
				switch(opcaor) {
				case 1:
					for(int i=0;i<(d2.listaDeProdutos).size();i++) {
						System.out.println(d2.listaDeProdutos.get(i).toString());
					}
					for(int i=0;i<(d2.listaDeProdutosP).size();i++) {
						System.out.println(d2.listaDeProdutosP.get(i).toString());
					}
					break;
				case 2:
					System.out.println("Opções:\r\n"
							+ "1. Produtos não perecíveis\r\n"
							+ "2. Produtos perecíveis");
					int opcaopp=entrada.nextInt();
					if(opcaopp==1) {
						for(int i=0;i<(d2.listaDeProdutos).size();i++) {
							System.out.println(d2.listaDeProdutos.get(i).toString());
						}
					}else {
						for(int i=0;i<(d2.listaDeProdutosP).size();i++) {
							System.out.println(d2.listaDeProdutosP.get(i).toString());
						}
					}
					break;
				case 3:
					System.out.println("Opções:\r\n"
							+ "1. Buscar por nome\r\n"
							+ "2. Buscar por código");
					opcaopp=entrada.nextInt();
					if(opcaopp==1) {
						System.out.println("Digite o nome do produto:");
						String nomepp=entrada.next();
						System.out.println((d2.buscarProduto(nomepp)).toString());
					}else {
						System.out.println("Digite o código do produto:");
						int codigopp=entrada.nextInt();
						System.out.println((d2.buscarProduto(codigopp)).toString());
					}
					break;
				case 4:
					for(int i=0;i<(d2.listaDeProdutos).size();i++) {
						System.out.println("Digite o nome da marca:");
						String marcapp=entrada.next();
						if(d2.listaDeProdutos.get(i).getMarca().equals(marcapp)) {
						System.out.println(d2.listaDeProdutos.get(i).toString());
						}
					}
					for(int i=0;i<(d2.listaDeProdutosP).size();i++) {
						System.out.println("Digite o nome da marca:");
						String marcapp=entrada.next();
						if(d2.listaDeProdutos.get(i).getMarca().equals(marcapp)) {
						System.out.println(d2.listaDeProdutos.get(i).toString());
						}
					}
				}
			}
			}while(!opcao2.equalsIgnoreCase(sair));
		break;
}
	}

}
