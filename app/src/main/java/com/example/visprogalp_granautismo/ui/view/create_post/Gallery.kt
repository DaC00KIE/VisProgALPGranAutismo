import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visprogalp_granautismo.R
import com.example.visprogalp_granautismo.ui.theme.Purple
import com.synac.instagramuipractice.comment_section.WriteComment





//rasa e ribet codingannya lek pake gallery yg mirip instagram jadi langsung aja codenya diarahin ke gallery user untuk milih gambar e





@Composable
fun Gallery() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .background(color = Color(0x80F7D2D6), shape = RoundedCornerShape(size = 10.dp))
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 16.dp, start = 16.dp, end = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Your Gallery",
                style = TextStyle(
                    fontSize = 16.sp,
                    fontFamily = FontFamily(Font(R.font.raleway_bold)),
                    fontWeight = FontWeight(800),
                    color = Color(0xFF65598E),
                    textAlign = TextAlign.Center,
                ),
                modifier = Modifier
                    .padding(top = 16.dp)
            )
            IconButton(onClick = { /* TODO */ }) {
                Icon(
                    painter = painterResource(R.drawable.arrowdown),
                    contentDescription = "Arrow Down",
                    modifier = Modifier.size(12.dp),
                    tint = Purple
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            IconButton(onClick = { /* TODO */ }) {
                Icon(
                    painter = painterResource(R.drawable.square),
                    contentDescription = "Square",
                    modifier = Modifier.size(15.dp),
                    tint = Color.White
                )
            }
            IconButton(onClick = { /* TODO */ }) {
                Icon(
                    painter = painterResource(R.drawable.camera),
                    contentDescription = "Camera",
                    modifier = Modifier.size(15.dp),
                    tint = Color.White
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GalleryPreview() {
    Gallery()
}
