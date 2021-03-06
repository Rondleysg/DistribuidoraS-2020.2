package provaPOO;

import java.util.Calendar;

public class Produto {

	protected int codigo,qntdEstoque;
	protected double pre�o;
	protected String nomeDoProduto,marca;
	protected static int cont=1;
	
	public Produto() {
	}
	public Produto(int qntdEstoque, double pre�o, String nomeDoProduto, String marca) {
		int ano=Calendar.getInstance().get(Calendar.YEAR);
		this.codigo=Integer.parseInt(String.valueOf(ano)+String.valueOf(cont));
		cont++;
		this.qntdEstoque=qntdEstoque;
		this.pre�o=pre�o;
		this.nomeDoProduto=nomeDoProduto;
		this.marca=marca;
	}
	public int getCodigo() {
		return codigo;
	}
	public int getQntdEstoque() {
		return qntdEstoque;
	}
	public double getPre�o() {
		return pre�o;
	}
	public String getNomeDoProduto() {
		return nomeDoProduto;
	}
	public String getMarca() {
		return marca;
	}
	public static int getCont() {
		return cont;
	}
	
	public int retirarDoEstoque(int quantidade){
		int quantidadeRetirada=0;
		if((qntdEstoque-quantidade)<0) {
			quantidadeRetirada=qntdEstoque;
			qntdEstoque=0;
			System.out.println("Quantidade retirada: "+quantidadeRetirada);
		}else {
			qntdEstoque-=quantidade;
			quantidadeRetirada=quantidade;
			System.out.println("Quantidade retirada: "+quantidadeRetirada);
		}
		return quantidadeRetirada;
	}
	public void colocarEmEstoque(int quantidade) {
		qntdEstoque+=quantidade;
		System.out.println("Quantidade adicionada.");
		System.out.println("Quantidade em estoque:"+qntdEstoque);
	}
	@Override
	public String toString() {
		return "Produto [C�digo= " + codigo + ", quantidade em estoque= " + qntdEstoque + ", pre�o= " + pre�o + ", nome do produto= "
				+ nomeDoProduto + ", marca= " + marca + "]";
	}
	
	
	
	
}
