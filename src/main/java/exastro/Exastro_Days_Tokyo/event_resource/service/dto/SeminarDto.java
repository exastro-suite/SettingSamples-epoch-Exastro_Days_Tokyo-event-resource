package exastro.Exastro_Days_Tokyo.event_resource.service.dto;

public class SeminarDto {
	private int mstSeminarId;
	private String seminarName;

	public SeminarDto() {
		
	}

	public SeminarDto(String seminarName) {
		this.seminarName = seminarName;
	}
	public SeminarDto(int mstSeminarId, String seminarName) {
		this.mstSeminarId = mstSeminarId;
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

