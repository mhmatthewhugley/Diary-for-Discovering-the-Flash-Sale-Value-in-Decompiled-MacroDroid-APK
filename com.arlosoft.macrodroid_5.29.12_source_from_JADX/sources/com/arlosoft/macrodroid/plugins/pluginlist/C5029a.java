package com.arlosoft.macrodroid.plugins.pluginlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.paging.PagedListAdapter;
import androidx.recyclerview.widget.DiffUtil;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.plugins.data.PluginDetail;
import com.arlosoft.macrodroid.templatestore.p071ui.profile.C5331h;
import kotlin.jvm.internal.C13706o;
import p130m2.C7899a;

/* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.a */
/* compiled from: PluginListAdapter.kt */
public final class C5029a extends PagedListAdapter<PluginDetail, C5057r> {

    /* renamed from: a */
    private final C5048q f12617a;

    /* renamed from: b */
    private final C5331h f12618b;

    /* renamed from: c */
    private final C7899a f12619c;

    /* renamed from: com.arlosoft.macrodroid.plugins.pluginlist.a$a */
    /* compiled from: PluginListAdapter.kt */
    public static final class C5030a extends DiffUtil.ItemCallback<PluginDetail> {
        /* renamed from: a */
        public boolean areContentsTheSame(PluginDetail pluginDetail, PluginDetail pluginDetail2) {
            C13706o.m87929f(pluginDetail, "oldItem");
            C13706o.m87929f(pluginDetail2, "newItem");
            return C13706o.m87924a(pluginDetail, pluginDetail2);
        }

        /* renamed from: b */
        public boolean areItemsTheSame(PluginDetail pluginDetail, PluginDetail pluginDetail2) {
            C13706o.m87929f(pluginDetail, "oldItem");
            C13706o.m87929f(pluginDetail2, "newItem");
            return C13706o.m87924a(pluginDetail.getPackageName(), pluginDetail2.getPackageName());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5029a(C5048q qVar, C5331h hVar, C7899a aVar) {
        super(new C5030a());
        C13706o.m87929f(qVar, "viewModel");
        C13706o.m87929f(hVar, "profileImageProvider");
        C13706o.m87929f(aVar, "pluginOverrideStore");
        this.f12617a = qVar;
        this.f12618b = hVar;
        this.f12619c = aVar;
    }

    /* renamed from: B */
    public void onBindViewHolder(C5057r rVar, int i) {
        C13706o.m87929f(rVar, "holder");
        Object item = getItem(i);
        C13706o.m87926c(item);
        PluginDetail pluginDetail = (PluginDetail) item;
        PluginDetail b = this.f12619c.mo37790b(pluginDetail.getId());
        if (b != null) {
            pluginDetail = b;
        }
        rVar.mo29928v(pluginDetail);
    }

    /* renamed from: C */
    public C5057r onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C17535R$layout.view_plugin_details, viewGroup, false);
        C13706o.m87928e(inflate, "view");
        return new C5057r(inflate, this.f12617a, this.f12618b);
    }
}
