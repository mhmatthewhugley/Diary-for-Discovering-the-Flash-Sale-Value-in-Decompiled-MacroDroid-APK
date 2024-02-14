package com.google.mlkit.common.sdkinternal;

import android.content.Context;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;

/* compiled from: com.google.mlkit:common@@18.5.0 */
public final /* synthetic */ class zzs implements ComponentFactory {

    /* renamed from: a */
    public static final /* synthetic */ zzs f56425a = new zzs();

    private /* synthetic */ zzs() {
    }

    /* renamed from: a */
    public final Object mo16829a(ComponentContainer componentContainer) {
        return new SharedPrefManager((Context) componentContainer.mo22868a(Context.class));
    }
}
