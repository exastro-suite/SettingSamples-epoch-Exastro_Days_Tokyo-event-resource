package exastro.Exastro_Days_Tokyo.event_resource.service.dto;

import java.util.Date;

public class SeminarDto extends MstSeminarDto {
	private int seminarId;
	private int blockId;
	private String blockName;
	private int isDeleted;

//	開催日時(開始)
	private Date startDatetime;

	public SeminarDto() {
		
	}
	
	public SeminarDto(int seminarId, String seminarName, int blockId, String blockName) {
		super(seminarName);
		this.seminarId = seminarId;
		this.blockId = blockId;
		this.blockName = blockName;
	}

	public Date getStartDatetime() {
		return startDatetime;
	}

	public void setStartDatetime(Date startDatetime) {
		this.startDatetime = startDatetime;
	}

	public int getSeminarId() {
		return seminarId;
	}

	public void setSeminarId(int seminarId) {
		this.seminarId = seminarId;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
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
	
}

