package com.arlosoft.macrodroid;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.l0 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C4833l0 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ShortcutActivity f12156a;

    /* renamed from: c */
    public final /* synthetic */ boolean f12157c;

    /* renamed from: d */
    public final /* synthetic */ List f12158d;

    public /* synthetic */ C4833l0(ShortcutActivity shortcutActivity, boolean z, List list) {
        this.f12156a = shortcutActivity;
        this.f12157c = z;
        this.f12158d = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f12156a.m9528W1(this.f12157c, this.f12158d, dialogInterface, i);
    }
}
