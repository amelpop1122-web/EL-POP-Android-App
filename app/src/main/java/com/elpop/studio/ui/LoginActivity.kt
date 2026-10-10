package com.elpop.studio.ui

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.elpop.studio.R

class LoginActivity : AppCompatActivity() {

    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var registerText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Initialize views
        emailEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        loginButton = findViewById(R.id.loginButton)
        registerText = findViewById(R.id.registerText)

        // Login button click listener
        loginButton.setOnClickListener {
            performLogin()
        }

        // Register text click listener
        registerText.setOnClickListener {
            startActivity(Intent(this, RegisterActivity::class.java))
        }
    }

    private fun performLogin() {
        val email = emailEditText.text.toString().trim()
        val password = passwordEditText.text.toString().trim()

        when {
            email.isEmpty() -> {
                showError("يرجى إدخال البريد الإلكتروني")
                emailEditText.requestFocus()
            }
            password.isEmpty() -> {
                showError("يرجى إدخال كلمة المرور")
                passwordEditText.requestFocus()
            }
            !isValidEmail(email) -> {
                showError("البريد الإلكتروني غير صحيح")
                emailEditText.requestFocus()
            }
            password.length < 6 -> {
                showError("كلمة المرور يجب أن تكون 6 أحرف على الأقل")
                passwordEditText.requestFocus()
            }
            else -> {
                // Simulate login (in real app, call API)
                loginButton.isEnabled = false
                loginButton.text = "جاري التسجيل..."
                
                Thread {
                    Thread.sleep(1500)
                    runOnUiThread {
                        showSuccess("تم تسجيل الدخول بنجاح!")
                        navigateToMain()
                    }
                }.start()
            }
        }
    }

    private fun isValidEmail(email: String): Boolean {
        return android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()
    }

    private fun showError(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun showSuccess(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun navigateToMain() {
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        startActivity(intent)
        finish()
    }
}
