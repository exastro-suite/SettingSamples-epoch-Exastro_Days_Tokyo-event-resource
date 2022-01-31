package exastro.Exastro_Days_Tokyo.event_resource.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MstSeminarDto {
	private int mstSeminarId;
	private String seminarName;
	
	public MstSeminarDto(String seminarName) {
		this.seminarName = seminarName;
	}
}

