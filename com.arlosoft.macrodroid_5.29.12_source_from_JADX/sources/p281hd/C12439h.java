package p281hd;

import android.bluetooth.le.ScanFilter;
import java.util.ArrayList;
import java.util.List;
import org.altbeacon.beacon.BeaconParser;
import org.altbeacon.beacon.C8048e;
import org.altbeacon.beacon.Region;

/* renamed from: hd.h */
/* compiled from: ScanFilterUtils */
public class C12439h {

    /* renamed from: hd.h$a */
    /* compiled from: ScanFilterUtils */
    class C12440a {

        /* renamed from: a */
        public Long f59222a = null;

        /* renamed from: b */
        public byte[] f59223b = new byte[0];

        /* renamed from: c */
        public int f59224c;

        /* renamed from: d */
        public byte[] f59225d;

        /* renamed from: e */
        public byte[] f59226e;

        C12440a() {
        }
    }

    /* renamed from: a */
    public List<C12440a> mo68822a(BeaconParser beaconParser, List<C8048e> list) {
        List<C8048e> list2 = list;
        ArrayList arrayList = new ArrayList();
        long longValue = beaconParser.mo38024l().longValue();
        int n = beaconParser.mo38026n();
        int m = beaconParser.mo38025m();
        byte[] r = BeaconParser.m33549r(longValue, (m - n) + 1);
        int i = 2;
        if (list2 != null && list.size() > 0 && list2.get(0) != null && beaconParser.mo38024l().longValue() == 533) {
            int[] j = beaconParser.mo38022j();
            if (j.length > 0) {
                int i2 = j[0];
                C12440a aVar = new C12440a();
                aVar.f59224c = i2;
                int i3 = list.size() == 2 ? 20 : 18;
                if (list.size() == 3) {
                    i3 = 22;
                }
                byte[] bArr = new byte[i3];
                aVar.f59225d = bArr;
                bArr[0] = r[0];
                bArr[1] = r[1];
                byte[] l = list2.get(0).mo38053l();
                for (int i4 = 0; i4 < l.length; i4++) {
                    aVar.f59225d[i4 + 2] = l[i4];
                }
                if (list.size() > 1 && list2.get(1) != null) {
                    byte[] l2 = list2.get(1).mo38053l();
                    for (int i5 = 0; i5 < l2.length; i5++) {
                        aVar.f59225d[i5 + 18] = l2[i5];
                    }
                }
                if (list.size() > 2 && list2.get(2) != null) {
                    byte[] l3 = list2.get(2).mo38053l();
                    for (int i6 = 0; i6 < l3.length; i6++) {
                        aVar.f59225d[i6 + 20] = l3[i6];
                    }
                }
                aVar.f59226e = new byte[i3];
                for (int i7 = 0; i7 < i3; i7++) {
                    aVar.f59226e[i7] = -1;
                }
                aVar.f59222a = null;
                aVar.f59223b = new byte[0];
                arrayList.add(aVar);
                return arrayList;
            }
        }
        int[] j2 = beaconParser.mo38022j();
        int length = j2.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = j2[i8];
            C12440a aVar2 = new C12440a();
            Long p = beaconParser.mo38027p();
            int i10 = (m + 1) - i;
            byte[] bArr2 = new byte[0];
            byte[] bArr3 = new byte[0];
            if (i10 > 0) {
                bArr2 = new byte[i10];
                bArr3 = new byte[i10];
                for (int i11 = 2; i11 <= m; i11++) {
                    int i12 = i11 - 2;
                    if (i11 < n) {
                        bArr2[i12] = 0;
                        bArr3[i12] = 0;
                    } else {
                        bArr2[i12] = r[i11 - n];
                        bArr3[i12] = -1;
                    }
                }
            }
            aVar2.f59224c = i9;
            aVar2.f59225d = bArr2;
            aVar2.f59226e = bArr3;
            aVar2.f59222a = p;
            aVar2.f59223b = beaconParser.mo38028q();
            arrayList.add(aVar2);
            i8++;
            i = 2;
        }
        return arrayList;
    }

    /* renamed from: b */
    public List<ScanFilter> mo68823b(List<BeaconParser> list) {
        return mo68824c(list, (List<Region>) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x016c A[SYNTHETIC] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<android.bluetooth.le.ScanFilter> mo68824c(java.util.List<org.altbeacon.beacon.BeaconParser> r18, java.util.List<org.altbeacon.beacon.Region> r19) {
        /*
            r17 = this;
            r0 = r19
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            if (r0 != 0) goto L_0x000e
            r1.add(r2)
            goto L_0x0011
        L_0x000e:
            r1.addAll(r0)
        L_0x0011:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x001a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x0175
            java.lang.Object r3 = r1.next()
            org.altbeacon.beacon.Region r3 = (org.altbeacon.beacon.Region) r3
            java.util.Iterator r4 = r18.iterator()
        L_0x002a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0171
            java.lang.Object r5 = r4.next()
            org.altbeacon.beacon.BeaconParser r5 = (org.altbeacon.beacon.BeaconParser) r5
            if (r3 != 0) goto L_0x003c
            r7 = r17
            r6 = r2
            goto L_0x0042
        L_0x003c:
            java.util.List r6 = r3.mo38034d()
            r7 = r17
        L_0x0042:
            java.util.List r5 = r7.mo68822a(r5, r6)
            java.util.Iterator r5 = r5.iterator()
        L_0x004a:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L_0x002a
            java.lang.Object r6 = r5.next()
            hd.h$a r6 = (p281hd.C12439h.C12440a) r6
            android.bluetooth.le.ScanFilter$Builder r8 = new android.bluetooth.le.ScanFilter$Builder
            r8.<init>()
            java.lang.Long r9 = r6.f59222a
            java.lang.String r10 = "making scan filter with service mask: "
            java.lang.String r11 = "making scan filter for service: "
            java.lang.String r12 = "FFFFFFFF-FFFF-FFFF-FFFF-FFFFFFFFFFFF"
            r13 = 1
            java.lang.String r14 = " "
            java.lang.String r15 = "ScanFilterUtils"
            r2 = 0
            if (r9 == 0) goto L_0x00c0
            java.lang.Object[] r6 = new java.lang.Object[r13]
            r6[r2] = r9
            java.lang.String r9 = "0000%04X-0000-1000-8000-00805f9b34fb"
            java.lang.String r6 = java.lang.String.format(r9, r6)
            android.os.ParcelUuid r9 = android.os.ParcelUuid.fromString(r6)
            android.os.ParcelUuid r13 = android.os.ParcelUuid.fromString(r12)
            boolean r16 = p097gd.C7354d.m30380e()
            if (r16 == 0) goto L_0x00b9
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r11)
            r2.append(r6)
            r2.append(r14)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r6 = 0
            java.lang.Object[] r11 = new java.lang.Object[r6]
            p097gd.C7354d.m30376a(r15, r2, r11)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r12)
            r2.append(r14)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r10 = new java.lang.Object[r6]
            p097gd.C7354d.m30376a(r15, r2, r10)
            goto L_0x00ba
        L_0x00b9:
            r6 = 0
        L_0x00ba:
            r8.setServiceUuid(r9, r13)
        L_0x00bd:
            r2 = 0
            goto L_0x014b
        L_0x00c0:
            byte[] r9 = r6.f59223b
            int r2 = r9.length
            if (r2 == 0) goto L_0x0117
            r2 = 16
            r6 = 0
            org.altbeacon.beacon.e r2 = org.altbeacon.beacon.C8048e.m33576d(r9, r6, r2, r13)
            java.lang.String r2 = r2.toString()
            android.os.ParcelUuid r6 = android.os.ParcelUuid.fromString(r2)
            android.os.ParcelUuid r9 = android.os.ParcelUuid.fromString(r12)
            boolean r13 = p097gd.C7354d.m30380e()
            if (r13 == 0) goto L_0x0113
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            r13.append(r11)
            r13.append(r2)
            r13.append(r14)
            r13.append(r6)
            java.lang.String r2 = r13.toString()
            r11 = 0
            java.lang.Object[] r13 = new java.lang.Object[r11]
            p097gd.C7354d.m30376a(r15, r2, r13)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            r2.append(r12)
            r2.append(r14)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r10 = new java.lang.Object[r11]
            p097gd.C7354d.m30376a(r15, r2, r10)
        L_0x0113:
            r8.setServiceUuid(r6, r9)
            goto L_0x00bd
        L_0x0117:
            r2 = 0
            r8.setServiceUuid(r2)
            int r9 = r6.f59224c
            byte[] r10 = r6.f59225d
            byte[] r11 = r6.f59226e
            r8.setManufacturerData(r9, r10, r11)
            boolean r9 = p097gd.C7354d.m30380e()
            if (r9 == 0) goto L_0x014b
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "making scan filter for manufacturer: "
            r9.append(r10)
            int r10 = r6.f59224c
            r9.append(r10)
            r9.append(r14)
            byte[] r6 = r6.f59225d
            r9.append(r6)
            java.lang.String r6 = r9.toString()
            r9 = 0
            java.lang.Object[] r10 = new java.lang.Object[r9]
            p097gd.C7354d.m30376a(r15, r6, r10)
        L_0x014b:
            android.bluetooth.le.ScanFilter r6 = r8.build()
            boolean r8 = p097gd.C7354d.m30380e()
            if (r8 == 0) goto L_0x016c
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Set up a scan filter: "
            r8.append(r9)
            r8.append(r6)
            java.lang.String r8 = r8.toString()
            r9 = 0
            java.lang.Object[] r9 = new java.lang.Object[r9]
            p097gd.C7354d.m30376a(r15, r8, r9)
        L_0x016c:
            r0.add(r6)
            goto L_0x004a
        L_0x0171:
            r7 = r17
            goto L_0x001a
        L_0x0175:
            r7 = r17
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p281hd.C12439h.mo68824c(java.util.List, java.util.List):java.util.List");
    }

    /* renamed from: d */
    public List<ScanFilter> mo68825d() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ScanFilter.Builder().build());
        return arrayList;
    }
}
