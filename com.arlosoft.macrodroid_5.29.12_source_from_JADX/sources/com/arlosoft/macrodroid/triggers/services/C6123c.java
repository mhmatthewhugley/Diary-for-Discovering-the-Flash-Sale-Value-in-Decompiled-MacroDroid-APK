package com.arlosoft.macrodroid.triggers.services;

import android.view.View;
import android.widget.TextView;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.triggers.services.c */
/* compiled from: FloatingTextService.kt */
public final class C6123c {

    /* renamed from: a */
    private final String f14561a;

    /* renamed from: b */
    private final View f14562b;

    /* renamed from: c */
    private final TextView f14563c;

    public C6123c(String str, View view, TextView textView) {
        C13706o.m87929f(str, "id");
        C13706o.m87929f(view, "container");
        C13706o.m87929f(textView, "textView");
        this.f14561a = str;
        this.f14562b = view;
        this.f14563c = textView;
    }

    /* renamed from: a */
    public final View mo32138a() {
        return this.f14562b;
    }

    /* renamed from: b */
    public final String mo32139b() {
        return this.f14561a;
    }

    /* renamed from: c */
    public final TextView mo32140c() {
        return this.f14563c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6123c)) {
            return false;
        }
        C6123c cVar = (C6123c) obj;
        return C13706o.m87924a(this.f14561a, cVar.f14561a) && C13706o.m87924a(this.f14562b, cVar.f14562b) && C13706o.m87924a(this.f14563c, cVar.f14563c);
    }

    public int hashCode() {
        return (((this.f14561a.hashCode() * 31) + this.f14562b.hashCode()) * 31) + this.f14563c.hashCode();
    }

    public String toString() {
        return "FloatingView(id=" + this.f14561a + ", container=" + this.f14562b + ", textView=" + this.f14563c + ')';
    }
}
