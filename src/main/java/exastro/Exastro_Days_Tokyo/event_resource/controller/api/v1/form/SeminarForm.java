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

public class SeminarForm {

	private int seminarId;
	private Date seminarDate;
	private boolean isDeleted;
	private int mstSeminarId;
	private int blockId;
	private int speakerId;
	//private int eventId;
	private String seminarName;

	public SeminarForm() {
		
	}

	public SeminarForm(String seminarName) {
		this.seminarName = seminarName;
	}
	
	public SeminarForm(int seminarId, Date seminarDate, boolean isDeleted,
			int mstSeminarId, int blockId, int speakerId, int eventId) {
		this.seminarId = seminarId;
		this.seminarDate = seminarDate;
		this.isDeleted = isDeleted;
		this.mstSeminarId = mstSeminarId;
		this.blockId = blockId;
		this.speakerId = speakerId;
	}
	
	public SeminarForm(int seminarId, String seminarName, Date seminarDate) {
		this.seminarId = seminarId;
		this.seminarName = seminarName;
		this.seminarDate = seminarDate;
	}
	
	public int getSpeakerId() {
		return speakerId;
	}

	public void setSpeakerId(int speakerId) {
		this.speakerId = speakerId;
	}

	public String getSeminarName() {
		return seminarName;
	}

	public void setSeminarName(String seminarName) {
		this.seminarName = seminarName;
	}

	public int getSeminarId() {
		return seminarId;
	}

	public void setSeminarId(int seminarId) {
		this.seminarId = seminarId;
	}

	public Date getSeminarDate() {
		return seminarDate;
	}

	public void setSeminarDate(Date seminarDate) {
		this.seminarDate = seminarDate;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public int getMstSeminarId() {
		return mstSeminarId;
	}

	public void setMstSeminarId(int mstSeminarId) {
		this.mstSeminarId = mstSeminarId;
	}

	public int getBlockId() {
		return blockId;
	}

	public void setBlockId(int blockId) {
		this.blockId = blockId;
	}
	
}
