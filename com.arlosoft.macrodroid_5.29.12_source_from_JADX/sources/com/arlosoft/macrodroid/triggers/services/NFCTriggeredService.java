package com.arlosoft.macrodroid.triggers.services;

import android.app.IntentService;
import android.content.Intent;
import android.nfc.NdefMessage;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.util.Log;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import com.arlosoft.macrodroid.triggers.NFCTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import java.util.ArrayList;
import java.util.Iterator;
import p148q0.C8151a;

public class NFCTriggeredService extends IntentService {

    /* renamed from: a */
    private Handler f14500a = new Handler(Looper.getMainLooper());

    public NFCTriggeredService() {
        super("NFCTriggeredService");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static /* synthetic */ void m24176b(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Macro macro = (Macro) it.next();
            macro.invokeActions(macro.getTriggerContextInfo());
        }
    }

    /* access modifiers changed from: protected */
    public void onHandleIntent(Intent intent) {
        String str;
        Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("android.nfc.extra.NDEF_MESSAGES");
        if (parcelableArrayExtra != null) {
            NdefMessage[] ndefMessageArr = new NdefMessage[parcelableArrayExtra.length];
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < parcelableArrayExtra.length; i++) {
                ndefMessageArr[i] = (NdefMessage) parcelableArrayExtra[i];
                try {
                    str = new String(ndefMessageArr[i].getRecords()[0].getType()).substring(17);
                } catch (Exception unused) {
                    Log.w("NFCTriggeredService", "Exeption while obtaining tag name");
                    str = "";
                }
                C8151a.m33860a("NFC Trigger service");
                for (Macro next : C4934n.m18998M().mo29679I()) {
                    Iterator<Trigger> it = next.getTriggerListWithAwaitingActions().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Trigger next2 = it.next();
                        if (next2 == null) {
                            C8151a.m33873n(new RuntimeException("Null Trigger detected in NFCTriggeredService"));
                        } else if (next2 instanceof NFCTrigger) {
                            NFCTrigger nFCTrigger = (NFCTrigger) next2;
                            if (nFCTrigger.mo31347m3() != null && nFCTrigger.mo31347m3().equals(str) && next2.mo31374R2()) {
                                next.setTriggerThatInvoked(next2);
                                if (next.canInvoke(next.getTriggerContextInfo())) {
                                    arrayList.add(next);
                                }
                            }
                        } else {
                            continue;
                        }
                    }
                }
            }
            if (arrayList.size() > 0) {
                this.f14500a.post(new C6129h(arrayList));
            }
        }
    }
}
