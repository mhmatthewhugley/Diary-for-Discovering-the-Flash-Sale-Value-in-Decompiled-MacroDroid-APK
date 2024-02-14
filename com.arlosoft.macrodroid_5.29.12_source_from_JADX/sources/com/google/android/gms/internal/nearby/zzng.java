package com.google.android.gms.internal.nearby;

import android.os.ParcelUuid;
import android.util.Log;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Hex;
import com.google.android.gms.common.util.VisibleForTesting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-nearby@@18.3.0 */
public final class zzng {

    /* renamed from: h */
    private static final ParcelUuid f44954h = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");

    /* renamed from: a */
    private final int f44955a;
    @Nullable

    /* renamed from: b */
    private final List f44956b;
    @Nullable

    /* renamed from: c */
    private final SparseArray f44957c;
    @Nullable

    /* renamed from: d */
    private final Map f44958d;

    /* renamed from: e */
    private final int f44959e;
    @Nullable

    /* renamed from: f */
    private final String f44960f;

    /* renamed from: g */
    private final byte[] f44961g;

    private zzng(@Nullable List list, @Nullable SparseArray sparseArray, @Nullable Map map, int i, int i2, @Nullable String str, byte[] bArr) {
        this.f44956b = list;
        this.f44957c = sparseArray;
        this.f44958d = map;
        this.f44960f = str;
        this.f44955a = i;
        this.f44959e = i2;
        this.f44961g = bArr;
    }

    @Nullable
    @VisibleForTesting
    /* renamed from: a */
    public static zzng m62816a(@Nullable byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        HashMap hashMap = new HashMap();
        int i = 0;
        byte b = -1;
        String str = null;
        byte b2 = -2147483648;
        while (true) {
            try {
                if (i < bArr.length) {
                    int i2 = i + 1;
                    byte b3 = bArr[i] & 255;
                    if (b3 != 0) {
                        int i3 = b3 - 1;
                        int i4 = i2 + 1;
                        byte b4 = bArr[i2] & 255;
                        if (b4 == 22) {
                            hashMap.put(m62818c(m62819d(bArr, i4, 2)), m62819d(bArr, i4 + 2, i3 - 2));
                        } else if (b4 != 255) {
                            switch (b4) {
                                case 1:
                                    b = bArr[i4] & 255;
                                    break;
                                case 2:
                                case 3:
                                    m62817b(bArr, i4, i3, 2, arrayList);
                                    break;
                                case 4:
                                case 5:
                                    m62817b(bArr, i4, i3, 4, arrayList);
                                    break;
                                case 6:
                                case 7:
                                    m62817b(bArr, i4, i3, 16, arrayList);
                                    break;
                                case 8:
                                case 9:
                                    str = new String(m62819d(bArr, i4, i3));
                                    break;
                                case 10:
                                    b2 = bArr[i4];
                                    break;
                            }
                        } else {
                            sparseArray.put(((bArr[i4 + 1] & 255) << 8) + (255 & bArr[i4]), m62819d(bArr, i4 + 2, i3 - 2));
                        }
                        i = i3 + i4;
                    }
                }
            } catch (Exception e) {
                Log.w("BleRecord", "Unable to parse scan record: ".concat(String.valueOf(Arrays.toString(bArr))), e);
                return null;
            }
        }
        return new zzng(true != arrayList.isEmpty() ? arrayList : null, sparseArray, hashMap, b, b2, str, bArr);
    }

    /* renamed from: b */
    private static int m62817b(byte[] bArr, int i, int i2, int i3, List list) {
        while (i2 > 0) {
            list.add(m62818c(m62819d(bArr, i, i3)));
            i2 -= i3;
            i += i3;
        }
        return i;
    }

    /* renamed from: c */
    private static ParcelUuid m62818c(byte[] bArr) {
        long j;
        int length = bArr.length;
        if (length != 2 && length != 4 && length != 16) {
            throw new IllegalArgumentException("uuidBytes length invalid - " + length);
        } else if (length == 16) {
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            return new ParcelUuid(new UUID(order.getLong(8), order.getLong(0)));
        } else {
            if (length == 2) {
                j = ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8));
            } else {
                j = ((long) ((bArr[3] & 255) << 24)) + ((long) (bArr[0] & 255)) + ((long) ((bArr[1] & 255) << 8)) + ((long) ((bArr[2] & 255) << 16));
            }
            ParcelUuid parcelUuid = f44954h;
            return new ParcelUuid(new UUID(parcelUuid.getUuid().getMostSignificantBits() + (j << 32), parcelUuid.getUuid().getLeastSignificantBits()));
        }
    }

    /* renamed from: d */
    private static byte[] m62819d(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzng)) {
            return false;
        }
        return Arrays.equals(this.f44961g, ((zzng) obj).f44961g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44961g);
    }

    public final String toString() {
        String str;
        String str2;
        String str3;
        int i = this.f44955a;
        String valueOf = String.valueOf(this.f44956b);
        SparseArray sparseArray = this.f44957c;
        StringBuilder sb = new StringBuilder();
        String str4 = "{}";
        int i2 = 0;
        if (sparseArray.size() <= 0) {
            str = str4;
        } else {
            sb.append('{');
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                if (i3 > 0) {
                    sb.append(", ");
                }
                int keyAt = sparseArray.keyAt(i3);
                byte[] bArr = (byte[]) sparseArray.valueAt(i3);
                sb.append(keyAt);
                sb.append('=');
                if (bArr == null) {
                    str3 = null;
                } else {
                    str3 = Hex.m4885b(bArr);
                }
                sb.append(str3);
            }
            sb.append('}');
            str = sb.toString();
        }
        Map map = this.f44958d;
        StringBuilder sb2 = new StringBuilder();
        if (!map.keySet().isEmpty()) {
            sb2.append('{');
            for (Map.Entry entry : map.entrySet()) {
                if (i2 > 0) {
                    sb2.append(", ");
                }
                sb2.append(entry.getKey());
                sb2.append('=');
                byte[] bArr2 = (byte[]) entry.getValue();
                if (bArr2 == null) {
                    str2 = null;
                } else {
                    str2 = Hex.m4885b(bArr2);
                }
                sb2.append(str2);
                i2++;
            }
            sb2.append('}');
            str4 = sb2.toString();
        }
        return "BleRecord [mAdvertiseFlags=" + i + ", mServiceUuids=" + valueOf + ", mManufacturerSpecificData=" + str + ", mServiceData=" + str4 + ", mTxPowerLevel=" + this.f44959e + ", mDeviceName=" + this.f44960f + "]";
    }
}
