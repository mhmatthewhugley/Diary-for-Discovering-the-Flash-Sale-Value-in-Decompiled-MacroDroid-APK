package com.arlosoft.macrodroid.triggers.services;

import android.content.Intent;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.arlosoft.macrodroid.triggers.OutgoingCallTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;

public class OutgoingCallCheckerService extends BaseCallCheckerService {
    public OutgoingCallCheckerService() {
        super("OutgoingCallCheckerService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo32006d(Trigger trigger) {
        return trigger instanceof OutgoingCallTrigger;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo32007e(Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }
}
