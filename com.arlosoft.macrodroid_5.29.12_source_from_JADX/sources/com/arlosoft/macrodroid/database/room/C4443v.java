package com.arlosoft.macrodroid.database.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Entity(tableName = "UserSubscription")
/* renamed from: com.arlosoft.macrodroid.database.room.v */
/* compiled from: UserSubscription.kt */
public final class C4443v {

    /* renamed from: d */
    public static final C4444a f11289d = new C4444a((C13695i) null);
    @PrimaryKey

    /* renamed from: a */
    private final int f11290a;

    /* renamed from: b */
    private final String f11291b;

    /* renamed from: c */
    private final String f11292c;

    /* renamed from: com.arlosoft.macrodroid.database.room.v$a */
    /* compiled from: UserSubscription.kt */
    public static final class C4444a {
        private C4444a() {
        }

        public /* synthetic */ C4444a(C13695i iVar) {
            this();
        }
    }

    public C4443v(int i, String str, String str2) {
        C13706o.m87929f(str, "userName");
        C13706o.m87929f(str2, "userImage");
        this.f11290a = i;
        this.f11291b = str;
        this.f11292c = str2;
    }

    /* renamed from: a */
    public final int mo28794a() {
        return this.f11290a;
    }

    /* renamed from: b */
    public final String mo28795b() {
        return this.f11292c;
    }

    /* renamed from: c */
    public final String mo28796c() {
        return this.f11291b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4443v)) {
            return false;
        }
        C4443v vVar = (C4443v) obj;
        return this.f11290a == vVar.f11290a && C13706o.m87924a(this.f11291b, vVar.f11291b) && C13706o.m87924a(this.f11292c, vVar.f11292c);
    }

    public int hashCode() {
        return (((this.f11290a * 31) + this.f11291b.hashCode()) * 31) + this.f11292c.hashCode();
    }

    public String toString() {
        return "UserSubscription(userId=" + this.f11290a + ", userName=" + this.f11291b + ", userImage=" + this.f11292c + ')';
    }
}
