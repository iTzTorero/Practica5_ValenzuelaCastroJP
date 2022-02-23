package valenzuela.juan.thecheezery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById<Button>(R.id.btn_get_started)

        button.setOnClickListener {
            var intent:Intent=Intent(this,registerActivity::class.java)
            startActivity(intent)
        }
    }
}