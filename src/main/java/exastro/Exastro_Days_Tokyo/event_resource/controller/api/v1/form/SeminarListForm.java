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

public class SeminarListForm {

//	セミナーID	
	private int seminarId;

//	セミナー名
	private String mstSeminarName;
	
//	ブロックID
	private int blockId;

//	ブロック名	
	private String blockName;

//	開催日時(開始)
	private Date startDatetime;
	
	public SeminarListForm(int seminarId, String mstSeminarName, int blockId, String blockName, Date startDatetime ) {
		this.seminarId = seminarId;
		this.mstSeminarName = mstSeminarName;
		this.blockId = blockId;
		this.blockName = blockName;
		this.startDatetime = startDatetime;
	}

	public int getSeminarId() {
		return seminarId;
	}

	public void setSeminarId(int seminarId) {
		this.seminarId = seminarId;
	}

	public String getMstSeminarName() {
		return mstSeminarName;
	}

	public void setMstSeminarName(String mstSeminarName) {
		this.mstSeminarName = mstSeminarName;
	}

	public int getBlockId() {
		return blockId;
	}

	public void setBlockId(int blockId) {
		this.blockId = blockId;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public Date getStartDatetime() {
		return startDatetime;
	}

	public void setStartDatetime(Date startDatetime) {
		this.startDatetime = startDatetime;
	}
	
	
}
