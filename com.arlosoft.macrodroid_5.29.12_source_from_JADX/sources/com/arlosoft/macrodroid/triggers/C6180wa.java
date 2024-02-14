package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.ListView;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.triggers.wa */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6180wa implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WifiSSIDTrigger f14694a;

    /* renamed from: c */
    public final /* synthetic */ ListView f14695c;

    /* renamed from: d */
    public final /* synthetic */ List f14696d;

    public /* synthetic */ C6180wa(WifiSSIDTrigger wifiSSIDTrigger, ListView listView, List list) {
        this.f14694a = wifiSSIDTrigger;
        this.f14695c = listView;
        this.f14696d = list;
    }

    public final void onClick(View view) {
        this.f14694a.m23774F3(this.f14695c, this.f14696d, view);
    }
}
