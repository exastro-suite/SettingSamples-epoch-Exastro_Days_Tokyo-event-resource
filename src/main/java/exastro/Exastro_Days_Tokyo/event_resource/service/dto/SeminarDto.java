package exastro.Exastro_Days_Tokyo.event_resource.service.dto;

import java.util.Date;

public class SeminarDto {
	private int seminarId;
	private Date seminarDate;
	private boolean isDeleted;
	private int mstSeminarId;
	private int blockId;
	private int speakerId;
	public int getSpeakerId() {
		return speakerId;
	}
	public void setSpeakerId(int speakerId) {
		this.speakerId = speakerId;
	}
	//private int eventId;
	private String seminarName;

	public int getSeminarId() {
		return seminarId;
	}
	public void setSeminarId(int seminarId) {
		this.seminarId = seminarId;
	}
	public Date getSeminarDate() {
		return seminarDate;
	}
	public void setSeminarDate(Date seminarDate) {
		this.seminarDate = seminarDate;
	}
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	public int getBlockId() {
		return blockId;
	}
	public void setBlockId(int blockId) {
		this.blockId = blockId;
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

