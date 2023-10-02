package hs.kr.equus.schedule.domain.schedule.exception

import hs.kr.equus.schedule.global.error.exception.EquusException
import hs.kr.equus.schedule.global.error.exception.ErrorCode

object InvalidScheduleSequenceException : EquusException(
    ErrorCode.DATE_SEQUENCE_NOT_VALID
)
