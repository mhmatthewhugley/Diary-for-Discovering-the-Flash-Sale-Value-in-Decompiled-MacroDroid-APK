package com.arlosoft.macrodroid.action.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import java.util.HashMap;

public class KeepAwakeActionFinishedHandler extends BroadcastReceiver {

    /* renamed from: a */
    private static final HashMap<Integer, PowerManager.WakeLock> f9043a = new HashMap<>();

    /* renamed from: a */
    public static void m14299a(int i, PowerManager.WakeLock wakeLock) {
        f9043a.put(Integer.valueOf(i), wakeLock);
    }

    public void onReceive(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("WakeLockId", -1);
        HashMap<Integer, PowerManager.WakeLock> hashMap = f9043a;
        PowerManager.WakeLock wakeLock = hashMap.get(Integer.valueOf(intExtra));
        if (wakeLock != null) {
            if (wakeLock.isHeld()) {
                wakeLock.release();
            }
            hashMap.remove(Integer.valueOf(intExtra));
        }
    }
}
