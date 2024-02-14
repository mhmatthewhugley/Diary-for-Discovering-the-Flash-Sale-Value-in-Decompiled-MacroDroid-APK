package com.google.android.gms.common.server.response;

import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import com.google.android.gms.common.util.MapUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@ShowFirstParty
@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class FastJsonResponse {

    @ShowFirstParty
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public interface FieldConverter<I, O> {
        @NonNull
        /* renamed from: s1 */
        Object mo21887s1(@NonNull Object obj);
    }

    @NonNull
    /* renamed from: f */
    protected static final Object m4793f(@NonNull Field field, @Nullable Object obj) {
        return field.f3862B != null ? field.mo21904u2(obj) : obj;
    }

    /* renamed from: g */
    private static final void m4794g(StringBuilder sb, Field field, Object obj) {
        int i = field.f3864c;
        if (i == 11) {
            Class cls = field.f3870s;
            Preconditions.m4488k(cls);
            sb.append(((FastJsonResponse) cls.cast(obj)).toString());
        } else if (i == 7) {
            sb.append("\"");
            sb.append(JsonUtils.m4893a((String) obj));
            sb.append("\"");
        } else {
            sb.append(obj);
        }
    }

    @NonNull
    @KeepForSdk
    /* renamed from: a */
    public abstract Map<String, Field<?, ?>> mo20789a();

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    /* renamed from: b */
    public Object mo20790b(@NonNull Field field) {
        String str = field.f3868o;
        if (field.f3870s == null) {
            return mo21898c(str);
        }
        Preconditions.m4495r(mo21898c(str) == null, "Concrete field shouldn't be value object: %s", field.f3868o);
        try {
            char upperCase = Character.toUpperCase(str.charAt(0));
            String substring = str.substring(1);
            return getClass().getMethod("get" + upperCase + substring, new Class[0]).invoke(this, new Object[0]);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    /* renamed from: c */
    public abstract Object mo21898c(@NonNull String str);

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: d */
    public boolean mo20791d(@NonNull Field field) {
        if (field.f3866f != 11) {
            return mo21899e(field.f3868o);
        }
        if (field.f3867g) {
            throw new UnsupportedOperationException("Concrete type arrays not supported");
        }
        throw new UnsupportedOperationException("Concrete types not supported");
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    /* renamed from: e */
    public abstract boolean mo21899e(@NonNull String str);

    @NonNull
    @KeepForSdk
    public String toString() {
        Map<String, Field<?, ?>> a = mo20789a();
        StringBuilder sb = new StringBuilder(100);
        for (String next : a.keySet()) {
            Field field = a.get(next);
            if (mo20791d(field)) {
                Object f = m4793f(field, mo20790b(field));
                if (sb.length() == 0) {
                    sb.append("{");
                } else {
                    sb.append(",");
                }
                sb.append("\"");
                sb.append(next);
                sb.append("\":");
                if (f != null) {
                    switch (field.f3866f) {
                        case 8:
                            sb.append("\"");
                            sb.append(Base64Utils.m4853c((byte[]) f));
                            sb.append("\"");
                            break;
                        case 9:
                            sb.append("\"");
                            sb.append(Base64Utils.m4854d((byte[]) f));
                            sb.append("\"");
                            break;
                        case 10:
                            MapUtils.m4894a(sb, (HashMap) f);
                            break;
                        default:
                            if (!field.f3865d) {
                                m4794g(sb, field, f);
                                break;
                            } else {
                                ArrayList arrayList = (ArrayList) f;
                                sb.append("[");
                                int size = arrayList.size();
                                for (int i = 0; i < size; i++) {
                                    if (i > 0) {
                                        sb.append(",");
                                    }
                                    Object obj = arrayList.get(i);
                                    if (obj != null) {
                                        m4794g(sb, field, obj);
                                    }
                                }
                                sb.append("]");
                                break;
                            }
                    }
                } else {
                    sb.append("null");
                }
            }
        }
        if (sb.length() > 0) {
            sb.append("}");
        } else {
            sb.append("{}");
        }
        return sb.toString();
    }

    @ShowFirstParty
    @SafeParcelable.Class
    @VisibleForTesting
    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class Field<I, O> extends AbstractSafeParcelable {
        public static final zaj CREATOR = new zaj();

        /* renamed from: A */
        private zan f3861A;
        /* access modifiers changed from: private */
        @SafeParcelable.Field
        @Nullable

        /* renamed from: B */
        public FieldConverter f3862B;
        @SafeParcelable.VersionField

        /* renamed from: a */
        private final int f3863a;
        @SafeParcelable.Field

        /* renamed from: c */
        protected final int f3864c;
        @SafeParcelable.Field

        /* renamed from: d */
        protected final boolean f3865d;
        @SafeParcelable.Field

        /* renamed from: f */
        protected final int f3866f;
        @SafeParcelable.Field

        /* renamed from: g */
        protected final boolean f3867g;
        @SafeParcelable.Field
        @NonNull

        /* renamed from: o */
        protected final String f3868o;
        @SafeParcelable.Field

        /* renamed from: p */
        protected final int f3869p;
        @Nullable

        /* renamed from: s */
        protected final Class f3870s;
        @SafeParcelable.Field
        @Nullable

        /* renamed from: z */
        protected final String f3871z;

        @SafeParcelable.Constructor
        Field(@SafeParcelable.Param int i, @SafeParcelable.Param int i2, @SafeParcelable.Param boolean z, @SafeParcelable.Param int i3, @SafeParcelable.Param boolean z2, @SafeParcelable.Param String str, @SafeParcelable.Param int i4, @SafeParcelable.Param @Nullable String str2, @SafeParcelable.Param @Nullable zaa zaa) {
            this.f3863a = i;
            this.f3864c = i2;
            this.f3865d = z;
            this.f3866f = i3;
            this.f3867g = z2;
            this.f3868o = str;
            this.f3869p = i4;
            if (str2 == null) {
                this.f3870s = null;
                this.f3871z = null;
            } else {
                this.f3870s = SafeParcelResponse.class;
                this.f3871z = str2;
            }
            if (zaa == null) {
                this.f3862B = null;
            } else {
                this.f3862B = zaa.mo21889m2();
            }
        }

        @NonNull
        @KeepForSdk
        @VisibleForTesting
        /* renamed from: l2 */
        public static Field<byte[], byte[]> m4800l2(@NonNull String str, int i) {
            return new Field(8, false, 8, false, str, i, (Class) null, (FieldConverter) null);
        }

        @NonNull
        @KeepForSdk
        /* renamed from: m2 */
        public static <T extends FastJsonResponse> Field<T, T> m4801m2(@NonNull String str, int i, @NonNull Class<T> cls) {
            return new Field(11, false, 11, false, str, i, cls, (FieldConverter) null);
        }

        @NonNull
        @KeepForSdk
        /* renamed from: n2 */
        public static <T extends FastJsonResponse> Field<ArrayList<T>, ArrayList<T>> m4802n2(@NonNull String str, int i, @NonNull Class<T> cls) {
            return new Field(11, true, 11, true, str, i, cls, (FieldConverter) null);
        }

        @NonNull
        @KeepForSdk
        @VisibleForTesting
        /* renamed from: o2 */
        public static Field<Integer, Integer> m4803o2(@NonNull String str, int i) {
            return new Field(0, false, 0, false, str, i, (Class) null, (FieldConverter) null);
        }

        @NonNull
        @KeepForSdk
        /* renamed from: p2 */
        public static Field<String, String> m4804p2(@NonNull String str, int i) {
            return new Field(7, false, 7, false, str, i, (Class) null, (FieldConverter) null);
        }

        @NonNull
        @KeepForSdk
        /* renamed from: q2 */
        public static Field<ArrayList<String>, ArrayList<String>> m4805q2(@NonNull String str, int i) {
            return new Field(7, true, 7, true, str, i, (Class) null, (FieldConverter) null);
        }

        @KeepForSdk
        /* renamed from: r2 */
        public int mo21901r2() {
            return this.f3869p;
        }

        /* access modifiers changed from: package-private */
        @Nullable
        /* renamed from: s2 */
        public final zaa mo21902s2() {
            FieldConverter fieldConverter = this.f3862B;
            if (fieldConverter == null) {
                return null;
            }
            return zaa.m4791l2(fieldConverter);
        }

        @NonNull
        public final String toString() {
            Objects.ToStringHelper a = Objects.m4472c(this).mo21720a("versionCode", Integer.valueOf(this.f3863a)).mo21720a("typeIn", Integer.valueOf(this.f3864c)).mo21720a("typeInArray", Boolean.valueOf(this.f3865d)).mo21720a("typeOut", Integer.valueOf(this.f3866f)).mo21720a("typeOutArray", Boolean.valueOf(this.f3867g)).mo21720a("outputFieldName", this.f3868o).mo21720a("safeParcelFieldId", Integer.valueOf(this.f3869p)).mo21720a("concreteTypeName", mo21905v2());
            Class cls = this.f3870s;
            if (cls != null) {
                a.mo21720a("concreteType.class", cls.getCanonicalName());
            }
            FieldConverter fieldConverter = this.f3862B;
            if (fieldConverter != null) {
                a.mo21720a("converterName", fieldConverter.getClass().getCanonicalName());
            }
            return a.toString();
        }

        @NonNull
        /* renamed from: u2 */
        public final Object mo21904u2(@NonNull Object obj) {
            Preconditions.m4488k(this.f3862B);
            return this.f3862B.mo21887s1(obj);
        }

        /* access modifiers changed from: package-private */
        @Nullable
        /* renamed from: v2 */
        public final String mo21905v2() {
            String str = this.f3871z;
            if (str == null) {
                return null;
            }
            return str;
        }

        @NonNull
        /* renamed from: w2 */
        public final Map mo21906w2() {
            Preconditions.m4488k(this.f3871z);
            Preconditions.m4488k(this.f3861A);
            return (Map) Preconditions.m4488k(this.f3861A.mo21922m2(this.f3871z));
        }

        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            int a = SafeParcelWriter.m4563a(parcel);
            SafeParcelWriter.m4576n(parcel, 1, this.f3863a);
            SafeParcelWriter.m4576n(parcel, 2, this.f3864c);
            SafeParcelWriter.m4565c(parcel, 3, this.f3865d);
            SafeParcelWriter.m4576n(parcel, 4, this.f3866f);
            SafeParcelWriter.m4565c(parcel, 5, this.f3867g);
            SafeParcelWriter.m4586x(parcel, 6, this.f3868o, false);
            SafeParcelWriter.m4576n(parcel, 7, mo21901r2());
            SafeParcelWriter.m4586x(parcel, 8, mo21905v2(), false);
            SafeParcelWriter.m4584v(parcel, 9, mo21902s2(), i, false);
            SafeParcelWriter.m4564b(parcel, a);
        }

        /* renamed from: x2 */
        public final void mo21908x2(zan zan) {
            this.f3861A = zan;
        }

        /* renamed from: y2 */
        public final boolean mo21909y2() {
            return this.f3862B != null;
        }

        protected Field(int i, boolean z, int i2, boolean z2, @NonNull String str, int i3, @Nullable Class cls, @Nullable FieldConverter fieldConverter) {
            this.f3863a = 1;
            this.f3864c = i;
            this.f3865d = z;
            this.f3866f = i2;
            this.f3867g = z2;
            this.f3868o = str;
            this.f3869p = i3;
            this.f3870s = cls;
            if (cls == null) {
                this.f3871z = null;
            } else {
                this.f3871z = cls.getCanonicalName();
            }
            this.f3862B = fieldConverter;
        }
    }
}
