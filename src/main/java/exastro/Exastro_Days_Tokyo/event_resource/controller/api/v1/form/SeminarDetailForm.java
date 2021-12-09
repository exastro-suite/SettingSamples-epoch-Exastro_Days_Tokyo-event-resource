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

import java.util.Date;

public class SeminarDetailForm extends SeminarListForm{

//	登壇者ID
	private int speakerId;
	
//	セミナー概要
	private String seminarOverview;

//	定員
	private int capacity;
	
//	登壇者名
	private String speakerName;

//	登壇者プロフィール
	private String speakerProfile;

//	終了時刻は値としてもたない？

	public SeminarDetailForm(int seminarId, String mstSeminarName, int blockId, String blockName, Date startDatetime ,
			int speakerId, String seminarOverview, int capacity, String speakerName, String speakerProfile){
		super(seminarId, mstSeminarName, blockId, blockName, startDatetime);
		this.speakerId = speakerId;
		this.seminarOverview = seminarOverview;
		this.capacity = capacity;
		this.speakerName = speakerName;
		this.speakerProfile = speakerProfile;
	}

	public int getSpeakerId() {
		return speakerId;
	}

	public void setSpeakerId(int speakerId) {
		this.speakerId = speakerId;
	}

	public String getSeminarOverview() {
		return seminarOverview;
	}

	public void setSeminarOverview(String seminarOverview) {
		this.seminarOverview = seminarOverview;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getSpeakerName() {
		return speakerName;
	}

	public void setSpeakerName(String speakerName) {
		this.speakerName = speakerName;
	}

	public String getSpeakerProfile() {
		return speakerProfile;
	}

	public void setSpeakerProfile(String speakerProfile) {
		this.speakerProfile = speakerProfile;
	}
	
}

