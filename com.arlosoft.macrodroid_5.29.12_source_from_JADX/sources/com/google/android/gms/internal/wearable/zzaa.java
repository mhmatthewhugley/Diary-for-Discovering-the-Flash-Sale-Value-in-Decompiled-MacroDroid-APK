package com.google.android.gms.internal.wearable;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
final class zzaa extends AbstractList implements RandomAccess, Serializable {
    final float[] zza;
    final int zzb;
    final int zzc;

    zzaa(float[] fArr, int i, int i2) {
        this.zza = fArr;
        this.zzb = i;
        this.zzc = i2;
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Float) && zzab.m64020a(this.zza, ((Float) obj).floatValue(), this.zzb, this.zzc) != -1;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzaa)) {
            return super.equals(obj);
        }
        zzaa zzaa = (zzaa) obj;
        int i = this.zzc - this.zzb;
        if (zzaa.zzc - zzaa.zzb != i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zza[this.zzb + i2] != zzaa.zza[zzaa.zzb + i2]) {
                return false;
            }
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object get(int i) {
        zzy.m64618a(i, this.zzc - this.zzb, "index");
        return Float.valueOf(this.zza[this.zzb + i]);
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.zzb; i2 < this.zzc; i2++) {
            i = (i * 31) + Float.valueOf(this.zza[i2]).hashCode();
        }
        return i;
    }

    public final int indexOf(Object obj) {
        int a;
        if (!(obj instanceof Float) || (a = zzab.m64020a(this.zza, ((Float) obj).floatValue(), this.zzb, this.zzc)) < 0) {
            return -1;
        }
        return a - this.zzb;
    }

    public final boolean isEmpty() {
        return false;
    }

    public final int lastIndexOf(Object obj) {
        if (obj instanceof Float) {
            float[] fArr = this.zza;
            float floatValue = ((Float) obj).floatValue();
            int i = this.zzb;
            int i2 = this.zzc - 1;
            while (true) {
                if (i2 >= i) {
                    if (fArr[i2] == floatValue) {
                        break;
                    }
                    i2--;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 >= 0) {
                return i2 - this.zzb;
            }
        }
        return -1;
    }

    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        Float f = (Float) obj;
        zzy.m64618a(i, this.zzc - this.zzb, "index");
        float[] fArr = this.zza;
        int i2 = this.zzb + i;
        float f2 = fArr[i2];
        Objects.requireNonNull(f);
        fArr[i2] = f.floatValue();
        return Float.valueOf(f2);
    }

    public final int size() {
        return this.zzc - this.zzb;
    }

    public final List subList(int i, int i2) {
        zzy.m64619b(i, i2, this.zzc - this.zzb);
        if (i == i2) {
            return Collections.emptyList();
        }
        float[] fArr = this.zza;
        int i3 = this.zzb;
        return new zzaa(fArr, i + i3, i3 + i2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((this.zzc - this.zzb) * 12);
        sb.append('[');
        sb.append(this.zza[this.zzb]);
        int i = this.zzb;
        while (true) {
            i++;
            if (i < this.zzc) {
                sb.append(", ");
                sb.append(this.zza[i]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
