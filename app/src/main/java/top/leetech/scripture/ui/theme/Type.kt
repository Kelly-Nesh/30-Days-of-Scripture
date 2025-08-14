package top.leetech.scripture.ui.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import top.leetech.scripture.R

// Define custom shapes
val Shapes = Shapes(
    extraLarge = RoundedCornerShape(16.dp) // Corresponds to rounded-2xl
)

// Define the custom font families
val Merriweather = FontFamily(
    Font(R.font.merriweather_bold, FontWeight.Bold),
    Font(R.font.merriweather_regular, FontWeight.Normal),
    Font(R.font.merriweather_extrabold, FontWeight.ExtraBold)
)

val Lato = FontFamily(
    Font(R.font.lato_regular, FontWeight.Normal),
    Font(R.font.lato_bold, FontWeight.Bold),
    Font(R.font.lato_semibold, FontWeight.SemiBold)
)

val ScriptureTypography = Typography(
    // Main Title (h1)
    titleLarge = TextStyle(
        fontFamily = Merriweather,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 48.sp,
        letterSpacing = (-0.025).sp,
        lineHeight = 48.sp // Adjust based on design
    ),
    // Header Subtitle
    bodyLarge = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        color = TextMutedColor
    ),
    // Card: Day
    labelSmall = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Bold,
        fontSize = 14.sp,
        color = PrimaryColor,
        letterSpacing = 0.05.sp // wider
    ),
    // Card: Title (h2)
    headlineSmall = TextStyle(
        fontFamily = Merriweather,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        color = TextMainColor
    ),
    // Card: Verse
    bodyMedium = TextStyle(
        fontFamily = Merriweather,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp,
        color = TextSubColor,
        fontStyle = FontStyle.Italic
    ),
    // Card: Reference
    labelMedium = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.SemiBold,
        fontSize = 16.sp,
        color = TextMutedColor,
        textAlign = TextAlign.End
    ),
    // Footer Text
    bodySmall = TextStyle(
        fontFamily = Lato,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        color = TextMutedColor
    )
)
