package com.yuiko.mobile.service.impl

import com.yuiko.mobile.service.DbService
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate
import org.springframework.stereotype.Service

@Service
class DbServiceImpl(
    private val namedParameterJdbcTemplate: NamedParameterJdbcTemplate
): DbService {
    override fun getData() {
        TODO("Not yet implemented")
    }
}