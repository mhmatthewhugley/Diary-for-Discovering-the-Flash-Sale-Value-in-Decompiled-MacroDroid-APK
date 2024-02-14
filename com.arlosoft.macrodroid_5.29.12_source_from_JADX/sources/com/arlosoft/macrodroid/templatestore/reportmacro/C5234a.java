package com.arlosoft.macrodroid.templatestore.reportmacro;

import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import java.util.List;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.templatestore.reportmacro.a */
/* compiled from: ReportMacroViewModel.kt */
public final class C5234a {

    /* renamed from: a */
    private final MacroTemplate f13060a;

    /* renamed from: b */
    private final List<C5240c> f13061b;

    public C5234a(MacroTemplate macroTemplate, List<? extends C5240c> list) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        C13706o.m87929f(list, "entries");
        this.f13060a = macroTemplate;
        this.f13061b = list;
    }

    /* renamed from: a */
    public final List<C5240c> mo30373a() {
        return this.f13061b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5234a)) {
            return false;
        }
        C5234a aVar = (C5234a) obj;
        return C13706o.m87924a(this.f13060a, aVar.f13060a) && C13706o.m87924a(this.f13061b, aVar.f13061b);
    }

    public int hashCode() {
        return (this.f13060a.hashCode() * 31) + this.f13061b.hashCode();
    }

    public String toString() {
        return "MacroReportData(macroTemplate=" + this.f13060a + ", entries=" + this.f13061b + ')';
    }
}
