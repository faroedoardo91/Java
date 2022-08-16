package polimorfismo;

public abstract class Dipendente {
	//attributi
		private String nome;
		private String cognome;
		private int oreLavorate;
		private double pagaOraria;
		
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
		public int getOreLavorate() {
			return oreLavorate;
		}
		public void setOreLavorate(int oreLavorate) {
			this.oreLavorate = oreLavorate;
		}
		public double getPagaOraria() {
			return pagaOraria;
		}
		public void setPagaOraria(double pagaOraria) {
			this.pagaOraria = pagaOraria;
		}
		
		public abstract double stipendio();
		
		@Override
		public String toString() {
			return "" + (nome != null ? "nome=" + nome + ", " : "")
					+ (cognome != null ? "cognome=" + cognome + ", " : "") + "oreLavorate=" + oreLavorate + ", pagaOraria="
					+ pagaOraria + ", stipendio()=" + stipendio()
					;
		}	
}
