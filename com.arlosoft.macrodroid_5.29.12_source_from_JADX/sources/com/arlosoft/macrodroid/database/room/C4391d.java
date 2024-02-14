package com.arlosoft.macrodroid.database.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Entity(tableName = "BlockedUser")
/* renamed from: com.arlosoft.macrodroid.database.room.d */
/* compiled from: BlockedUser.kt */
public final class C4391d {

    /* renamed from: c */
    public static final C4392a f11191c = new C4392a((C13695i) null);
    @PrimaryKey

    /* renamed from: a */
    private final int f11192a;

    /* renamed from: b */
    private final String f11193b;

    /* renamed from: com.arlosoft.macrodroid.database.room.d$a */
    /* compiled from: BlockedUser.kt */
    public static final class C4392a {
        private C4392a() {
        }

        public /* synthetic */ C4392a(C13695i iVar) {
            this();
        }
    }

    public C4391d(int i, String str) {
        C13706o.m87929f(str, "username");
        this.f11192a = i;
        this.f11193b = str;
    }

    /* renamed from: a */
    public final int mo28713a() {
        return this.f11192a;
    }

    /* renamed from: b */
    public final String mo28714b() {
        return this.f11193b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4391d)) {
            return false;
        }
        C4391d dVar = (C4391d) obj;
        return this.f11192a == dVar.f11192a && C13706o.m87924a(this.f11193b, dVar.f11193b);
    }

    public int hashCode() {
        return (this.f11192a * 31) + this.f11193b.hashCode();
    }

    public String toString() {
        return "BlockedUser(userId=" + this.f11192a + ", username=" + this.f11193b + ')';
    }
}
