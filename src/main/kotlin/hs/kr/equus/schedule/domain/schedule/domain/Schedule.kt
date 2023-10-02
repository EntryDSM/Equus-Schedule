package hs.kr.equus.schedule.domain.schedule.domain

import hs.kr.equus.schedule.domain.schedule.domain.types.Type
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.Id

@Entity(name = "tbl_schedule")
class Schedule(
    @Id
    val id: Int = 0,

    @Enumerated(EnumType.STRING)
    @Column(length = 19, unique = true, nullable = false)
    val type: Type,

    @Column(nullable = false)
    var date: LocalDateTime
) {
    fun updateDate(date: LocalDateTime) {
        this.date = date
    }
}
