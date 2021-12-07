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

package exastro.Exastro_Days_Tokyo.event_resource.service.dto;

import java.util.ArrayList;
import java.util.Date;

public class EventDetailDto extends EventDto{
	private String eventOverview;
	private String eventVenue;
	private  ArrayList<Integer> speakerIDs = new ArrayList<Integer>();
	private boolean isDeleted;

	public EventDetailDto() {
		
	}
	
	public EventDetailDto(int eventId, String eventName, 
			String eventOverview, Date eventDate, String eventVenue) {
		super(eventId, eventName, eventDate);
		this.eventOverview = eventOverview;
		this.eventVenue = eventVenue;
	}
	
	public ArrayList<Integer> getSpeakerIDs() {
		return speakerIDs;
	}

	public void setSpeakerIDs(ArrayList<Integer> speakerIDs) {
		this.speakerIDs = speakerIDs;
	}

	public String getEventOverview() {
		return eventOverview;
	}
	public void setEventOverview(String eventOverview) {
		this.eventOverview = eventOverview;
	}

	public String getEventVenue() {
		return eventVenue;
	}
	public void setEventVenue(String eventVenue) {
		this.eventVenue = eventVenue;
	}
	
	public boolean isDeleted() {
		return isDeleted;
	}
	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}
	
}

