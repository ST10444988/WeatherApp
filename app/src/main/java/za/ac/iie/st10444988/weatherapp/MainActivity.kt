package za.ac.iie.st10444988.weatherapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AlertDialog
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.Days
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.FRIDAY
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
            @SuppressLint("MissingInflatedId")
            override fun onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
                setContentView(R.layout.activity_main)

                val btnSplashScreen = findViewById<Button>(R.id.btnMainActivity)
                btnSplashScreen.setOnClickListener {
                    val intent = Intent(this, SplashScreen::class.java)
                    startActivity(intent)
                }
            }
            private fun showAddTempDialog() {
                val input = EditText(this)
                val dialog = AlertDialog.Builder(this)
                    .setTitle("Enter Temperature")
                    .setView(input)
                    .setPositiveButton("OK") { _, _ ->
                        val temp = input.text.toString().toDoubleOrNull() ?: return@setPositiveButton

                    }
                    .setNegativeButton("Cancel", null)
                    .create()
                dialog.show()
            }


                }
            }