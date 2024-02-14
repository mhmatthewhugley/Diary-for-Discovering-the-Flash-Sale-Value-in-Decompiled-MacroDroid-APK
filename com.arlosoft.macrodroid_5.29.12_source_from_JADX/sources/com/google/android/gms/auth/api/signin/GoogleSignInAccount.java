package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new zab();
    @NonNull
    @VisibleForTesting

    /* renamed from: E */
    public static Clock f2857E = DefaultClock.m4871d();
    @SafeParcelable.Field

    /* renamed from: A */
    List f2858A;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: B */
    private String f2859B;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: C */
    private String f2860C;

    /* renamed from: D */
    private Set f2861D = new HashSet();
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f2862a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private String f2863c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private String f2864d;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: f */
    private String f2865f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    private String f2866g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    private Uri f2867o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    private String f2868p;
    @SafeParcelable.Field

    /* renamed from: s */
    private long f2869s;
    @SafeParcelable.Field

    /* renamed from: z */
    private String f2870z;

    @SafeParcelable.Constructor
    GoogleSignInAccount(@SafeParcelable.Param int i, @SafeParcelable.Param @Nullable String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param @Nullable String str3, @SafeParcelable.Param @Nullable String str4, @SafeParcelable.Param @Nullable Uri uri, @SafeParcelable.Param @Nullable String str5, @SafeParcelable.Param long j, @SafeParcelable.Param String str6, @SafeParcelable.Param List list, @SafeParcelable.Param @Nullable String str7, @SafeParcelable.Param @Nullable String str8) {
        this.f2862a = i;
        this.f2863c = str;
        this.f2864d = str2;
        this.f2865f = str3;
        this.f2866g = str4;
        this.f2867o = uri;
        this.f2868p = str5;
        this.f2869s = j;
        this.f2870z = str6;
        this.f2858A = list;
        this.f2859B = str7;
        this.f2860C = str8;
    }

    @NonNull
    /* renamed from: s2 */
    public static GoogleSignInAccount m3283s2(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Uri uri, @Nullable Long l, @NonNull String str7, @NonNull Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, (String) null, l.longValue(), Preconditions.m4484g(str7), new ArrayList((Collection) Preconditions.m4488k(set)), str5, str6);
    }

    @Nullable
    /* renamed from: t2 */
    public static GoogleSignInAccount m3284t2(@Nullable String str) throws JSONException {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount s2 = m3283s2(jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has(NotificationCompat.CATEGORY_EMAIL) ? jSONObject.optString(NotificationCompat.CATEGORY_EMAIL) : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        if (jSONObject.has("serverAuthCode")) {
            str2 = jSONObject.optString("serverAuthCode");
        }
        s2.f2868p = str2;
        return s2;
    }

    @Nullable
    /* renamed from: K */
    public Account mo20960K() {
        String str = this.f2865f;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f2870z.equals(this.f2870z) && googleSignInAccount.mo20970q2().equals(mo20970q2());
    }

    @Nullable
    public String getId() {
        return this.f2863c;
    }

    public int hashCode() {
        return ((this.f2870z.hashCode() + 527) * 31) + mo20970q2().hashCode();
    }

    @Nullable
    /* renamed from: l2 */
    public String mo20964l2() {
        return this.f2865f;
    }

    @Nullable
    /* renamed from: m2 */
    public String mo20965m2() {
        return this.f2860C;
    }

    @Nullable
    /* renamed from: n2 */
    public String mo20966n2() {
        return this.f2859B;
    }

    @Nullable
    /* renamed from: o2 */
    public String mo20967o2() {
        return this.f2864d;
    }

    @Nullable
    /* renamed from: p0 */
    public String mo20968p0() {
        return this.f2866g;
    }

    @Nullable
    /* renamed from: p2 */
    public Uri mo20969p2() {
        return this.f2867o;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: q2 */
    public Set<Scope> mo20970q2() {
        HashSet hashSet = new HashSet(this.f2858A);
        hashSet.addAll(this.f2861D);
        return hashSet;
    }

    @Nullable
    /* renamed from: r2 */
    public String mo20971r2() {
        return this.f2868p;
    }

    @NonNull
    /* renamed from: u2 */
    public final String mo20972u2() {
        return this.f2870z;
    }

    @NonNull
    /* renamed from: v2 */
    public final String mo20973v2() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (getId() != null) {
                jSONObject.put("id", getId());
            }
            if (mo20967o2() != null) {
                jSONObject.put("tokenId", mo20967o2());
            }
            if (mo20964l2() != null) {
                jSONObject.put(NotificationCompat.CATEGORY_EMAIL, mo20964l2());
            }
            if (mo20968p0() != null) {
                jSONObject.put("displayName", mo20968p0());
            }
            if (mo20966n2() != null) {
                jSONObject.put("givenName", mo20966n2());
            }
            if (mo20965m2() != null) {
                jSONObject.put("familyName", mo20965m2());
            }
            Uri p2 = mo20969p2();
            if (p2 != null) {
                jSONObject.put("photoUrl", p2.toString());
            }
            if (mo20971r2() != null) {
                jSONObject.put("serverAuthCode", mo20971r2());
            }
            jSONObject.put("expirationTime", this.f2869s);
            jSONObject.put("obfuscatedIdentifier", this.f2870z);
            JSONArray jSONArray = new JSONArray();
            List list = this.f2858A;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, zaa.f2946a);
            for (Scope l2 : scopeArr) {
                jSONArray.put(l2.mo21286l2());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4576n(parcel, 1, this.f2862a);
        SafeParcelWriter.m4586x(parcel, 2, getId(), false);
        SafeParcelWriter.m4586x(parcel, 3, mo20967o2(), false);
        SafeParcelWriter.m4586x(parcel, 4, mo20964l2(), false);
        SafeParcelWriter.m4586x(parcel, 5, mo20968p0(), false);
        SafeParcelWriter.m4584v(parcel, 6, mo20969p2(), i, false);
        SafeParcelWriter.m4586x(parcel, 7, mo20971r2(), false);
        SafeParcelWriter.m4581s(parcel, 8, this.f2869s);
        SafeParcelWriter.m4586x(parcel, 9, this.f2870z, false);
        SafeParcelWriter.m4558B(parcel, 10, this.f2858A, false);
        SafeParcelWriter.m4586x(parcel, 11, mo20966n2(), false);
        SafeParcelWriter.m4586x(parcel, 12, mo20965m2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
