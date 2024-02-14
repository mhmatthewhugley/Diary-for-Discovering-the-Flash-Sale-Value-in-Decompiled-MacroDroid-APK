package com.arlosoft.macrodroid.database.room;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;

@Entity(tableName = "BlockedMacro")
/* renamed from: com.arlosoft.macrodroid.database.room.a */
/* compiled from: BlockedMacro.kt */
public final class C4382a {

    /* renamed from: c */
    public static final C4383a f11177c = new C4383a((C13695i) null);
    @PrimaryKey

    /* renamed from: a */
    private final int f11178a;

    /* renamed from: b */
    private final String f11179b;

    /* renamed from: com.arlosoft.macrodroid.database.room.a$a */
    /* compiled from: BlockedMacro.kt */
    public static final class C4383a {
        private C4383a() {
        }

        public /* synthetic */ C4383a(C13695i iVar) {
            this();
        }
    }

    public C4382a(int i, String str) {
        C13706o.m87929f(str, "macroName");
        this.f11178a = i;
        this.f11179b = str;
    }

    /* renamed from: a */
    public final int mo28701a() {
        return this.f11178a;
    }

    /* renamed from: b */
    public final String mo28702b() {
        return this.f11179b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4382a)) {
            return false;
        }
        C4382a aVar = (C4382a) obj;
        return this.f11178a == aVar.f11178a && C13706o.m87924a(this.f11179b, aVar.f11179b);
    }

    public int hashCode() {
        return (this.f11178a * 31) + this.f11179b.hashCode();
    }

    public String toString() {
        return "BlockedMacro(macroId=" + this.f11178a + ", macroName=" + this.f11179b + ')';
    }
}
