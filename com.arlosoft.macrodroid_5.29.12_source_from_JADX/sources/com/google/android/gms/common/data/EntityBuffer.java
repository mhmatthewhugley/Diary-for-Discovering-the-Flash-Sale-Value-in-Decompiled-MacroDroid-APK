package com.google.android.gms.common.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;

@KeepForSdk
/* compiled from: com.google.android.gms:play-services-base@@18.1.0 */
public abstract class EntityBuffer<T> extends AbstractDataBuffer<T> {

    /* renamed from: c */
    private boolean f3535c = false;

    /* renamed from: d */
    private ArrayList f3536d;

    @KeepForSdk
    protected EntityBuffer(@NonNull DataHolder dataHolder) {
        super(dataHolder);
    }

    /* renamed from: m */
    private final void m4312m() {
        synchronized (this) {
            if (!this.f3535c) {
                int count = ((DataHolder) Preconditions.m4488k(this.f3506a)).getCount();
                ArrayList arrayList = new ArrayList();
                this.f3536d = arrayList;
                if (count > 0) {
                    arrayList.add(0);
                    String i = mo21581i();
                    String q2 = this.f3506a.mo21572q2(i, 0, this.f3506a.mo21573r2(0));
                    int i2 = 1;
                    while (i2 < count) {
                        int r2 = this.f3506a.mo21573r2(i2);
                        String q22 = this.f3506a.mo21572q2(i, i2, r2);
                        if (q22 != null) {
                            if (!q22.equals(q2)) {
                                this.f3536d.add(Integer.valueOf(i2));
                                q2 = q22;
                            }
                            i2++;
                        } else {
                            throw new NullPointerException("Missing value for markerColumn: " + i + ", at row: " + i2 + ", for window: " + r2);
                        }
                    }
                }
                this.f3535c = true;
            }
        }
    }

    /* access modifiers changed from: protected */
    @KeepForSdk
    @Nullable
    /* renamed from: c */
    public String mo21579c() {
        return null;
    }

    @NonNull
    @KeepForSdk
    public final T get(int i) {
        int i2;
        int i3;
        m4312m();
        int j = mo21582j(i);
        int i4 = 0;
        if (i >= 0 && i != this.f3536d.size()) {
            if (i == this.f3536d.size() - 1) {
                i3 = ((DataHolder) Preconditions.m4488k(this.f3506a)).getCount();
                i2 = ((Integer) this.f3536d.get(i)).intValue();
            } else {
                i3 = ((Integer) this.f3536d.get(i + 1)).intValue();
                i2 = ((Integer) this.f3536d.get(i)).intValue();
            }
            int i5 = i3 - i2;
            if (i5 == 1) {
                int j2 = mo21582j(i);
                int r2 = ((DataHolder) Preconditions.m4488k(this.f3506a)).mo21573r2(j2);
                String c = mo21579c();
                if (c == null || this.f3506a.mo21572q2(c, j2, r2) != null) {
                    i4 = 1;
                }
            } else {
                i4 = i5;
            }
        }
        return mo21580h(j, i4);
    }

    @KeepForSdk
    public int getCount() {
        m4312m();
        return this.f3536d.size();
    }

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: h */
    public abstract T mo21580h(int i, int i2);

    /* access modifiers changed from: protected */
    @NonNull
    @KeepForSdk
    /* renamed from: i */
    public abstract String mo21581i();

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final int mo21582j(int i) {
        if (i >= 0 && i < this.f3536d.size()) {
            return ((Integer) this.f3536d.get(i)).intValue();
        }
        throw new IllegalArgumentException("Position " + i + " is out of bounds for this buffer");
    }
}
