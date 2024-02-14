package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ListView;
import android.widget.Spinner;
import androidx.appcompat.app.AppCompatDialog;

/* renamed from: com.arlosoft.macrodroid.action.rd */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3396rd implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ PlaySoundAction f9031a;

    /* renamed from: c */
    public final /* synthetic */ CheckBox f9032c;

    /* renamed from: d */
    public final /* synthetic */ ListView f9033d;

    /* renamed from: f */
    public final /* synthetic */ Spinner f9034f;

    /* renamed from: g */
    public final /* synthetic */ int[] f9035g;

    /* renamed from: o */
    public final /* synthetic */ String[] f9036o;

    /* renamed from: p */
    public final /* synthetic */ Activity f9037p;

    /* renamed from: s */
    public final /* synthetic */ AppCompatDialog f9038s;

    public /* synthetic */ C3396rd(PlaySoundAction playSoundAction, CheckBox checkBox, ListView listView, Spinner spinner, int[] iArr, String[] strArr, Activity activity, AppCompatDialog appCompatDialog) {
        this.f9031a = playSoundAction;
        this.f9032c = checkBox;
        this.f9033d = listView;
        this.f9034f = spinner;
        this.f9035g = iArr;
        this.f9036o = strArr;
        this.f9037p = activity;
        this.f9038s = appCompatDialog;
    }

    public final void onClick(View view) {
        this.f9031a.m11867x3(this.f9032c, this.f9033d, this.f9034f, this.f9035g, this.f9036o, this.f9037p, this.f9038s, view);
    }
}
