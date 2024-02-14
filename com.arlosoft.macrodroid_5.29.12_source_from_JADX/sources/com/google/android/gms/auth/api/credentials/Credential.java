package com.google.android.gms.auth.api.credentials;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

@SafeParcelable.Class
@SafeParcelable.Reserved
/* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
public class Credential extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<Credential> CREATOR = new zzc();
    @SafeParcelable.Field

    /* renamed from: a */
    private final String f2736a;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: c */
    private final String f2737c;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: d */
    private final Uri f2738d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final List<IdToken> f2739f;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: g */
    private final String f2740g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    private final String f2741o;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: p */
    private final String f2742p;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: s */
    private final String f2743s;

    /* compiled from: com.google.android.gms:play-services-auth@@19.0.0 */
    public static class Builder {

        /* renamed from: a */
        private final String f2744a;
        @Nullable

        /* renamed from: b */
        private String f2745b;
        @Nullable

        /* renamed from: c */
        private Uri f2746c;

        /* renamed from: d */
        private List<IdToken> f2747d;
        @Nullable

        /* renamed from: e */
        private String f2748e;
        @Nullable

        /* renamed from: f */
        private String f2749f;
        @Nullable

        /* renamed from: g */
        private String f2750g;
        @Nullable

        /* renamed from: h */
        private String f2751h;

        public Builder(String str) {
            this.f2744a = str;
        }

        /* renamed from: a */
        public Credential mo20817a() {
            return new Credential(this.f2744a, this.f2745b, this.f2746c, this.f2747d, this.f2748e, this.f2749f, this.f2750g, this.f2751h);
        }

        /* renamed from: b */
        public Builder mo20818b(String str) {
            this.f2749f = str;
            return this;
        }

        /* renamed from: c */
        public Builder mo20819c(String str) {
            this.f2745b = str;
            return this;
        }

        /* renamed from: d */
        public Builder mo20820d(@Nullable String str) {
            this.f2748e = str;
            return this;
        }

        /* renamed from: e */
        public Builder mo20821e(Uri uri) {
            this.f2746c = uri;
            return this;
        }
    }

    @SafeParcelable.Constructor
    Credential(@SafeParcelable.Param String str, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param @Nullable Uri uri, @SafeParcelable.Param List<IdToken> list, @SafeParcelable.Param @Nullable String str3, @SafeParcelable.Param @Nullable String str4, @SafeParcelable.Param @Nullable String str5, @SafeParcelable.Param @Nullable String str6) {
        List<IdToken> list2;
        String trim = ((String) Preconditions.m4489l(str, "credential identifier cannot be null")).trim();
        Preconditions.m4485h(trim, "credential identifier cannot be empty");
        if (str3 == null || !TextUtils.isEmpty(str3)) {
            if (str4 != null) {
                boolean z = false;
                if (!TextUtils.isEmpty(str4)) {
                    Uri parse = Uri.parse(str4);
                    if (parse.isAbsolute() && parse.isHierarchical() && !TextUtils.isEmpty(parse.getScheme()) && !TextUtils.isEmpty(parse.getAuthority()) && ("http".equalsIgnoreCase(parse.getScheme()) || ProxyConfig.MATCH_HTTPS.equalsIgnoreCase(parse.getScheme()))) {
                        z = true;
                    }
                }
                if (!Boolean.valueOf(z).booleanValue()) {
                    throw new IllegalArgumentException("Account type must be a valid Http/Https URI");
                }
            }
            if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str3)) {
                if (str2 != null && TextUtils.isEmpty(str2.trim())) {
                    str2 = null;
                }
                this.f2737c = str2;
                this.f2738d = uri;
                if (list == null) {
                    list2 = Collections.emptyList();
                } else {
                    list2 = Collections.unmodifiableList(list);
                }
                this.f2739f = list2;
                this.f2736a = trim;
                this.f2740g = str3;
                this.f2741o = str4;
                this.f2742p = str5;
                this.f2743s = str6;
                return;
            }
            throw new IllegalArgumentException("Password and AccountType are mutually exclusive");
        }
        throw new IllegalArgumentException("Password must not be empty if set");
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Credential)) {
            return false;
        }
        Credential credential = (Credential) obj;
        return TextUtils.equals(this.f2736a, credential.f2736a) && TextUtils.equals(this.f2737c, credential.f2737c) && Objects.m4470a(this.f2738d, credential.f2738d) && TextUtils.equals(this.f2740g, credential.f2740g) && TextUtils.equals(this.f2741o, credential.f2741o);
    }

    public String getId() {
        return this.f2736a;
    }

    @Nullable
    public String getName() {
        return this.f2737c;
    }

    public int hashCode() {
        return Objects.m4471b(this.f2736a, this.f2737c, this.f2738d, this.f2740g, this.f2741o);
    }

    @Nullable
    /* renamed from: l2 */
    public String mo20810l2() {
        return this.f2741o;
    }

    @Nullable
    /* renamed from: m2 */
    public String mo20811m2() {
        return this.f2743s;
    }

    @Nullable
    /* renamed from: n2 */
    public String mo20812n2() {
        return this.f2742p;
    }

    /* renamed from: o2 */
    public List<IdToken> mo20813o2() {
        return this.f2739f;
    }

    @Nullable
    /* renamed from: p2 */
    public String mo20814p2() {
        return this.f2740g;
    }

    @Nullable
    /* renamed from: q2 */
    public Uri mo20815q2() {
        return this.f2738d;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4586x(parcel, 1, getId(), false);
        SafeParcelWriter.m4586x(parcel, 2, getName(), false);
        SafeParcelWriter.m4584v(parcel, 3, mo20815q2(), i, false);
        SafeParcelWriter.m4558B(parcel, 4, mo20813o2(), false);
        SafeParcelWriter.m4586x(parcel, 5, mo20814p2(), false);
        SafeParcelWriter.m4586x(parcel, 6, mo20810l2(), false);
        SafeParcelWriter.m4586x(parcel, 9, mo20812n2(), false);
        SafeParcelWriter.m4586x(parcel, 10, mo20811m2(), false);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
