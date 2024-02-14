package com.google.android.gms.common.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public final class Objects {

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static final class ToStringHelper {

        /* renamed from: a */
        private final List f3667a = new ArrayList();

        /* renamed from: b */
        private final Object f3668b;

        /* synthetic */ ToStringHelper(Object obj, zzah zzah) {
            Preconditions.m4488k(obj);
            this.f3668b = obj;
        }

        @NonNull
        @KeepForSdk
        @CanIgnoreReturnValue
        /* renamed from: a */
        public ToStringHelper mo21720a(@NonNull String str, @Nullable Object obj) {
            List list = this.f3667a;
            Preconditions.m4488k(str);
            String valueOf = String.valueOf(obj);
            list.add(str + "=" + valueOf);
            return this;
        }

        @NonNull
        @KeepForSdk
        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f3668b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f3667a.size();
            for (int i = 0; i < size; i++) {
                sb.append((String) this.f3667a.get(i));
                if (i < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    private Objects() {
        throw new AssertionError("Uninstantiable");
    }

    @KeepForSdk
    /* renamed from: a */
    public static boolean m4470a(@Nullable Object obj, @Nullable Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    @KeepForSdk
    /* renamed from: b */
    public static int m4471b(@NonNull Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    @NonNull
    @KeepForSdk
    /* renamed from: c */
    public static ToStringHelper m4472c(@NonNull Object obj) {
        return new ToStringHelper(obj, (zzah) null);
    }
}
