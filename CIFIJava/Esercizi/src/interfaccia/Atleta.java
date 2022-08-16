package interfaccia;

public class Atleta implements IAtleta,INuotatore,ITennista,IAtletaUniversale {

	private String nome;
	private String cognome;
	private int pettorina;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getPettorina() {
		return pettorina;
	}
	public void setPettorina(int pettorina) {
		this.pettorina = pettorina;
	}
	
	@Override
	public String corro() {
		return "Sto correndo ...";
	}
	
	@Override
	public String salto() {
		return "Sto saltando ...";
	}
	@Override
	public String toString() {
		return "Atleta [" + (nome != null ? "nome=" + nome + ", " : "")
				+ (cognome != null ? "cognome=" + cognome + ", " : "") + "pettorina=" + pettorina + ", "
				+ (corro() != null ? "corro()=" + corro() + ", " : "") + (salto() != null ? "salto()=" + salto() : "")
				+ "]";
	}
	
	@Override
	public String rovescio() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String dritto() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String dorso() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String rana() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String mangio() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String bevo() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + pettorina;
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Atleta other = (Atleta) obj;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (pettorina != other.pettorina)
			return false;
		return true;

	}
}