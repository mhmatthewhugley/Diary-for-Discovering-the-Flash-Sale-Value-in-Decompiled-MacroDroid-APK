package com.google.android.gms.common.internal.safeparcel;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.internal.view.SupportMenu;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
public class SafeParcelReader {

    /* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static class ParseException extends RuntimeException {
        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ParseException(@androidx.annotation.NonNull java.lang.String r3, @androidx.annotation.NonNull android.os.Parcel r4) {
            /*
                r2 = this;
                int r0 = r4.dataPosition()
                int r4 = r4.dataSize()
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = " Parcel: pos="
                r1.append(r3)
                r1.append(r0)
                java.lang.String r3 = " size="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ParseException.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    private SafeParcelReader() {
    }

    /* renamed from: A */
    public static double m4514A(@NonNull Parcel parcel, int i) {
        m4530Q(parcel, i, 8);
        return parcel.readDouble();
    }

    @NonNull
    /* renamed from: B */
    public static Double m4515B(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        if (M == 0) {
            return null;
        }
        m4529P(parcel, i, M, 8);
        return Double.valueOf(parcel.readDouble());
    }

    /* renamed from: C */
    public static float m4516C(@NonNull Parcel parcel, int i) {
        m4530Q(parcel, i, 4);
        return parcel.readFloat();
    }

    @NonNull
    /* renamed from: D */
    public static Float m4517D(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        if (M == 0) {
            return null;
        }
        m4529P(parcel, i, M, 4);
        return Float.valueOf(parcel.readFloat());
    }

    /* renamed from: E */
    public static int m4518E(@NonNull Parcel parcel) {
        return parcel.readInt();
    }

    @NonNull
    /* renamed from: F */
    public static IBinder m4519F(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + M);
        return readStrongBinder;
    }

    /* renamed from: G */
    public static int m4520G(@NonNull Parcel parcel, int i) {
        m4530Q(parcel, i, 4);
        return parcel.readInt();
    }

    @NonNull
    /* renamed from: H */
    public static Integer m4521H(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        if (M == 0) {
            return null;
        }
        m4529P(parcel, i, M, 4);
        return Integer.valueOf(parcel.readInt());
    }

    /* renamed from: I */
    public static void m4522I(@NonNull Parcel parcel, int i, @NonNull List list, @NonNull ClassLoader classLoader) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M != 0) {
            parcel.readList(list, classLoader);
            parcel.setDataPosition(dataPosition + M);
        }
    }

    /* renamed from: J */
    public static long m4523J(@NonNull Parcel parcel, int i) {
        m4530Q(parcel, i, 8);
        return parcel.readLong();
    }

    @NonNull
    /* renamed from: K */
    public static Long m4524K(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        if (M == 0) {
            return null;
        }
        m4529P(parcel, i, M, 8);
        return Long.valueOf(parcel.readLong());
    }

    /* renamed from: L */
    public static short m4525L(@NonNull Parcel parcel, int i) {
        m4530Q(parcel, i, 4);
        return (short) parcel.readInt();
    }

    /* renamed from: M */
    public static int m4526M(@NonNull Parcel parcel, int i) {
        return (i & SupportMenu.CATEGORY_MASK) != -65536 ? (char) (i >> 16) : parcel.readInt();
    }

    /* renamed from: N */
    public static void m4527N(@NonNull Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + m4526M(parcel, i));
    }

    /* renamed from: O */
    public static int m4528O(@NonNull Parcel parcel) {
        int E = m4518E(parcel);
        int M = m4526M(parcel, E);
        int dataPosition = parcel.dataPosition();
        if (m4553w(E) == 20293) {
            int i = M + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            throw new ParseException("Size read is invalid start=" + dataPosition + " end=" + i, parcel);
        }
        throw new ParseException("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(E))), parcel);
    }

    /* renamed from: P */
    private static void m4529P(Parcel parcel, int i, int i2, int i3) {
        if (i2 != i3) {
            String hexString = Integer.toHexString(i2);
            throw new ParseException("Expected size " + i3 + " got " + i2 + " (0x" + hexString + ")", parcel);
        }
    }

    /* renamed from: Q */
    private static void m4530Q(Parcel parcel, int i, int i2) {
        int M = m4526M(parcel, i);
        if (M != i2) {
            String hexString = Integer.toHexString(M);
            throw new ParseException("Expected size " + i2 + " got " + M + " (0x" + hexString + ")", parcel);
        }
    }

    @NonNull
    /* renamed from: a */
    public static BigDecimal m4531a(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        int readInt = parcel.readInt();
        parcel.setDataPosition(dataPosition + M);
        return new BigDecimal(new BigInteger(createByteArray), readInt);
    }

    @NonNull
    /* renamed from: b */
    public static BigDecimal[] m4532b(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigDecimal[] bigDecimalArr = new BigDecimal[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            byte[] createByteArray = parcel.createByteArray();
            bigDecimalArr[i2] = new BigDecimal(new BigInteger(createByteArray), parcel.readInt());
        }
        parcel.setDataPosition(dataPosition + M);
        return bigDecimalArr;
    }

    @NonNull
    /* renamed from: c */
    public static BigInteger m4533c(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + M);
        return new BigInteger(createByteArray);
    }

    @NonNull
    /* renamed from: d */
    public static BigInteger[] m4534d(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        BigInteger[] bigIntegerArr = new BigInteger[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bigIntegerArr[i2] = new BigInteger(parcel.createByteArray());
        }
        parcel.setDataPosition(dataPosition + M);
        return bigIntegerArr;
    }

    @NonNull
    /* renamed from: e */
    public static boolean[] m4535e(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        boolean[] createBooleanArray = parcel.createBooleanArray();
        parcel.setDataPosition(dataPosition + M);
        return createBooleanArray;
    }

    @NonNull
    /* renamed from: f */
    public static Bundle m4536f(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + M);
        return readBundle;
    }

    @NonNull
    /* renamed from: g */
    public static byte[] m4537g(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + M);
        return createByteArray;
    }

    @NonNull
    /* renamed from: h */
    public static double[] m4538h(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        double[] createDoubleArray = parcel.createDoubleArray();
        parcel.setDataPosition(dataPosition + M);
        return createDoubleArray;
    }

    @NonNull
    /* renamed from: i */
    public static ArrayList<Double> m4539i(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        ArrayList<Double> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Double.valueOf(parcel.readDouble()));
        }
        parcel.setDataPosition(dataPosition + M);
        return arrayList;
    }

    @NonNull
    /* renamed from: j */
    public static float[] m4540j(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        float[] createFloatArray = parcel.createFloatArray();
        parcel.setDataPosition(dataPosition + M);
        return createFloatArray;
    }

    @NonNull
    /* renamed from: k */
    public static int[] m4541k(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + M);
        return createIntArray;
    }

    @NonNull
    /* renamed from: l */
    public static ArrayList<Integer> m4542l(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        int readInt = parcel.readInt();
        for (int i2 = 0; i2 < readInt; i2++) {
            arrayList.add(Integer.valueOf(parcel.readInt()));
        }
        parcel.setDataPosition(dataPosition + M);
        return arrayList;
    }

    @NonNull
    /* renamed from: m */
    public static long[] m4543m(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + M);
        return createLongArray;
    }

    @NonNull
    /* renamed from: n */
    public static Parcel m4544n(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        obtain.appendFrom(parcel, dataPosition, M);
        parcel.setDataPosition(dataPosition + M);
        return obtain;
    }

    @NonNull
    /* renamed from: o */
    public static Parcel[] m4545o(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        Parcel[] parcelArr = new Parcel[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            int readInt2 = parcel.readInt();
            if (readInt2 != 0) {
                int dataPosition2 = parcel.dataPosition();
                Parcel obtain = Parcel.obtain();
                obtain.appendFrom(parcel, dataPosition2, readInt2);
                parcelArr[i2] = obtain;
                parcel.setDataPosition(dataPosition2 + readInt2);
            } else {
                parcelArr[i2] = null;
            }
        }
        parcel.setDataPosition(dataPosition + M);
        return parcelArr;
    }

    @NonNull
    /* renamed from: p */
    public static <T extends Parcelable> T m4546p(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        T t = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + M);
        return t;
    }

    @NonNull
    /* renamed from: q */
    public static String m4547q(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + M);
        return readString;
    }

    @NonNull
    /* renamed from: r */
    public static String[] m4548r(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + M);
        return createStringArray;
    }

    @NonNull
    /* renamed from: s */
    public static ArrayList<String> m4549s(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + M);
        return createStringArrayList;
    }

    @NonNull
    /* renamed from: t */
    public static <T> T[] m4550t(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        T[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + M);
        return createTypedArray;
    }

    @NonNull
    /* renamed from: u */
    public static <T> ArrayList<T> m4551u(@NonNull Parcel parcel, int i, @NonNull Parcelable.Creator<T> creator) {
        int M = m4526M(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (M == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + M);
        return createTypedArrayList;
    }

    /* renamed from: v */
    public static void m4552v(@NonNull Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            throw new ParseException("Overread allowed size end=" + i, parcel);
        }
    }

    /* renamed from: w */
    public static int m4553w(int i) {
        return (char) i;
    }

    /* renamed from: x */
    public static boolean m4554x(@NonNull Parcel parcel, int i) {
        m4530Q(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    @NonNull
    /* renamed from: y */
    public static Boolean m4555y(@NonNull Parcel parcel, int i) {
        int M = m4526M(parcel, i);
        if (M == 0) {
            return null;
        }
        m4529P(parcel, i, M, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    /* renamed from: z */
    public static byte m4556z(@NonNull Parcel parcel, int i) {
        m4530Q(parcel, i, 4);
        return (byte) parcel.readInt();
    }
}
