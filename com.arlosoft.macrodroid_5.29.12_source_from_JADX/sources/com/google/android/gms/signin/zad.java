package com.google.android.gms.signin;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ShowFirstParty;

/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class zad {

    /* renamed from: a */
    public static final Api.ClientKey f47962a;
    @ShowFirstParty

    /* renamed from: b */
    public static final Api.ClientKey f47963b;

    /* renamed from: c */
    public static final Api.AbstractClientBuilder f47964c;

    /* renamed from: d */
    static final Api.AbstractClientBuilder f47965d;

    /* renamed from: e */
    public static final Scope f47966e = new Scope("profile");

    /* renamed from: f */
    public static final Scope f47967f = new Scope(NotificationCompat.CATEGORY_EMAIL);

    /* renamed from: g */
    public static final Api f47968g;

    /* renamed from: h */
    public static final Api f47969h;

    static {
        Api.ClientKey clientKey = new Api.ClientKey();
        f47962a = clientKey;
        Api.ClientKey clientKey2 = new Api.ClientKey();
        f47963b = clientKey2;
        zaa zaa = new zaa();
        f47964c = zaa;
        zab zab = new zab();
        f47965d = zab;
        f47968g = new Api("SignIn.API", zaa, clientKey);
        f47969h = new Api("SignIn.INTERNAL_API", zab, clientKey2);
    }
}
