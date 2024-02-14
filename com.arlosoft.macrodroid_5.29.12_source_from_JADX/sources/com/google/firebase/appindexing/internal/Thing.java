package com.google.firebase.appindexing.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.icing.zzbp;
import com.google.firebase.appindexing.Indexable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

@SafeParcelable.Class
/* compiled from: com.google.firebase:firebase-appindexing@@20.0.0 */
public final class Thing extends AbstractSafeParcelable implements Indexable, ReflectedParcelable {
    @NonNull
    public static final Parcelable.Creator<Thing> CREATOR = new zzad();
    @SafeParcelable.Field

    /* renamed from: a */
    public final int f53835a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final Bundle f53836c;
    @SafeParcelable.Field

    /* renamed from: d */
    private final zzac f53837d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final String f53838f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String f53839g;

    @SafeParcelable.Constructor
    public Thing(@SafeParcelable.Param int i, @SafeParcelable.Param Bundle bundle, @SafeParcelable.Param zzac zzac, @SafeParcelable.Param String str, @SafeParcelable.Param String str2) {
        this.f53835a = i;
        this.f53836c = bundle;
        this.f53837d = zzac;
        this.f53838f = str;
        this.f53839g = str2;
        ClassLoader classLoader = Thing.class.getClassLoader();
        zzbp.m58638a(classLoader);
        bundle.setClassLoader(classLoader);
    }

    /* access modifiers changed from: private */
    /* renamed from: o2 */
    public static void m74508o2(@NonNull Bundle bundle, @NonNull StringBuilder sb) {
        try {
            Set keySet = bundle.keySet();
            String[] strArr = (String[]) keySet.toArray(new String[keySet.size()]);
            Arrays.sort(strArr, zzab.f53840a);
            for (String str : strArr) {
                sb.append("{ key: '");
                sb.append(str);
                sb.append("' value: ");
                Object obj = bundle.get(str);
                if (obj == null) {
                    sb.append("<null>");
                } else if (obj.getClass().isArray()) {
                    sb.append("[ ");
                    for (int i = 0; i < Array.getLength(obj); i++) {
                        sb.append("'");
                        sb.append(Array.get(obj, i));
                        sb.append("' ");
                    }
                    sb.append("]");
                } else {
                    sb.append(obj.toString());
                }
                sb.append(" } ");
            }
        } catch (RuntimeException unused) {
            sb.append("<error>");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p2 */
    public static boolean m74509p2(Bundle bundle, Bundle bundle2) {
        if (bundle.size() != bundle2.size()) {
            return false;
        }
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            Object obj2 = bundle2.get(str);
            if ((obj instanceof Bundle) && (obj2 instanceof Bundle) && !m74509p2((Bundle) obj, (Bundle) obj2)) {
                return false;
            }
            if (obj == null) {
                if (obj2 != null || !bundle2.containsKey(str)) {
                    return false;
                }
                obj2 = null;
            }
            if (obj instanceof boolean[]) {
                if (!(obj2 instanceof boolean[]) || !Arrays.equals((boolean[]) obj, (boolean[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof long[]) {
                if (!(obj2 instanceof long[]) || !Arrays.equals((long[]) obj, (long[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof double[]) {
                if (!(obj2 instanceof double[]) || !Arrays.equals((double[]) obj, (double[]) obj2)) {
                    return false;
                }
            } else if (obj instanceof byte[]) {
                if (!(obj2 instanceof byte[]) || !Arrays.equals((byte[]) obj, (byte[]) obj2)) {
                    return false;
                }
            } else if ((obj instanceof Object[]) && (!(obj2 instanceof Object[]) || !Arrays.equals((Object[]) obj, (Object[]) obj2))) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: q2 */
    public static int m74510q2(Bundle bundle) {
        ArrayList arrayList = new ArrayList(bundle.keySet());
        Collections.sort(arrayList);
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Object obj = bundle.get((String) arrayList.get(i));
            if (obj instanceof boolean[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((boolean[]) obj)));
            } else if (obj instanceof long[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((long[]) obj)));
            } else if (obj instanceof double[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((double[]) obj)));
            } else if (obj instanceof byte[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((byte[]) obj)));
            } else if (obj instanceof Object[]) {
                arrayList2.add(Integer.valueOf(Arrays.hashCode((Object[]) obj)));
            } else {
                arrayList2.add(Integer.valueOf(Objects.m4471b(obj)));
            }
        }
        return Objects.m4471b(arrayList2.toArray());
    }

    public final boolean equals(@NonNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Thing)) {
            return false;
        }
        Thing thing = (Thing) obj;
        return Objects.m4470a(Integer.valueOf(this.f53835a), Integer.valueOf(thing.f53835a)) && Objects.m4470a(this.f53838f, thing.f53838f) && Objects.m4470a(this.f53839g, thing.f53839g) && Objects.m4470a(this.f53837d, thing.f53837d) && m74509p2(this.f53836c, thing.f53836c);
    }

    public final int hashCode() {
        return Objects.m4471b(Integer.valueOf(this.f53835a), this.f53838f, this.f53839g, Integer.valueOf(this.f53837d.hashCode()), Integer.valueOf(m74510q2(this.f53836c)));
    }

    @NonNull
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        if (this.f53839g.equals("Thing")) {
            str = "Indexable";
        } else {
            str = this.f53839g;
        }
        sb.append(str);
        sb.append(" { { id: ");
        if (this.f53838f == null) {
            sb.append("<null>");
        } else {
            sb.append("'");
            sb.append(this.f53838f);
            sb.append("'");
        }
        sb.append(" } Properties { ");
        m74508o2(this.f53836c, sb);
        sb.append("} Metadata { ");
        sb.append(this.f53837d.toString());
        sb.append(" } }");
        return sb.toString();
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4567e(parcel, 1, this.f53836c, false);
        SafeParcelWriter.m4584v(parcel, 2, this.f53837d, i, false);
        SafeParcelWriter.m4586x(parcel, 3, this.f53838f, false);
        SafeParcelWriter.m4586x(parcel, 4, this.f53839g, false);
        SafeParcelWriter.m4576n(parcel, 1000, this.f53835a);
        SafeParcelWriter.m4564b(parcel, a);
    }
}
