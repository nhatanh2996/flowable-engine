/* Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.flowable.cmmn.api.migration;

import java.util.List;
import java.util.Map;

/**
 * @author Valentin Zickner
 */
public interface CaseInstanceMigrationDocumentBuilder {

    CaseInstanceMigrationDocumentBuilder setCaseDefinitionToMigrateTo(String caseDefinitionId);

    CaseInstanceMigrationDocumentBuilder setCaseDefinitionToMigrateTo(String caseDefinitionKey, Integer caseDefinitionVersion);

    CaseInstanceMigrationDocumentBuilder setTenantId(String caseDefinitionTenantId);

    CaseInstanceMigrationDocumentBuilder addActivatePlanItemDefinitionMappings(List<ActivatePlanItemDefinitionMapping> planItemDefinitionMappings);

    CaseInstanceMigrationDocumentBuilder addActivatePlanItemDefinitionMapping(ActivatePlanItemDefinitionMapping planItemDefinitionMapping);
    
    CaseInstanceMigrationDocumentBuilder addTerminatePlanItemDefinitionMappings(List<TerminatePlanItemDefinitionMapping> planItemDefinitionMappings);

    CaseInstanceMigrationDocumentBuilder addTerminatePlanItemDefinitionMapping(TerminatePlanItemDefinitionMapping planItemDefinitionMapping);
    
    CaseInstanceMigrationDocumentBuilder addMoveToAvailablePlanItemDefinitionMappings(List<MoveToAvailablePlanItemDefinitionMapping> planItemDefinitionMappings);

    CaseInstanceMigrationDocumentBuilder addMoveToAvailablePlanItemDefinitionMapping(MoveToAvailablePlanItemDefinitionMapping planItemDefinitionMapping);
    
    CaseInstanceMigrationDocumentBuilder addWaitingForRepetitionPlanItemDefinitionMappings(List<WaitingForRepetitionPlanItemDefinitionMapping> planItemDefinitionMappings);

    CaseInstanceMigrationDocumentBuilder addWaitingForRepetitionPlanItemDefinitionMapping(WaitingForRepetitionPlanItemDefinitionMapping planItemDefinitionMapping);
    
    CaseInstanceMigrationDocumentBuilder addRemoveWaitingForRepetitionPlanItemDefinitionMappings(List<RemoveWaitingForRepetitionPlanItemDefinitionMapping> planItemDefinitionMappings);

    CaseInstanceMigrationDocumentBuilder addRemoveWaitingForRepetitionPlanItemDefinitionMapping(RemoveWaitingForRepetitionPlanItemDefinitionMapping planItemDefinitionMapping);

    CaseInstanceMigrationDocumentBuilder addChangePlanItemIdMapping(ChangePlanItemIdMapping mapping);
    
    CaseInstanceMigrationDocumentBuilder addChangePlanItemIdWithDefinitionIdMapping(ChangePlanItemIdWithDefinitionIdMapping mapping);
    
    CaseInstanceMigrationDocumentBuilder addCaseInstanceVariable(String variableName, Object variableValue);

    CaseInstanceMigrationDocumentBuilder addCaseInstanceVariables(Map<String, Object> caseInstanceVariables);

    CaseInstanceMigrationDocument build();

}
