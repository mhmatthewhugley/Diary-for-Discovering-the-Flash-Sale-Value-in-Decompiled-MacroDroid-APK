package com.arlosoft.macrodroid.database.room;

import androidx.room.TypeConverter;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.database.room.g */
/* compiled from: Converters.kt */
public final class C4401g {
    @TypeConverter
    /* renamed from: a */
    public final C4403i mo28728a(int i) {
        return C4403i.f11214a.mo28735a(i);
    }

    @TypeConverter
    /* renamed from: b */
    public final C4402h mo28729b(int i) {
        return C4402h.values()[i];
    }

    @TypeConverter
    /* renamed from: c */
    public final C4418o mo28730c(int i) {
        return C4418o.values()[i];
    }

    @TypeConverter
    /* renamed from: d */
    public final int mo28731d(C4402h hVar) {
        C13706o.m87929f(hVar, "logFlag");
        return hVar.ordinal();
    }

    @TypeConverter
    /* renamed from: e */
    public final int mo28732e(C4403i iVar) {
        C13706o.m87929f(iVar, "sleepNoteIcon");
        return iVar.mo28734d();
    }

    @TypeConverter
    /* renamed from: f */
    public final int mo28733f(C4418o oVar) {
        C13706o.m87929f(oVar, "updateType");
        return oVar.ordinal();
    }
}
