package hs.kr.equus.schedule.domain.schedule.presentation

import hs.kr.equus.schedule.domain.schedule.presentation.dto.ScheduleDto
import hs.kr.equus.schedule.domain.schedule.presentation.dto.request.UpdateSchedulesRequest
import hs.kr.equus.schedule.domain.schedule.presentation.dto.response.SchedulesResponse
import hs.kr.equus.schedule.domain.schedule.service.QueryScheduleByTypeService
import hs.kr.equus.schedule.domain.schedule.service.QuerySchedulesService
import hs.kr.equus.schedule.domain.schedule.service.UpdateSchedulesService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/schedule")
class ScheduleController(
    private val queryScheduleByTypeService: QueryScheduleByTypeService,
    private val querySchedulesService: QuerySchedulesService,
    private val updateSchedulesService: UpdateSchedulesService
) {
    @GetMapping(params = ["type"])
    fun queryScheduleByType(
        @RequestParam type: String
    ): ScheduleDto = queryScheduleByTypeService.execute(type)

    @GetMapping
    fun querySchedules(): SchedulesResponse =
        querySchedulesService.execute()

    @PatchMapping
    fun updateSchedules(
        @RequestBody @Valid
        request: UpdateSchedulesRequest
    ) =
        updateSchedulesService.execute(request)
}
