package com.arlosoft.macrodroid.action;

import android.content.DialogInterface;
import com.arlosoft.macrodroid.common.Contact;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.action.t3 */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3469t3 implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ List f9247a;

    /* renamed from: c */
    public final /* synthetic */ ContactViaAppAction f9248c;

    /* renamed from: d */
    public final /* synthetic */ Contact f9249d;

    public /* synthetic */ C3469t3(List list, ContactViaAppAction contactViaAppAction, Contact contact) {
        this.f9247a = list;
        this.f9248c = contactViaAppAction;
        this.f9249d = contact;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ContactViaAppAction.m10288s3(this.f9247a, this.f9248c, this.f9249d, dialogInterface, i);
    }
}
