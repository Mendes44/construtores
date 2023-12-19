package dados;

public class DadosCliente {

	double taxa = 5.00;
	private String nome;
	private int conta;
	private double saldo;//saldo da conta so pode ser alterado por saque ou deposito entao so podemos usar o get
	
	
	public DadosCliente (String nome, int conta, double depositoInicial) {
		this.nome = nome;
		this.conta = conta;
		Deposito(depositoInicial);
	}
	
	
	public DadosCliente (String nome, int conta) {
		this.nome = nome;
		this.conta = conta;
		
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getConta() {
		return conta;
	}

	
	public double getSaldo() {
		return saldo;
	}


	public void Deposito(double deposito) {
		saldo += deposito;
	}
	
	public void Saque(double saque) {
		saldo -= saque + taxa;
	}
	
	public String toString() {
		return "Conta: "
				+ conta
				+ ", TITULAR: " 
				+nome 
				+" SALDO: "
				+ String.format("%.2f", saldo);
	}
	
	
	
}
