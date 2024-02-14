package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.rb */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3394rb implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ OpenLastPhotoAction f9027a;

    /* renamed from: c */
    public final /* synthetic */ List f9028c;

    /* renamed from: d */
    public final /* synthetic */ String[] f9029d;

    public /* synthetic */ C3394rb(OpenLastPhotoAction openLastPhotoAction, List list, String[] strArr) {
        this.f9027a = openLastPhotoAction;
        this.f9028c = list;
        this.f9029d = strArr;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        OpenLastPhotoAction.m11666n3(this.f9027a, this.f9028c, this.f9029d, dialogInterface, i);
    }
}
