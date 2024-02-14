package com.arlosoft.macrodroid.database.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import org.apache.http.cookie.ClientCookie;
import p014b3.C1405a;

@Entity(tableName = "SubscriptionUpdateItem")
/* renamed from: com.arlosoft.macrodroid.database.room.p */
/* compiled from: SubscriptionUpdateItem.kt */
public final class C4419p {

    /* renamed from: j */
    public static final C4420a f11244j = new C4420a((C13695i) null);
    @PrimaryKey(autoGenerate = true)

    /* renamed from: a */
    private final long f11245a;

    /* renamed from: b */
    private final C4418o f11246b;

    /* renamed from: c */
    private final int f11247c;

    /* renamed from: d */
    private final String f11248d;

    /* renamed from: e */
    private final String f11249e;

    /* renamed from: f */
    private final int f11250f;

    /* renamed from: g */
    private final String f11251g;

    /* renamed from: h */
    private final String f11252h;

    /* renamed from: i */
    private final long f11253i;

    /* renamed from: com.arlosoft.macrodroid.database.room.p$a */
    /* compiled from: SubscriptionUpdateItem.kt */
    public static final class C4420a {
        private C4420a() {
        }

        public /* synthetic */ C4420a(C13695i iVar) {
            this();
        }
    }

    public C4419p(long j, C4418o oVar, int i, String str, String str2, int i2, String str3, String str4, long j2) {
        C13706o.m87929f(oVar, "type");
        C13706o.m87929f(str, "macroName");
        C13706o.m87929f(str2, "username");
        C13706o.m87929f(str3, "userImage");
        C13706o.m87929f(str4, ClientCookie.COMMENT_ATTR);
        this.f11245a = j;
        this.f11246b = oVar;
        this.f11247c = i;
        this.f11248d = str;
        this.f11249e = str2;
        this.f11250f = i2;
        this.f11251g = str3;
        this.f11252h = str4;
        this.f11253i = j2;
    }

    /* renamed from: a */
    public final String mo28754a() {
        return this.f11252h;
    }

    /* renamed from: b */
    public final long mo28755b() {
        return this.f11245a;
    }

    /* renamed from: c */
    public final int mo28756c() {
        return this.f11247c;
    }

    /* renamed from: d */
    public final String mo28757d() {
        return this.f11248d;
    }

    /* renamed from: e */
    public final long mo28758e() {
        return this.f11253i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4419p)) {
            return false;
        }
        C4419p pVar = (C4419p) obj;
        return this.f11245a == pVar.f11245a && this.f11246b == pVar.f11246b && this.f11247c == pVar.f11247c && C13706o.m87924a(this.f11248d, pVar.f11248d) && C13706o.m87924a(this.f11249e, pVar.f11249e) && this.f11250f == pVar.f11250f && C13706o.m87924a(this.f11251g, pVar.f11251g) && C13706o.m87924a(this.f11252h, pVar.f11252h) && this.f11253i == pVar.f11253i;
    }

    /* renamed from: f */
    public final C4418o mo28760f() {
        return this.f11246b;
    }

    /* renamed from: g */
    public final int mo28761g() {
        return this.f11250f;
    }

    /* renamed from: h */
    public final String mo28762h() {
        return this.f11251g;
    }

    public int hashCode() {
        return (((((((((((((((C1405a.m633a(this.f11245a) * 31) + this.f11246b.hashCode()) * 31) + this.f11247c) * 31) + this.f11248d.hashCode()) * 31) + this.f11249e.hashCode()) * 31) + this.f11250f) * 31) + this.f11251g.hashCode()) * 31) + this.f11252h.hashCode()) * 31) + C1405a.m633a(this.f11253i);
    }

    /* renamed from: i */
    public final String mo28764i() {
        return this.f11249e;
    }

    public String toString() {
        return "SubscriptionUpdateItem(id=" + this.f11245a + ", type=" + this.f11246b + ", macroId=" + this.f11247c + ", macroName=" + this.f11248d + ", username=" + this.f11249e + ", userId=" + this.f11250f + ", userImage=" + this.f11251g + ", comment=" + this.f11252h + ", timestamp=" + this.f11253i + ')';
    }
}
