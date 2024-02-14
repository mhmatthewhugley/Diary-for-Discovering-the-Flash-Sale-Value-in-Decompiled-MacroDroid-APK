package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class SafeParcelWriter {
    private SafeParcelWriter() {
    }

    /* renamed from: A */
    public static <T extends Parcelable> void m4557A(@NonNull Parcel parcel, int i, @NonNull T[] tArr, int i2, boolean z) {
        if (tArr != null) {
            int C = m4559C(parcel, i);
            parcel.writeInt(r7);
            for (T t : tArr) {
                if (t == null) {
                    parcel.writeInt(0);
                } else {
                    m4562F(parcel, t, i2);
                }
            }
            m4560D(parcel, C);
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: B */
    public static <T extends Parcelable> void m4558B(@NonNull Parcel parcel, int i, @NonNull List<T> list, boolean z) {
        if (list != null) {
            int C = m4559C(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    m4562F(parcel, parcelable, 0);
                }
            }
            m4560D(parcel, C);
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: C */
    private static int m4559C(Parcel parcel, int i) {
        parcel.writeInt(i | SupportMenu.CATEGORY_MASK);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    /* renamed from: D */
    private static void m4560D(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    /* renamed from: E */
    private static void m4561E(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    /* renamed from: F */
    private static void m4562F(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }

    /* renamed from: a */
    public static int m4563a(@NonNull Parcel parcel) {
        return m4559C(parcel, 20293);
    }

    /* renamed from: b */
    public static void m4564b(@NonNull Parcel parcel, int i) {
        m4560D(parcel, i);
    }

    /* renamed from: c */
    public static void m4565c(@NonNull Parcel parcel, int i, boolean z) {
        m4561E(parcel, i, 4);
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m4566d(@NonNull Parcel parcel, int i, @NonNull Boolean bool, boolean z) {
        if (bool != null) {
            m4561E(parcel, i, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: e */
    public static void m4567e(@NonNull Parcel parcel, int i, @NonNull Bundle bundle, boolean z) {
        if (bundle != null) {
            int C = m4559C(parcel, i);
            parcel.writeBundle(bundle);
            m4560D(parcel, C);
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: f */
    public static void m4568f(@NonNull Parcel parcel, int i, byte b) {
        m4561E(parcel, i, 4);
        parcel.writeInt(b);
    }

    /* renamed from: g */
    public static void m4569g(@NonNull Parcel parcel, int i, @NonNull byte[] bArr, boolean z) {
        if (bArr != null) {
            int C = m4559C(parcel, i);
            parcel.writeByteArray(bArr);
            m4560D(parcel, C);
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: h */
    public static void m4570h(@NonNull Parcel parcel, int i, double d) {
        m4561E(parcel, i, 8);
        parcel.writeDouble(d);
    }

    /* renamed from: i */
    public static void m4571i(@NonNull Parcel parcel, int i, @NonNull List<Double> list, boolean z) {
        if (list != null) {
            int C = m4559C(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeDouble(list.get(i2).doubleValue());
            }
            m4560D(parcel, C);
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: j */
    public static void m4572j(@NonNull Parcel parcel, int i, @NonNull Double d, boolean z) {
        if (d != null) {
            m4561E(parcel, i, 8);
            parcel.writeDouble(d.doubleValue());
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: k */
    public static void m4573k(@NonNull Parcel parcel, int i, float f) {
        m4561E(parcel, i, 4);
        parcel.writeFloat(f);
    }

    /* renamed from: l */
    public static void m4574l(@NonNull Parcel parcel, int i, @NonNull Float f, boolean z) {
        if (f != null) {
            m4561E(parcel, i, 4);
            parcel.writeFloat(f.floatValue());
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: m */
    public static void m4575m(@NonNull Parcel parcel, int i, @NonNull IBinder iBinder, boolean z) {
        if (iBinder != null) {
            int C = m4559C(parcel, i);
            parcel.writeStrongBinder(iBinder);
            m4560D(parcel, C);
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: n */
    public static void m4576n(@NonNull Parcel parcel, int i, int i2) {
        m4561E(parcel, i, 4);
        parcel.writeInt(i2);
    }

    /* renamed from: o */
    public static void m4577o(@NonNull Parcel parcel, int i, @NonNull int[] iArr, boolean z) {
        if (iArr != null) {
            int C = m4559C(parcel, i);
            parcel.writeIntArray(iArr);
            m4560D(parcel, C);
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: p */
    public static void m4578p(@NonNull Parcel parcel, int i, @NonNull List<Integer> list, boolean z) {
        if (list != null) {
            int C = m4559C(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(list.get(i2).intValue());
            }
            m4560D(parcel, C);
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: q */
    public static void m4579q(@NonNull Parcel parcel, int i, @NonNull Integer num, boolean z) {
        if (num != null) {
            m4561E(parcel, i, 4);
            parcel.writeInt(num.intValue());
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: r */
    public static void m4580r(@NonNull Parcel parcel, int i, @NonNull List list, boolean z) {
        if (list != null) {
            int C = m4559C(parcel, i);
            parcel.writeList(list);
            m4560D(parcel, C);
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: s */
    public static void m4581s(@NonNull Parcel parcel, int i, long j) {
        m4561E(parcel, i, 8);
        parcel.writeLong(j);
    }

    /* renamed from: t */
    public static void m4582t(@NonNull Parcel parcel, int i, @NonNull Long l, boolean z) {
        if (l != null) {
            m4561E(parcel, i, 8);
            parcel.writeLong(l.longValue());
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: u */
    public static void m4583u(@NonNull Parcel parcel, int i, @NonNull Parcel parcel2, boolean z) {
        if (parcel2 != null) {
            int C = m4559C(parcel, i);
            parcel.appendFrom(parcel2, 0, parcel2.dataSize());
            m4560D(parcel, C);
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: v */
    public static void m4584v(@NonNull Parcel parcel, int i, @NonNull Parcelable parcelable, int i2, boolean z) {
        if (parcelable != null) {
            int C = m4559C(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            m4560D(parcel, C);
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: w */
    public static void m4585w(@NonNull Parcel parcel, int i, short s) {
        m4561E(parcel, i, 4);
        parcel.writeInt(s);
    }

    /* renamed from: x */
    public static void m4586x(@NonNull Parcel parcel, int i, @NonNull String str, boolean z) {
        if (str != null) {
            int C = m4559C(parcel, i);
            parcel.writeString(str);
            m4560D(parcel, C);
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: y */
    public static void m4587y(@NonNull Parcel parcel, int i, @NonNull String[] strArr, boolean z) {
        if (strArr != null) {
            int C = m4559C(parcel, i);
            parcel.writeStringArray(strArr);
            m4560D(parcel, C);
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }

    /* renamed from: z */
    public static void m4588z(@NonNull Parcel parcel, int i, @NonNull List<String> list, boolean z) {
        if (list != null) {
            int C = m4559C(parcel, i);
            parcel.writeStringList(list);
            m4560D(parcel, C);
        } else if (z) {
            m4561E(parcel, i, 0);
        }
    }
}
