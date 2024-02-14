package com.arlosoft.macrodroid.triggers.services;

import android.content.Intent;
import com.arlosoft.macrodroid.triggers.CallActiveTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;
import com.arlosoft.macrodroid.utils.C6398k0;

public class CallActiveCheckerService extends BaseCallCheckerService {
    public CallActiveCheckerService() {
        super("CallActiveCheckerService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo32006d(Trigger trigger) {
        return trigger instanceof CallActiveTrigger;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public String mo32008f(Intent intent) {
        String str = C6398k0.f15004a;
        return str != null ? str : "";
    }
}
