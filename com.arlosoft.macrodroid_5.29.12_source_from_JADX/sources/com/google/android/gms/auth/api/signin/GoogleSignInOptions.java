package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.auth.api.signin.internal.HashAccumulator;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class GoogleSignInOptions extends AbstractSafeParcelable implements Api.ApiOptions.Optional, ReflectedParcelable {
    @NonNull

    /* renamed from: C */
    public static final GoogleSignInOptions f2878C;
    @NonNull
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR = new zae();
    @NonNull

    /* renamed from: D */
    public static final GoogleSignInOptions f2879D;
    @NonNull
    @VisibleForTesting

    /* renamed from: E */
    public static final Scope f2880E = new Scope("profile");
    @NonNull
    @VisibleForTesting

    /* renamed from: F */
    public static final Scope f2881F = new Scope(NotificationCompat.CATEGORY_EMAIL);
    @NonNull
    @VisibleForTesting

    /* renamed from: G */
    public static final Scope f2882G = new Scope("openid");
    @NonNull
    @VisibleForTesting

    /* renamed from: H */
    public static final Scope f2883H;
    @NonNull
    @VisibleForTesting

    /* renamed from: I */
    public static final Scope f2884I = new Scope("https://www.googleapis.com/auth/games");

    /* renamed from: J */
    private static Comparator f2885J = new zac();
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: A */
    public String f2886A;

    /* renamed from: B */
    private Map f2887B;
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f2888a;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: c */
    public final ArrayList f2889c;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    public Account f2890d;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: f */
    public boolean f2891f;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: g */
    public final boolean f2892g;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: o */
    public final boolean f2893o;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    public String f2894p;
    /* access modifiers changed from: private */
    @SafeParcelable.Field
    @Nullable

    /* renamed from: s */
    public String f2895s;
    /* access modifiers changed from: private */
    @SafeParcelable.Field

    /* renamed from: z */
    public ArrayList f2896z;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f2883H = scope;
        Builder builder = new Builder();
        builder.mo20992c();
        builder.mo20994e();
        f2878C = builder.mo20990a();
        Builder builder2 = new Builder();
        builder2.mo20995f(scope, new Scope[0]);
        f2879D = builder2.mo20990a();
    }

    @SafeParcelable.Constructor
    GoogleSignInOptions(@SafeParcelable.Param int i, @SafeParcelable.Param ArrayList arrayList, @SafeParcelable.Param @Nullable Account account, @SafeParcelable.Param boolean z, @SafeParcelable.Param boolean z2, @SafeParcelable.Param boolean z3, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param ArrayList arrayList2, @SafeParcelable.Param @Nullable String str3) {
        this(i, arrayList, account, z, z2, z3, str, str2, m3306E2(arrayList2), str3);
    }

    /* synthetic */ GoogleSignInOptions(int i, ArrayList arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map map, String str3, zad zad) {
        this(3, arrayList, account, z, z2, z3, str, str2, map, str3);
    }

    /* access modifiers changed from: private */
    /* renamed from: E2 */
    public static Map m3306E2(@Nullable List list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable = (GoogleSignInOptionsExtensionParcelable) it.next();
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.mo21003l2()), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    @Nullable
    /* renamed from: t2 */
    public static GoogleSignInOptions m3308t2(@Nullable String str) throws JSONException {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        Account account = !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null;
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            str2 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z, z2, z3, optString2, str2, (Map) new HashMap(), (String) null);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: K */
    public Account mo20978K() {
        return this.f2890d;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        if (r1.equals(r4.mo20978K()) != false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(@androidx.annotation.Nullable java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r1 = r3.f2896z     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 > 0) goto L_0x0090
            java.util.ArrayList r1 = r4.f2896z     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 <= 0) goto L_0x0018
            goto L_0x0090
        L_0x0018:
            java.util.ArrayList r1 = r3.f2889c     // Catch:{ ClassCastException -> 0x0090 }
            int r1 = r1.size()     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo20983n2()     // Catch:{ ClassCastException -> 0x0090 }
            int r2 = r2.size()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.util.ArrayList r1 = r3.f2889c     // Catch:{ ClassCastException -> 0x0090 }
            java.util.ArrayList r2 = r4.mo20983n2()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.containsAll(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0035
            goto L_0x0090
        L_0x0035:
            android.accounts.Account r1 = r3.f2890d     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0040
            android.accounts.Account r1 = r4.mo20978K()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x0090
            goto L_0x004a
        L_0x0040:
            android.accounts.Account r2 = r4.mo20978K()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
        L_0x004a:
            java.lang.String r1 = r3.f2894p     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x005d
            java.lang.String r1 = r4.mo20984o2()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 == 0) goto L_0x0090
            goto L_0x006a
        L_0x005d:
            java.lang.String r1 = r3.f2894p     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r2 = r4.mo20984o2()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r1 = r1.equals(r2)     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != 0) goto L_0x006a
            goto L_0x0090
        L_0x006a:
            boolean r1 = r3.f2893o     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo20985p2()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f2891f     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo20986q2()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            boolean r1 = r3.f2892g     // Catch:{ ClassCastException -> 0x0090 }
            boolean r2 = r4.mo20987r2()     // Catch:{ ClassCastException -> 0x0090 }
            if (r1 != r2) goto L_0x0090
            java.lang.String r1 = r3.f2886A     // Catch:{ ClassCastException -> 0x0090 }
            java.lang.String r4 = r4.mo20982m2()     // Catch:{ ClassCastException -> 0x0090 }
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch:{ ClassCastException -> 0x0090 }
            if (r4 == 0) goto L_0x0090
            r4 = 1
            return r4
        L_0x0090:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f2889c;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((Scope) arrayList2.get(i)).mo21286l2());
        }
        Collections.sort(arrayList);
        HashAccumulator hashAccumulator = new HashAccumulator();
        hashAccumulator.mo21005a(arrayList);
        hashAccumulator.mo21005a(this.f2890d);
        hashAccumulator.mo21005a(this.f2894p);
        hashAccumulator.mo21007c(this.f2893o);
        hashAccumulator.mo21007c(this.f2891f);
        hashAccumulator.mo21007c(this.f2892g);
        hashAccumulator.mo21005a(this.f2886A);
        return hashAccumulator.mo21006b();
    }

    @NonNull
    @KeepForSdk
    /* renamed from: l2 */
    public ArrayList<GoogleSignInOptionsExtensionParcelable> mo20981l2() {
        return this.f2896z;
    }

    @KeepForSdk
    @Nullable
    /* renamed from: m2 */
    public String mo20982m2() {
        return this.f2886A;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: n2 */
    public ArrayList<Scope> mo20983n2() {
        return new ArrayList<>(this.f2889c);
    }

    @KeepForSdk
    @Nullable
    /* renamed from: o2 */
    public String mo20984o2() {
        return this.f2894p;
    }

    @KeepForSdk
    /* renamed from: p2 */
    public boolean mo20985p2() {
        return this.f2893o;
    }

    @KeepForSdk
    /* renamed from: q2 */
    public boolean mo20986q2() {
        return this.f2891f;
    }

    @KeepForSdk
    /* renamed from: r2 */
    public boolean mo20987r2() {
        return this.f2892g;
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f2888a);
        SafeParcelWriter.m4558B(parcel, 2, mo20983n2(), false);
        SafeParcelWriter.m4584v(parcel, 3, mo20978K(), i, false);
        SafeParcelWriter.m4565c(parcel, 4, mo20986q2());
        SafeParcelWriter.m4565c(parcel, 5, mo20987r2());
        SafeParcelWriter.m4565c(parcel, 6, mo20985p2());
        SafeParcelWriter.m4586x(parcel, 7, mo20984o2(), false);
        SafeParcelWriter.m4586x(parcel, 8, this.f2895s, false);
        SafeParcelWriter.m4558B(parcel, 9, mo20981l2(), false);
        SafeParcelWriter.m4586x(parcel, 10, mo20982m2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    @NonNull
    /* renamed from: x2 */
    public final String mo20989x2() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f2889c, f2885J);
            Iterator it = this.f2889c.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).mo21286l2());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f2890d;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f2891f);
            jSONObject.put("forceCodeForRefreshToken", this.f2893o);
            jSONObject.put("serverAuthRequested", this.f2892g);
            if (!TextUtils.isEmpty(this.f2894p)) {
                jSONObject.put("serverClientId", this.f2894p);
            }
            if (!TextUtils.isEmpty(this.f2895s)) {
                jSONObject.put("hostedDomain", this.f2895s);
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static final class Builder {

        /* renamed from: a */
        private Set f2897a = new HashSet();

        /* renamed from: b */
        private boolean f2898b;

        /* renamed from: c */
        private boolean f2899c;

        /* renamed from: d */
        private boolean f2900d;
        @Nullable

        /* renamed from: e */
        private String f2901e;
        @Nullable

        /* renamed from: f */
        private Account f2902f;
        @Nullable

        /* renamed from: g */
        private String f2903g;

        /* renamed from: h */
        private Map f2904h = new HashMap();
        @Nullable

        /* renamed from: i */
        private String f2905i;

        public Builder() {
        }

        /* renamed from: i */
        private final String m3323i(String str) {
            Preconditions.m4484g(str);
            String str2 = this.f2901e;
            boolean z = true;
            if (str2 != null && !str2.equals(str)) {
                z = false;
            }
            Preconditions.m4479b(z, "two different server client ids provided");
            return str;
        }

        @NonNull
        /* renamed from: a */
        public GoogleSignInOptions mo20990a() {
            if (this.f2897a.contains(GoogleSignInOptions.f2884I)) {
                Set set = this.f2897a;
                Scope scope = GoogleSignInOptions.f2883H;
                if (set.contains(scope)) {
                    this.f2897a.remove(scope);
                }
            }
            if (this.f2900d && (this.f2902f == null || !this.f2897a.isEmpty())) {
                mo20992c();
            }
            return new GoogleSignInOptions(3, new ArrayList(this.f2897a), this.f2902f, this.f2900d, this.f2898b, this.f2899c, this.f2901e, this.f2903g, this.f2904h, this.f2905i, (zad) null);
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: b */
        public Builder mo20991b() {
            this.f2897a.add(GoogleSignInOptions.f2881F);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: c */
        public Builder mo20992c() {
            this.f2897a.add(GoogleSignInOptions.f2882G);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: d */
        public Builder mo20993d(@NonNull String str) {
            this.f2900d = true;
            m3323i(str);
            this.f2901e = str;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: e */
        public Builder mo20994e() {
            this.f2897a.add(GoogleSignInOptions.f2880E);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: f */
        public Builder mo20995f(@NonNull Scope scope, @NonNull Scope... scopeArr) {
            this.f2897a.add(scope);
            this.f2897a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        /* renamed from: g */
        public Builder mo20996g(@NonNull String str) {
            this.f2902f = new Account(Preconditions.m4484g(str), "com.google");
            return this;
        }

        @NonNull
        @KeepForSdk
        @CanIgnoreReturnValue
        /* renamed from: h */
        public Builder mo20997h(@NonNull String str) {
            this.f2905i = str;
            return this;
        }

        public Builder(@NonNull GoogleSignInOptions googleSignInOptions) {
            Preconditions.m4488k(googleSignInOptions);
            this.f2897a = new HashSet(googleSignInOptions.f2889c);
            this.f2898b = googleSignInOptions.f2892g;
            this.f2899c = googleSignInOptions.f2893o;
            this.f2900d = googleSignInOptions.f2891f;
            this.f2901e = googleSignInOptions.f2894p;
            this.f2902f = googleSignInOptions.f2890d;
            this.f2903g = googleSignInOptions.f2895s;
            this.f2904h = GoogleSignInOptions.m3306E2(googleSignInOptions.f2896z);
            this.f2905i = googleSignInOptions.f2886A;
        }
    }

    private GoogleSignInOptions(int i, ArrayList arrayList, @Nullable Account account, boolean z, boolean z2, boolean z3, @Nullable String str, @Nullable String str2, Map map, @Nullable String str3) {
        this.f2888a = i;
        this.f2889c = arrayList;
        this.f2890d = account;
        this.f2891f = z;
        this.f2892g = z2;
        this.f2893o = z3;
        this.f2894p = str;
        this.f2895s = str2;
        this.f2896z = new ArrayList(map.values());
        this.f2887B = map;
        this.f2886A = str3;
    }
}
