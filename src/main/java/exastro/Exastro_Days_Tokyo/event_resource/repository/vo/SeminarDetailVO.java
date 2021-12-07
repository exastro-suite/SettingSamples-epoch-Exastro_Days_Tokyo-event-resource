package exastro.Exastro_Days_Tokyo.event_resource.repository.vo;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToOne;

public class SeminarDetailVO extends SeminarListVO{

//	開催日時(開始)
	private Date startDatetime;

//	登壇者ID
	private int speakerId;
	
//	セミナー概要
	private String seminarOverview;

//	定員
	private int capacity;
	private int isDeleted;

	@OneToOne
    @JoinColumns({
        @JoinColumn(name = "block_id", referencedColumnName = "block_id")
    })
    private BlockVO  block;	

	public SeminarDetailVO(int seminarId) {
		super();
	}


	public SeminarDetailVO(int seminarId, String seminarName, 
			String seminarOverview, Date startDatetime, int blockId, String  blockName, int speakerId) {
		super(seminarId, seminarName, blockId, blockName);
		this.seminarOverview = seminarOverview;
		this.startDatetime = startDatetime;
		this.speakerId = speakerId;
	}

	public int getSpeakerId() {
		return speakerId;
	}

	public void setSpeakerId(int speakerId) {
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
	
}

