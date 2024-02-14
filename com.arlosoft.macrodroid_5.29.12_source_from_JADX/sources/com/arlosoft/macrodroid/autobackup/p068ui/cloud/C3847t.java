package com.arlosoft.macrodroid.autobackup.p068ui.cloud;

import kotlin.jvm.internal.C13706o;
import p014b3.C1405a;

/* renamed from: com.arlosoft.macrodroid.autobackup.ui.cloud.t */
/* compiled from: AutoBackupCloudViewModel.kt */
public final class C3847t {

    /* renamed from: a */
    private final long f9995a;

    /* renamed from: b */
    private final String f9996b;

    public C3847t(long j, String str) {
        C13706o.m87929f(str, "name");
        this.f9995a = j;
        this.f9996b = str;
    }

    /* renamed from: a */
    public final String mo27378a() {
        return this.f9996b;
    }

    /* renamed from: b */
    public final long mo27379b() {
        return this.f9995a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3847t)) {
            return false;
        }
        C3847t tVar = (C3847t) obj;
        return this.f9995a == tVar.f9995a && C13706o.m87924a(this.f9996b, tVar.f9996b);
    }

    public int hashCode() {
        return (C1405a.m633a(this.f9995a) * 31) + this.f9996b.hashCode();
    }

    public String toString() {
        return "BackupInfo(timeStamp=" + this.f9995a + ", name=" + this.f9996b + ')';
    }
}
