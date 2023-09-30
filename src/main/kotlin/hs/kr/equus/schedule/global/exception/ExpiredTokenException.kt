package hs.kr.equus.schedule.global.exception

import hs.kr.equus.schedule.global.error.exception.EquusException
import hs.kr.equus.schedule.global.error.exception.ErrorCode

object ExpiredTokenException : EquusException(
    ErrorCode.EXPIRED_TOKEN
)
