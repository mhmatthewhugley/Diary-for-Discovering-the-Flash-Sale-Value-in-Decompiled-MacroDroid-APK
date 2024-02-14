package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@KeepName
@KeepForSdk
@SafeParcelable.Class
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public final class DataHolder extends AbstractSafeParcelable implements Closeable {

    /* renamed from: B */
    private static final Builder f3521B = new zab(new String[0], (String) null);
    @NonNull
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zaf();

    /* renamed from: A */
    private boolean f3522A;
    @SafeParcelable.VersionField

    /* renamed from: a */
    final int f3523a;
    @SafeParcelable.Field

    /* renamed from: c */
    private final String[] f3524c;

    /* renamed from: d */
    Bundle f3525d;
    @SafeParcelable.Field

    /* renamed from: f */
    private final CursorWindow[] f3526f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final int f3527g;
    @SafeParcelable.Field
    @Nullable

    /* renamed from: o */
    private final Bundle f3528o;

    /* renamed from: p */
    int[] f3529p;

    /* renamed from: s */
    int f3530s;

    /* renamed from: z */
    boolean f3531z;

    @KeepForSdk
    /* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final String[] f3532a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ArrayList f3533b = new ArrayList();

        /* renamed from: c */
        private final HashMap f3534c = new HashMap();

        /* synthetic */ Builder(String[] strArr, String str, zac zac) {
            this.f3532a = (String[]) Preconditions.m4488k(strArr);
        }
    }

    @SafeParcelable.Constructor
    DataHolder(@SafeParcelable.Param int i, @SafeParcelable.Param String[] strArr, @SafeParcelable.Param CursorWindow[] cursorWindowArr, @SafeParcelable.Param int i2, @SafeParcelable.Param @Nullable Bundle bundle) {
        this.f3531z = false;
        this.f3522A = true;
        this.f3523a = i;
        this.f3524c = strArr;
        this.f3526f = cursorWindowArr;
        this.f3527g = i2;
        this.f3528o = bundle;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: l2 */
    public static DataHolder m4297l2(int i) {
        return new DataHolder(f3521B, i, (Bundle) null);
    }

    /* renamed from: w2 */
    private final void m4298w2(String str, int i) {
        Bundle bundle = this.f3525d;
        if (bundle == null || !bundle.containsKey(str)) {
            throw new IllegalArgumentException("No such column: ".concat(String.valueOf(str)));
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.f3530s) {
            throw new CursorIndexOutOfBoundsException(i, this.f3530s);
        }
    }

    /* renamed from: x2 */
    private static CursorWindow[] m4299x2(Builder builder, int i) {
        if (builder.f3532a.length == 0) {
            return new CursorWindow[0];
        }
        ArrayList a = builder.f3533b;
        int size = a.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(cursorWindow);
        cursorWindow.setNumColumns(builder.f3532a.length);
        int i2 = 0;
        boolean z = false;
        while (i2 < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Allocating additional cursor window for large data set (row ");
                    sb.append(i2);
                    sb.append(")");
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(builder.f3532a.length);
                    arrayList.add(cursorWindow);
                    if (!cursorWindow.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        arrayList.remove(cursorWindow);
                        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
                    }
                }
                Map map = (Map) a.get(i2);
                int i3 = 0;
                boolean z2 = true;
                while (true) {
                    if (i3 < builder.f3532a.length) {
                        if (!z2) {
                            break;
                        }
                        String str = builder.f3532a[i3];
                        Object obj = map.get(str);
                        if (obj == null) {
                            z2 = cursorWindow.putNull(i2, i3);
                        } else if (obj instanceof String) {
                            z2 = cursorWindow.putString((String) obj, i2, i3);
                        } else if (obj instanceof Long) {
                            z2 = cursorWindow.putLong(((Long) obj).longValue(), i2, i3);
                        } else if (obj instanceof Integer) {
                            z2 = cursorWindow.putLong((long) ((Integer) obj).intValue(), i2, i3);
                        } else if (obj instanceof Boolean) {
                            z2 = cursorWindow.putLong(true != ((Boolean) obj).booleanValue() ? 0 : 1, i2, i3);
                        } else if (obj instanceof byte[]) {
                            z2 = cursorWindow.putBlob((byte[]) obj, i2, i3);
                        } else if (obj instanceof Double) {
                            z2 = cursorWindow.putDouble(((Double) obj).doubleValue(), i2, i3);
                        } else if (obj instanceof Float) {
                            z2 = cursorWindow.putDouble((double) ((Float) obj).floatValue(), i2, i3);
                        } else {
                            throw new IllegalArgumentException("Unsupported object for column " + str + ": " + obj.toString());
                        }
                        i3++;
                    } else if (z2) {
                        z = false;
                    }
                }
                if (!z) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Couldn't populate window data for row ");
                    sb2.append(i2);
                    sb2.append(" - allocating new window.");
                    cursorWindow.freeLastRow();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i2);
                    cursorWindow.setNumColumns(builder.f3532a.length);
                    arrayList.add(cursorWindow);
                    i2--;
                    z = true;
                    i2++;
                } else {
                    throw new zad("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                }
            } catch (RuntimeException e) {
                int size2 = arrayList.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((CursorWindow) arrayList.get(i4)).close();
                }
                throw e;
            }
        }
        return (CursorWindow[]) arrayList.toArray(new CursorWindow[arrayList.size()]);
    }

    @KeepForSdk
    public void close() {
        synchronized (this) {
            if (!this.f3531z) {
                this.f3531z = true;
                int i = 0;
                while (true) {
                    CursorWindow[] cursorWindowArr = this.f3526f;
                    if (i >= cursorWindowArr.length) {
                        break;
                    }
                    cursorWindowArr[i].close();
                    i++;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (this.f3522A && this.f3526f.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + obj + ")");
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public int getCount() {
        return this.f3530s;
    }

    @KeepForSdk
    public boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.f3531z;
        }
        return z;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: m2 */
    public byte[] mo21568m2(@NonNull String str, int i, int i2) {
        m4298w2(str, i);
        return this.f3526f[i2].getBlob(i, this.f3525d.getInt(str));
    }

    @KeepForSdk
    /* renamed from: n2 */
    public int mo21569n2(@NonNull String str, int i, int i2) {
        m4298w2(str, i);
        return this.f3526f[i2].getInt(i, this.f3525d.getInt(str));
    }

    @KeepForSdk
    @Nullable
    /* renamed from: o2 */
    public Bundle mo21570o2() {
        return this.f3528o;
    }

    @KeepForSdk
    /* renamed from: p2 */
    public int mo21571p2() {
        return this.f3527g;
    }

    @NonNull
    @KeepForSdk
    /* renamed from: q2 */
    public String mo21572q2(@NonNull String str, int i, int i2) {
        m4298w2(str, i);
        return this.f3526f[i2].getString(i, this.f3525d.getInt(str));
    }

    @KeepForSdk
    /* renamed from: r2 */
    public int mo21573r2(int i) {
        int length;
        int i2 = 0;
        Preconditions.m4493p(i >= 0 && i < this.f3530s);
        while (true) {
            int[] iArr = this.f3529p;
            length = iArr.length;
            if (i2 >= length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return i2 == length ? i2 - 1 : i2;
    }

    @KeepForSdk
    /* renamed from: s2 */
    public boolean mo21574s2(@NonNull String str) {
        return this.f3525d.containsKey(str);
    }

    @KeepForSdk
    /* renamed from: t2 */
    public boolean mo21575t2(@NonNull String str, int i, int i2) {
        m4298w2(str, i);
        return this.f3526f[i2].isNull(i, this.f3525d.getInt(str));
    }

    /* renamed from: u2 */
    public final float mo21576u2(@NonNull String str, int i, int i2) {
        m4298w2(str, i);
        return this.f3526f[i2].getFloat(i, this.f3525d.getInt(str));
    }

    /* renamed from: v2 */
    public final void mo21577v2() {
        this.f3525d = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f3524c;
            if (i2 >= strArr.length) {
                break;
            }
            this.f3525d.putInt(strArr[i2], i2);
            i2++;
        }
        this.f3529p = new int[this.f3526f.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f3526f;
            if (i < cursorWindowArr.length) {
                this.f3529p[i] = i3;
                i3 += this.f3526f[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.f3530s = i3;
                return;
            }
        }
    }

    public final void writeToParcel(@NonNull Parcel parcel, int i) {
        int a = SafeParcelWriter.m4563a(parcel);
        SafeParcelWriter.m4587y(parcel, 1, this.f3524c, false);
        SafeParcelWriter.m4557A(parcel, 2, this.f3526f, i, false);
        SafeParcelWriter.m4576n(parcel, 3, mo21571p2());
        SafeParcelWriter.m4567e(parcel, 4, mo21570o2(), false);
        SafeParcelWriter.m4576n(parcel, 1000, this.f3523a);
        SafeParcelWriter.m4564b(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }

    private DataHolder(Builder builder, int i, @Nullable Bundle bundle) {
        this(builder.f3532a, m4299x2(builder, -1), i, (Bundle) null);
    }

    @KeepForSdk
    public DataHolder(@NonNull String[] strArr, @NonNull CursorWindow[] cursorWindowArr, int i, @Nullable Bundle bundle) {
        this.f3531z = false;
        this.f3522A = true;
        this.f3523a = 1;
        this.f3524c = (String[]) Preconditions.m4488k(strArr);
        this.f3526f = (CursorWindow[]) Preconditions.m4488k(cursorWindowArr);
        this.f3527g = i;
        this.f3528o = bundle;
        mo21577v2();
    }
}
