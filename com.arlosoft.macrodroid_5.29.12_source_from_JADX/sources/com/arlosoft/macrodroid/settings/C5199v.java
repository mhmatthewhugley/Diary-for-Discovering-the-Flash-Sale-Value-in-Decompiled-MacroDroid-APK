package com.arlosoft.macrodroid.settings;

import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;
import p106i2.C7395a;

/* renamed from: com.arlosoft.macrodroid.settings.v */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C5199v implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ EditText f13000a;

    /* renamed from: c */
    public final /* synthetic */ C7395a f13001c;

    /* renamed from: d */
    public final /* synthetic */ EditNotificationChannelsActivity f13002d;

    /* renamed from: f */
    public final /* synthetic */ Spinner f13003f;

    /* renamed from: g */
    public final /* synthetic */ int[] f13004g;

    /* renamed from: o */
    public final /* synthetic */ AppCompatDialog f13005o;

    public /* synthetic */ C5199v(EditText editText, C7395a aVar, EditNotificationChannelsActivity editNotificationChannelsActivity, Spinner spinner, int[] iArr, AppCompatDialog appCompatDialog) {
        this.f13000a = editText;
        this.f13001c = aVar;
        this.f13002d = editNotificationChannelsActivity;
        this.f13003f = spinner;
        this.f13004g = iArr;
        this.f13005o = appCompatDialog;
    }

    public final void onClick(View view) {
        EditNotificationChannelsActivity.m19757b2(this.f13000a, this.f13001c, this.f13002d, this.f13003f, this.f13004g, this.f13005o, view);
    }
}
