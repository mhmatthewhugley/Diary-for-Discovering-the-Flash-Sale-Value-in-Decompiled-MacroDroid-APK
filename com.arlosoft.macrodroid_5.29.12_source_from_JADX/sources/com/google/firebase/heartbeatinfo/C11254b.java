package com.google.firebase.heartbeatinfo;

import android.content.Context;
import com.google.firebase.inject.Provider;

/* renamed from: com.google.firebase.heartbeatinfo.b */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C11254b implements Provider {

    /* renamed from: a */
    public final /* synthetic */ Context f54816a;

    /* renamed from: b */
    public final /* synthetic */ String f54817b;

    public /* synthetic */ C11254b(Context context, String str) {
        this.f54816a = context;
        this.f54817b = str;
    }

    public final Object get() {
        return DefaultHeartBeatController.m76547k(this.f54816a, this.f54817b);
    }
}
