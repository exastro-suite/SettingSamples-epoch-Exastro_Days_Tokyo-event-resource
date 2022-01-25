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
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import exastro.Exastro_Days_Tokyo.event_resource.repository.entity.EventDetail;
import exastro.Exastro_Days_Tokyo.event_resource.service.EventResourceService;


@RestController
//@RequestMapping("/api/v1/event")
public class EventResourceController extends BaseEventController {
	
	public EventResourceController(@Autowired EventResourceService service) {
		this.service = service;
	}
	//イベント更新/削除
	@RequestMapping(path = "/api/v1/event/{eventId}", method = RequestMethod.PUT)
	public String eventUpdate(@PathVariable(value = "eventId") @Validated int eventId, @RequestBody EventDetail eventDetail) {
		
		String resultStr = null;
		try {
			resultStr = service.updateEvent(eventDetail);
		
		}
		catch(Exception e) {
			logger.debug(e.getMessage(), e);
			throw e;
		}
		
		return resultStr;
	}

	//イベント登録
	@RequestMapping(path = "/api/v1/event", method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED) 
	public String eventRegist(@RequestBody EventDetail eventDetail) {
		
		String resultStr = null;
		try {
			resultStr = service.registEvent(eventDetail);
		
		}
		catch(Exception e) {
			logger.debug(e.getMessage(), e);
			throw e;
		}
		
		return resultStr;
	}
	
}
