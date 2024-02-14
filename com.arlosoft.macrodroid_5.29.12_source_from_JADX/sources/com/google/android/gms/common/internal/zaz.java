package com.google.android.gms.common.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.RemoteCreator;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zaz extends RemoteCreator {

    /* renamed from: c */
    private static final zaz f3739c = new zaz();

    private zaz() {
        super("com.google.android.gms.common.ui.SignInButtonCreatorImpl");
    }

    /* renamed from: c */
    public static View m4659c(Context context, int i, int i2) throws RemoteCreator.RemoteCreatorException {
        zaz zaz = f3739c;
        try {
            zax zax = new zax(1, i, i2, (Scope[]) null);
            return (View) ObjectWrapper.m5050A1(((zam) zaz.mo22049b(context)).mo21765Z8(ObjectWrapper.m5051g8(context), zax));
        } catch (Exception e) {
            throw new RemoteCreator.RemoteCreatorException("Could not get button with size " + i + " and color " + i2, e);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo20096a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ISignInButtonCreator");
        return queryLocalInterface instanceof zam ? (zam) queryLocalInterface : new zam(iBinder);
    }
}
