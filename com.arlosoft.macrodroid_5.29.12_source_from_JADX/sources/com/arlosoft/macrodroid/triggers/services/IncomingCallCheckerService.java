package com.arlosoft.macrodroid.triggers.services;

import com.arlosoft.macrodroid.triggers.IncomingCallTrigger;
import com.arlosoft.macrodroid.triggers.Trigger;

public class IncomingCallCheckerService extends BaseCallCheckerService {
    public IncomingCallCheckerService() {
        super("IncomingCallCheckerService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public boolean mo32006d(Trigger trigger) {
        return trigger instanceof IncomingCallTrigger;
    }
}
