/*   Copyright 2021 NEC Corporation
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package exastro.Exastro_Days_Tokyo.event_resource.controller.api.v1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import exastro.Exastro_Days_Tokyo.event_resource.controller.api.v1.form.SeminarDetailForm;
import exastro.Exastro_Days_Tokyo.event_resource.service.SeminarService;
import exastro.Exastro_Days_Tokyo.event_resource.service.dto.SeminarDetailDto;

//@RestController
//@RequestMapping("/api/v1/seminar")
public class SeminarResourceController {
	
	@Autowired
	protected SeminarService service;
	
	public SeminarResourceController() {
		
	}

	@GetMapping("/{seminar_id}")
	public SeminarDetailForm eventDetail(@PathVariable(value = "seminar_id") @Validated int seminar_id) {
		
		SeminarDetailForm eventDetail = null;
		//	public SeminarDetailDto(int seminarId, String seminarName, 
		//String seminarOverview, Date startDatetime, int blockId, String  blockName, int speakerId) {

		try {
			SeminarDetailDto e = service.getSeminarDetail(seminar_id);
			eventDetail = new SeminarDetailForm(e.getSeminarId(), e.getSeminarName(),
					 e.getSeminarOverview(), e.getStartDatetime(), e.getBlockId(),e.getBlockName(), e.getSpeakerId());
		
		}
		catch(Exception e) {
			throw e;
		}
		
		return eventDetail;
	}
}
