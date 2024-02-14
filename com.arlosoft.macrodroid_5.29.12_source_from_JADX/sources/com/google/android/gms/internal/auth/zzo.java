package com.google.android.gms.internal.auth;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.api.Status;

final class zzo implements WorkAccountApi.AddAccountResult {

    /* renamed from: a */
    private final Status f39241a;

    /* renamed from: c */
    private final Account f39242c;

    public zzo(Status status, Account account) {
        this.f39241a = status;
        this.f39242c = account;
    }

    /* renamed from: K */
    public final Account mo20761K() {
        return this.f39242c;
    }

    public final Status getStatus() {
        return this.f39241a;
    }
}
