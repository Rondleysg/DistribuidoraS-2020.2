package provaPOO;

import java.util.Calendar;

public class ProdutoPerecivel extends Produto {

	private String dataValidade,datasalvar;
	private int datavalidadeint,quantidadeRetirada;
	
	public ProdutoPerecivel() {
	}
	public ProdutoPerecivel(int qntdEstoque, double pre�o, String nomeDoProduto, String marca, String dataValidade) {
		super(qntdEstoque,pre�o,nomeDoProduto,marca);
		int ano=Calendar.getInstance().get(Calendar.YEAR);
		this.codigo=Integer.parseInt(String.valueOf(ano)+String.valueOf(cont));
		cont++;
		this.dataValidade=dataValidade;
		this.datasalvar=dataValidade;
		this.dataValidade=dataValidade.replace("/", "");
		datavalidadeint = Integer.parseInt(this.dataValidade);
	}
	
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}
	public int retirarDoEstoque(String dataHoje) {
		int data = Integer.parseInt(dataHoje);
		if(datavalidadeint<data||datavalidadeint==data) {
			quantidadeRetirada=qntdEstoque;
			qntdEstoque=0;
			System.out.println("Produtos j� venceram, o estoque foi zerado.");
		}
		return quantidadeRetirada;
	}
	public void colocarEmEstoque(int quantidade) {
		if(qntdEstoque==0) {
			qntdEstoque+=quantidade;
		}
	}
	@Override
	public String toString() {
		return "Produto Perec�vel [Data de validade= " + datasalvar + ", c�digo= " + codigo + ", quantidade em estoque= " + qntdEstoque
				+ ", pre�o= " + pre�o + ", nomes do produto= " + nomeDoProduto + ", marca= " + marca + "]";
	}
	
	
	
}
