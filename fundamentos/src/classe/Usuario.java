package classe;

public class Usuario {

	String nome;
	String email;

	@Override
	public boolean equals(Object objeto) {
		
			if (objeto instanceof Usuario) {
				Usuario outro = (Usuario) objeto;
				
				boolean nomeIgual =  outro.nome.equals(this.nome);
				boolean emailigual = outro.email.equals(this.email) ;
				return  nomeIgual && emailigual;
		} else {
			return false; 
		}
			
		
	}

}
