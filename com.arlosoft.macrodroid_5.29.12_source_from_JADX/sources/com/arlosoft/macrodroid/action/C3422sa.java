package com.arlosoft.macrodroid.action;

import android.app.Activity;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatDialog;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.sa */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3422sa implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ NotificationAction f9082a;

    /* renamed from: c */
    public final /* synthetic */ Activity f9083c;

    /* renamed from: d */
    public final /* synthetic */ AppCompatDialog f9084d;

    /* renamed from: f */
    public final /* synthetic */ LinearLayout f9085f;

    /* renamed from: g */
    public final /* synthetic */ List f9086g;

    /* renamed from: o */
    public final /* synthetic */ List f9087o;

    /* renamed from: p */
    public final /* synthetic */ Button f9088p;

    /* renamed from: s */
    public final /* synthetic */ TextWatcher f9089s;

    /* renamed from: z */
    public final /* synthetic */ Button f9090z;

    public /* synthetic */ C3422sa(NotificationAction notificationAction, Activity activity, AppCompatDialog appCompatDialog, LinearLayout linearLayout, List list, List list2, Button button, TextWatcher textWatcher, Button button2) {
        this.f9082a = notificationAction;
        this.f9083c = activity;
        this.f9084d = appCompatDialog;
        this.f9085f = linearLayout;
        this.f9086g = list;
        this.f9087o = list2;
        this.f9088p = button;
        this.f9089s = textWatcher;
        this.f9090z = button2;
    }

    public final void onClick(View view) {
        this.f9082a.m11542Z3(this.f9083c, this.f9084d, this.f9085f, this.f9086g, this.f9087o, this.f9088p, this.f9089s, this.f9090z, view);
    }
}
