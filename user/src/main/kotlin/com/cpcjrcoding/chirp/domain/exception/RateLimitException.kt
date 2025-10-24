package com.cpcjrcoding.chirp.domain.exception

class RateLimitException(
    resetsInSeconds: Long,
) : RuntimeException(
    "Rate limit exceeded. Please try again in $resetsInSeconds seconds."
    )
