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

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import exastro.Exastro_Days_Tokyo.event_resource.controller.api.v1.form.SeminarDetailForm;
import exastro.Exastro_Days_Tokyo.event_resource.controller.api.v1.form.SeminarListForm;
import exastro.Exastro_Days_Tokyo.event_resource.service.SeminarResourceService;
import exastro.Exastro_Days_Tokyo.event_resource.service.dto.SeminarDetailDto;

@RestController
@RequestMapping("/api/v1/seminar")
public class SeminarResourceController {
	
	@Autowired
	protected SeminarResourceService service;
	
	public SeminarResourceController() {
		
	}
	
	@GetMapping("")
	public List<SeminarListForm> seminar(@RequestParam(name = "event_id", required = true) int eventId) {
		
		List<SeminarListForm> seminarList = null;
		
		try {
			seminarList = service.getSeminar(eventId)
					.stream()
					.map(s -> new SeminarListForm(s.getSeminarId(), s.getSeminarName(), s.getBlockId(), s.getBlockName(), s.getStartDatetime(), s.getSpeakerId()))
					.collect(Collectors.toList());
		}
		catch(Exception e) {
			throw e;
		}
		
		return seminarList;
	}
	
	@GetMapping("/{seminarId}")
	public SeminarDetailForm seminarDetail(@PathVariable(value = "seminarId") @Validated int seminarId) {
		
		SeminarDetailForm eventDetail = null;
		
		try {
			SeminarDetailDto e = service.getSeminarDetail(seminarId);
			eventDetail = new SeminarDetailForm(e.getSeminarId(), e.getSeminarName(), e.getBlockId(), e.getBlockName(),
					 e.getStartDatetime(), e.getSpeakerId(), e.getSeminarOverview(), e.getCapacity());
		}
		catch(Exception e) {
			throw e;
		}
		
		return eventDetail;
	}
}
