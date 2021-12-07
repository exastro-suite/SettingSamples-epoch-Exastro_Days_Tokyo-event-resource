package exastro.Exastro_Days_Tokyo.event_resource.repository.vo;

public class SeminarVO {
	private int mstSeminarId;
	private String seminarName;

	public SeminarVO(String seminarName) {
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

