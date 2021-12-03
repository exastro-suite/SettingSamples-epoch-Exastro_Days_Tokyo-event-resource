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
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import exastro.Exastro_Days_Tokyo.event_resource.repository.EventDetailRepository;
import exastro.Exastro_Days_Tokyo.event_resource.repository.EventRepository;
import exastro.Exastro_Days_Tokyo.event_resource.repository.SeminarRepository;
import exastro.Exastro_Days_Tokyo.event_resource.repository.SpeakerRepository;
import exastro.Exastro_Days_Tokyo.event_resource.service.dto.EventDto;

public abstract class BaseEventService {
	
	@Autowired
	protected EventRepository event_repo;

	@Autowired
	protected EventDetailRepository event_detail_repo;

	@Autowired
	protected SeminarRepository seminar_repo;

	@Autowired
	protected SpeakerRepository speaker_repo;
	
	public BaseEventService() {
		
	}

	public List<EventDto> getEvent() {
		
		List<EventDto> eventList = null;
		
		try {
			eventList = event_repo.findByIsDeleted(false)
					.stream()
					.map(e -> new EventDto(e.getEventId(), e.getEventName(), e.getEventDate()))
					.collect(Collectors.toList());
		}
		catch(Exception e) {
			throw e;
		}
		
		return eventList;
	}

}
