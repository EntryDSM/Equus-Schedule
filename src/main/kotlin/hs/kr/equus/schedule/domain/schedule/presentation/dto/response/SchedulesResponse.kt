package hs.kr.equus.schedule.domain.schedule.presentation.dto.response

import hs.kr.equus.schedule.domain.schedule.presentation.dto.ScheduleDto

data class SchedulesResponse(
    val schedules: List<ScheduleDto?>,

    val currentStatus: String
)
