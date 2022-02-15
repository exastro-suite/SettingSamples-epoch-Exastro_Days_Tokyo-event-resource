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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import exastro.Exastro_Days_Tokyo.event_resource.controller.api.v1.form.EventDetailForm;
import exastro.Exastro_Days_Tokyo.event_resource.controller.api.v1.form.EventForm;
import exastro.Exastro_Days_Tokyo.event_resource.service.EventResourceService;
import exastro.Exastro_Days_Tokyo.event_resource.service.dto.EventDetailDto;

@RestController
@RequestMapping("/api/v1/event")
public class EventResourceController {
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	protected EventResourceService service;
	
	public EventResourceController() {
		
	}
	
	//イベント一覧取得
	@GetMapping("")
	public List<EventForm> getEvent() {
		logger.debug("method called. [ " + Thread.currentThread().getStackTrace()[1].getMethodName() + " ]");
		
		List<EventForm> eventList = null;
		
		try {
			eventList = service.getEvent()
					.stream()
					.map(e -> new EventForm(e.getEventId(), e.getEventName(), e.getEventDate()))
					.collect(Collectors.toList());
		}
		catch(Exception e) {
			logger.debug(e.getMessage(), e);
			throw e;
		}
		
		return eventList;
	}
	
	//イベント詳細取得
	@GetMapping("/{eventId}")
	public EventDetailForm getEventDetail(@PathVariable(value = "eventId") @Validated int eventId) {
		logger.debug("method called. [ " + Thread.currentThread().getStackTrace()[1].getMethodName() + " ]");
		
		EventDetailForm eventDetail = null;
		try {
			EventDetailDto e = service.getEventDetail(eventId);
			eventDetail = new EventDetailForm(e.getEventId(), e.getEventName(),
					 e.getEventOverview(), e.getEventDate(), e.getEventVenue(), e.getSpeakerIDs());
			
		}
		catch(Exception e) {
			throw e;
		}
		
		return eventDetail;
	}
	
	//イベント登録
	@PostMapping("")
	@ResponseStatus(HttpStatus.CREATED)
	public String registerEvent(@RequestBody EventDetailForm ed) {
		logger.debug("method called. [ " + Thread.currentThread().getStackTrace()[1].getMethodName() + " ]");
		
		EventDetailDto eventDetail = null;
		String resultStr = null;
		try {
			eventDetail = new EventDetailDto(ed.getEventName(), ed.getEventOverview(), ed.getEventDate(),
					ed.getEventVenue());
			resultStr = service.registerEvent(eventDetail);
		
		}
		catch(Exception e) {
			logger.debug(e.getMessage(), e);
			throw e;
		}
		
		return resultStr;
	}
	
	//イベント更新
	@PutMapping("/{eventId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public String updateEvent(@PathVariable(value = "eventId") @Validated int eventId, @RequestBody EventDetailForm ed) {
		logger.debug("method called. [ " + Thread.currentThread().getStackTrace()[1].getMethodName() + " ]");
		
		EventDetailDto eventDetail = null;
		String resultStr = null;
		try {
			// does data exist ?
			EventDetailDto checkEd = service.getEventDetail(eventId);
			if(checkEd == null) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found data.");
			}
			
			// validate data
			if(eventId != ed.getEventId()) {
				throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Invalid data.");
			}
			
			// update
			eventDetail = new EventDetailDto(ed.getEventId(), ed.getEventName(), ed.getEventOverview(), ed.getEventDate(),
					ed.getEventVenue());
			resultStr = service.updateEvent(eventDetail);
		
		}
		catch(Exception e) {
			logger.debug(e.getMessage(), e);
			throw e;
		}
		
		return resultStr;
	}
	
	//イベント削除
	@DeleteMapping("/{eventId}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public String deleteEvent(@PathVariable(value = "eventId") @Validated int eventId) {
		
		String resultStr = null;
		try {
			// does data exist ?
			EventDetailDto checkEd = service.getEventDetail(eventId);
			if(checkEd == null) {
				throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Not found data.");
			}
			
			// does data exist ?
			if(checkEd.isDeleteFlag()) {
				return "{\"result\":\"already deleted.\"}";
			}
			
			resultStr = service.deleteEvent(eventId);
		
		}
		catch(Exception e) {
			logger.debug(e.getMessage(), e);
			throw e;
		}
		
		return resultStr;
	}
}
