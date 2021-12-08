package exastro.Exastro_Days_Tokyo.event_resource.repository.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
 * The persistent class for the events database table.
 * 
 */
@Entity
@Table(name="seminars")
public class SeminarDetailVO extends SeminarVO {
	
//	セミナー概要
	@Column(name="seminar_overview")
	private String seminarOverview;

//	定員
	@Column(name="capacity")
	private int capacity;
	
	public SeminarDetailVO(int seminarId, String seminarName, 
			String seminarOverview, Date startDatetime, int blockId, String  blockName, int speakerId) {
		super(seminarId);
		this.seminarOverview = seminarOverview;
		this.startDatetime = startDatetime;
		this.speakerId = speakerId;
	}

	public String getSeminarOverview() {
		return seminarOverview;
	}

	public void setSeminarOverview(String seminarOverview) {
		this.seminarOverview = seminarOverview;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
}

