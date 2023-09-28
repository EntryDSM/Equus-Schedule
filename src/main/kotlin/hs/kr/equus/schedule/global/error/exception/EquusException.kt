package hs.kr.equus.schedule.global.error.exception

import java.lang.RuntimeException

abstract class EquusException(
    val errorCode: ErrorCode
) : RuntimeException()
