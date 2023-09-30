package hs.kr.equus.schedule.global.exception

import hs.kr.equus.schedule.global.error.exception.EquusException
import hs.kr.equus.schedule.global.error.exception.ErrorCode

object InvalidTokenException : EquusException(
    ErrorCode.INVALID_TOKEN
)
