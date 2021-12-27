package fragment.callbacklifecycle

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    val Tag = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e(Tag, "onCreate Call")

        val BtnSecond = findViewById<Button>(R.id.BtnSecond)
        val normalFragment = NormalFragment()
        val ft = supportFragmentManager.beginTransaction()
        ft.add(R.id.layoutContainer, normalFragment)
       ft.addToBackStack(null)
        ft.commit()

        BtnSecond.setOnClickListener {
            val secondFragment = SecondFragment()
            val ft = supportFragmentManager.beginTransaction()
            ft.replace(R.id.layoutContainer, secondFragment)
            ft.addToBackStack(null)
            ft.commit()
        }
    }

    override fun onStart() {
        super.onStart()
        Log.e(Tag, "onStart Call")
    }

    override fun onResume() {
        super.onResume()
        Log.e(Tag, "onResume Call")
    }

    override fun onPause() {
        super.onPause()
        Log.e(Tag, "onPause Call")
    }
    override fun onRestart() {
        super.onRestart()
        Log.e(Tag, "onRestart Call")
    }
    override fun onStop() {
        super.onStop()
        Log.e(Tag, "onStop Call")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(Tag, "onDestroy Call")
    }

}