package com.arlosoft.macrodroid.upgrade;

import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;

/* renamed from: com.arlosoft.macrodroid.upgrade.b */
/* compiled from: UpgradeBlurbItem.kt */
public final class C6300b {

    /* renamed from: a */
    private final int f14846a;

    /* renamed from: b */
    private final int f14847b;

    /* renamed from: c */
    private final int f14848c;

    public C6300b(@StringRes int i, @StringRes int i2, @DrawableRes int i3) {
        this.f14846a = i;
        this.f14847b = i2;
        this.f14848c = i3;
    }

    /* renamed from: a */
    public final int mo32343a() {
        return this.f14847b;
    }

    /* renamed from: b */
    public final int mo32344b() {
        return this.f14848c;
    }

    /* renamed from: c */
    public final int mo32345c() {
        return this.f14846a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6300b)) {
            return false;
        }
        C6300b bVar = (C6300b) obj;
        return this.f14846a == bVar.f14846a && this.f14847b == bVar.f14847b && this.f14848c == bVar.f14848c;
    }

    public int hashCode() {
        return (((this.f14846a * 31) + this.f14847b) * 31) + this.f14848c;
    }

    public String toString() {
        return "UpgradeBlurbItem(title=" + this.f14846a + ", description=" + this.f14847b + ", image=" + this.f14848c + ')';
    }
}
