package com.arlosoft.macrodroid.videos;

import androidx.lifecycle.Observer;
import com.arlosoft.macrodroid.videos.data.VideosData;

/* renamed from: com.arlosoft.macrodroid.videos.c */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6609c implements Observer {

    /* renamed from: a */
    public final /* synthetic */ VideosActivity f15345a;

    public /* synthetic */ C6609c(VideosActivity videosActivity) {
        this.f15345a = videosActivity;
    }

    public final void onChanged(Object obj) {
        VideosActivity.m25065U1(this.f15345a, (VideosData) obj);
    }
}
