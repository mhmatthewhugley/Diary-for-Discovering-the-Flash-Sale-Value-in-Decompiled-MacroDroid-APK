package com.google.android.gms.auth.account;

import android.accounts.Account;
import com.google.android.gms.auth.account.WorkAccountApi;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

final class zzg implements PendingResultUtil.ResultConverter<WorkAccountApi.AddAccountResult, Account> {
    /* renamed from: a */
    public final /* synthetic */ Object mo20769a(Result result) {
        return ((WorkAccountApi.AddAccountResult) result).mo20761K();
    }
}
