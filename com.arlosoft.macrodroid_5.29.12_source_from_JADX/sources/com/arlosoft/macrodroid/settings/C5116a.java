package com.arlosoft.macrodroid.settings;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.settings.a */
/* compiled from: AppPreferences.kt */
public final class C5116a {

    /* renamed from: a */
    private final Context f12853a;

    /* renamed from: b */
    private final SharedPreferences f12854b;

    public C5116a(Context context) {
        C13706o.m87929f(context, "context");
        this.f12853a = context;
        this.f12854b = PreferenceManager.getDefaultSharedPreferences(context);
    }

    /* renamed from: a */
    public final boolean mo30101a() {
        return this.f12854b.getBoolean("auto_translate_templates", true);
    }
}
