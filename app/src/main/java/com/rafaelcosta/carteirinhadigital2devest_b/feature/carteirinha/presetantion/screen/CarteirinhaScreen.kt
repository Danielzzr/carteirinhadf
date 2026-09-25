package com.rafaelcosta.carteirinhadigital2devest_b.feature.carteirinha.presetantion.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.rafaelcosta.carteirinhadigital2devest_b.R
import com.rafaelcosta.carteirinhadigital2devest_b.core.designsystem.theme.CarteirinhaDigital2DEVEST_BTheme
import com.rafaelcosta.carteirinhadigital2devest_b.feature.carteirinha.presetantion.component.PerfilAluno
import com.rafaelcosta.myapplication.QrCode

@Composable
fun CarteirinhaScreen(
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(id = R.drawable.fundo),
            contentDescription = "Fundo",
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.3f),
            contentScale = ContentScale.Crop
        )

        Card(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .padding(16.dp),
            shape = RoundedCornerShape(20.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color.White.copy(alpha = 0.95f)
            ),
            border = BorderStroke(3.dp, MaterialTheme.colorScheme.primary),
            elevation = CardDefaults.cardElevation(defaultElevation = 8.dp)
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp, horizontal = 16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = "Logo Senai",
                    modifier = Modifier.fillMaxWidth(0.7f)
                )

                PerfilAluno(
                    nome = "Daniel Felix",
                    curso = "Desenvolvimento de Sistemas"
                )

                QrCode(
                    conteudo = "jkhgkgfhgf"
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CarteirinhaScreenPreview() {
    CarteirinhaDigital2DEVEST_BTheme {
        CarteirinhaScreen()
    }
}