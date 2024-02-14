package com.arlosoft.macrodroid.videos;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.arlosoft.macrodroid.videos.data.VideoInfo;
import com.google.android.material.card.MaterialCardView;
import java.util.List;
import kotlin.jvm.internal.C13706o;
import p063b5.C2253f;
import p083e4.C7271c;
import p139o1.C8028t0;

/* renamed from: com.arlosoft.macrodroid.videos.f */
/* compiled from: VideosAdapter.kt */
public final class C6612f extends RecyclerView.Adapter<C6613a> {

    /* renamed from: a */
    private final List<VideoInfo> f15348a;

    /* renamed from: b */
    private final C6605a f15349b;

    /* renamed from: com.arlosoft.macrodroid.videos.f$a */
    /* compiled from: VideosAdapter.kt */
    public static final class C6613a extends RecyclerView.ViewHolder {

        /* renamed from: a */
        private final C8028t0 f15350a;

        /* renamed from: b */
        private final C6605a f15351b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C6613a(C8028t0 t0Var, C6605a aVar) {
            super(t0Var.getRoot());
            C13706o.m87929f(t0Var, "binding");
            C13706o.m87929f(aVar, "videoClickedListener");
            this.f15350a = t0Var;
            this.f15351b = aVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public static final void m25076v(C6613a aVar, VideoInfo videoInfo, View view) {
            C13706o.m87929f(aVar, "this$0");
            C13706o.m87929f(videoInfo, "$video");
            aVar.f15351b.mo32826d(videoInfo);
        }

        /* renamed from: u */
        public final void mo32853u(VideoInfo videoInfo) {
            C13706o.m87929f(videoInfo, "video");
            MaterialCardView materialCardView = this.f15350a.f19460b;
            C13706o.m87928e(materialCardView, "binding.container");
            materialCardView.setOnClickListener(new C6611e(this, videoInfo));
            this.f15350a.f19462d.setText(videoInfo.getTitle());
            C7271c.m30017t(this.f15350a.f19461c.getContext()).mo37190t(videoInfo.getImage()).mo24491a(new C2253f().mo24494c()).mo37169G0(this.f15350a.f19461c);
        }
    }

    public C6612f(List<VideoInfo> list, C6605a aVar) {
        C13706o.m87929f(list, "videos");
        C13706o.m87929f(aVar, "videoClickedListener");
        this.f15348a = list;
        this.f15349b = aVar;
    }

    /* renamed from: B */
    public void onBindViewHolder(C6613a aVar, int i) {
        C13706o.m87929f(aVar, "holder");
        aVar.mo32853u(this.f15348a.get(i));
    }

    /* renamed from: C */
    public C6613a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C13706o.m87929f(viewGroup, "parent");
        C8028t0 c = C8028t0.m33421c(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C13706o.m87928e(c, "inflate(LayoutInflater.f….context), parent, false)");
        return new C6613a(c, this.f15349b);
    }

    public int getItemCount() {
        return this.f15348a.size();
    }
}
