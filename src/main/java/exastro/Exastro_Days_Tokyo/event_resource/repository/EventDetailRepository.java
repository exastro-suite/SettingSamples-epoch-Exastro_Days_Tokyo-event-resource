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

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import exastro.Exastro_Days_Tokyo.event_resource.repository.vo.EventDetailVO;

@ConfigurationProperties(prefix = "resource.event")
@Repository
public interface EventDetailRepository extends JpaRepository<EventDetailVO, String> {

	//イベント詳細情報を取得
//	ArrayList<EventDetailVO>  findByEventIdIs(int eventId);
	EventDetailVO  findByEventIdIs(int eventId);

	//セミナー一覧から登壇者ID 取得
//	ArrayList<SpeakerVO> findBySpeakerIdIn(List<Integer> speakerList);
}
