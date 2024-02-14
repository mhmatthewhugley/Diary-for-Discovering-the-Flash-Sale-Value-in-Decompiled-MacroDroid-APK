package com.arlosoft.macrodroid.templatestore.p071ui.templateList;

import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import java.util.HashMap;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.a */
/* compiled from: LocalTemplateOverrideStore.kt */
public final class C5410a {

    /* renamed from: a */
    private final HashMap<Integer, MacroTemplate> f13299a = new HashMap<>();

    /* renamed from: a */
    public final void mo30606a(int i, MacroTemplate macroTemplate) {
        C13706o.m87929f(macroTemplate, "macroTemplate");
        this.f13299a.put(Integer.valueOf(i), macroTemplate);
    }

    /* renamed from: b */
    public final void mo30607b() {
        this.f13299a.clear();
    }

    /* renamed from: c */
    public final MacroTemplate mo30608c(int i) {
        return this.f13299a.get(Integer.valueOf(i));
    }
}
