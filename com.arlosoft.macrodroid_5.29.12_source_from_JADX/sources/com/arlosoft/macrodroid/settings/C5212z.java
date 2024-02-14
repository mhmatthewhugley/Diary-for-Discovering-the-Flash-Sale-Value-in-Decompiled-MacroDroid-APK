package com.arlosoft.macrodroid.settings;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C13706o;
import p106i2.C7396b;
import p139o1.C8008j0;

/* renamed from: com.arlosoft.macrodroid.settings.z */
/* compiled from: EditNotificationChannelsActivity.kt */
final class C5212z extends RecyclerView.Adapter<C5208y> {

    /* renamed from: a */
    private final C7396b f13020a;

    /* renamed from: b */
    private final C5120b f13021b;

    public C5212z(C7396b bVar, C5120b bVar2) {
        C13706o.m87929f(bVar, "notificationChannelList");
        C13706o.m87929f(bVar2, "channelSelectedCallback");
        this.f13020a = bVar;
        this.f13021b = bVar2;
    }

    /* renamed from: B */
    public void onBindViewHolder(C5208y yVar, int i) {
        C13706o.m87929f(yVar, "holder");
        yVar.mo30151u(this.f13020a.mo37428a().get(i));
    }

    /* renamed from: C */
    public C5208y onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        C8008j0 c = C8008j0.m33351c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C13706o.m87928e(c, "inflate(LayoutInflater.f….context), parent, false)");
        return new C5208y(c, this.f13021b);
    }

    public int getItemCount() {
        return this.f13020a.mo37428a().size();
    }
}
