package com.arlosoft.macrodroid.action;

import android.accounts.Account;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.util.Pair;
import p080e0.C7262b;

/* renamed from: com.arlosoft.macrodroid.action.zl */
/* compiled from: R8$$SyntheticClass */
public final /* synthetic */ class C3659zl implements C7262b.C7263a {

    /* renamed from: a */
    public final /* synthetic */ SyncAccountAction f9707a;

    /* renamed from: b */
    public final /* synthetic */ AppCompatDialog f9708b;

    /* renamed from: c */
    public final /* synthetic */ Pair f9709c;

    public /* synthetic */ C3659zl(SyncAccountAction syncAccountAction, AppCompatDialog appCompatDialog, Pair pair) {
        this.f9707a = syncAccountAction;
        this.f9708b = appCompatDialog;
        this.f9709c = pair;
    }

    /* renamed from: a */
    public final void mo27078a(Account account, String str) {
        this.f9707a.m13186q3(this.f9708b, this.f9709c, account, str);
    }
}
