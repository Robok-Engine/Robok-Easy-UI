package org.robok.gui.demo

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.enableEdgeToEdge
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.shape.*
import androidx.compose.ui.*
import androidx.compose.ui.draw.*
import androidx.compose.ui.unit.*
import androidx.compose.ui.res.stringResource

import org.robok.gui.demo.R
import org.robok.gui.demo.ui.theme.RobokTheme
import org.robok.gui.GUIBuilder
import org.robok.gui.compiler.GUICompiler

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge()
        super.onCreate(savedInstanceState)
        setContent {
            RobokTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                      MainScreen()
                }
            }
        }
    }

    @Composable
    fun MainScreen() {
        var showDialog by remember { mutableStateOf(false) }
        var dialogMessage by remember { mutableStateOf("") }
        var isError by remember { mutableStateOf(false) }
        
        var isDebugLogs by remember { mutableStateOf(false) }  
        
        // screen cintent
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = {
                    val guiBuilder = GUIBuilder(
                        context = this@MainActivity,
                        debugLogs = isDebugLogs,
                        onFinish = { value, error ->
                            dialogMessage = value
                            isError = error
                            showDialog = true
                        }
                    )
                    val guiCompiler = GUICompiler(guiBuilder)
                },
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = stringResource(id = R.string.create_basic_gui))
            }
            Row(
                 modifier = Modifier
                    .clip(RoundedCornerShape(12.dp))
                    .clickable { isDebugLogs = !isDebugLogs }
                    .padding(vertical =  7.dp, horizontal = 10.dp),
                 verticalAlignment = Alignment.CenterVertically,
                 horizontalArrangement = Arrangement.Center
            ) {
               Text(
                  text = stringResource(id = R.string.debug_texts),
                  modifier = Modifier.align(Alignment.CenterVertically)
               )
               Spacer(modifier = Modifier.width(8.dp))
               Switch(
                   checked = isDebugLogs,
                   onCheckedChange = {
                      isDebugLogs = it
                   },
                   modifier = Modifier.align(Alignment.CenterVertically)
               )
            }
        }
        // dialog
        if (showDialog) {
            AlertDialog(
                onDismissRequest = { showDialog = false },
                title = {
                    Text(if (!isError) stringResource(id = R.string.finish_method) else stringResource(id = R.string.error_ocurred) )
                },
                text = {
                    SelectionContainer {
                        Text(dialogMessage)
                    }
                },
                confirmButton = {
                    Button(onClick = { showDialog = false }) {
                        Text("OK")
                    }
                }
            )
        }
    }
}