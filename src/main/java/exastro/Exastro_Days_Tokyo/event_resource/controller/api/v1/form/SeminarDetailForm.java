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

public class SeminarDetailForm extends SeminarForm{

	public SeminarDetailForm(int seminarId) {
		super();
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	public SeminarDetailForm(int seminarId, String seminarName, 
			String seminarOverview, Date startDatetime, int blockId, String  blockName, int speakerId ) {
	}

	//	public SeminarDetailDto(int seminarId, String seminarName, 
	//String seminarOverview, Date startDatetime, int blockId, String  blockName, int speakerId) {

	
//	セミナーID
	private int seminarId;
	
//	ブロックID
	private int blockId;

//	ブロック名
	private String blockName;

//	開催日時(開始)
	private String startDatetime;

//	登壇者ID
	private int speakerId;
	
//	セミナー概要
	private String seminarOverview;

//	定員
	private int capacity;

	public int getSeminarId() {
		return seminarId;
	}

	public void setSeminarId(int seminarId) {
		this.seminarId = seminarId;
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

	public String getStartDatetime() {
		return startDatetime;
	}

	public void setStartDatetime(String startDatetime) {
		this.startDatetime = startDatetime;
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
	
}

