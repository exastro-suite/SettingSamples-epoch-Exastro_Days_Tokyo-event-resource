package exastro.Exastro_Days_Tokyo.event_resource.service.dto;

import java.util.Date;

import lombok.Data;

@Data
public class SeminarListDto {

//	セミナーID	
	private int seminarId;

//	セミナー名
	private String seminarName;
	
//	ブロックID
	private int blockId;

//	ブロック名	
	private String blockName;

//	開催日時(開始)
	private Date startDatetime;
	
	public SeminarListDto(int seminarId, String seminarName, int blockId, String blockName, Date startDatetime ) {
		this.seminarId = seminarId;
		this.seminarName = seminarName;
		this.blockId = blockId;
		this.blockName = blockName;
		this.startDatetime = startDatetime;
	}	
}
