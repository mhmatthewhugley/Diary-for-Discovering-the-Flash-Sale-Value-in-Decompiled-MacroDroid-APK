package com.arlosoft.macrodroid.triggers;

import com.arlosoft.macrodroid.triggers.receivers.OutgoingCallMonitor;

/* renamed from: com.arlosoft.macrodroid.triggers.o1 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6026o1 implements Runnable {

    /* renamed from: a */
    public static final /* synthetic */ C6026o1 f14246a = new C6026o1();

    private /* synthetic */ C6026o1() {
    }

    public final void run() {
        CallActiveTrigger.s_outgoingCallMonitor = new OutgoingCallMonitor();
    }
}
