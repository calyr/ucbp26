package com.ucb.app.country.presentation.state

import com.ucb.app.country.model.CountryModel

data class CountryState(
    val valuedb: String = "",
    val isLoading: Boolean = false,
                        val countries: List<CountryModel> = emptyList(),
                        val error: String? = null
)