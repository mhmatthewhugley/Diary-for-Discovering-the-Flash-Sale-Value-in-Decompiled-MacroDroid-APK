package com.arlosoft.macrodroid.actionblock.list;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.action.Action;
import com.arlosoft.macrodroid.actionblock.data.ActionBlock;
import com.arlosoft.macrodroid.macro.C4934n;
import com.arlosoft.macrodroid.macro.Macro;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.C13706o;
import kotlin.text.C15159j;
import p057a2.C2225n;
import p139o1.C8020p0;

/* renamed from: com.arlosoft.macrodroid.actionblock.list.a */
/* compiled from: ActionBlockAdapter.kt */
public final class C3750a extends RecyclerView.Adapter<C3771s> {

    /* renamed from: a */
    private final List<ActionBlock> f9825a;

    /* renamed from: b */
    private final boolean f9826b;

    /* renamed from: c */
    private final C3751b f9827c;

    /* renamed from: d */
    private final HashMap<String, ArrayList<Macro>> f9828d = new HashMap<>();

    /* renamed from: e */
    private List<ActionBlock> f9829e;

    public C3750a(List<ActionBlock> list, boolean z, C3751b bVar) {
        C13706o.m87929f(list, "actionBlocksList");
        C13706o.m87929f(bVar, "actionBlockClickListener");
        this.f9825a = list;
        this.f9826b = z;
        this.f9827c = bVar;
        this.f9829e = list;
        setHasStableIds(true);
        refresh();
    }

    /* renamed from: B */
    private final void m14764B(String str, Macro macro) {
        ArrayList arrayList = this.f9828d.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (!arrayList.contains(macro)) {
            arrayList.add(macro);
            this.f9828d.put(str, arrayList);
        }
    }

    /* renamed from: C */
    private final boolean m14765C(ActionBlock actionBlock, String str) {
        String name = actionBlock.getName();
        C13706o.m87928e(name, "actionBlock.name");
        Locale locale = Locale.ROOT;
        String lowerCase = name.toLowerCase(locale);
        C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        if (C15177w.m93663N(lowerCase, str, false, 2, (Object) null)) {
            return true;
        }
        if (actionBlock.getDescription() != null) {
            String description = actionBlock.getDescription();
            C13706o.m87928e(description, "actionBlock.description");
            String lowerCase2 = description.toLowerCase(locale);
            C13706o.m87928e(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (C15177w.m93663N(lowerCase2, str, false, 2, (Object) null)) {
                return true;
            }
        }
        Iterator<Action> it = actionBlock.getActions().iterator();
        while (it.hasNext()) {
            Action next = it.next();
            String D = m14766D(next.mo24738G0());
            String D2 = m14766D(next.mo25559a1());
            C13706o.m87926c(D);
            String lowerCase3 = D.toLowerCase();
            C13706o.m87928e(lowerCase3, "this as java.lang.String).toLowerCase()");
            if (!C15177w.m93663N(lowerCase3, str, false, 2, (Object) null)) {
                C13706o.m87926c(D2);
                String lowerCase4 = D2.toLowerCase();
                C13706o.m87928e(lowerCase4, "this as java.lang.String).toLowerCase()");
                if (C15177w.m93663N(lowerCase4, str, false, 2, (Object) null)) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: D */
    private final String m14766D(String str) {
        if (str == null) {
            return null;
        }
        String normalize = Normalizer.normalize(str, Normalizer.Form.NFD);
        C13706o.m87928e(normalize, "normalize(text, Normalizer.Form.NFD)");
        String d = new C15159j("\\p{InCombiningDiacriticalMarks}+").mo74469d(normalize, "");
        Locale locale = Locale.getDefault();
        C13706o.m87928e(locale, "getDefault()");
        String lowerCase = d.toLowerCase(locale);
        C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    /* renamed from: E */
    public void onBindViewHolder(C3771s sVar, int i) {
        C13706o.m87929f(sVar, "holder");
        sVar.mo27266v(this.f9829e.get(i), this.f9828d);
    }

    /* renamed from: F */
    public C3771s onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        C8020p0 c = C8020p0.m33393c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C13706o.m87928e(c, "inflate(LayoutInflater.f….context), parent, false)");
        return new C3771s(c, this.f9826b, this.f9827c);
    }

    /* renamed from: G */
    public final void mo27253G(String str) {
        C13706o.m87929f(str, "text");
        if (C15176v.m93640u(str, "_", false, 2, (Object) null)) {
            str = str.substring(0, str.length() - 1);
            C13706o.m87928e(str, "this as java.lang.String…ing(startIndex, endIndex)");
        }
        String D = m14766D(str);
        C13706o.m87926c(D);
        List<ActionBlock> list = this.f9825a;
        ArrayList arrayList = new ArrayList();
        for (T next : list) {
            String lowerCase = D.toLowerCase();
            C13706o.m87928e(lowerCase, "this as java.lang.String).toLowerCase()");
            if (m14765C((ActionBlock) next, lowerCase)) {
                arrayList.add(next);
            }
        }
        this.f9829e = arrayList;
        notifyDataSetChanged();
    }

    public int getItemCount() {
        return this.f9829e.size();
    }

    public long getItemId(int i) {
        return this.f9829e.get(i).getGUID();
    }

    public final void refresh() {
        List<Macro> D = C4934n.m18998M().mo29674D();
        this.f9828d.clear();
        for (Macro next : D) {
            Iterator<Action> it = next.getActions().iterator();
            while (it.hasNext()) {
                Action next2 = it.next();
                if (next2 instanceof C2225n) {
                    for (String B : ((C2225n) next2).mo24442i()) {
                        C13706o.m87928e(next, "macro");
                        m14764B(B, next);
                    }
                }
            }
        }
    }
}
