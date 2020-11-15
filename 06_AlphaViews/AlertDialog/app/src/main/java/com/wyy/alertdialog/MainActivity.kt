package com.wyy.alertdialog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.DialogFragment
import com.wyy.alertdialog.modules.one.OneDialogFragment

class MainActivity : AppCompatActivity() {
    val mDialogFragment = DialogFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        windowManager
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().add(R.id.fl_main, DialogFragment(), "123").commit()
    }
}
