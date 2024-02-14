package com.google.android.gms.internal.p204firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.work.PeriodicWorkRequest;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.common.util.Strings;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzy */
/* compiled from: com.google.firebase:firebase-auth@@21.1.0 */
public final class zzzy extends AbstractSafeParcelable implements zzxn<zzzy> {
    public static final Parcelable.Creator<zzzy> CREATOR = new zzzz();

    /* renamed from: o */
    private static final String f40750o = zzzy.class.getSimpleName();
    @SafeParcelable.Field

    /* renamed from: a */
    private String f40751a;
    @SafeParcelable.Field

    /* renamed from: c */
    private String f40752c;
    @SafeParcelable.Field

    /* renamed from: d */
    private Long f40753d;
    @SafeParcelable.Field

    /* renamed from: f */
    private String f40754f;
    @SafeParcelable.Field

    /* renamed from: g */
    private Long f40755g;

    public zzzy() {
        this.f40755g = Long.valueOf(System.currentTimeMillis());
    }

    /* renamed from: l2 */
    public static zzzy m58580l2(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            zzzy zzzy = new zzzy();
            zzzy.f40751a = jSONObject.optString("refresh_token", (String) null);
            zzzy.f40752c = jSONObject.optString("access_token", (String) null);
            zzzy.f40753d = Long.valueOf(jSONObject.optLong("expires_in"));
            zzzy.f40754f = jSONObject.optString("token_type", (String) null);
            zzzy.f40755g = Long.valueOf(jSONObject.optLong("issued_at"));
            return zzzy;
        } catch (JSONException e) {
            throw new zzqx(e);
        }
    }

    /* renamed from: a */
    public final long mo50146a() {
        return this.f40755g.longValue();
    }

    /* renamed from: m2 */
    public final String mo50147m2() {
        return this.f40752c;
    }

    /* renamed from: n2 */
    public final String mo50148n2() {
        return this.f40751a;
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ zzxn mo48759o(String str) throws zzvg {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f40751a = Strings.m4911a(jSONObject.optString("refresh_token"));
            this.f40752c = Strings.m4911a(jSONObject.optString("access_token"));
            this.f40753d = Long.valueOf(jSONObject.optLong("expires_in", 0));
            this.f40754f = Strings.m4911a(jSONObject.optString("token_type"));
            this.f40755g = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e) {
            throw zzabk.m56110a(e, f40750o, str);
        }
    }

    @Nullable
    /* renamed from: o2 */
    public final String mo50149o2() {
        return this.f40754f;
    }

    /* renamed from: p2 */
    public final String mo50150p2() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f40751a);
            jSONObject.put("access_token", this.f40752c);
            jSONObject.put("expires_in", this.f40753d);
            jSONObject.put("token_type", this.f40754f);
            jSONObject.put("issued_at", this.f40755g);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new zzqx(e);
        }
    }

    /* renamed from: q2 */
    public final void mo50151q2(String str) {
        this.f40751a = Preconditions.m4484g(str);
    }

    /* renamed from: r2 */
    public final boolean mo50152r2() {
        return DefaultClock.m4871d().mo21950a() + PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS < this.f40755g.longValue() + (this.f40753d.longValue() * 1000);
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 2, this.f40751a, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f40752c, false);
        SafeParcelWriter.m4582t(parcel, 4, Long.valueOf(zzb()), false);
        SafeParcelWriter.m4586x(parcel, 5, this.f40754f, false);
        SafeParcelWriter.m4582t(parcel, 6, Long.valueOf(this.f40755g.longValue()), false);
        SafeParcelWriter.m4564b(parcel, a);
    }

    public final long zzb() {
        Long l = this.f40753d;
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    public zzzy(String str, String str2, Long l, String str3) {
        this(str, str2, l, str3, Long.valueOf(System.currentTimeMillis()));
    }

    @SafeParcelable.Constructor
    zzzy(@SafeParcelable.Param String str, @SafeParcelable.Param String str2, @SafeParcelable.Param Long l, @SafeParcelable.Param String str3, @SafeParcelable.Param Long l2) {
        this.f40751a = str;
        this.f40752c = str2;
        this.f40753d = l;
        this.f40754f = str3;
        this.f40755g = l2;
    }
}
