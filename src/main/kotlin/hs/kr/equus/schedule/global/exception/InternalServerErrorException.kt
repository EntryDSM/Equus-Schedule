package hs.kr.equus.schedule.global.exception

import hs.kr.equus.schedule.global.error.exception.EquusException
import hs.kr.equus.schedule.global.error.exception.ErrorCode

object InternalServerErrorException : EquusException(
    ErrorCode.INTERNAL_SERVER_ERROR
)
