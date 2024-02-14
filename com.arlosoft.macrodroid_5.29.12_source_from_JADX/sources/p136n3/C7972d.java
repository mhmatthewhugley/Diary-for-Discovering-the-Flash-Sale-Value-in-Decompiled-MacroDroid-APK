package p136n3;

import android.telephony.PhoneStateListener;
import com.arlosoft.macrodroid.utils.C6398k0;

/* renamed from: n3.d */
/* compiled from: IncomingCallMonitor */
public class C7972d extends PhoneStateListener {
    public void onCallStateChanged(int i, String str) {
        if (i == 1) {
            C6398k0.f15004a = str;
        }
    }
}
