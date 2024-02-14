package com.google.api.client.googleapis.extensions.android.accounts;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import com.google.api.client.util.Beta;
import com.google.api.client.util.Preconditions;

@Beta
public final class GoogleAccountManager {

    /* renamed from: a */
    private final AccountManager f52284a;

    public GoogleAccountManager(AccountManager accountManager) {
        this.f52284a = (AccountManager) Preconditions.m72716d(accountManager);
    }

    /* renamed from: a */
    public Account mo60268a(String str) {
        if (str == null) {
            return null;
        }
        for (Account account : mo60269b()) {
            if (str.equals(account.name)) {
                return account;
            }
        }
        return null;
    }

    /* renamed from: b */
    public Account[] mo60269b() {
        return this.f52284a.getAccountsByType("com.google");
    }

    public GoogleAccountManager(Context context) {
        this(AccountManager.get(context));
    }
}
