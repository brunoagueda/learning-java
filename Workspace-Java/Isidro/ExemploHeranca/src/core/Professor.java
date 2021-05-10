package core;

public class Professor extends Pessoa{
	private String area;
	private String disciplina;
	
	public String exibirInfo() {
		return super.exibirInfo()+";"+this.area+";"+this.disciplina;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	
	

}
