package com.arlosoft.macrodroid.triggers;

import android.content.DialogInterface;
import android.widget.TextView;

/* renamed from: com.arlosoft.macrodroid.triggers.c3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5884c3 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ GeofenceTrigger f13973a;

    /* renamed from: c */
    public final /* synthetic */ String[] f13974c;

    /* renamed from: d */
    public final /* synthetic */ int[] f13975d;

    /* renamed from: f */
    public final /* synthetic */ TextView f13976f;

    public /* synthetic */ C5884c3(GeofenceTrigger geofenceTrigger, String[] strArr, int[] iArr, TextView textView) {
        this.f13973a = geofenceTrigger;
        this.f13974c = strArr;
        this.f13975d = iArr;
        this.f13976f = textView;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f13973a.m22271v3(this.f13974c, this.f13975d, this.f13976f, dialogInterface, i);
    }
}
