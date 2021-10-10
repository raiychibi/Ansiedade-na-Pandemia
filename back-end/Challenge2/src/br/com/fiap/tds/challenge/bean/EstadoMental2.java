package br.com.fiap.tds.challenge.bean;

public class EstadoMental2 extends Aluno{
	String grauHumor2;
	String grauAnsiedade2;
	
	
	
	public EstadoMental2() {}
	
	
	
	public EstadoMental2(String grauHumor2, String grauAnsiedade2) {
		super();
		this.grauHumor2 = grauHumor2;
		this.grauAnsiedade2 = grauAnsiedade2;
	}



	public EstadoMental2(String email, String senha, String dataNascimento, String genero, String telefone,
			String curso, int numeroMatricula, String grauHumor, String grauAnsiedade, String grauHumor2,
			String grauAnsiedade2) {
		super(email, senha, dataNascimento, genero, telefone, curso, numeroMatricula, grauHumor, grauAnsiedade);
		this.grauHumor2 = grauHumor2;
		this.grauAnsiedade2 = grauAnsiedade2;
	}
	
	
	public String getGrauHumor2() {
		return grauHumor2;
	}



	public void setGrauHumor2(String grauHumor2) {
		this.grauHumor2 = grauHumor2;
	}



	public String getGrauAnsiedade2() {
		return grauAnsiedade2;
	}



	public void setGrauAnsiedade2(String grauAnsiedade2) {
		this.grauAnsiedade2 = grauAnsiedade2;
	}

   
			
   }
