package com.google.android.gms.auth.api.signin;

import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final /* synthetic */ class zaa implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ zaa f2946a = new zaa();

    private /* synthetic */ zaa() {
    }

    public final int compare(Object obj, Object obj2) {
        Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
        return ((Scope) obj).mo21286l2().compareTo(((Scope) obj2).mo21286l2());
    }
}
