package com.decagon.decagonclassroom

import android.content.Intent
import android.os.Bundle
import android.util.Patterns
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        submit_button.setOnClickListener {
            if (email_input.text.toString().isEmpty()) {
                email_input.setBackgroundResource(R.drawable.edit_text_error)
                error_text_reg.text = getString(
                    resources.getIdentifier(
                        "app_register_error1",
                        "string",
                        "com.decagon.decagonclassroom"
                    )
                )
            } else if (validateEmail(email_input.text.toString())) {
                email_input.setBackgroundResource(R.drawable.edit_text_error)
                error_text_reg.text = getString(
                    resources.getIdentifier(
                        "app_register_error",
                        "string",
                        "com.decagon.decagonclassroom"
                    )
                )
            } else {
                startActivity(Intent(applicationContext, VerificationActivity::class.java))
            }
        }

        email_input.addTextChangedListener {
            email_input.setBackgroundResource(R.drawable.edit_text_bg)
            error_text_reg.text = ""
        }
    }

    fun validateEmail(string: String): Boolean {
        return !Patterns.EMAIL_ADDRESS.matcher(string).matches()
    }
}
