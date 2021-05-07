package InfoRH;

public class Funcionario {
	
	private int funcional;
	private String nome;
	private String email;
	private double salario;
	private double valorImposto;
	
	
	
	public Funcionario(int funcional, String nome, String email, double salario) {
		this.funcional = funcional;
		this.nome = nome;
		this.email = email;
		this.salario = salario;
	}
	
	
	public int getFuncional() {
		return funcional;
	}
	public void setFuncional(int funcional) {
		this.funcional = funcional;
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
	
	public void ajustarSalario(double reajuste) {
		salario *= (1 + reajuste / 100);
	}
	
	public double calcularValorImposto() {
		
		if(salario <= 2000) {
			valorImposto = 0;
		}
		else if(salario <= 3000){
			valorImposto = salario * 15 / 100;
		}
		else if(salario <= 4500){
			valorImposto = salario * 25 / 100;
		}
		else {
			valorImposto = 2250;
		}
		
		return valorImposto;
	}
	
	public String getInfo() {
		String tabela = "Nome: " + nome + "\n" + 
						"Funcional: " + funcional + "\n" +
						"Email: " + email + "\n" +
						"Salario: R$ " + String.format("%.2f", salario) + "\n" +
						"Mordida do Le�o: R$ " + String.format("%.2f", valorImposto) + "\n";
		return tabela;
	}
}









