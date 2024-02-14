package com.arlosoft.macrodroid.templatestore.p071ui.templateList;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.database.room.C4407l;
import com.arlosoft.macrodroid.database.room.C4443v;
import com.arlosoft.macrodroid.templatestore.model.MacroTemplate;
import com.arlosoft.macrodroid.templatestore.p071ui.C5276c;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import com.arlosoft.macrodroid.templatestore.p071ui.user.C5527g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p058a3.C2227a;
import p078d3.C7245d;

/* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.j */
/* compiled from: TemplateListAdapter.kt */
public final class C5431j extends PagedListAdapter<MacroTemplate, C5418h> {

    /* renamed from: a */
    private final C5276c f13331a;

    /* renamed from: b */
    private final C5331h f13332b;

    /* renamed from: c */
    private final C5410a f13333c;

    /* renamed from: d */
    private final C5527g f13334d;

    /* renamed from: e */
    private final C2227a f13335e;

    /* renamed from: f */
    private final boolean f13336f;

    /* renamed from: g */
    private final boolean f13337g;

    /* renamed from: h */
    private final boolean f13338h;

    /* renamed from: i */
    private final C7245d f13339i;

    /* renamed from: j */
    private List<C4407l> f13340j;

    /* renamed from: k */
    private List<C4443v> f13341k;

    /* renamed from: l */
    private final List<MacroTemplate> f13342l = new ArrayList();

    /* renamed from: com.arlosoft.macrodroid.templatestore.ui.templateList.j$a */
    /* compiled from: TemplateListAdapter.kt */
    public static final class C5432a extends DiffUtil.ItemCallback<MacroTemplate> {
        /* renamed from: a */
        public boolean areContentsTheSame(MacroTemplate macroTemplate, MacroTemplate macroTemplate2) {
            C13706o.m87929f(macroTemplate, "oldItem");
            C13706o.m87929f(macroTemplate2, "newItem");
            return C13706o.m87924a(macroTemplate, macroTemplate2);
        }

        /* renamed from: b */
        public boolean areItemsTheSame(MacroTemplate macroTemplate, MacroTemplate macroTemplate2) {
            C13706o.m87929f(macroTemplate, "oldItem");
            C13706o.m87929f(macroTemplate2, "newItem");
            return macroTemplate.getId() == macroTemplate2.getId();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5431j(C5276c cVar, C5331h hVar, C5410a aVar, C5527g gVar, C2227a aVar2, boolean z, boolean z2, boolean z3, C7245d dVar, List<C4407l> list, List<C4443v> list2) {
        super(new C5432a());
        C13706o.m87929f(cVar, "presenter");
        C13706o.m87929f(hVar, "profileImageProvider");
        C13706o.m87929f(aVar, "templateOverrideStore");
        C13706o.m87929f(gVar, "userProvider");
        C13706o.m87929f(aVar2, "flagProvider");
        C13706o.m87929f(list, "macroSubscriptions");
        C13706o.m87929f(list2, "userSubscriptions");
        this.f13331a = cVar;
        this.f13332b = hVar;
        this.f13333c = aVar;
        this.f13334d = gVar;
        this.f13335e = aVar2;
        this.f13336f = z;
        this.f13337g = z2;
        this.f13338h = z3;
        this.f13339i = dVar;
        this.f13340j = list;
        this.f13341k = list2;
    }

    /* renamed from: B */
    public void onBindViewHolder(C5418h hVar, int i) {
        C13706o.m87929f(hVar, "holder");
        Object item = getItem(i);
        C13706o.m87926c(item);
        MacroTemplate macroTemplate = (MacroTemplate) item;
        MacroTemplate c = this.f13333c.mo30608c(macroTemplate.getId());
        List<C4407l> list = this.f13340j;
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        for (C4407l a : list) {
            arrayList.add(Integer.valueOf(a.mo28736a()));
        }
        boolean contains = arrayList.contains(Integer.valueOf(macroTemplate.getId()));
        List<C4443v> list2 = this.f13341k;
        ArrayList arrayList2 = new ArrayList(C13616u.m87774u(list2, 10));
        for (C4443v a2 : list2) {
            arrayList2.add(Integer.valueOf(a2.mo28794a()));
        }
        boolean contains2 = arrayList2.contains(Integer.valueOf(macroTemplate.getUserId()));
        if (c != null) {
            macroTemplate = c;
        }
        hVar.mo30621z(macroTemplate, i % 2 == 0, contains, contains2);
    }

    /* renamed from: C */
    public C5418h onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.item_template_macro, viewGroup, false);
        C13706o.m87928e(inflate, "view");
        return new C5418h(inflate, this.f13331a, this.f13332b, this.f13334d, this.f13335e, this.f13336f, this.f13342l, this.f13337g, this.f13338h, this.f13339i);
    }

    /* renamed from: D */
    public final void mo30634D(List<C4407l> list) {
        C13706o.m87929f(list, "macroSubscriptions");
        this.f13340j = list;
    }

    /* renamed from: E */
    public final void mo30635E(List<C4443v> list) {
        C13706o.m87929f(list, "userSubscriptions");
        this.f13341k = list;
    }
}
