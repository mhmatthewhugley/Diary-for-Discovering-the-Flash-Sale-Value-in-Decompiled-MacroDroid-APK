package com.arlosoft.macrodroid.database;

import com.arlosoft.macrodroid.triggers.TriggerContextInfo;
import kotlin.jvm.internal.C13706o;
import p014b3.C1405a;

/* renamed from: com.arlosoft.macrodroid.database.d */
/* compiled from: FloatingTextData.kt */
public final class C4378d {

    /* renamed from: a */
    private final String f11146a;

    /* renamed from: b */
    private final String f11147b;

    /* renamed from: c */
    private final float f11148c;

    /* renamed from: d */
    private final float f11149d;

    /* renamed from: e */
    private final int f11150e;

    /* renamed from: f */
    private final int f11151f;

    /* renamed from: g */
    private final int f11152g;

    /* renamed from: h */
    private final int f11153h;

    /* renamed from: i */
    private final int f11154i;

    /* renamed from: j */
    private final int f11155j;

    /* renamed from: k */
    private final int f11156k;

    /* renamed from: l */
    private final boolean f11157l;

    /* renamed from: m */
    private final long f11158m;

    /* renamed from: n */
    private final TriggerContextInfo f11159n;

    public C4378d(String str, String str2, float f, float f2, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, long j, TriggerContextInfo triggerContextInfo) {
        C13706o.m87929f(str, "id");
        C13706o.m87929f(str2, "text");
        this.f11146a = str;
        this.f11147b = str2;
        this.f11148c = f;
        this.f11149d = f2;
        this.f11150e = i;
        this.f11151f = i2;
        this.f11152g = i3;
        this.f11153h = i4;
        this.f11154i = i5;
        this.f11155j = i6;
        this.f11156k = i7;
        this.f11157l = z;
        this.f11158m = j;
        this.f11159n = triggerContextInfo;
    }

    /* renamed from: a */
    public final int mo28660a() {
        return this.f11155j;
    }

    /* renamed from: b */
    public final int mo28661b() {
        return this.f11156k;
    }

    /* renamed from: c */
    public final int mo28662c() {
        return this.f11151f;
    }

    /* renamed from: d */
    public final int mo28663d() {
        return this.f11154i;
    }

    /* renamed from: e */
    public final String mo28664e() {
        return this.f11146a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4378d)) {
            return false;
        }
        C4378d dVar = (C4378d) obj;
        return C13706o.m87924a(this.f11146a, dVar.f11146a) && C13706o.m87924a(this.f11147b, dVar.f11147b) && C13706o.m87924a(Float.valueOf(this.f11148c), Float.valueOf(dVar.f11148c)) && C13706o.m87924a(Float.valueOf(this.f11149d), Float.valueOf(dVar.f11149d)) && this.f11150e == dVar.f11150e && this.f11151f == dVar.f11151f && this.f11152g == dVar.f11152g && this.f11153h == dVar.f11153h && this.f11154i == dVar.f11154i && this.f11155j == dVar.f11155j && this.f11156k == dVar.f11156k && this.f11157l == dVar.f11157l && this.f11158m == dVar.f11158m && C13706o.m87924a(this.f11159n, dVar.f11159n);
    }

    /* renamed from: f */
    public final long mo28666f() {
        return this.f11158m;
    }

    /* renamed from: g */
    public final int mo28667g() {
        return this.f11153h;
    }

    /* renamed from: h */
    public final String mo28668h() {
        return this.f11147b;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((this.f11146a.hashCode() * 31) + this.f11147b.hashCode()) * 31) + Float.floatToIntBits(this.f11148c)) * 31) + Float.floatToIntBits(this.f11149d)) * 31) + this.f11150e) * 31) + this.f11151f) * 31) + this.f11152g) * 31) + this.f11153h) * 31) + this.f11154i) * 31) + this.f11155j) * 31) + this.f11156k) * 31;
        boolean z = this.f11157l;
        if (z) {
            z = true;
        }
        int a = (((hashCode + (z ? 1 : 0)) * 31) + C1405a.m633a(this.f11158m)) * 31;
        TriggerContextInfo triggerContextInfo = this.f11159n;
        return a + (triggerContextInfo == null ? 0 : triggerContextInfo.hashCode());
    }

    /* renamed from: i */
    public final int mo28670i() {
        return this.f11150e;
    }

    /* renamed from: j */
    public final int mo28671j() {
        return this.f11152g;
    }

    /* renamed from: k */
    public final TriggerContextInfo mo28672k() {
        return this.f11159n;
    }

    /* renamed from: l */
    public final float mo28673l() {
        return this.f11148c;
    }

    /* renamed from: m */
    public final float mo28674m() {
        return this.f11149d;
    }

    /* renamed from: n */
    public final boolean mo28675n() {
        return this.f11157l;
    }

    public String toString() {
        return "FloatingTextData(id=" + this.f11146a + ", text=" + this.f11147b + ", xPosition=" + this.f11148c + ", yPosition=" + this.f11149d + ", textColor=" + this.f11150e + ", bgColor=" + this.f11151f + ", textSize=" + this.f11152g + ", padding=" + this.f11153h + ", corners=" + this.f11154i + ", alignemnt=" + this.f11155j + ", alpha=" + this.f11156k + ", isVisible=" + this.f11157l + ", macroId=" + this.f11158m + ", triggerContextInfo=" + this.f11159n + ')';
    }
}
