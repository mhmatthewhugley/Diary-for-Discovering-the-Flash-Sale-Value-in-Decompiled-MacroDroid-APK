package com.arlosoft.macrodroid.triggers;

import android.content.DialogInterface;
import android.widget.EditText;
import android.widget.ListView;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.triggers.ra */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C6071ra implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ListView f14349a;

    /* renamed from: c */
    public final /* synthetic */ EditText f14350c;

    /* renamed from: d */
    public final /* synthetic */ List f14351d;

    public /* synthetic */ C6071ra(ListView listView, EditText editText, List list) {
        this.f14349a = listView;
        this.f14350c = editText;
        this.f14351d = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        WifiSSIDTrigger.m23777I3(this.f14349a, this.f14350c, this.f14351d, dialogInterface, i);
    }
}
