package fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.navigation.R

class NotificationFragment: Fragment(R.layout.fragment_notification) {

    private lateinit var textView: TextView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        textView = view.findViewById(R.id.textView)
        textView.text = NotificationFragmentArgs.fromBundle(requireArguments()).name
    }
}