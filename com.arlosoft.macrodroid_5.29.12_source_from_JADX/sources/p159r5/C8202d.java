package p159r5;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.firebase.p073ui.auth.IdpResponse;
import com.firebase.p073ui.auth.data.model.User;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.AuthCredential;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* renamed from: r5.d */
/* compiled from: EmailLinkPersistenceManager */
public class C8202d {

    /* renamed from: b */
    private static final Set<String> f19878b = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"com.firebase.ui.auth.data.client.email", "com.firebase.ui.auth.data.client.provider", "com.firebase.ui.auth.data.client.idpToken", "com.firebase.ui.auth.data.client.idpSecret"})));

    /* renamed from: c */
    private static final C8202d f19879c = new C8202d();

    /* renamed from: a */
    private AuthCredential f19880a;

    /* renamed from: r5.d$a */
    /* compiled from: EmailLinkPersistenceManager */
    public static class C8203a {

        /* renamed from: a */
        private String f19881a;

        /* renamed from: b */
        private String f19882b;
        @Nullable

        /* renamed from: c */
        private String f19883c;
        @Nullable

        /* renamed from: d */
        private IdpResponse f19884d;

        public C8203a(@NonNull String str, @Nullable String str2) {
            Preconditions.m4488k(str);
            this.f19881a = str;
            this.f19883c = str2;
        }

        /* renamed from: a */
        public String mo38286a() {
            return this.f19882b;
        }

        @Nullable
        /* renamed from: b */
        public IdpResponse mo38287b() {
            return this.f19884d;
        }

        /* renamed from: c */
        public String mo38288c() {
            return this.f19881a;
        }

        /* renamed from: d */
        public C8203a mo38289d(@NonNull String str) {
            this.f19882b = str;
            return this;
        }

        /* renamed from: e */
        public C8203a mo38290e(@NonNull IdpResponse idpResponse) {
            this.f19884d = idpResponse;
            return this;
        }
    }

    /* renamed from: b */
    public static C8202d m34038b() {
        return f19879c;
    }

    /* renamed from: a */
    public void mo38282a(@NonNull Context context) {
        Preconditions.m4488k(context);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.firebase.ui.auth.util.data.EmailLinkPersistenceManager", 0).edit();
        for (String remove : f19878b) {
            edit.remove(remove);
        }
        edit.apply();
    }

    @Nullable
    /* renamed from: c */
    public C8203a mo38283c(@NonNull Context context) {
        Preconditions.m4488k(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.firebase.ui.auth.util.data.EmailLinkPersistenceManager", 0);
        String string = sharedPreferences.getString("com.firebase.ui.auth.data.client.email", (String) null);
        String string2 = sharedPreferences.getString("com.firebase.ui.auth.data.client.sid", (String) null);
        if (string == null || string2 == null) {
            return null;
        }
        String string3 = sharedPreferences.getString("com.firebase.ui.auth.data.client.auid", (String) null);
        String string4 = sharedPreferences.getString("com.firebase.ui.auth.data.client.provider", (String) null);
        String string5 = sharedPreferences.getString("com.firebase.ui.auth.data.client.idpToken", (String) null);
        String string6 = sharedPreferences.getString("com.firebase.ui.auth.data.client.idpSecret", (String) null);
        C8203a d = new C8203a(string2, string3).mo38289d(string);
        if (!(string4 == null || (string5 == null && this.f19880a == null))) {
            d.mo38290e(new IdpResponse.C6845b(new User.C6853b(string4, string).mo34171a()).mo34111c(this.f19880a).mo34113e(string5).mo34112d(string6).mo34110b(false).mo34109a());
        }
        this.f19880a = null;
        return d;
    }

    /* renamed from: d */
    public void mo38284d(@NonNull Context context, @NonNull String str, @NonNull String str2, @Nullable String str3) {
        Preconditions.m4488k(context);
        Preconditions.m4488k(str);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.firebase.ui.auth.util.data.EmailLinkPersistenceManager", 0).edit();
        edit.putString("com.firebase.ui.auth.data.client.email", str);
        edit.putString("com.firebase.ui.auth.data.client.auid", str3);
        edit.putString("com.firebase.ui.auth.data.client.sid", str2);
        edit.apply();
    }

    /* renamed from: e */
    public void mo38285e(@NonNull Context context, @NonNull IdpResponse idpResponse) {
        if (idpResponse.mo34097p()) {
            this.f19880a = idpResponse.mo34089h();
        }
        Preconditions.m4488k(context);
        Preconditions.m4488k(idpResponse);
        SharedPreferences.Editor edit = context.getSharedPreferences("com.firebase.ui.auth.util.data.EmailLinkPersistenceManager", 0).edit();
        edit.putString("com.firebase.ui.auth.data.client.email", idpResponse.mo34091i());
        edit.putString("com.firebase.ui.auth.data.client.provider", idpResponse.mo34095n());
        edit.putString("com.firebase.ui.auth.data.client.idpToken", idpResponse.mo34094m());
        edit.putString("com.firebase.ui.auth.data.client.idpSecret", idpResponse.mo34093l());
        edit.apply();
    }
}
