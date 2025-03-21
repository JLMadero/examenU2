package mx.edu.itson.potros.examenu2

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class detalle_detalles : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_detalles)
        val iv_regalo_imagen: ImageView = findViewById(R.id.iv_regalo_imagen)
        val tv_regalo_precio: TextView =findViewById(R.id.tv_regalo_precio)

        val bundle = intent.extras
        if (bundle != null) {
            iv_regalo_imagen.setImageResource(bundle.getInt("imagen"))
            tv_regalo_precio.setText(bundle.getString("precio"))
        }

    }
}