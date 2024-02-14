package com.google.android.gms.internal.wearable;

import com.google.android.gms.internal.wearable.zzaf;
import com.google.android.gms.internal.wearable.zzag;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-wearable@@18.0.0 */
public abstract class zzag<MessageType extends zzag<MessageType, BuilderType>, BuilderType extends zzaf<MessageType, BuilderType>> implements zzdc {
    protected int zza = 0;

    /* JADX WARNING: type inference failed for: r5v0, types: [java.util.Collection, java.lang.Object, java.lang.Iterable] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static void m64027c(java.lang.Iterable r5, java.util.List r6) {
        /*
            com.google.android.gms.internal.wearable.zzcd.m64226e(r5)
            boolean r0 = r5 instanceof com.google.android.gms.internal.wearable.zzck
            java.lang.String r1 = " is null."
            java.lang.String r2 = "Element at index "
            if (r0 == 0) goto L_0x0061
            com.google.android.gms.internal.wearable.zzck r5 = (com.google.android.gms.internal.wearable.zzck) r5
            java.util.List r5 = r5.mo53968e()
            r0 = r6
            com.google.android.gms.internal.wearable.zzck r0 = (com.google.android.gms.internal.wearable.zzck) r0
            int r6 = r6.size()
            java.util.Iterator r5 = r5.iterator()
        L_0x001c:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x00bd
            java.lang.Object r3 = r5.next()
            if (r3 != 0) goto L_0x0051
            int r5 = r0.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            int r5 = r5 - r6
            r3.append(r5)
            r3.append(r1)
            java.lang.String r5 = r3.toString()
            int r1 = r0.size()
        L_0x0043:
            int r1 = r1 + -1
            if (r1 < r6) goto L_0x004b
            r0.remove(r1)
            goto L_0x0043
        L_0x004b:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            r6.<init>(r5)
            throw r6
        L_0x0051:
            boolean r4 = r3 instanceof com.google.android.gms.internal.wearable.zzaw
            if (r4 == 0) goto L_0x005b
            com.google.android.gms.internal.wearable.zzaw r3 = (com.google.android.gms.internal.wearable.zzaw) r3
            r0.mo53965U0(r3)
            goto L_0x001c
        L_0x005b:
            java.lang.String r3 = (java.lang.String) r3
            r0.add(r3)
            goto L_0x001c
        L_0x0061:
            boolean r0 = r5 instanceof com.google.android.gms.internal.wearable.zzdj
            if (r0 != 0) goto L_0x00be
            boolean r0 = r6 instanceof java.util.ArrayList
            if (r0 == 0) goto L_0x007c
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L_0x007c
            r0 = r6
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r3 = r6.size()
            int r4 = r5.size()
            int r3 = r3 + r4
            r0.ensureCapacity(r3)
        L_0x007c:
            int r0 = r6.size()
            java.util.Iterator r5 = r5.iterator()
        L_0x0084:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L_0x00bd
            java.lang.Object r3 = r5.next()
            if (r3 != 0) goto L_0x00b9
            int r5 = r6.size()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            int r5 = r5 - r0
            r3.append(r5)
            r3.append(r1)
            java.lang.String r5 = r3.toString()
            int r1 = r6.size()
        L_0x00ab:
            int r1 = r1 + -1
            if (r1 < r0) goto L_0x00b3
            r6.remove(r1)
            goto L_0x00ab
        L_0x00b3:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException
            r6.<init>(r5)
            throw r6
        L_0x00b9:
            r6.add(r3)
            goto L_0x0084
        L_0x00bd:
            return
        L_0x00be:
            r6.addAll(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.wearable.zzag.m64027c(java.lang.Iterable, java.util.List):void");
    }

    /* renamed from: S */
    public final zzaw mo53798S() {
        try {
            int T = mo53942T();
            zzaw zzaw = zzaw.f45541a;
            byte[] bArr = new byte[T];
            zzbe c = zzbe.m64093c(bArr);
            mo53943a(c);
            c.mo53867d();
            return new zzat(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo53799b() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo53800d(int i) {
        throw null;
    }

    /* renamed from: e */
    public final byte[] mo53801e() {
        try {
            byte[] bArr = new byte[mo53942T()];
            zzbe c = zzbe.m64093c(bArr);
            mo53943a(c);
            c.mo53867d();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}