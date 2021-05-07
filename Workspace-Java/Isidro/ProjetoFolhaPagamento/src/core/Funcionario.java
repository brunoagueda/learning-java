package core;

public class Funcionario {
	private int numFuncional;
	private String nome;
	private String email;
	private double salario;
	
	public Funcionario(int numFuncional, String nome, String email, double salario) {
		super();
		this.numFuncional = numFuncional;
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}
	
	public String exibirInfo() {
		return numFuncional+"-"+nome+ " ("+email+")  R$ "+String.format("%.2f",salario);		
	}
	
	public void reajustarSalario(double percentual) {
		this.salario = this.salario + this.salario * percentual / 100;
	}
	
	public double calcularImposto() {
		double imposto;
		if (salario <= 2000) {
			imposto = 0;
		}
		else if (salario <= 3000) {
			imposto = salario * 15 / 100;
		}
		else if (salario <= 4500) {
			imposto = salario * 25 / 100;
		}
		else {
			imposto = 2250;
		}
		return imposto;
	}

	public int getNumFuncional() {
		return numFuncional;
	}

	public void setNumFuncional(int numFuncional) {
		this.numFuncional = numFuncional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	

}
