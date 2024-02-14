package com.arlosoft.macrodroid.triggers;

import android.view.View;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatDialog;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.triggers.xa */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6192xa implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ WifiSSIDTrigger f14718a;

    /* renamed from: c */
    public final /* synthetic */ ListView f14719c;

    /* renamed from: d */
    public final /* synthetic */ List f14720d;

    /* renamed from: f */
    public final /* synthetic */ AppCompatDialog f14721f;

    public /* synthetic */ C6192xa(WifiSSIDTrigger wifiSSIDTrigger, ListView listView, List list, AppCompatDialog appCompatDialog) {
        this.f14718a = wifiSSIDTrigger;
        this.f14719c = listView;
        this.f14720d = list;
        this.f14721f = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f14718a.m23772D3(this.f14719c, this.f14720d, this.f14721f, view);
    }
}
