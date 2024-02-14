package com.arlosoft.macrodroid.triggers.services;

import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.arlosoft.macrodroid.triggers.CallEndedTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.utils.C6398k0;

public class CallEndedCheckerService extends BaseCallCheckerService {
    public CallEndedCheckerService() {
        super("CallEndedCheckerService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo32006d(Trigger trigger) {
        return trigger instanceof CallEndedTrigger;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo32007e(Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo32008f(Intent intent) {
        return C6398k0.f15004a;
    }
}
