package exastro.Exastro_Days_Tokyo.event_resource.service.dto;

import java.util.Date;

public class SeminarListDto {

//	セミナーID	
	private int seminarId;

//	セミナー名
	private String mstSeminarName;
	
//	ブロックID
	private int blockId;

//	ブロック名	
	private String blockName;

//	開催日時(開始)
	private Date startDatetime;
	
	public SeminarListDto(int seminarId, String mstSeminarName, int blockId, String blockName, Date startDatetime ) {
		this.seminarId = seminarId;
		this.mstSeminarName = mstSeminarName;
		this.blockId = blockId;
		this.blockName = blockName;
		this.startDatetime = startDatetime;
	}

	public int getSeminarId() {
		return seminarId;
	}

	public void setSeminarId(int seminarId) {
		this.seminarId = seminarId;
	}

	public String getMstSeminarName() {
		return mstSeminarName;
	}

	public void setMstSeminarName(String mstSeminarName) {
		this.mstSeminarName = mstSeminarName;
	}

	public int getBlockId() {
		return blockId;
	}

	public void setBlockId(int blockId) {
		this.blockId = blockId;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public Date getStartDatetime() {
		return startDatetime;
	}

	public void setStartDatetime(Date startDatetime) {
		this.startDatetime = startDatetime;
	}
	
	
}


