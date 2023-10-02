package hs.kr.equus.schedule.domain.schedule.presentation.dto.request

import hs.kr.equus.schedule.domain.schedule.presentation.dto.ScheduleDto
import javax.validation.constraints.NotNull

data class UpdateSchedulesRequest(

    @NotNull
    val schedules: List<ScheduleDto>
)
