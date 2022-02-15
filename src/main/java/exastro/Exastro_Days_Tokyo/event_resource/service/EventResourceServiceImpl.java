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

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import exastro.Exastro_Days_Tokyo.event_resource.repository.EventRepository;
import exastro.Exastro_Days_Tokyo.event_resource.repository.entity.EventDetail;
import exastro.Exastro_Days_Tokyo.event_resource.service.dto.EventDetailDto;
import exastro.Exastro_Days_Tokyo.event_resource.service.dto.EventDto;

@Service
public class EventResourceServiceImpl implements EventResourceService {
	
	@Autowired
	protected EventRepository repository;
	
	@Autowired
	protected SeminarResourceService seminarSvc;
	
	public EventResourceServiceImpl() {
		
	}

	public List<EventDto> getEvent() {
		
		List<EventDto> eventList = null;
		
		try {
			eventList = repository.findByDeleteFlagFalse()
					.stream()
					.map(e -> new EventDto(e.getEventId(), e.getEventName(), e.getEventDate()))
					.collect(Collectors.toList());
		}
		catch(Exception e) {
			throw e;
		}
		
		return eventList;
	}

	public EventDetailDto getEventDetail(int eventId) {

		EventDetailDto eventInfo =null;

		try {
			//イベントID に紐づくイベント情報を取得
			EventDetail ev = repository.findByEventIdIs(eventId);
			eventInfo = new EventDetailDto(ev.getEventId(), ev.getEventName(), 
					ev.getEventOverview(), ev.getEventDate(), ev.getEventVenue());


			//該当イベントを含むセミナー一覧から登壇者IDを取得
			List<Integer> speakerIdList = seminarSvc.getSpeakerIdList(eventId);

			//登壇者情報をイベント情報内にセット
			eventInfo.setSpeakerIDs(speakerIdList);
		}
		catch(Exception e) {
			throw e;
		}

		return eventInfo;
	}
	
	public String registerEvent(EventDetailDto ev) {
		
		EventDetail eventDetail = null;
		String resultStr = null;
		try {
			Timestamp eventDate = new Timestamp(ev.getEventDate().getTime());
			eventDetail = new EventDetail(ev.getEventName(), ev.getEventOverview(), eventDate, ev.getEventVenue());
			EventDetail result = repository.save(eventDetail);
			
			resultStr = "{\"result\":\"ok\", \"event_id\":" + result.getEventId() + "}";
		}
		catch(Exception e) {
			throw e;
		}
		
		return resultStr;
	}
	
	public String updateEvent(EventDetail ev) {
		
		EventDetail eventDetail = new EventDetail(ev.getEventId(), ev.getEventName(),
				ev.getEventOverview(), ev.getEventDate(), ev.getEventVenue(), ev.getDeleteFlag());
		
		
		String resultStr = null;
		try {
			//イベントID に紐づくイベント情報 = repository.findByEventIdIs(eventDetail.getEventId());
			EventDetail eventDetailTarget = repository.findByEventIdIs(eventDetail.getEventId());
			eventDetailTarget.setEventId(eventDetail.getEventId());
			eventDetailTarget.setEventName(eventDetail.getEventName());
			eventDetailTarget.setEventOverview(eventDetail.getEventOverview());
			eventDetailTarget.setEventDate(new Timestamp(eventDetail.getEventDate().getTime()));
			eventDetailTarget.setEventVenue(eventDetail.getEventVenue());
			eventDetailTarget.setDeleteFlag(eventDetail.getDeleteFlag());
			EventDetail result = repository.save(eventDetailTarget);
			
			resultStr = "{\"result\":\"ok\"}";
		}
		catch(Exception e) {
			throw e;
		}
		
		return resultStr;
	}

}
