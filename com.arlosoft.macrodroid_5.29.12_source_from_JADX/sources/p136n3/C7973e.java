package p136n3;

import android.content.Intent;
import android.telephony.PhoneStateListener;
import androidx.work.WorkRequest;
import com.arlosoft.macrodroid.app.MacroDroidApplication;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.triggers.services.IncomingCallCheckerService;
import p148q0.C8151a;

/* renamed from: n3.e */
/* compiled from: IncomingCallTriggerReceiver */
public class C7973e extends PhoneStateListener {

    /* renamed from: a */
    private static long f19120a;

    public void onCallStateChanged(int i, String str) {
        if (i == 1) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - f19120a > WorkRequest.MIN_BACKOFF_MILLIS) {
                    f19120a = currentTimeMillis;
                    try {
                        Intent intent = new Intent(MacroDroidApplication.m14845u(), IncomingCallCheckerService.class);
                        intent.putExtra("PhoneNumber", str);
                        MacroDroidApplication.m14845u().startService(intent);
                    } catch (Exception e) {
                        C4878b.m18868g("Cannot start call checker service: " + e);
                        C8151a.m33873n(e);
                    }
                }
            } catch (Exception e2) {
                C8151a.m33873n(e2);
            }
        }
    }
}
