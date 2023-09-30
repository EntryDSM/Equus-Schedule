package hs.kr.equus.schedule.domain.schedule.domain.repository

import hs.kr.equus.schedule.domain.schedule.domain.Schedule
import hs.kr.equus.schedule.domain.schedule.domain.types.Type
import org.springframework.data.jpa.repository.JpaRepository
import java.util.*

interface ScheduleRepository : JpaRepository<Schedule, Long> {
    fun findAllBy(): List<Schedule>

    fun findByType(type: Type): Schedule?
}
