package principal;

import core.Estudante;
import core.Pessoa;
import core.Professor;

public class SistemaUniversidade {
	public static void main(String[] args) {
		
		
		Pessoa p = new Pessoa();
		p.setNome("Isidro");
		p.setEmail("isidro@isidro.com");
		p.setTelefone("98765-4321");
		
		Estudante e = new Estudante();
		e.setNome("Jose");
		e.setEmail("jose@jose.com");
		e.setTelefone("91234-5678");
		e.setNumeroMatricula(12345);
		e.setCurso("Computacao");
		
		Professor r = new Professor();
		r.setNome("Giraffales");
		r.setEmail("gira@falles.com");
		r.setTelefone("94567-8901");
		r.setArea("Ciencias da Natureza");
		r.setDisciplina("Tudao");
		
		System.out.println(p.exibirInfo());
		System.out.println(e.exibirInfo());
		System.out.println(r.exibirInfo());

		
		
	}

}
