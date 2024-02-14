package com.arlosoft.macrodroid.action;

import android.accounts.Account;
import android.content.DialogInterface;

/* renamed from: com.arlosoft.macrodroid.action.xl */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3605xl implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ SyncAccountAction f9588a;

    /* renamed from: c */
    public final /* synthetic */ String[] f9589c;

    /* renamed from: d */
    public final /* synthetic */ Account f9590d;

    /* renamed from: f */
    public final /* synthetic */ String f9591f;

    public /* synthetic */ C3605xl(SyncAccountAction syncAccountAction, String[] strArr, Account account, String str) {
        this.f9588a = syncAccountAction;
        this.f9589c = strArr;
        this.f9590d = account;
        this.f9591f = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f9588a.m13185p3(this.f9589c, this.f9590d, this.f9591f, dialogInterface, i);
    }
}
