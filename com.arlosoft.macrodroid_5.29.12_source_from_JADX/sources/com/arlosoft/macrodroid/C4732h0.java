package com.arlosoft.macrodroid;

import android.view.View;
import android.widget.AdapterView;
import com.arlosoft.macrodroid.data.ResumeMacroInfo;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.h0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4732h0 implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ SelectForceRunMacroActivity f11891a;

    /* renamed from: c */
    public final /* synthetic */ List f11892c;

    /* renamed from: d */
    public final /* synthetic */ String f11893d;

    /* renamed from: f */
    public final /* synthetic */ boolean f11894f;

    /* renamed from: g */
    public final /* synthetic */ ResumeMacroInfo f11895g;

    public /* synthetic */ C4732h0(SelectForceRunMacroActivity selectForceRunMacroActivity, List list, String str, boolean z, ResumeMacroInfo resumeMacroInfo) {
        this.f11891a = selectForceRunMacroActivity;
        this.f11892c = list;
        this.f11893d = str;
        this.f11894f = z;
        this.f11895g = resumeMacroInfo;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.f11891a.m9515L1(this.f11892c, this.f11893d, this.f11894f, this.f11895g, adapterView, view, i, j);
    }
}
