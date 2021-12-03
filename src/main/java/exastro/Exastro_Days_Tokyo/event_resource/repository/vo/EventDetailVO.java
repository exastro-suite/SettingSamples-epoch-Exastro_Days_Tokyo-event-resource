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

package exastro.Exastro_Days_Tokyo.event_resource.repository.vo;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
/**
 * The persistent class for the events database table.
 * 
 */
@Entity
@Table(name="events")
//@NamedQuery(name="Event.findAll", query="SELECT e FROM Event e")
public class EventDetailVO {
	
	@Id
	@Column(name="event_id")
	private int eventId;
	
	@Column(name="event_name")
	private String eventName;
	
	
	@Column(name="event_overview")
	private String eventOverview;

	@Column(name="event_date")
	private Date eventDate;

	@Column(name="event_venue")
	private String eventVenue;
	
	@Column(name="is_deleted")
	private boolean isDeleted;

//	private  ArrayList<SpeakerVO> speakerVO = new ArrayList<SpeakerVO>();

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

//	public ArrayList<SpeakerVO> getSpeakerVO() {
//		return speakerVO;
//	}
//	
//	public void setSpeakerVO(ArrayList<SpeakerVO> speakerVO) {
//		this.speakerVO = new ArrayList<SpeakerVO>(speakerVO);
//	}
	
}

