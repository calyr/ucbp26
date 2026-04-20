package com.calyrsoft.designsystem.theme

@Immutable
data class MyColors(
    val primary: Color,
    val background: Color,
    val surface: Color,
    val textPrimary: Color,
    val isLight: Boolean // Útil para lógica interna
)