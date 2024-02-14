package com.google.android.play.core.internal;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.play:core@@1.10.3 */
public abstract class zzo extends zzl implements zzp {
    /* renamed from: t1 */
    public static zzp m70979t1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return queryLocalInterface instanceof zzp ? (zzp) queryLocalInterface : new zzn(iBinder);
    }
}
