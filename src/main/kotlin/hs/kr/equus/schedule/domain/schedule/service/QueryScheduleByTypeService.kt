package hs.kr.equus.schedule.domain.schedule.service

import hs.kr.equus.schedule.domain.schedule.domain.types.Type
import hs.kr.equus.schedule.domain.schedule.facade.ScheduleFacade
import hs.kr.equus.schedule.domain.schedule.presentation.dto.ScheduleDto
import org.springframework.stereotype.Service

@Service
class QueryScheduleByTypeService(
    private val scheduleFacade: ScheduleFacade
) {
    fun execute(type: String): ScheduleDto {
        val schedule = scheduleFacade.getScheduleByType(Type.valueOf(type))
        return ScheduleDto(schedule.type, schedule.date)
    }
}
