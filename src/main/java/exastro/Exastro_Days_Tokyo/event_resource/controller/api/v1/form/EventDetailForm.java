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

package exastro.Exastro_Days_Tokyo.event_resource.controller.api.v1.form;

import java.util.ArrayList;
import java.util.Date;

public class EventDetailForm {

	private int eventId;
	private String eventName;
	private String eventOverview;
	private Date eventDate;
	private String eventVenue;
	private boolean isDeleted;
	private  ArrayList<Integer> speakerIDs = new ArrayList<Integer>();

	public EventDetailForm(int eventId, String eventName, 
			String eventOverview, Date eventDate, String eventVenue, ArrayList<Integer> speakerIDs) {
		this.eventId = eventId;
		this.eventName = eventName;
		this.eventOverview = eventOverview;
		this.eventDate = eventDate;
		this.eventVenue = eventVenue;
		this.speakerIDs =(ArrayList<Integer>)speakerIDs.clone();
	}
	
	public int getEventId() {
		return eventId;
	}
	public void setEventId(int eventId) {
		this.eventId = eventId;
	}
	
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	public String getEventOverview() {
		return eventOverview;
	}
	public void setEventOverview(String eventOverview) {
		this.eventOverview = eventOverview;
	}
	
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
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

	public ArrayList<Integer> getSpeakerIDs() {
		return speakerIDs;
	}

	public void setSpeakerIDs(ArrayList<Integer> speakerIDs) {
		this.speakerIDs = speakerIDs;
	}

}

