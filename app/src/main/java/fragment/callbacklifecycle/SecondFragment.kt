package fragment.callbacklifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class SecondFragment : Fragment() {
    val TAgS = "SecondFragment"
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAgS, "onAttach Call")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAgS, "onCreate Call")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d(TAgS, "onCreateView Call")
        return inflater.inflate(R.layout.fragment_normal, container, false)

    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.d(TAgS, "onActivityCreated Call")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAgS, "onStart Call")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAgS, "onResume Call")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAgS, "onPause Call")
    }


    override fun onStop() {
        super.onStop()
        Log.d(TAgS, "onStop Call")
    }


    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAgS, "onDestroyView Call")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAgS, "onDestroy Call")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAgS, "onDetach Call")
    }
}