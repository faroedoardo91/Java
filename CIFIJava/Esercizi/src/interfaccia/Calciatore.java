package interfaccia;

public class Calciatore extends Atleta implements Cloneable,Comparable<Object> {
	
	//goal segnati, partitegiocate, club
	private String club;
	private int goalSegnati;
	private int partiteGiocate;
	
	public Calciatore() {
	}

	public Calciatore(String nome, String cognome, int pettorina, String club, int goalSegnati, int partiteGiocate) {
		super.setNome(nome);
		super.setCognome(cognome);
		super.setPettorina(pettorina);
		this.club = club;
		this.goalSegnati = goalSegnati;
		this.partiteGiocate = partiteGiocate;
	}

	public String getClub() {
		return club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public int getGoalSegnati() {
		return goalSegnati;
	}

	public void setGoalSegnati(int goalSegnati) {
		this.goalSegnati = goalSegnati;
	}

	public int getPartiteGiocate() {
		return partiteGiocate;
	}

	public void setPartiteGiocate(int partiteGiocate) {
		this.partiteGiocate = partiteGiocate;
	}
	
	public double mediaGoalSegnati() {
		return (double)goalSegnati/partiteGiocate;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		if(partiteGiocate==0)
			throw new CloneNotSupportedException("clonazione non effettuata causa numero di partite nulle");
		
		return super.clone();
	}

	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((club == null) ? 0 : club.hashCode());
		result = prime * result + goalSegnati;
		result = prime * result + partiteGiocate;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Calciatore other = (Calciatore) obj;
		if (club == null) {
			if (other.club != null)
				return false;
		} else if (!club.equals(other.club))
			return false;
		if (goalSegnati != other.goalSegnati)
			return false;
		if (partiteGiocate != other.partiteGiocate)
			return false;
		return true;
	}
		
	@Override
	public int compareTo(Object obj) {
		
		//1 se this > other
		//-1 se this < other
		//0 in tutti gli altri casi
						
		if (getClass() != obj.getClass())
			return 0;
		
		Calciatore other = (Calciatore) obj;
		
		if(this.mediaGoalSegnati()>other.mediaGoalSegnati())
			return 1;
		else if (this.mediaGoalSegnati()<other.mediaGoalSegnati())
			return -1;
		
		return 0;
	}

	@Override
	public String toString() {
		return "Calciatore [" + (club != null ? "club=" + club + ", " : "") + "goalSegnati=" + goalSegnati
				+ ", partiteGiocate=" + partiteGiocate + ", mediaGoalSegnati()=" + mediaGoalSegnati() + "]";
	}
	
	

}
