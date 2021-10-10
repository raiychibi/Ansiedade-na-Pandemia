package br.com.fiap.tds.challenge.bean;

public class Aluno {
	private String email;
	private String senha;
	private String dataNascimento;
	private String genero;
	private String telefone;
	private String curso;
	private int numeroMatricula;
	private String grauHumor;
	private String grauAnsiedade;
	
	public Aluno() {}
	
	public Aluno(String email, String senha, String dataNascimento, String genero, String telefone, String curso,
			int numeroMatricula, String grauHumor, String grauAnsiedade) {
		super();
		this.email = email;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
		this.genero = genero;
		this.telefone = telefone;
		this.curso = curso;
		this.numeroMatricula = numeroMatricula;
		this.grauHumor = grauHumor;
		this.grauAnsiedade = grauAnsiedade;
		
	}

      public String getGrauHumor() {
		  return grauHumor;
	    }

	   public void setGrauHumor(String grauHumor) {
		  this.grauHumor = grauHumor;
	    }

	   public String getGrauAnsiedade() {
		  return grauAnsiedade;
	    }

	   public void setGrauAnsiedade(String grauAnsiedade) {
		   this.grauAnsiedade = grauAnsiedade;
	    }

		public String getEmail() {
	        return email;
        }
        
        public void setEmail(String email) {
	        this.email = email;
        }
        
        public String getSenha() {
	        return senha;
        }
        
        public void setSenha(String senha) {
	        this.senha = senha;
        }
        
        public String getDataNascimento() {
	        return dataNascimento;
        }
        
        public void setDataNascimento(String dataNascimento) {
	        this.dataNascimento = dataNascimento;
        }
        
        public String getTelefone() {
	        return telefone;
        }
        
        public void setTelefone(String telefone) {
	        this.telefone = telefone;
        }
        
        public String getCurso() {
	        return curso;
        }
        
        public void setCurso(String curso) {
	        this.curso = curso;
        }
        
        public int getNumeroMatricula() {
	        return numeroMatricula;
        }
        
        public void setNumeroMatricula(int numeroMatricula) {
	        this.numeroMatricula = numeroMatricula;
        }
        
        public String getGenero() {
			return genero;
		}

        public void setGenero(String genero) {
			this.genero = genero;
		}
        
		public String Cadastro() {
    		return ("Cadastro efetuado no email:\n"+ email +
    				"\nsenha:\n"+ senha +
    				"\nData de nascimento:\n"+ dataNascimento +
    				"\ngenero:\n"+ genero +
    				"\ntelefone:\n"+ telefone +
    				"\ncurso :\n"+ curso +
    				"\nnumero de matricula:\n"+ numeroMatricula);
    	}
		
			
}





