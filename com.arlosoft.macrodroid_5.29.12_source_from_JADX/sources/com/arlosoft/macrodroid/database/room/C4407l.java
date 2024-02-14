package com.arlosoft.macrodroid.database.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Entity(tableName = "MacroSubscription")
/* renamed from: com.arlosoft.macrodroid.database.room.l */
/* compiled from: MacroSubscription.kt */
public final class C4407l {

    /* renamed from: c */
    public static final C4408a f11221c = new C4408a((C13695i) null);
    @PrimaryKey

    /* renamed from: a */
    private final int f11222a;

    /* renamed from: b */
    private final String f11223b;

    /* renamed from: com.arlosoft.macrodroid.database.room.l$a */
    /* compiled from: MacroSubscription.kt */
    public static final class C4408a {
        private C4408a() {
        }

        public /* synthetic */ C4408a(C13695i iVar) {
            this();
        }
    }

    public C4407l(int i, String str) {
        C13706o.m87929f(str, "macroName");
        this.f11222a = i;
        this.f11223b = str;
    }

    /* renamed from: a */
    public final int mo28736a() {
        return this.f11222a;
    }

    /* renamed from: b */
    public final String mo28737b() {
        return this.f11223b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4407l)) {
            return false;
        }
        C4407l lVar = (C4407l) obj;
        return this.f11222a == lVar.f11222a && C13706o.m87924a(this.f11223b, lVar.f11223b);
    }

    public int hashCode() {
        return (this.f11222a * 31) + this.f11223b.hashCode();
    }

    public String toString() {
        return "MacroSubscription(macroId=" + this.f11222a + ", macroName=" + this.f11223b + ')';
    }
}
