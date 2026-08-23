package br.com.fiap.recipes.screens

import android.content.res.Configuration
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddAPhoto
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.RemoveRedEye
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.recipes.R
import br.com.fiap.recipes.ui.theme.RecipesTheme

@Composable
fun SignupScreen(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
                .fillMaxSize()
                .background(
                    MaterialTheme.colorScheme.background
                )
    ){
        TopEndCard(modifier = Modifier.align(alignment = Alignment.TopEnd))
        BottomStartCard(modifier = Modifier.align(alignment = Alignment.BottomStart))
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .align(alignment = Alignment.Center),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ){
            TitleComponent()
            Spacer(modifier = Modifier.height(48.dp))
            UserImage()
            SignupUserForm()
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true,
)
@Composable
private fun SignUpScreenPreview() {
    RecipesTheme {
        SignupScreen()
    }
}

@Composable
fun TitleComponent(modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(
            text = stringResource(R.string.sign_up),
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.titleLarge
        )
        Text(
            text = stringResource(R.string.create_a_new_accout),
            color = MaterialTheme.colorScheme.primary,
            style = MaterialTheme.typography.titleSmall
        )
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
private fun TittleComponentPreview() {
    RecipesTheme {
        TitleComponent()
    }
}

@Composable
fun UserImage(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.size(120.dp)
    ){
        Image(
            painter = painterResource(R.drawable.user),
            contentDescription = stringResource(R.string.user_image),
            modifier = Modifier
                .size(250.dp)
                .align(Alignment.Center)
        )
        Icon(
            imageVector = Icons.Default.AddAPhoto,
            tint = MaterialTheme.colorScheme.primary,
            contentDescription = "Imagem do usuário",
            modifier = Modifier
                        .align(Alignment.BottomEnd),
        )
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
private fun UserImagePreview() {
    RecipesTheme {
        UserImage()
    }
}

@Composable
fun SignupUserForm(modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(32.dp)
    ) {
        //Caixa de texto para o nome do usuário
        OutlinedTextField(
            value = "",
            onValueChange = {},
            modifier = Modifier
                .fillMaxWidth(),
            label = {
                Text(text = stringResource(R.string.your_name),
                    style = MaterialTheme.typography.labelSmall)
            },
            shape = RoundedCornerShape(16.dp),
            colors = OutlinedTextFieldDefaults
                .colors(
                    focusedBorderColor = MaterialTheme.colorScheme.primary,
                    unfocusedBorderColor = MaterialTheme.colorScheme.primary,

                ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = stringResource(R.string.person_icon),
                    tint = MaterialTheme.colorScheme.tertiary
                )
            }
        )

        //Caixa de texto para o e-mail do usuário
        EmailForm()

        //Caixa de texto para a senha do usuário
        PasswordForm()
        Spacer(modifier = Modifier.height(32.dp))
        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme
                    .colorScheme.primary
            ),
            border = BorderStroke(
                width = 1.dp,
                color = MaterialTheme.colorScheme.primary
            ),
            modifier = Modifier
                .fillMaxWidth()
                .height(48.dp),
            shape = RoundedCornerShape(8.dp)
        ) {
            Text(
                text = stringResource(R.string.create_a_new_accout),
                style = MaterialTheme.typography.labelMedium,
                color = MaterialTheme.colorScheme.onPrimary,
            )
        }
    }
}


@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_NO
)
@Composable
private fun SignupUserFormPreview() {
    RecipesTheme {
        SignupUserForm()
    }
}