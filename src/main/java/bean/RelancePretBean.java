package bean;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class RelancePretBean {

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date dateDeFin;
	private String statut;

	public Date getDateDeFin() {
		return dateDeFin;
	}

	public void setDateDeFin(Date dateDeFin) {
		this.dateDeFin = dateDeFin;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}

}
