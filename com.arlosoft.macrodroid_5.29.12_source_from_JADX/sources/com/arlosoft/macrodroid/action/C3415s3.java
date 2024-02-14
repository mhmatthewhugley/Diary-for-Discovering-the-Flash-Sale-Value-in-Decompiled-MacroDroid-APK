package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.s3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3415s3 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ ContactViaAppAction f9068a;

    /* renamed from: c */
    public final /* synthetic */ List f9069c;

    public /* synthetic */ C3415s3(ContactViaAppAction contactViaAppAction, List list) {
        this.f9068a = contactViaAppAction;
        this.f9069c = list;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ContactViaAppAction.m10292w3(this.f9068a, this.f9069c, dialogInterface, i);
    }
}
