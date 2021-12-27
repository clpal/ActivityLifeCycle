package fragment.callbacklifecycle

import android.content.Context
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class NormalFragment : Fragment() {
    val TagN = "NormalFragment"
    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e(TagN, "onAttach Call")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TagN, "onCreate Call")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.e(TagN, "onCreateView Call")
        return inflater.inflate(R.layout.fragment_normal, container, false)

    }


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e(TagN, "onActivityCreated Call")
    }

    override fun onStart() {
        super.onStart()
        Log.e(TagN, "onStart Call")
    }

    override fun onResume() {
        super.onResume()
        Log.e(TagN, "onResume Call")
    }

    override fun onPause() {
        super.onPause()
        Log.e(TagN, "onPause Call")
    }


    override fun onStop() {
        super.onStop()
        Log.e(TagN, "onStop Call")
    }


    override fun onDestroyView() {
        super.onDestroyView()
        Log.e(TagN, "onDestroyView Call")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e(TagN, "onDestroy Call")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e(TagN, "onDetach Call")
    }
}