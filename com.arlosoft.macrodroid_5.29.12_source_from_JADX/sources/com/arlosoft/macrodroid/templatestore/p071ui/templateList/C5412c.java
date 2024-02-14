package com.arlosoft.macrodroid.templatestore.p071ui.templateList;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.C13706o;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.c */
/* compiled from: TemplateCategoryManager.kt */
public final class C5412c {

    /* renamed from: a */
    private Integer f13301a;

    /* renamed from: b */
    private int f13302b;

    /* renamed from: c */
    private final ArrayList<C5413a> f13303c = new ArrayList<>();

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.c$a */
    /* compiled from: TemplateCategoryManager.kt */
    public interface C5413a {
        /* renamed from: g */
        void mo30616g(int i);
    }

    /* renamed from: a */
    public final void mo30610a(C5413a aVar) {
        C13706o.m87929f(aVar, "listener");
        this.f13303c.add(aVar);
    }

    /* renamed from: b */
    public final int mo30611b() {
        return this.f13302b;
    }

    /* renamed from: c */
    public final Integer mo30612c() {
        return this.f13301a;
    }

    /* renamed from: d */
    public final void mo30613d(C5413a aVar) {
        C13706o.m87929f(aVar, "listener");
        this.f13303c.remove(aVar);
    }

    /* renamed from: e */
    public final void mo30614e(int i) {
        this.f13302b = i;
        Iterator<C5413a> it = this.f13303c.iterator();
        while (it.hasNext()) {
            it.next().mo30616g(i);
        }
    }

    /* renamed from: f */
    public final void mo30615f(Integer num) {
        this.f13301a = num;
    }
}
