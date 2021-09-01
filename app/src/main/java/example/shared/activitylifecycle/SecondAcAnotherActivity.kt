package example.shared.activitylifecycle

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondAcAnotherActivity : AppCompatActivity() {
    val Tag="ActivityLog"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity_main)
        Log.i(Tag,"onCreate 1")
        findViewById<Button>(R.id.btnStartSecondActivity).setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.i(Tag,"onStart 1")
    }

    override fun onResume() {
        super.onResume()
        Log.i(Tag,"onResume 1")
    }

    override fun onPause() {
        super.onPause()
        Log.i(Tag,"onPause 1")
    }

    override fun onStop() {
        super.onStop()
        Log.i(Tag,"onStop 1")
    }
    override fun onRestart() {
        super.onRestart()
        Log.i(Tag,"onRestart 1")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(Tag,"onDestroy 1")
    }
}