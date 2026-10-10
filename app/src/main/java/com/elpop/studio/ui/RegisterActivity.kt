package com.elpop.studio.ui

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.elpop.studio.R

class RegisterActivity : AppCompatActivity() {

    private lateinit var nameEditText: EditText
    private lateinit var emailEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var confirmPasswordEditText: EditText
    private lateinit var registerButton: Button
    private lateinit var backButton: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Initialize views
        nameEditText = findViewById(R.id.nameEditText)
        emailEditText = findViewById(R.id.emailEditText)
        passwordEditText = findViewById(R.id.passwordEditText)
        confirmPasswordEditText = findViewById(R.id.confirmPasswordEditText)
        registerButton = findViewById(R.id.registerButton)
        backButton = findViewById(R.id.backButton)

        // Register button click listener
        registerButton.setOnClickListener {
            performRegister()
        }

        // Back button click listener
        backButton.setOnClickListener {
            finish()
        }
    }

    private fun performRegister() {
        val name = nameEditText.text.toString().trim()
        val email = emailEditText.text.toString().trim()
        val password = passwordEditText.text.toString().trim()
        val confirmPassword = confirmPasswordEditText.text.toString().trim()

        when {
            name.isEmpty() -> showError("يرجى إدخال الاسم")
            email.isEmpty() -> showError("يرجى إدخال البريد الإلكتروني")
            !isValidEmail(email) -> showError("البريد الإلكتروني غير صحيح")
            password.isEmpty() -> showError("يرجى إدخال كلمة المرور")
            password.length < 6 -> showError("كلمة المرور يجب أن تكون 6 أحرف على الأقل")
            confirmPassword.isEmpty() -> showError("يرجى تأكيد كلمة المرور")
            password != confirmPassword -> showError("كلمات المرور غير متطابقة")
            else -> {
                registerButton.isEnabled = false
                registerButton.text = "جاري إنشاء الحساب..."
                
                Thread {
                    Thread.sleep(1500)
                    runOnUiThread {
                        showSuccess("تم إنشاء الحساب بنجاح!")
                        finish()
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
}
