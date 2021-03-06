package provaPOO;

import java.util.ArrayList;
import java.util.Scanner;

public class Distribuidora {
	Scanner entrada=new Scanner(System.in);
	private String nome,numero;
	ArrayList<Produto> listaDeProdutos = new ArrayList();
	ArrayList<ProdutoPerecivel> listaDeProdutosP = new ArrayList();
	public Distribuidora(String nome, String numero) {
		this.nome=nome;
		this.numero=numero;
	}
	public Produto buscarProduto(String nome) {
		 for (int i = 0; i < listaDeProdutos.size(); i++) {
				if(listaDeProdutos.get(i).getNomeDoProduto().equals(nome)){
							return listaDeProdutos.get(i);
                      }
				break;
		    }
		return null;
	}
	public Produto buscarProduto(int codigo) {
		 for (int i = 0; i < listaDeProdutos.size(); i++) {
				if(listaDeProdutos.get(i).getCodigo()==codigo){
							return listaDeProdutos.get(i);
                     }
				break;
		    }
		return null;
	}
	public Produto buscarProdutomarca(String marca) {
		 for (int i = 0; i < listaDeProdutos.size(); i++) {
				if(listaDeProdutos.get(i).getMarca().equals(marca)){
							return listaDeProdutos.get(i);
                     }
				break;
		    }
		return null;
	}
	public void cadastrarProduto(ProdutoPerecivel x) {
		System.out.println("Digite 1 para cadastrar produto\nDigite 2 para cadastrar produto perecível");
		int opcao=entrada.nextInt();
		switch(opcao){
		case 1:
			System.out.println("Digite o nome do produto: ");
			String nomex=entrada.next();
			System.out.println("Digite o preço do produto: ");
			double preçox=entrada.nextDouble();
			System.out.println("Digite a marca do produto: ");
			String marcax=entrada.next();
			Produto x1=new Produto(0, preçox, nomex, marcax);
			listaDeProdutos.add(x1);
			System.out.println("Produto cadastrado.");
			break;
		case 2:
			System.out.println("Digite o nome do produto: ");
			String nomex1=entrada.next();
			System.out.println("Digite o preço do produto: ");
			double preçox1=entrada.nextDouble();
			System.out.println("Digite a marca do produto: ");
			String marcax1=entrada.next();
			System.out.println("Digite a data de validade(yyyy/mm/dd):");
			String datax1=entrada.next();
			ProdutoPerecivel x2=new ProdutoPerecivel(0, preçox1, nomex1, marcax1,datax1);
			listaDeProdutosP.add((ProdutoPerecivel) x2);
			System.out.println("Produto cadastrado.");
			break;
		}
	}
	public void cadastrarProduto(Produto x) {
		System.out.println("Digite 1 para cadastrar produto\nDigite 2 para cadastrar produto perecível");
		int opcao=entrada.nextInt();
		switch(opcao){
		case 1:
			System.out.println("Digite o nome do produto: ");
			String nomex=entrada.next();
			System.out.println("Digite o preço do produto: ");
			double preçox=entrada.nextDouble();
			System.out.println("Digite a marca do produto: ");
			String marcax=entrada.next();
			Produto x1=new Produto(0, preçox, nomex, marcax);
			listaDeProdutos.add(x1);
			System.out.println("Produto cadastrado.");
			break;
		case 2:
			System.out.println("Digite o nome do produto: ");
			String nomex1=entrada.next();
			System.out.println("Digite o preço do produto: ");
			double preçox1=entrada.nextDouble();
			System.out.println("Digite a marca do produto: ");
			String marcax1=entrada.next();
			System.out.println("Digite a data de validade(yyyy/mm/dd):");
			String datax1=entrada.next();
			ProdutoPerecivel x2=new ProdutoPerecivel(0, preçox1, nomex1, marcax1,datax1);
			listaDeProdutosP.add((ProdutoPerecivel) x2);
			System.out.println("Produto cadastrado.");
			break;
		}
	}

}
