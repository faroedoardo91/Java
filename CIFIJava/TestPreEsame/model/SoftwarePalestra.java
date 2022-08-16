package model;

public class SoftwarePalestra {

		private int cliente;
		private String nomeCliente;
		private int anni;
				
		
		public SoftwarePalestra(int cliente, String nomeCliente, int anni) {
			this.cliente = cliente;
			this.nomeCliente = nomeCliente;
			this.anni = anni;
		}
		
		public int getCliente() {
			return cliente;
		}
		public void setCliente(int cliente) {
			this.cliente = cliente;
		}
		public String getNomeCliente() {
			return nomeCliente;
		}
		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}
		public int getAnni() {
			return anni;
		}
		public void setAnni(int anni) {
			this.anni = anni;
		}

		@Override
		public String toString() {
			return "[" 
		+ cliente 
		+ ", " + nomeCliente
		+ ", " + anni 
		+ "]";
		}
				
	}
