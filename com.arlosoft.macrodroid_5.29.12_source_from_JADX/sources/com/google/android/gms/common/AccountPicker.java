package com.google.android.gms.common;

import android.accounts.Account;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class AccountPicker {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class AccountChooserOptions {
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: a */
        public Account f3021a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public boolean f3022b;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: c */
        public ArrayList f3023c;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: d */
        public ArrayList f3024d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public boolean f3025e;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: f */
        public String f3026f;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: g */
        public Bundle f3027g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f3028h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f3029i;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: j */
        public String f3030j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f3031k;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: l */
        public zza f3032l;
        /* access modifiers changed from: private */
        @Nullable

        /* renamed from: m */
        public String f3033m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public boolean f3034n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public boolean f3035o;

        /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
        public static class Builder {
            @Nullable

            /* renamed from: a */
            private Account f3036a;
            @Nullable

            /* renamed from: b */
            private ArrayList f3037b;
            @Nullable

            /* renamed from: c */
            private ArrayList f3038c;

            /* renamed from: d */
            private boolean f3039d = false;
            @Nullable

            /* renamed from: e */
            private String f3040e;
            @Nullable

            /* renamed from: f */
            private Bundle f3041f;

            @NonNull
            /* renamed from: a */
            public AccountChooserOptions mo21124a() {
                Preconditions.m4479b(true, "We only support hostedDomain filter for account chip styled account picker");
                Preconditions.m4479b(true, "Consent is only valid for account chip styled account picker");
                AccountChooserOptions accountChooserOptions = new AccountChooserOptions();
                accountChooserOptions.f3024d = this.f3038c;
                accountChooserOptions.f3023c = this.f3037b;
                accountChooserOptions.f3025e = this.f3039d;
                accountChooserOptions.f3032l = null;
                accountChooserOptions.f3030j = null;
                accountChooserOptions.f3027g = this.f3041f;
                accountChooserOptions.f3021a = this.f3036a;
                accountChooserOptions.f3022b = false;
                accountChooserOptions.f3028h = false;
                accountChooserOptions.f3033m = null;
                accountChooserOptions.f3029i = 0;
                accountChooserOptions.f3026f = this.f3040e;
                accountChooserOptions.f3031k = false;
                accountChooserOptions.f3034n = false;
                accountChooserOptions.f3035o = false;
                return accountChooserOptions;
            }

            @NonNull
            @CanIgnoreReturnValue
            /* renamed from: b */
            public Builder mo21125b(@Nullable List<String> list) {
                this.f3038c = list == null ? null : new ArrayList(list);
                return this;
            }

            @NonNull
            @CanIgnoreReturnValue
            /* renamed from: c */
            public Builder mo21126c(@Nullable Account account) {
                this.f3036a = account;
                return this;
            }
        }
    }

    private AccountPicker() {
    }

    @NonNull
    @Deprecated
    /* renamed from: a */
    public static Intent m3475a(@Nullable Account account, @Nullable ArrayList<Account> arrayList, @Nullable String[] strArr, boolean z, @Nullable String str, @Nullable String str2, @Nullable String[] strArr2, @Nullable Bundle bundle) {
        Intent intent = new Intent();
        Preconditions.m4479b(true, "We only support hostedDomain filter for account chip styled account picker");
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", arrayList);
        intent.putExtra("allowableAccountTypes", strArr);
        intent.putExtra("addAccountOptions", bundle);
        intent.putExtra("selectedAccount", account);
        intent.putExtra("alwaysPromptForAccount", z);
        intent.putExtra("descriptionTextOverride", str);
        intent.putExtra("authTokenType", str2);
        intent.putExtra("addAccountRequiredFeatures", strArr2);
        intent.putExtra("setGmsCoreAccount", false);
        intent.putExtra("overrideTheme", 0);
        intent.putExtra("overrideCustomTheme", 0);
        intent.putExtra("hostedDomainFilter", (String) null);
        return intent;
    }

    @NonNull
    /* renamed from: b */
    public static Intent m3476b(@NonNull AccountChooserOptions accountChooserOptions) {
        Intent intent = new Intent();
        boolean unused = accountChooserOptions.f3031k;
        String unused2 = accountChooserOptions.f3030j;
        Preconditions.m4479b(true, "We only support hostedDomain filter for account chip styled account picker");
        zza unused3 = accountChooserOptions.f3032l;
        Preconditions.m4479b(true, "Consent is only valid for account chip styled account picker");
        boolean unused4 = accountChooserOptions.f3022b;
        Preconditions.m4479b(true, "Making the selected account non-clickable is only supported for the theme THEME_DAY_NIGHT_GOOGLE_MATERIAL2");
        boolean unused5 = accountChooserOptions.f3031k;
        intent.setAction("com.google.android.gms.common.account.CHOOSE_ACCOUNT");
        intent.setPackage("com.google.android.gms");
        intent.putExtra("allowableAccounts", accountChooserOptions.f3023c);
        if (accountChooserOptions.f3024d != null) {
            intent.putExtra("allowableAccountTypes", (String[]) accountChooserOptions.f3024d.toArray(new String[0]));
        }
        intent.putExtra("addAccountOptions", accountChooserOptions.f3027g);
        intent.putExtra("selectedAccount", accountChooserOptions.f3021a);
        boolean unused6 = accountChooserOptions.f3022b;
        intent.putExtra("selectedAccountIsNotClickable", false);
        intent.putExtra("alwaysPromptForAccount", accountChooserOptions.f3025e);
        intent.putExtra("descriptionTextOverride", accountChooserOptions.f3026f);
        boolean unused7 = accountChooserOptions.f3028h;
        intent.putExtra("setGmsCoreAccount", false);
        String unused8 = accountChooserOptions.f3033m;
        intent.putExtra("realClientPackage", (String) null);
        int unused9 = accountChooserOptions.f3029i;
        intent.putExtra("overrideTheme", 0);
        boolean unused10 = accountChooserOptions.f3031k;
        intent.putExtra("overrideCustomTheme", 0);
        String unused11 = accountChooserOptions.f3030j;
        intent.putExtra("hostedDomainFilter", (String) null);
        Bundle bundle = new Bundle();
        boolean unused12 = accountChooserOptions.f3031k;
        zza unused13 = accountChooserOptions.f3032l;
        boolean unused14 = accountChooserOptions.f3034n;
        boolean unused15 = accountChooserOptions.f3035o;
        if (!bundle.isEmpty()) {
            intent.putExtra("first_party_options_bundle", bundle);
        }
        return intent;
    }
}
