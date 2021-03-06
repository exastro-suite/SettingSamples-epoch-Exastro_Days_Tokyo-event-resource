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

package exastro.Exastro_Days_Tokyo.event_resource.repository;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import exastro.Exastro_Days_Tokyo.event_resource.repository.entity.Event;
import exastro.Exastro_Days_Tokyo.event_resource.repository.entity.EventDetail;

@Repository
public interface EventRepository extends JpaRepository<EventDetail, String> {

	//イベント一覧取得
	ArrayList<Event> findByDeleteFlagFalse();
	
	//イベント詳細情報を取得
	EventDetail findByEventIdIsAndDeleteFlagFalse(int eventId);
	
	//セミナー一覧から登壇者ID 取得
//	ArrayList<Speaker> findBySpeakerIdIn(List<Integer> speakerList);
}
