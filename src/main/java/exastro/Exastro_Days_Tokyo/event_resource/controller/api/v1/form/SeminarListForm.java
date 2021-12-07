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

public class SeminarListForm extends SeminarForm {

	private int seminarId;
	private int blockId;
	private String blockName;
	private int isDeleted;

//	開催日時(開始)
	private Date startDatetime;

	public SeminarListForm() {
		
	}
	
	public SeminarListForm(int seminarId, String seminarName, int blockId, String blockName) {
		super(seminarName);
		this.seminarId = seminarId;
		this.blockId = blockId;
		this.blockName = blockName;
	}

	public SeminarListForm(int seminarId, String seminarName, Date startDateTime) {
		super(seminarName);
		this.seminarId = seminarId;
		this.startDatetime = startDateTime;
	}

	public Date getStartDatetime() {
		return startDatetime;
	}

	public void setStartDatetime(Date startDatetime) {
		this.startDatetime = startDatetime;
	}

	public int getSeminarId() {
		return seminarId;
	}

	public void setSeminarId(int seminarId) {
		this.seminarId = seminarId;
	}

	public int getIsDeleted() {
		return isDeleted;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	
	public void setIsDeleted(int isDeleted) {
		this.isDeleted = isDeleted;
	}

	public int getBlockId() {
		return blockId;
	}

	public void setBlockId(int blockId) {
		this.blockId = blockId;
	}
	
}
