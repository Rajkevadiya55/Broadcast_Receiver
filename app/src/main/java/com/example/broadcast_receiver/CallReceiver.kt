package com.example.broadcast_receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telecom.TelecomManager
import android.telephony.TelephonyManager
import android.view.Gravity
import android.widget.Toast

class CallReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if (intent!!.getStringExtra(TelephonyManager.EXTRA_STATE) == TelephonyManager.EXTRA_STATE_OFFHOOK
        ){
            showToastMsg(context!!,"Phone Call is Stared...")
        }else if(
            intent!!.getStringExtra(TelephonyManager.EXTRA_STATE) == TelephonyManager.EXTRA_STATE_RINGING
        ) {
            showToastMsg(context!!,"Incoming Call...")
        }else if(
                intent!!.getStringExtra(TelephonyManager.EXTRA_STATE) == TelephonyManager.EXTRA_STATE_IDLE
        )
            showToastMsg(context!!,"Call cut...")
    }
  fun showToastMsg(c:Context,msg:String){
      val toast=Toast.makeText(c,msg,Toast.LENGTH_LONG)
      toast.setGravity(Gravity.CENTER,0,0)
      toast.show()
  }
}