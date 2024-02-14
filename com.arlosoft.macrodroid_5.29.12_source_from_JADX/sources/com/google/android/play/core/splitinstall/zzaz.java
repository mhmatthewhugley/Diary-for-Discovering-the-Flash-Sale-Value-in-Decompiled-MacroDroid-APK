package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.play.core.tasks.zzi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:core@@1.10.3 */
final class zzaz extends zzbb {
    zzaz(zzbc zzbc, zzi zzi) {
        super(zzbc, zzi);
    }

    /* renamed from: P1 */
    public final void mo59854P1(List list) throws RemoteException {
        super.mo59854P1(list);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(SplitInstallSessionState.m71111n((Bundle) it.next()));
        }
        this.f51914a.mo60034e(arrayList);
    }
}
