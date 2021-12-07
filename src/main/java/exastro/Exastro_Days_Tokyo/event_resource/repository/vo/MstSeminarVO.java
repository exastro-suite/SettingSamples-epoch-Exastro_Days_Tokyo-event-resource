package exastro.Exastro_Days_Tokyo.event_resource.repository.vo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
 * The persistent class for the events database table.
 * 
 */
@Entity
@Table(name="mst_seminars")
public class MstSeminarVO {
	
	@Id
	@Column(name="mst_seminar_id")
	protected int mstSeminarId;
	
	@Column(name="seminar_name")
	protected String seminarName;
	
	public MstSeminarVO(String seminarName) {
		this.seminarName = seminarName;
	}
	
	public int getMstSeminarId() {
		return mstSeminarId;
	}
	public void setMstSeminarId(int mstSeminarId) {
		this.mstSeminarId = mstSeminarId;
	}
	
	public String getSeminarName() {
		return seminarName;
	}
	public void setSeminarName(String seminarName) {
		this.seminarName = seminarName;
	}

}

