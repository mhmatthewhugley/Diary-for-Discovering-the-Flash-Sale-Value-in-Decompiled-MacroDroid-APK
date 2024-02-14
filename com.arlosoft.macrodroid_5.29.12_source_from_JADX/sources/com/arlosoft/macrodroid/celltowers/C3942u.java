package com.arlosoft.macrodroid.celltowers;

import android.os.PowerManager;
import java.util.ArrayList;

/* renamed from: com.arlosoft.macrodroid.celltowers.u */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3942u implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ArrayList f10254a;

    /* renamed from: c */
    public final /* synthetic */ PowerManager.WakeLock f10255c;

    public /* synthetic */ C3942u(ArrayList arrayList, PowerManager.WakeLock wakeLock) {
        this.f10254a = arrayList;
        this.f10255c = wakeLock;
    }

    public final void run() {
        CellTowerService.m15257c(this.f10254a, this.f10255c);
    }
}
