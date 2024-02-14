package com.firebase.p073ui.auth;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.app.NotificationCompat;
import com.facebook.login.LoginManager;
import com.firebase.p073ui.auth.data.model.FlowParameters;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import p153q5.C8179c;
import p153q5.C8180d;
import p159r5.C8204e;
import p159r5.C8206g;

/* renamed from: com.firebase.ui.auth.AuthUI */
public final class AuthUI {

    /* renamed from: e */
    public static final Set<String> f15907e = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"google.com", "facebook.com", "twitter.com", "github.com", "password", "phone", "anonymous", "emailLink"})));

    /* renamed from: f */
    public static final Set<String> f15908f = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"microsoft.com", "yahoo.com", "apple.com", "twitter.com", "github.com"})));
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})

    /* renamed from: g */
    public static final Set<String> f15909g = Collections.unmodifiableSet(new HashSet(Arrays.asList(new String[]{"google.com", "facebook.com"})));

    /* renamed from: h */
    private static final IdentityHashMap<FirebaseApp, AuthUI> f15910h = new IdentityHashMap<>();

    /* renamed from: i */
    private static Context f15911i;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final FirebaseApp f15912a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final FirebaseAuth f15913b;

    /* renamed from: c */
    private String f15914c = null;

    /* renamed from: d */
    private int f15915d = -1;

    /* renamed from: com.firebase.ui.auth.AuthUI$IdpConfig */
    public static final class IdpConfig implements Parcelable {
        public static final Parcelable.Creator<IdpConfig> CREATOR = new C6834a();

        /* renamed from: a */
        private final String f15916a;

        /* renamed from: c */
        private final Bundle f15917c;

        /* renamed from: com.firebase.ui.auth.AuthUI$IdpConfig$a */
        static class C6834a implements Parcelable.Creator<IdpConfig> {
            C6834a() {
            }

            /* renamed from: a */
            public IdpConfig createFromParcel(Parcel parcel) {
                return new IdpConfig(parcel, (C6849a) null);
            }

            /* renamed from: b */
            public IdpConfig[] newArray(int i) {
                return new IdpConfig[i];
            }
        }

        /* renamed from: com.firebase.ui.auth.AuthUI$IdpConfig$b */
        public static class C6835b {

            /* renamed from: a */
            private final Bundle f15918a = new Bundle();
            /* access modifiers changed from: private */

            /* renamed from: b */
            public String f15919b;

            protected C6835b(@NonNull String str) {
                if (AuthUI.f15907e.contains(str) || AuthUI.f15908f.contains(str)) {
                    this.f15919b = str;
                    return;
                }
                throw new IllegalArgumentException("Unknown provider: " + str);
            }

            @CallSuper
            @NonNull
            /* renamed from: b */
            public IdpConfig mo34067b() {
                return new IdpConfig(this.f15919b, this.f15918a, (C6849a) null);
            }

            /* access modifiers changed from: protected */
            @NonNull
            @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
            /* renamed from: c */
            public final Bundle mo34068c() {
                return this.f15918a;
            }
        }

        /* renamed from: com.firebase.ui.auth.AuthUI$IdpConfig$c */
        public static final class C6836c extends C6835b {
            public C6836c() {
                super("password");
            }

            /* renamed from: b */
            public IdpConfig mo34067b() {
                if (this.f15919b.equals("emailLink")) {
                    ActionCodeSettings actionCodeSettings = (ActionCodeSettings) mo34068c().getParcelable("action_code_settings");
                    C8180d.m33938b(actionCodeSettings, "ActionCodeSettings cannot be null when using email link sign in.", new Object[0]);
                    if (!actionCodeSettings.mo22554l2()) {
                        throw new IllegalStateException("You must set canHandleCodeInApp in your ActionCodeSettings to true for Email-Link Sign-in.");
                    }
                }
                return super.mo34067b();
            }
        }

        /* renamed from: com.firebase.ui.auth.AuthUI$IdpConfig$d */
        public static class C6837d extends C6835b {
            public C6837d(@NonNull String str, @NonNull String str2, int i) {
                super(str);
                C8180d.m33938b(str, "The provider ID cannot be null.", new Object[0]);
                C8180d.m33938b(str2, "The provider name cannot be null.", new Object[0]);
                mo34068c().putString("generic_oauth_provider_id", str);
                mo34068c().putString("generic_oauth_provider_name", str2);
                mo34068c().putInt("generic_oauth_button_id", i);
            }
        }

        /* renamed from: com.firebase.ui.auth.AuthUI$IdpConfig$e */
        public static final class C6838e extends C6835b {
            public C6838e() {
                super("google.com");
            }

            /* renamed from: f */
            private void m25717f() {
                C8180d.m33937a(AuthUI.m25695e(), "Check your google-services plugin configuration, the default_web_client_id string wasn't populated.", R$string.default_web_client_id);
            }

            @NonNull
            /* renamed from: b */
            public IdpConfig mo34067b() {
                if (!mo34068c().containsKey("extra_google_sign_in_options")) {
                    m25717f();
                    mo34069d(Collections.emptyList());
                }
                return super.mo34067b();
            }

            @NonNull
            /* renamed from: d */
            public C6838e mo34069d(@NonNull List<String> list) {
                GoogleSignInOptions.Builder b = new GoogleSignInOptions.Builder(GoogleSignInOptions.f2878C).mo20991b();
                for (String scope : list) {
                    b.mo20995f(new Scope(scope), new Scope[0]);
                }
                return mo34070e(b.mo20990a());
            }

            @NonNull
            /* renamed from: e */
            public C6838e mo34070e(@NonNull GoogleSignInOptions googleSignInOptions) {
                C8180d.m33939c(mo34068c(), "Cannot overwrite previously set sign-in options.", "extra_google_sign_in_options");
                GoogleSignInOptions.Builder builder = new GoogleSignInOptions.Builder(googleSignInOptions);
                String o2 = googleSignInOptions.mo20984o2();
                if (o2 == null) {
                    m25717f();
                    o2 = AuthUI.m25695e().getString(R$string.default_web_client_id);
                }
                boolean z = false;
                Iterator<Scope> it = googleSignInOptions.mo20983n2().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (NotificationCompat.CATEGORY_EMAIL.equals(it.next().mo21286l2())) {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!z) {
                    Log.w("AuthUI", "The GoogleSignInOptions passed to setSignInOptions does not request the 'email' scope. In most cases this is a mistake! Call requestEmail() on the GoogleSignInOptions object.");
                }
                builder.mo20993d(o2);
                mo34068c().putParcelable("extra_google_sign_in_options", builder.mo20990a());
                return this;
            }
        }

        /* renamed from: com.firebase.ui.auth.AuthUI$IdpConfig$f */
        public static final class C6839f extends C6835b {
            public C6839f() {
                super("phone");
            }

            /* renamed from: d */
            private boolean m25721d(List<String> list, String str) {
                String upperCase = str.toUpperCase(Locale.getDefault());
                for (String next : list) {
                    if (C8204e.m34064q(next)) {
                        if (next.equals(upperCase)) {
                            return true;
                        }
                    } else if (C8204e.m34055h(next).contains(upperCase)) {
                        return true;
                    }
                }
                return false;
            }

            /* renamed from: e */
            private String m25722e() {
                if (mo34068c().containsKey("extra_country_iso")) {
                    return mo34068c().getString("extra_country_iso");
                }
                return null;
            }

            /* renamed from: f */
            private List<String> m25723f() {
                ArrayList arrayList = new ArrayList();
                String string = mo34068c().getString("extra_phone_number");
                if (string != null && string.startsWith("+")) {
                    List<String> h = C8204e.m34055h("+" + C8204e.m34059l(string).mo37729a());
                    if (h != null) {
                        arrayList.addAll(h);
                    }
                }
                return arrayList;
            }

            /* renamed from: g */
            private boolean m25724g(List<String> list, String str, boolean z) {
                if (str == null) {
                    return true;
                }
                boolean d = m25721d(list, str);
                if (!d || !z) {
                    return !d && !z;
                }
                return true;
            }

            /* renamed from: h */
            private void m25725h(List<String> list) {
                for (String next : list) {
                    if (!C8204e.m34064q(next) && !C8204e.m34063p(next)) {
                        throw new IllegalArgumentException("Invalid input: You must provide a valid country iso (alpha-2) or code (e-164). e.g. 'us' or '+1'.");
                    }
                }
            }

            /* renamed from: i */
            private void m25726i(List<String> list, boolean z) {
                if (!mo34068c().containsKey("extra_country_iso") && !mo34068c().containsKey("extra_phone_number")) {
                    return;
                }
                if (!m25727j(list, z) || !m25728k(list, z)) {
                    throw new IllegalArgumentException("Invalid default country iso. Make sure it is either part of the allowed list or that you haven't blocked it.");
                }
            }

            /* renamed from: j */
            private boolean m25727j(List<String> list, boolean z) {
                return m25724g(list, m25722e(), z);
            }

            /* renamed from: k */
            private boolean m25728k(List<String> list, boolean z) {
                List<String> f = m25723f();
                for (String g : f) {
                    if (m25724g(list, g, z)) {
                        return true;
                    }
                }
                return f.isEmpty();
            }

            /* renamed from: l */
            private void m25729l() {
                ArrayList<String> stringArrayList = mo34068c().getStringArrayList("allowlisted_countries");
                ArrayList<String> stringArrayList2 = mo34068c().getStringArrayList("blocklisted_countries");
                if (stringArrayList != null && stringArrayList2 != null) {
                    throw new IllegalStateException("You can either allowlist or blocked country codes for phone authentication.");
                } else if (stringArrayList != null) {
                    m25730m(stringArrayList, true);
                } else if (stringArrayList2 != null) {
                    m25730m(stringArrayList2, false);
                }
            }

            /* renamed from: m */
            private void m25730m(List<String> list, boolean z) {
                m25725h(list);
                m25726i(list, z);
            }

            /* renamed from: b */
            public IdpConfig mo34067b() {
                m25729l();
                return super.mo34067b();
            }
        }

        /* synthetic */ IdpConfig(Parcel parcel, C6849a aVar) {
            this(parcel);
        }

        @NonNull
        /* renamed from: a */
        public Bundle mo34056a() {
            return new Bundle(this.f15917c);
        }

        @NonNull
        /* renamed from: b */
        public String mo34057b() {
            return this.f15916a;
        }

        public int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || IdpConfig.class != obj.getClass()) {
                return false;
            }
            return this.f15916a.equals(((IdpConfig) obj).f15916a);
        }

        public final int hashCode() {
            return this.f15916a.hashCode();
        }

        public String toString() {
            return "IdpConfig{mProviderId='" + this.f15916a + '\'' + ", mParams=" + this.f15917c + '}';
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f15916a);
            parcel.writeBundle(this.f15917c);
        }

        /* synthetic */ IdpConfig(String str, Bundle bundle, C6849a aVar) {
            this(str, bundle);
        }

        private IdpConfig(@NonNull String str, @NonNull Bundle bundle) {
            this.f15916a = str;
            this.f15917c = new Bundle(bundle);
        }

        private IdpConfig(Parcel parcel) {
            this.f15916a = parcel.readString();
            this.f15917c = parcel.readBundle(IdpConfig.class.getClassLoader());
        }
    }

    /* renamed from: com.firebase.ui.auth.AuthUI$a */
    class C6840a implements Continuation<Void, Void> {
        C6840a() {
        }

        /* renamed from: b */
        public Void mo21119a(@NonNull Task<Void> task) {
            Exception o = task.mo23714o();
            if (!(o instanceof ApiException) || ((ApiException) o).mo21210b() != 16) {
                return task.mo23715p();
            }
            Log.w("AuthUI", "Could not disable auto-sign in, maybe there are no SmartLock accounts available?", o);
            return null;
        }
    }

    /* renamed from: com.firebase.ui.auth.AuthUI$b */
    class C6841b implements Continuation<Void, Void> {
        C6841b() {
        }

        /* renamed from: b */
        public Void mo21119a(@NonNull Task<Void> task) {
            task.mo23715p();
            AuthUI.this.f15913b.mo22628u();
            return null;
        }
    }

    /* renamed from: com.firebase.ui.auth.AuthUI$d */
    public final class C6843d extends C6842c<C6843d> {

        /* renamed from: n */
        private String f15935n;

        /* renamed from: o */
        private boolean f15936o;

        /* synthetic */ C6843d(AuthUI authUI, C6849a aVar) {
            this();
        }

        @CallSuper
        @NonNull
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Intent mo34073a() {
            return super.mo34073a();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public FlowParameters mo34074b() {
            return new FlowParameters(AuthUI.this.f15912a.mo61951o(), this.f15922a, this.f15923b, this.f15925d, this.f15924c, this.f15926e, this.f15927f, this.f15930i, this.f15931j, this.f15936o, this.f15928g, this.f15929h, this.f15935n, this.f15933l, this.f15932k);
        }

        @NonNull
        /* renamed from: c */
        public /* bridge */ /* synthetic */ C6842c mo34075c(boolean z) {
            return super.mo34075c(z);
        }

        @NonNull
        /* renamed from: d */
        public /* bridge */ /* synthetic */ C6842c mo34076d(@NonNull List list) {
            return super.mo34076d(list);
        }

        @NonNull
        /* renamed from: e */
        public /* bridge */ /* synthetic */ C6842c mo34077e(boolean z) {
            return super.mo34077e(z);
        }

        @NonNull
        /* renamed from: g */
        public /* bridge */ /* synthetic */ C6842c mo34079g(@DrawableRes int i) {
            return super.mo34079g(i);
        }

        @NonNull
        /* renamed from: h */
        public /* bridge */ /* synthetic */ C6842c mo34080h(@StyleRes int i) {
            return super.mo34080h(i);
        }

        private C6843d() {
            super(AuthUI.this, (C6849a) null);
        }
    }

    private AuthUI(FirebaseApp firebaseApp) {
        this.f15912a = firebaseApp;
        FirebaseAuth instance = FirebaseAuth.getInstance(firebaseApp);
        this.f15913b = instance;
        try {
            instance.mo22623p("7.2.0");
        } catch (Exception e) {
            Log.e("AuthUI", "Couldn't set the FUI version.", e);
        }
        this.f15913b.mo22630w();
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: e */
    public static Context m25695e() {
        return f15911i;
    }

    @StyleRes
    /* renamed from: g */
    public static int m25696g() {
        return R$style.FirebaseUI;
    }

    @NonNull
    /* renamed from: j */
    public static AuthUI m25697j() {
        return m25698k(FirebaseApp.m74383m());
    }

    @NonNull
    /* renamed from: k */
    public static AuthUI m25698k(@NonNull FirebaseApp firebaseApp) {
        AuthUI authUI;
        if (C8206g.f19892c) {
            Log.w("AuthUI", String.format("Beginning with FirebaseUI 6.2.0 you no longer need to include %s to sign in with %s. Go to %s for more information", new Object[]{"the TwitterKit SDK", "Twitter", "https://github.com/firebase/FirebaseUI-Android/releases/tag/6.2.0"}));
        }
        if (C8206g.f19890a) {
            Log.w("AuthUI", String.format("Beginning with FirebaseUI 6.2.0 you no longer need to include %s to sign in with %s. Go to %s for more information", new Object[]{"com.firebaseui:firebase-ui-auth-github", "GitHub", "https://github.com/firebase/FirebaseUI-Android/releases/tag/6.2.0"}));
        }
        IdentityHashMap<FirebaseApp, AuthUI> identityHashMap = f15910h;
        synchronized (identityHashMap) {
            authUI = identityHashMap.get(firebaseApp);
            if (authUI == null) {
                authUI = new AuthUI(firebaseApp);
                identityHashMap.put(firebaseApp, authUI);
            }
        }
        return authUI;
    }

    @NonNull
    /* renamed from: l */
    public static AuthUI m25699l(@NonNull String str) {
        return m25698k(FirebaseApp.m74384n(str));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: n */
    public static void m25700n(@NonNull Context context) {
        f15911i = ((Context) C8180d.m33938b(context, "App context cannot be null.", new Object[0])).getApplicationContext();
    }

    /* renamed from: p */
    private Task<Void> m25701p(@NonNull Context context) {
        if (C8206g.f19891b) {
            LoginManager.getInstance().logOut();
        }
        if (C8179c.m33936b(context)) {
            return GoogleSignIn.m3281a(context, GoogleSignInOptions.f2878C).mo20977I();
        }
        return Tasks.m66667f(null);
    }

    @NonNull
    /* renamed from: c */
    public C6843d mo34049c() {
        return new C6843d(this, (C6849a) null);
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: d */
    public FirebaseApp mo34050d() {
        return this.f15912a;
    }

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: f */
    public FirebaseAuth mo34051f() {
        return this.f15913b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: h */
    public String mo34052h() {
        return this.f15914c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: i */
    public int mo34053i() {
        return this.f15915d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* renamed from: m */
    public boolean mo34054m() {
        return this.f15914c != null && this.f15915d >= 0;
    }

    @NonNull
    /* renamed from: o */
    public Task<Void> mo34055o(@NonNull Context context) {
        Task<Void> task;
        boolean b = C8179c.m33936b(context);
        if (!b) {
            Log.w("AuthUI", "Google Play services not available during signOut");
        }
        if (b) {
            task = C8179c.m33935a(context).mo20845H();
        } else {
            task = Tasks.m66667f(null);
        }
        task.mo23710k(new C6840a());
        return Tasks.m66669h(m25701p(context), task).mo23710k(new C6841b());
    }

    /* renamed from: com.firebase.ui.auth.AuthUI$c */
    private abstract class C6842c<T extends C6842c> {

        /* renamed from: a */
        final List<IdpConfig> f15922a;

        /* renamed from: b */
        IdpConfig f15923b;

        /* renamed from: c */
        int f15924c;

        /* renamed from: d */
        int f15925d;

        /* renamed from: e */
        String f15926e;

        /* renamed from: f */
        String f15927f;

        /* renamed from: g */
        boolean f15928g;

        /* renamed from: h */
        boolean f15929h;

        /* renamed from: i */
        boolean f15930i;

        /* renamed from: j */
        boolean f15931j;

        /* renamed from: k */
        AuthMethodPickerLayout f15932k;

        /* renamed from: l */
        ActionCodeSettings f15933l;

        private C6842c() {
            this.f15922a = new ArrayList();
            this.f15923b = null;
            this.f15924c = -1;
            this.f15925d = AuthUI.m25696g();
            this.f15928g = false;
            this.f15929h = false;
            this.f15930i = true;
            this.f15931j = true;
            this.f15932k = null;
            this.f15933l = null;
        }

        @CallSuper
        @NonNull
        /* renamed from: a */
        public Intent mo34073a() {
            if (this.f15922a.isEmpty()) {
                this.f15922a.add(new IdpConfig.C6836c().mo34067b());
            }
            return KickoffActivity.m25786V1(AuthUI.this.f15912a.mo61950l(), mo34074b());
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public abstract FlowParameters mo34074b();

        @NonNull
        /* renamed from: c */
        public T mo34075c(boolean z) {
            if (!z || this.f15923b == null) {
                this.f15928g = z;
                return this;
            }
            throw new IllegalStateException("Can't show provider choice with a default provider.");
        }

        @NonNull
        /* renamed from: d */
        public T mo34076d(@NonNull List<IdpConfig> list) {
            C8180d.m33938b(list, "idpConfigs cannot be null", new Object[0]);
            if (list.size() != 1 || !list.get(0).mo34057b().equals("anonymous")) {
                this.f15922a.clear();
                for (IdpConfig next : list) {
                    if (!this.f15922a.contains(next)) {
                        this.f15922a.add(next);
                    } else {
                        throw new IllegalArgumentException("Each provider can only be set once. " + next.mo34057b() + " was set twice.");
                    }
                }
                return this;
            }
            throw new IllegalStateException("Sign in as guest cannot be the only sign in method. In this case, sign the user in anonymously your self; no UI is needed.");
        }

        @NonNull
        /* renamed from: e */
        public T mo34077e(boolean z) {
            return mo34078f(z, z);
        }

        @NonNull
        /* renamed from: f */
        public T mo34078f(boolean z, boolean z2) {
            this.f15930i = z;
            this.f15931j = z2;
            return this;
        }

        @NonNull
        /* renamed from: g */
        public T mo34079g(@DrawableRes int i) {
            this.f15924c = i;
            return this;
        }

        @NonNull
        /* renamed from: h */
        public T mo34080h(@StyleRes int i) {
            this.f15925d = C8180d.m33940d(AuthUI.this.f15912a.mo61950l(), i, "theme identifier is unknown or not a style definition", new Object[0]);
            return this;
        }

        /* synthetic */ C6842c(AuthUI authUI, C6849a aVar) {
            this();
        }
    }
}
