package br.com.fiap.recipes.screens

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.RemoveRedEye
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.com.fiap.recipes.R
import br.com.fiap.recipes.ui.theme.RecipesTheme

@Composable
fun TopEndCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .size(width = 160.dp, height = 85.dp),
        colors = CardDefaults
            .cardColors(
                containerColor = MaterialTheme.colorScheme.primary
            ),
        shape = RoundedCornerShape(bottomStart = 85.dp)
    ) { }
}

@Preview
@Composable
private fun TopendCardPreview() {
    RecipesTheme {
        TopEndCard()
    }
}

@Composable
fun BottomStartCard(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier
            .size(width = 160.dp, height = 85.dp),
        colors = CardDefaults
            .cardColors(containerColor = MaterialTheme
                .colorScheme.primary),
        shape = RoundedCornerShape(topEnd = 85.dp)
    ) { }
}

@Preview
@Composable
private fun BottomStartCardPreview() {
    RecipesTheme {
        BottomStartCard()
    }
    
}

@Composable
fun EmailForm(modifier: Modifier = Modifier) {
    //Caixa de texto para o e-mail do usuário
    OutlinedTextField(
        value = "",
        onValueChange = {},
        modifier = Modifier
            .fillMaxWidth(),
        label = {
            Text(text = stringResource(R.string.your_e_mail),
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
                imageVector = Icons.Default.Email,
                contentDescription = stringResource(R.string.e_mail_icon),
                tint = MaterialTheme.colorScheme.tertiary
            )
        }
    )
}

@Preview
@Composable
private fun EmailFormPreview() {
    EmailForm()
}

@Composable
fun PasswordForm(modifier: Modifier = Modifier) {
    //Caixa de texto para a senha do usuário
    OutlinedTextField(
        value = "",
        onValueChange = {},
        modifier = Modifier
            .fillMaxWidth(),
        label = {
            Text(text = stringResource(R.string.your_password),
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
                imageVector = Icons.Default.Lock,
                contentDescription = stringResource(R.string.lock_icon),
                tint = MaterialTheme.colorScheme.tertiary
            )
        },
        trailingIcon = {
            Icon(
                imageVector = Icons.Default.RemoveRedEye,
                contentDescription = stringResource(R.string.eye_icon),
                tint = MaterialTheme.colorScheme.tertiary
            )
        }
    )
}

@Preview
@Composable
private fun PasswordFormPreview() {
    PasswordForm()
}