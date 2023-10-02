package hs.kr.equus.schedule.domain.schedule.exception

import hs.kr.equus.schedule.global.error.exception.EquusException
import hs.kr.equus.schedule.global.error.exception.ErrorCode

object InvalidScheduleRequestException : EquusException(
    ErrorCode.INVALID_SCHEDULE
)
