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

package exastro.Exastro_Days_Tokyo.event_resource.service;

import java.util.List;

import org.springframework.stereotype.Service;

import exastro.Exastro_Days_Tokyo.event_resource.service.dto.SeminarDetailDto;
import exastro.Exastro_Days_Tokyo.event_resource.service.dto.SpeakerDto;

@Service
public class SeminarResourceService extends BaseEventService implements EventService {


	public SeminarResourceService() {
		
	}

	public SeminarDetailDto getSeminarDetail(int seminar_id) {
		
		List<Integer> speakerList = null;
		List<SpeakerDto> speakerInfo = null;
		SeminarDetailDto seminarInfo =null;
		
//			eventDetail = new SeminarDetailForm(e.getSeminarId(), e.getSeminarName(),
//		 e.getSeminarOverview(), e.getStartDatetime(), e.getBlockId(),e.getBlockName(), e.getSpeakerId());

		try {
			//セミナーID に紐づくセミナー情報を取得
			SeminarDetailVO ev = seminar_detail_repo.findBySeminarIdIs(seminar_id);
			seminarInfo = new SeminarDetailDto(ev.getSeminarId(), ev.getSeminarName(),
					 ev.getSeminarOverview(), ev.getStartDatetime(), ev.getBlockId(),ev.getBlockName(), ev.getSpeakerId());
					}
		catch(Exception e) {
			throw e;
		}

		return seminarInfo;
	}

}
