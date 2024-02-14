package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.MessageListener;
import com.google.android.gms.nearby.messages.internal.Update;
import com.google.android.gms.nearby.messages.internal.zzn;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zznm extends zzn {

    /* renamed from: a */
    private final ListenerHolder f44971a;

    public zznm(ListenerHolder listenerHolder) {
        this.f44971a = listenerHolder;
    }

    /* renamed from: t1 */
    public static void m62821t1(Iterable iterable, MessageListener messageListener) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Update update = (Update) it.next();
            if (update.mo55925l2(1)) {
                messageListener.mo55896c(update.f47701d);
            }
            if (update.mo55925l2(2)) {
                messageListener.mo55897d(update.f47701d);
            }
            if (update.mo55925l2(4)) {
                messageListener.mo55895b(update.f47701d, update.f47702f);
            }
            if (update.mo55925l2(8)) {
                messageListener.mo55894a(update.f47701d, update.f47703g);
            }
            update.mo55925l2(16);
        }
    }

    /* renamed from: b1 */
    public final void mo53031b1(List list) throws RemoteException {
        this.f44971a.mo21377c(new zznl(this, list));
    }
}
