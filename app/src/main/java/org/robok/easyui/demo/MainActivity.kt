package org.robok.easyui.demo

/*
 *  This file is part of Robok © 2024.
 *
 *  Robok is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Robok is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *   along with Robok.  If not, see <https://www.gnu.org/licenses/>.
 */

import android.os.Bundle
import androidx.activity.*
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.*
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.res.*
import androidx.compose.ui.unit.*
import androidx.compose.ui.window.*
import org.robok.easyui.GUIBuilder
import org.robok.easyui.compiler.GUICompiler
import org.robok.easyui.demo.ui.components.editor.HighlightingEditor
import org.robok.easyui.demo.ui.components.syntax.SyntaxType
import org.robok.easyui.demo.ui.theme.RobokTheme

@OptIn(ExperimentalMaterial3Api::class)
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            RobokTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background,
                ) {
                    MainScreen()
                }
            }
        }
    }

    @Composable
    fun MainScreen() {
        var showCodeDialog = remember { mutableStateOf(false) }
        var showErrorDialog = remember { mutableStateOf(false) }
        var showProgress by remember { mutableStateOf(false) }
        var codeComments = remember { mutableStateOf(false) }
        var error by remember { mutableStateOf("") }
        var generatedCode by remember { mutableStateOf("") }
        var code by remember {
            mutableStateOf(
                """Column {
                    Button(text = "Click here", id = "a")
                    Text(text = "Thanks love", id = "b")
                   
                }"""
            )
        }

        // screen content
        Column(
            modifier = Modifier.fillMaxSize().padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            HighlightingEditor(
                value = code,
                onValueChange = { code = it },
                syntaxType = SyntaxType.XML,
            )
            Button(
                onClick = {
                    showProgress = true
                    val guiBuilder =
                        GUIBuilder(
                            context = this@MainActivity,
                            codeComments = codeComments.value,
                            onGenerateCode = { code, config ->
                                generatedCode = code
                                showCodeDialog.value = true
                                showProgress = false
                            },
                            onError = {
                                error = it
                                showErrorDialog.value = true
                                showProgress = false
                            },
                        )
                    val guiCompiler = GUICompiler(guiBuilder = guiBuilder, code = code)
                }
            ) {
                Text(text = stringResource(id = R.string.create_basic_gui))
            }
            CodeCommentsWidget(codeComments)
        }
        // dialog
        if (showCodeDialog.value) {
            GeneratedCodeDialog(generatedCode = generatedCode, showCodeDialog = showCodeDialog)
        }

        if (showErrorDialog.value) {
            ErrorDialog(error = error, showErrorDialog = showErrorDialog)
        }

        if (showProgress) {
            LoadingIndicatorDialog(isShow = showProgress, onDismiss = { showProgress = false })
        }
    }

    @Composable
    fun CodeCommentsWidget(codeComments: MutableState<Boolean>) {
        Row(
            modifier =
                Modifier.clip(RoundedCornerShape(20.dp))
                    .clickable { codeComments.value = !codeComments.value }
                    .padding(vertical = 7.dp, horizontal = 10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
        ) {
            Text(
                text = stringResource(id = R.string.code_comments),
                modifier = Modifier.align(Alignment.CenterVertically).padding(vertical = 10.dp),
            )
            Spacer(modifier = Modifier.width(8.dp))
            Switch(
                checked = codeComments.value,
                onCheckedChange = null,
                modifier = Modifier.align(Alignment.CenterVertically).padding(vertical = 10.dp),
            )
        }
    }

    @Composable
    fun GeneratedCodeDialog(generatedCode: String, showCodeDialog: MutableState<Boolean>) {
        AlertDialog(
            onDismissRequest = { showCodeDialog.value = false },
            title = { Text(text = stringResource(id = R.string.generated_code)) },
            text = {
                SelectionContainer {
                    HighlightingEditor(
                        value = generatedCode,
                        onValueChange = {},
                        syntaxType = SyntaxType.XML,
                    )
                }
            },
            confirmButton = { Button(onClick = { showCodeDialog.value = false }) { Text("OK") } },
        )
    }

    @Composable
    fun ErrorDialog(error: String, showErrorDialog: MutableState<Boolean>) {
        AlertDialog(
            onDismissRequest = { showErrorDialog.value = false },
            title = { Text(text = stringResource(id = R.string.error_ocurred)) },
            text = { ErrorCard(error) },
            confirmButton = { Button(onClick = { showErrorDialog.value = false }) { Text("OK") } },
        )
    }

    @Composable
    fun ErrorCard(error: String) {
        Card(
            modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(18.dp)),
            colors =
                CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.errorContainer),
            shape = RoundedCornerShape(18.dp),
        ) {
            SelectionContainer {
                Text(
                    text = error,
                    modifier = Modifier.padding(16.dp),
                    color = MaterialTheme.colorScheme.onErrorContainer,
                )
            }
        }
    }

    @Composable
    fun LoadingIndicatorDialog(isShow: Boolean, onDismiss: () -> Unit) {
        if (isShow) {
            Dialog(
                onDismissRequest = { onDismiss() },
                DialogProperties(dismissOnBackPress = false, dismissOnClickOutside = false),
            ) {
                Box(
                    contentAlignment = Alignment.Center,
                    modifier =
                        Modifier.clip(RoundedCornerShape(22.dp))
                            .background(MaterialTheme.colorScheme.surfaceVariant),
                ) {
                    CircularProgressIndicator(modifier = Modifier.padding(16.dp))
                }
            }
        }
    }
}
