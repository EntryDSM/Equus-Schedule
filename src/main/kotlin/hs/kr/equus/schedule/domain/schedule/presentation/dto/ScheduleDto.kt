package hs.kr.equus.schedule.domain.schedule.presentation.dto

import com.fasterxml.jackson.annotation.JsonFormat
import hs.kr.equus.schedule.domain.schedule.domain.types.Type
import java.time.LocalDateTime
import javax.validation.constraints.NotNull

data class ScheduleDto(
    @NotNull
    val type: Type,

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd", timezone = "Asia/Seoul")
    @NotNull
    val date: LocalDateTime
)
