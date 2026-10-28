package kg.kkc.myfirstappkkc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = MaterialTheme.colorScheme.background
            ) {

                ProfileListScreen()
            }
        }
    }
}


data class UserProfile(
    val initial: String,
    val name: String,
    val profession: String,
    val projectsCount: String,
    val tasksCount: String,
    val yearsExperience: String
)

@Composable
fun ProfileListScreen() {

    val users = listOf(
        UserProfile("Т", "Тилек Абдрахманов", "Android-разработчик", "12", "48", "5"),
        UserProfile("А", "Алина Бекова", "UI/UX Дизайнер", "19", "64", "3"),
        UserProfile("И", "Ильяс Осмонов", "Backend-разработчик", "24", "95", "4")
    )

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        users.forEach { user ->
            ProfileCard(user = user)
        }
    }
}

@Composable
fun ProfileCard(user: UserProfile) {

    Column(
        modifier = Modifier.fillMaxWidth()
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(16.dp))
                .background(Color(0xFF1B2B21)) // Тёмно-зеленый фон (в стиле Dark Industrial Moss)
                .padding(16.dp)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(16.dp)
                ) {

                    Box(
                        modifier = Modifier
                            .size(56.dp)
                            .clip(CircleShape)
                            .background(Color(0xFF334D3D)),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = user.initial,
                            color = Color.White,
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }


                    Column(
                        verticalArrangement = Arrangement.spacedBy(4.dp)
                    ) {
                        Text(
                            text = user.name,
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Text(
                            text = user.profession,
                            color = Color(0xFFB0BEC5),
                            fontSize = 14.sp
                        )
                    }
                }


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(8.dp)
                ) {
                    StatItem(
                        modifier = Modifier.weight(1f),
                        value = user.projectsCount,
                        label = "проектов"
                    )
                    StatItem(
                        modifier = Modifier.weight(1f),
                        value = user.tasksCount,
                        label = "задач"
                    )
                    StatItem(
                        modifier = Modifier.weight(1f),
                        value = user.yearsExperience,
                        label = "лет опыта"
                    )
                }


                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp)
                ) {
                    Button(
                        onClick = { },
                        modifier = Modifier.weight(1f),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF4CAF50))
                    ) {
                        Text(text = "Написать", color = Color.White)
                    }

                    OutlinedButton(
                        onClick = { },
                        modifier = Modifier.weight(1f),
                        colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.White)
                    ) {
                        Text(text = "Подписаться")
                    }
                }
            }
        }
    }
}


@Composable
fun StatItem(modifier: Modifier = Modifier, value: String, label: String) {
    Column(
        modifier = modifier
            .clip(RoundedCornerShape(8.dp))
            .background(Color(0xFF111C16))
            .padding(vertical = 12.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(4.dp)
    ) {
        Text(
            text = value,
            color = Color.White,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = label,
            color = Color(0xFF90A4AE),
            fontSize = 12.sp
        )
    }
}