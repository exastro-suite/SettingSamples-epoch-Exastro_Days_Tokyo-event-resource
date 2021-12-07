package exastro.Exastro_Days_Tokyo.event_resource.repository.vo;

import java.util.Date;

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
@Table(name="seminars")
public class SeminarVO {

	@Column(name="mst_seminar_id")
	protected int mstSeminarId;
	
	@Column(name="seminar_name")
	protected String seminarName;
	
	@Id
	@Column(name="seminar_id")
	protected int seminarId;
	
	@Column(name="start_datetime")
	protected Date startDatetime;
	
	@Column(name="is_deleted")
	protected int isDeleted;
	
	@Column(name="block_id")
	protected int blockId;
	
	@Column(name="speaker_id")
	protected int speakerId;
	
	@Column(name="event_id")
	protected int eventId;
	
	protected String blockName;
	
	public SeminarVO(int seminarId, String seminarName, int blockId, String blockName) {
		this.seminarName = seminarName;
		this.seminarId = seminarId;
		this.blockId = blockId;
		this.blockName = blockName;
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
	
	public int getSeminarId() {
		return seminarId;
	}
	public void setSeminarId(int seminarId) {
		this.seminarId = seminarId;
	}
	
	public Date getStartDatetime() {
		return startDatetime;
	}
	public void setStartDatetime(Date startDatetime) {
		this.startDatetime = startDatetime;
	}
	
	public int getIsDeleted() {
		return isDeleted;
	}
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}
	
	public int getBlockId() {
		return blockId;
	}
	public void setBlockId(int blockId) {
		this.blockId = blockId;
	}
	
	public int getSpeakerId() {
		return speakerId;
	}
	public void setSpeakerId(int speakerId) {
		this.speakerId = speakerId;
	}
	
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	
	public String getBlockName() {
		return blockName;
	}
	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}
	
}

