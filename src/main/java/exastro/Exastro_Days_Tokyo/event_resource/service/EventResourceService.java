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

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import exastro.Exastro_Days_Tokyo.event_resource.repository.vo.EventDetailVO;
import exastro.Exastro_Days_Tokyo.event_resource.service.dto.EventDetailDto;
import exastro.Exastro_Days_Tokyo.event_resource.service.dto.SpeakerDto;

@Service
public class EventResourceService extends BaseEventService implements EventService {


	public EventResourceService() {
		
	}

	public EventDetailDto getEventDetail(int event_id) {
//		List<EventDetailDto> eventInfo = null;
		
		List<Integer> speakerList = null;
		List<SpeakerDto> speakerInfo = null;
		EventDetailDto eventInfo =null;
		
		try {
			//イベントID に紐づくイベント情報を取得
			EventDetailVO ev = event_detail_repo.findByEventIdIs(event_id);
			eventInfo = new EventDetailDto(ev.getEventId(), ev.getEventName(), 
					ev.getEventOverview(), ev.getEventDate(), ev.getEventVenue());

		
			//該当イベントを含むセミナー一覧から登壇者IDを取得
			int eventId = eventInfo.getEventId();
			speakerList = seminar_repo.findByEventId(eventId)
					.stream()
					.map(e -> Integer.valueOf(e.getSpeakerId()))
					.collect(Collectors.toList());
			
			//登壇者情報をイベント情報内にセット
			eventInfo.setSpeakerIDs((ArrayList<Integer>) speakerList);
					}
		catch(Exception e) {
			throw e;
		}

		return eventInfo;
	}

}
