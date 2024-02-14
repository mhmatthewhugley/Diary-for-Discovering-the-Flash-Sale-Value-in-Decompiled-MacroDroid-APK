package com.arlosoft.macrodroid.celltowers;

import android.content.Context;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.TelephonyManager;
import java.util.List;

/* renamed from: com.arlosoft.macrodroid.celltowers.v */
/* compiled from: CellTowerUtils */
public class C3943v {

    /* renamed from: com.arlosoft.macrodroid.celltowers.v$a */
    /* compiled from: CellTowerUtils */
    public static class C3944a {

        /* renamed from: a */
        public long f10256a;

        /* renamed from: b */
        public String f10257b;

        /* renamed from: c */
        public String f10258c;

        /* renamed from: d */
        public int f10259d;

        public boolean equals(Object obj) {
            if (obj != null && (obj instanceof C3944a)) {
                return this.f10258c.equals(((C3944a) obj).f10258c);
            }
            return false;
        }

        public String toString() {
            if (this.f10257b != null) {
                return this.f10257b + " " + this.f10259d;
            }
            return this.f10258c + " " + this.f10259d;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:168:0x0362 A[Catch:{ Exception -> 0x04ea }] */
    /* JADX WARNING: Removed duplicated region for block: B:192:0x03cd A[Catch:{ NumberFormatException -> 0x051e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.arlosoft.macrodroid.celltowers.C3943v.C3944a> m15317a(android.content.Context r19) {
        /*
            r0 = r19
            java.lang.String r1 = "phone"
            java.lang.Object r1 = r0.getSystemService(r1)
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1
            if (r1 != 0) goto L_0x0017
            java.lang.String r0 = "Telephony Manager is null cannot obtain cell tower ids"
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L_0x0017:
            java.lang.String r2 = "android.permission.READ_PHONE_STATE"
            int r0 = androidx.core.content.ContextCompat.checkSelfPermission(r0, r2)
            if (r0 != 0) goto L_0x002b
            int r0 = r1.getCallState()
            if (r0 == 0) goto L_0x002b
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
        L_0x002b:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 4
            r4 = 2
            r6 = 0
            java.util.List r0 = r1.getAllCellInfo()     // Catch:{ Exception -> 0x04ed }
            java.lang.String r8 = "CDMA:"
            r9 = 999(0x3e7, float:1.4E-42)
            r10 = -1
            java.lang.String r11 = ","
            r12 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L_0x035b
            int r13 = r0.size()     // Catch:{ Exception -> 0x04ed }
            if (r13 <= 0) goto L_0x035b
            java.util.Iterator r13 = r0.iterator()     // Catch:{ Exception -> 0x04ed }
            r14 = 0
        L_0x004e:
            boolean r0 = r13.hasNext()     // Catch:{ Exception -> 0x04ea }
            if (r0 == 0) goto L_0x035c
            java.lang.Object r0 = r13.next()     // Catch:{ Exception -> 0x04ea }
            android.telephony.CellInfo r0 = (android.telephony.CellInfo) r0     // Catch:{ Exception -> 0x04ea }
            com.arlosoft.macrodroid.celltowers.v$a r15 = new com.arlosoft.macrodroid.celltowers.v$a     // Catch:{ Exception -> 0x04ea }
            r15.<init>()     // Catch:{ Exception -> 0x04ea }
            r15.f10259d = r6     // Catch:{ Exception -> 0x04ea }
            boolean r7 = r0 instanceof android.telephony.CellInfoGsm     // Catch:{ Exception -> 0x04ea }
            if (r7 == 0) goto L_0x00e0
            android.telephony.CellInfoGsm r0 = (android.telephony.CellInfoGsm) r0     // Catch:{ Exception -> 0x00dc }
            android.telephony.CellIdentityGsm r7 = r0.getCellIdentity()     // Catch:{ Exception -> 0x00dc }
            if (r7 == 0) goto L_0x00d7
            int r14 = r7.getMcc()     // Catch:{ Exception -> 0x00dc }
            if (r14 == r12) goto L_0x00d7
            int r14 = r7.getMnc()     // Catch:{ Exception -> 0x00dc }
            if (r14 == r12) goto L_0x00d7
            int r14 = r7.getCid()     // Catch:{ Exception -> 0x00dc }
            if (r14 == r12) goto L_0x00d7
            int r14 = r7.getMcc()     // Catch:{ Exception -> 0x00dc }
            if (r14 == 0) goto L_0x00d7
            int r14 = r7.getMcc()     // Catch:{ Exception -> 0x00dc }
            if (r14 == r10) goto L_0x00d7
            int r14 = r7.getMnc()     // Catch:{ Exception -> 0x00dc }
            if (r14 == 0) goto L_0x00d7
            int r14 = r7.getMnc()     // Catch:{ Exception -> 0x00dc }
            if (r14 == r10) goto L_0x00d7
            int r14 = r7.getCid()     // Catch:{ Exception -> 0x00dc }
            if (r14 <= r9) goto L_0x00d7
            int r14 = r7.getCid()     // Catch:{ Exception -> 0x00dc }
            long r5 = (long) r14     // Catch:{ Exception -> 0x00dc }
            r15.f10256a = r5     // Catch:{ Exception -> 0x00dc }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00dc }
            r5.<init>()     // Catch:{ Exception -> 0x00dc }
            int r6 = r7.getMcc()     // Catch:{ Exception -> 0x00dc }
            r5.append(r6)     // Catch:{ Exception -> 0x00dc }
            r5.append(r11)     // Catch:{ Exception -> 0x00dc }
            int r6 = r7.getMnc()     // Catch:{ Exception -> 0x00dc }
            r5.append(r6)     // Catch:{ Exception -> 0x00dc }
            r5.append(r11)     // Catch:{ Exception -> 0x00dc }
            int r6 = r7.getCid()     // Catch:{ Exception -> 0x00dc }
            r5.append(r6)     // Catch:{ Exception -> 0x00dc }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00dc }
            r15.f10258c = r5     // Catch:{ Exception -> 0x00dc }
            android.telephony.CellSignalStrengthGsm r0 = r0.getCellSignalStrength()     // Catch:{ Exception -> 0x00dc }
            int r0 = r0.getDbm()     // Catch:{ Exception -> 0x00dc }
            r15.f10259d = r0     // Catch:{ Exception -> 0x00dc }
            r2.add(r15)     // Catch:{ Exception -> 0x00dc }
        L_0x00d7:
            r16 = r13
            r14 = 1
            goto L_0x0353
        L_0x00dc:
            r0 = move-exception
            r3 = 1
            goto L_0x04ef
        L_0x00e0:
            boolean r5 = r0 instanceof android.telephony.CellInfoCdma     // Catch:{ Exception -> 0x04ea }
            if (r5 == 0) goto L_0x01bc
            android.telephony.CellInfoCdma r0 = (android.telephony.CellInfoCdma) r0     // Catch:{ Exception -> 0x01b8 }
            android.telephony.CellIdentityCdma r5 = r0.getCellIdentity()     // Catch:{ Exception -> 0x01b8 }
            if (r5 == 0) goto L_0x01b3
            int r6 = r5.getNetworkId()     // Catch:{ Exception -> 0x01b8 }
            if (r6 == r12) goto L_0x013a
            int r6 = r5.getSystemId()     // Catch:{ Exception -> 0x01b8 }
            if (r6 == r12) goto L_0x013a
            int r6 = r5.getBasestationId()     // Catch:{ Exception -> 0x01b8 }
            if (r6 == r12) goto L_0x013a
            int r6 = r5.getBasestationId()     // Catch:{ Exception -> 0x01b8 }
            long r6 = (long) r6     // Catch:{ Exception -> 0x01b8 }
            r15.f10256a = r6     // Catch:{ Exception -> 0x01b8 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b8 }
            r6.<init>()     // Catch:{ Exception -> 0x01b8 }
            r6.append(r8)     // Catch:{ Exception -> 0x01b8 }
            int r7 = r5.getNetworkId()     // Catch:{ Exception -> 0x01b8 }
            r6.append(r7)     // Catch:{ Exception -> 0x01b8 }
            r6.append(r11)     // Catch:{ Exception -> 0x01b8 }
            int r7 = r5.getSystemId()     // Catch:{ Exception -> 0x01b8 }
            r6.append(r7)     // Catch:{ Exception -> 0x01b8 }
            int r5 = r5.getBasestationId()     // Catch:{ Exception -> 0x01b8 }
            r6.append(r5)     // Catch:{ Exception -> 0x01b8 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x01b8 }
            r15.f10258c = r5     // Catch:{ Exception -> 0x01b8 }
            android.telephony.CellSignalStrengthCdma r0 = r0.getCellSignalStrength()     // Catch:{ Exception -> 0x01b8 }
            int r0 = r0.getDbm()     // Catch:{ Exception -> 0x01b8 }
            r15.f10259d = r0     // Catch:{ Exception -> 0x01b8 }
            r2.add(r15)     // Catch:{ Exception -> 0x01b8 }
            goto L_0x01b3
        L_0x013a:
            int r6 = r5.getNetworkId()     // Catch:{ Exception -> 0x01b8 }
            if (r6 == r12) goto L_0x0142
            r6 = 1
            goto L_0x0143
        L_0x0142:
            r6 = 0
        L_0x0143:
            int r7 = r5.getSystemId()     // Catch:{ Exception -> 0x01b8 }
            if (r7 == r12) goto L_0x014b
            int r6 = r6 + 1
        L_0x014b:
            int r7 = r5.getBasestationId()     // Catch:{ Exception -> 0x01b8 }
            if (r7 == r12) goto L_0x0153
            int r6 = r6 + 1
        L_0x0153:
            int r7 = r5.getLongitude()     // Catch:{ Exception -> 0x01b8 }
            if (r7 == r12) goto L_0x015b
            int r6 = r6 + 1
        L_0x015b:
            int r7 = r5.getLatitude()     // Catch:{ Exception -> 0x01b8 }
            if (r7 == r12) goto L_0x0163
            int r6 = r6 + 1
        L_0x0163:
            if (r6 < r4) goto L_0x01b3
            int r6 = r5.getBasestationId()     // Catch:{ Exception -> 0x01b8 }
            long r6 = (long) r6     // Catch:{ Exception -> 0x01b8 }
            r15.f10256a = r6     // Catch:{ Exception -> 0x01b8 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b8 }
            r6.<init>()     // Catch:{ Exception -> 0x01b8 }
            r6.append(r8)     // Catch:{ Exception -> 0x01b8 }
            int r7 = r5.getNetworkId()     // Catch:{ Exception -> 0x01b8 }
            r6.append(r7)     // Catch:{ Exception -> 0x01b8 }
            r6.append(r11)     // Catch:{ Exception -> 0x01b8 }
            int r7 = r5.getSystemId()     // Catch:{ Exception -> 0x01b8 }
            r6.append(r7)     // Catch:{ Exception -> 0x01b8 }
            int r7 = r5.getBasestationId()     // Catch:{ Exception -> 0x01b8 }
            r6.append(r7)     // Catch:{ Exception -> 0x01b8 }
            r6.append(r11)     // Catch:{ Exception -> 0x01b8 }
            int r7 = r5.getLatitude()     // Catch:{ Exception -> 0x01b8 }
            r6.append(r7)     // Catch:{ Exception -> 0x01b8 }
            r6.append(r11)     // Catch:{ Exception -> 0x01b8 }
            int r5 = r5.getLongitude()     // Catch:{ Exception -> 0x01b8 }
            r6.append(r5)     // Catch:{ Exception -> 0x01b8 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x01b8 }
            r15.f10258c = r5     // Catch:{ Exception -> 0x01b8 }
            android.telephony.CellSignalStrengthCdma r0 = r0.getCellSignalStrength()     // Catch:{ Exception -> 0x01b8 }
            int r0 = r0.getDbm()     // Catch:{ Exception -> 0x01b8 }
            r15.f10259d = r0     // Catch:{ Exception -> 0x01b8 }
            r2.add(r15)     // Catch:{ Exception -> 0x01b8 }
        L_0x01b3:
            r16 = r13
            r14 = 2
            goto L_0x0353
        L_0x01b8:
            r0 = move-exception
            r3 = 2
            goto L_0x04ef
        L_0x01bc:
            boolean r5 = r0 instanceof android.telephony.CellInfoLte     // Catch:{ Exception -> 0x04ea }
            if (r5 == 0) goto L_0x023b
            android.telephony.CellInfoLte r0 = (android.telephony.CellInfoLte) r0     // Catch:{ Exception -> 0x0237 }
            android.telephony.CellIdentityLte r5 = r0.getCellIdentity()     // Catch:{ Exception -> 0x0237 }
            if (r5 == 0) goto L_0x0232
            int r6 = r5.getMcc()     // Catch:{ Exception -> 0x0237 }
            if (r6 == r12) goto L_0x0232
            int r6 = r5.getMnc()     // Catch:{ Exception -> 0x0237 }
            if (r6 == r12) goto L_0x0232
            int r6 = r5.getCi()     // Catch:{ Exception -> 0x0237 }
            if (r6 == r12) goto L_0x0232
            int r6 = r5.getMcc()     // Catch:{ Exception -> 0x0237 }
            if (r6 == 0) goto L_0x0232
            int r6 = r5.getMcc()     // Catch:{ Exception -> 0x0237 }
            if (r6 == r10) goto L_0x0232
            int r6 = r5.getMnc()     // Catch:{ Exception -> 0x0237 }
            if (r6 == 0) goto L_0x0232
            int r6 = r5.getMnc()     // Catch:{ Exception -> 0x0237 }
            if (r6 == r10) goto L_0x0232
            int r6 = r5.getCi()     // Catch:{ Exception -> 0x0237 }
            if (r6 <= r9) goto L_0x0232
            int r6 = r5.getCi()     // Catch:{ Exception -> 0x0237 }
            long r6 = (long) r6     // Catch:{ Exception -> 0x0237 }
            r15.f10256a = r6     // Catch:{ Exception -> 0x0237 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0237 }
            r6.<init>()     // Catch:{ Exception -> 0x0237 }
            int r7 = r5.getMcc()     // Catch:{ Exception -> 0x0237 }
            r6.append(r7)     // Catch:{ Exception -> 0x0237 }
            r6.append(r11)     // Catch:{ Exception -> 0x0237 }
            int r7 = r5.getMnc()     // Catch:{ Exception -> 0x0237 }
            r6.append(r7)     // Catch:{ Exception -> 0x0237 }
            r6.append(r11)     // Catch:{ Exception -> 0x0237 }
            int r5 = r5.getCi()     // Catch:{ Exception -> 0x0237 }
            r6.append(r5)     // Catch:{ Exception -> 0x0237 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x0237 }
            r15.f10258c = r5     // Catch:{ Exception -> 0x0237 }
            android.telephony.CellSignalStrengthLte r0 = r0.getCellSignalStrength()     // Catch:{ Exception -> 0x0237 }
            int r0 = r0.getDbm()     // Catch:{ Exception -> 0x0237 }
            r15.f10259d = r0     // Catch:{ Exception -> 0x0237 }
            r2.add(r15)     // Catch:{ Exception -> 0x0237 }
        L_0x0232:
            r16 = r13
            r14 = 3
            goto L_0x0353
        L_0x0237:
            r0 = move-exception
            r3 = 3
            goto L_0x04ef
        L_0x023b:
            boolean r5 = r0 instanceof android.telephony.CellInfoWcdma     // Catch:{ Exception -> 0x04ea }
            if (r5 == 0) goto L_0x02b6
            android.telephony.CellInfoWcdma r0 = (android.telephony.CellInfoWcdma) r0     // Catch:{ Exception -> 0x04e8 }
            android.telephony.CellIdentityWcdma r5 = r0.getCellIdentity()     // Catch:{ Exception -> 0x04e8 }
            if (r5 == 0) goto L_0x02b1
            int r6 = r5.getMcc()     // Catch:{ Exception -> 0x04e8 }
            if (r6 == r12) goto L_0x02b1
            int r6 = r5.getMnc()     // Catch:{ Exception -> 0x04e8 }
            if (r6 == r12) goto L_0x02b1
            int r6 = r5.getCid()     // Catch:{ Exception -> 0x04e8 }
            if (r6 == r12) goto L_0x02b1
            int r6 = r5.getMcc()     // Catch:{ Exception -> 0x04e8 }
            if (r6 == 0) goto L_0x02b1
            int r6 = r5.getMcc()     // Catch:{ Exception -> 0x04e8 }
            if (r6 == r10) goto L_0x02b1
            int r6 = r5.getMnc()     // Catch:{ Exception -> 0x04e8 }
            if (r6 == 0) goto L_0x02b1
            int r6 = r5.getMnc()     // Catch:{ Exception -> 0x04e8 }
            if (r6 == r10) goto L_0x02b1
            int r6 = r5.getCid()     // Catch:{ Exception -> 0x04e8 }
            if (r6 <= r9) goto L_0x02b1
            int r6 = r5.getCid()     // Catch:{ Exception -> 0x04e8 }
            long r6 = (long) r6     // Catch:{ Exception -> 0x04e8 }
            r15.f10256a = r6     // Catch:{ Exception -> 0x04e8 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04e8 }
            r6.<init>()     // Catch:{ Exception -> 0x04e8 }
            int r7 = r5.getMcc()     // Catch:{ Exception -> 0x04e8 }
            r6.append(r7)     // Catch:{ Exception -> 0x04e8 }
            r6.append(r11)     // Catch:{ Exception -> 0x04e8 }
            int r7 = r5.getMnc()     // Catch:{ Exception -> 0x04e8 }
            r6.append(r7)     // Catch:{ Exception -> 0x04e8 }
            r6.append(r11)     // Catch:{ Exception -> 0x04e8 }
            int r5 = r5.getCid()     // Catch:{ Exception -> 0x04e8 }
            r6.append(r5)     // Catch:{ Exception -> 0x04e8 }
            java.lang.String r5 = r6.toString()     // Catch:{ Exception -> 0x04e8 }
            r15.f10258c = r5     // Catch:{ Exception -> 0x04e8 }
            android.telephony.CellSignalStrengthWcdma r0 = r0.getCellSignalStrength()     // Catch:{ Exception -> 0x04e8 }
            int r0 = r0.getDbm()     // Catch:{ Exception -> 0x04e8 }
            r15.f10259d = r0     // Catch:{ Exception -> 0x04e8 }
            r2.add(r15)     // Catch:{ Exception -> 0x04e8 }
        L_0x02b1:
            r16 = r13
            r14 = 4
            goto L_0x0353
        L_0x02b6:
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x04ea }
            r6 = 29
            if (r5 < r6) goto L_0x0325
            boolean r5 = r0 instanceof android.telephony.CellInfoNr     // Catch:{ Exception -> 0x04ea }
            if (r5 == 0) goto L_0x0325
            r14 = 5
            r5 = r0
            android.telephony.CellInfoNr r5 = (android.telephony.CellInfoNr) r5     // Catch:{ Exception -> 0x032f, Error -> 0x0328 }
            android.telephony.CellIdentity r0 = r0.getCellIdentity()     // Catch:{ Exception -> 0x032f, Error -> 0x0328 }
            android.telephony.CellIdentityNr r0 = (android.telephony.CellIdentityNr) r0     // Catch:{ Exception -> 0x032f, Error -> 0x0328 }
            if (r0 == 0) goto L_0x0325
            java.lang.String r6 = r0.getMccString()     // Catch:{ Exception -> 0x032f, Error -> 0x0328 }
            if (r6 == 0) goto L_0x0325
            java.lang.String r6 = r0.getMccString()     // Catch:{ Exception -> 0x032f, Error -> 0x0328 }
            if (r6 == 0) goto L_0x0325
            long r6 = r0.getNci()     // Catch:{ Exception -> 0x032f, Error -> 0x0328 }
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r18 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r18 == 0) goto L_0x0325
            long r6 = r0.getNci()     // Catch:{ Exception -> 0x032f, Error -> 0x0328 }
            r15.f10256a = r6     // Catch:{ Exception -> 0x032f, Error -> 0x0328 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x032f, Error -> 0x0328 }
            r6.<init>()     // Catch:{ Exception -> 0x032f, Error -> 0x0328 }
            java.lang.String r7 = r0.getMccString()     // Catch:{ Exception -> 0x032f, Error -> 0x0328 }
            r6.append(r7)     // Catch:{ Exception -> 0x032f, Error -> 0x0328 }
            r6.append(r11)     // Catch:{ Exception -> 0x032f, Error -> 0x0328 }
            java.lang.String r7 = r0.getMccString()     // Catch:{ Exception -> 0x032f, Error -> 0x0328 }
            r6.append(r7)     // Catch:{ Exception -> 0x032f, Error -> 0x0328 }
            r6.append(r11)     // Catch:{ Exception -> 0x032f, Error -> 0x0328 }
            r16 = r13
            long r12 = r0.getNci()     // Catch:{ Exception -> 0x0323, Error -> 0x0321 }
            r6.append(r12)     // Catch:{ Exception -> 0x0323, Error -> 0x0321 }
            java.lang.String r0 = r6.toString()     // Catch:{ Exception -> 0x0323, Error -> 0x0321 }
            r15.f10258c = r0     // Catch:{ Exception -> 0x0323, Error -> 0x0321 }
            android.telephony.CellSignalStrength r0 = r5.getCellSignalStrength()     // Catch:{ Exception -> 0x0323, Error -> 0x0321 }
            int r0 = r0.getDbm()     // Catch:{ Exception -> 0x0323, Error -> 0x0321 }
            r15.f10259d = r0     // Catch:{ Exception -> 0x0323, Error -> 0x0321 }
            r2.add(r15)     // Catch:{ Exception -> 0x0323, Error -> 0x0321 }
            goto L_0x0353
        L_0x0321:
            r0 = move-exception
            goto L_0x032b
        L_0x0323:
            r0 = move-exception
            goto L_0x0332
        L_0x0325:
            r16 = r13
            goto L_0x0353
        L_0x0328:
            r0 = move-exception
            r16 = r13
        L_0x032b:
            p148q0.C8151a.m33873n(r0)     // Catch:{ Exception -> 0x034f }
            goto L_0x0353
        L_0x032f:
            r0 = move-exception
            r16 = r13
        L_0x0332:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x034f }
            r5.<init>(r0)     // Catch:{ Exception -> 0x034f }
            p148q0.C8151a.m33873n(r5)     // Catch:{ Exception -> 0x034f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x034f }
            r5.<init>()     // Catch:{ Exception -> 0x034f }
            java.lang.String r6 = "Failed to add 5G tower: "
            r5.append(r6)     // Catch:{ Exception -> 0x034f }
            r5.append(r0)     // Catch:{ Exception -> 0x034f }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x034f }
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)     // Catch:{ Exception -> 0x034f }
            goto L_0x0353
        L_0x034f:
            r0 = move-exception
            r3 = 5
            goto L_0x04ef
        L_0x0353:
            r13 = r16
            r6 = 0
            r12 = 2147483647(0x7fffffff, float:NaN)
            goto L_0x004e
        L_0x035b:
            r14 = 0
        L_0x035c:
            android.telephony.CellLocation r0 = r1.getCellLocation()     // Catch:{ Exception -> 0x04ea }
            if (r0 == 0) goto L_0x051e
            boolean r5 = r0 instanceof android.telephony.gsm.GsmCellLocation     // Catch:{ Exception -> 0x04ea }
            r6 = 100
            if (r5 == 0) goto L_0x03d6
            r4 = 7
            java.lang.String r1 = r1.getNetworkOperator()     // Catch:{ Exception -> 0x03d2 }
            if (r1 == 0) goto L_0x0388
            int r5 = r1.length()     // Catch:{ NumberFormatException -> 0x051e }
            if (r5 < r3) goto L_0x0388
            r3 = 3
            r5 = 0
            java.lang.String r8 = r1.substring(r5, r3)     // Catch:{ NumberFormatException -> 0x051e }
            int r5 = java.lang.Integer.parseInt(r8)     // Catch:{ NumberFormatException -> 0x051e }
            java.lang.String r1 = r1.substring(r3)     // Catch:{ NumberFormatException -> 0x051e }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x051e }
            goto L_0x038a
        L_0x0388:
            r1 = 0
            r5 = 0
        L_0x038a:
            android.telephony.gsm.GsmCellLocation r0 = (android.telephony.gsm.GsmCellLocation) r0     // Catch:{ NumberFormatException -> 0x051e }
            int r0 = r0.getCid()     // Catch:{ NumberFormatException -> 0x051e }
            if (r5 == r10) goto L_0x051e
            if (r5 == 0) goto L_0x051e
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r3) goto L_0x051e
            if (r1 == r10) goto L_0x051e
            if (r1 == 0) goto L_0x051e
            if (r1 == r3) goto L_0x051e
            if (r0 <= r9) goto L_0x051e
            if (r0 == r3) goto L_0x051e
            com.arlosoft.macrodroid.celltowers.v$a r3 = new com.arlosoft.macrodroid.celltowers.v$a     // Catch:{ NumberFormatException -> 0x051e }
            r3.<init>()     // Catch:{ NumberFormatException -> 0x051e }
            long r7 = (long) r0     // Catch:{ NumberFormatException -> 0x051e }
            r3.f10256a = r7     // Catch:{ NumberFormatException -> 0x051e }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x051e }
            r7.<init>()     // Catch:{ NumberFormatException -> 0x051e }
            r7.append(r5)     // Catch:{ NumberFormatException -> 0x051e }
            r7.append(r11)     // Catch:{ NumberFormatException -> 0x051e }
            r7.append(r1)     // Catch:{ NumberFormatException -> 0x051e }
            r7.append(r11)     // Catch:{ NumberFormatException -> 0x051e }
            r7.append(r0)     // Catch:{ NumberFormatException -> 0x051e }
            java.lang.String r0 = r7.toString()     // Catch:{ NumberFormatException -> 0x051e }
            r3.f10258c = r0     // Catch:{ NumberFormatException -> 0x051e }
            r3.f10259d = r6     // Catch:{ NumberFormatException -> 0x051e }
            boolean r0 = r2.contains(r3)     // Catch:{ NumberFormatException -> 0x051e }
            if (r0 != 0) goto L_0x051e
            r2.add(r3)     // Catch:{ NumberFormatException -> 0x051e }
            goto L_0x051e
        L_0x03d2:
            r0 = move-exception
            r3 = 7
            goto L_0x04ef
        L_0x03d6:
            boolean r1 = r0 instanceof android.telephony.cdma.CdmaCellLocation     // Catch:{ Exception -> 0x04ea }
            if (r1 == 0) goto L_0x051e
            r3 = 8
            com.arlosoft.macrodroid.celltowers.v$a r1 = new com.arlosoft.macrodroid.celltowers.v$a     // Catch:{ Exception -> 0x04e8 }
            r1.<init>()     // Catch:{ Exception -> 0x04e8 }
            android.telephony.cdma.CdmaCellLocation r0 = (android.telephony.cdma.CdmaCellLocation) r0     // Catch:{ Exception -> 0x04e8 }
            int r5 = r0.getNetworkId()     // Catch:{ Exception -> 0x04e8 }
            if (r5 != 0) goto L_0x03f7
            int r5 = r0.getSystemId()     // Catch:{ Exception -> 0x04e8 }
            if (r5 != 0) goto L_0x03f7
            int r5 = r0.getBaseStationId()     // Catch:{ Exception -> 0x04e8 }
            if (r5 != 0) goto L_0x03f7
            goto L_0x051e
        L_0x03f7:
            int r5 = r0.getNetworkId()     // Catch:{ Exception -> 0x04e8 }
            if (r5 == r10) goto L_0x0443
            int r5 = r0.getSystemId()     // Catch:{ Exception -> 0x04e8 }
            if (r5 == r10) goto L_0x0443
            int r5 = r0.getBaseStationId()     // Catch:{ Exception -> 0x04e8 }
            if (r5 == r10) goto L_0x0443
            int r4 = r0.getBaseStationId()     // Catch:{ Exception -> 0x04e8 }
            long r4 = (long) r4     // Catch:{ Exception -> 0x04e8 }
            r1.f10256a = r4     // Catch:{ Exception -> 0x04e8 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04e8 }
            r4.<init>()     // Catch:{ Exception -> 0x04e8 }
            r4.append(r8)     // Catch:{ Exception -> 0x04e8 }
            int r5 = r0.getNetworkId()     // Catch:{ Exception -> 0x04e8 }
            r4.append(r5)     // Catch:{ Exception -> 0x04e8 }
            r4.append(r11)     // Catch:{ Exception -> 0x04e8 }
            int r5 = r0.getSystemId()     // Catch:{ Exception -> 0x04e8 }
            r4.append(r5)     // Catch:{ Exception -> 0x04e8 }
            int r0 = r0.getBaseStationId()     // Catch:{ Exception -> 0x04e8 }
            r4.append(r0)     // Catch:{ Exception -> 0x04e8 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x04e8 }
            r1.f10258c = r0     // Catch:{ Exception -> 0x04e8 }
            r1.f10259d = r6     // Catch:{ Exception -> 0x04e8 }
            boolean r0 = r2.contains(r1)     // Catch:{ Exception -> 0x04e8 }
            if (r0 != 0) goto L_0x051e
            r2.add(r1)     // Catch:{ Exception -> 0x04e8 }
            goto L_0x051e
        L_0x0443:
            int r5 = r0.getNetworkId()     // Catch:{ Exception -> 0x04e8 }
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r5 == r7) goto L_0x0454
            int r5 = r0.getNetworkId()     // Catch:{ Exception -> 0x04e8 }
            if (r5 == 0) goto L_0x0454
            r5 = 1
            goto L_0x0455
        L_0x0454:
            r5 = 0
        L_0x0455:
            int r9 = r0.getSystemId()     // Catch:{ Exception -> 0x04e8 }
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r7) goto L_0x0466
            int r9 = r0.getSystemId()     // Catch:{ Exception -> 0x04e8 }
            if (r9 == 0) goto L_0x0466
            int r5 = r5 + 1
        L_0x0466:
            int r9 = r0.getBaseStationId()     // Catch:{ Exception -> 0x04e8 }
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r7) goto L_0x0477
            int r9 = r0.getBaseStationId()     // Catch:{ Exception -> 0x04e8 }
            if (r9 == 0) goto L_0x0477
            int r5 = r5 + 1
        L_0x0477:
            int r9 = r0.getBaseStationLongitude()     // Catch:{ Exception -> 0x04e8 }
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r7) goto L_0x0488
            int r9 = r0.getBaseStationLongitude()     // Catch:{ Exception -> 0x04e8 }
            if (r9 == 0) goto L_0x0488
            int r5 = r5 + 1
        L_0x0488:
            int r9 = r0.getBaseStationLatitude()     // Catch:{ Exception -> 0x04e8 }
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r9 == r7) goto L_0x0499
            int r7 = r0.getBaseStationLatitude()     // Catch:{ Exception -> 0x04e8 }
            if (r7 == 0) goto L_0x0499
            int r5 = r5 + 1
        L_0x0499:
            if (r5 < r4) goto L_0x051e
            int r4 = r0.getBaseStationId()     // Catch:{ Exception -> 0x04e8 }
            long r4 = (long) r4     // Catch:{ Exception -> 0x04e8 }
            r1.f10256a = r4     // Catch:{ Exception -> 0x04e8 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x04e8 }
            r4.<init>()     // Catch:{ Exception -> 0x04e8 }
            r4.append(r8)     // Catch:{ Exception -> 0x04e8 }
            int r5 = r0.getNetworkId()     // Catch:{ Exception -> 0x04e8 }
            r4.append(r5)     // Catch:{ Exception -> 0x04e8 }
            r4.append(r11)     // Catch:{ Exception -> 0x04e8 }
            int r5 = r0.getSystemId()     // Catch:{ Exception -> 0x04e8 }
            r4.append(r5)     // Catch:{ Exception -> 0x04e8 }
            int r5 = r0.getBaseStationId()     // Catch:{ Exception -> 0x04e8 }
            r4.append(r5)     // Catch:{ Exception -> 0x04e8 }
            r4.append(r11)     // Catch:{ Exception -> 0x04e8 }
            int r5 = r0.getBaseStationLongitude()     // Catch:{ Exception -> 0x04e8 }
            r4.append(r5)     // Catch:{ Exception -> 0x04e8 }
            r4.append(r11)     // Catch:{ Exception -> 0x04e8 }
            int r0 = r0.getBaseStationLatitude()     // Catch:{ Exception -> 0x04e8 }
            r4.append(r0)     // Catch:{ Exception -> 0x04e8 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x04e8 }
            r1.f10258c = r0     // Catch:{ Exception -> 0x04e8 }
            r1.f10259d = r6     // Catch:{ Exception -> 0x04e8 }
            boolean r0 = r2.contains(r1)     // Catch:{ Exception -> 0x04e8 }
            if (r0 != 0) goto L_0x051e
            r2.add(r1)     // Catch:{ Exception -> 0x04e8 }
            goto L_0x051e
        L_0x04e8:
            r0 = move-exception
            goto L_0x04ef
        L_0x04ea:
            r0 = move-exception
            r3 = r14
            goto L_0x04ef
        L_0x04ed:
            r0 = move-exception
            r3 = 0
        L_0x04ef:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "Failed to scan cell towers - issue stage ("
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = "): "
            r1.append(r3)
            java.lang.String r3 = r0.toString()
            r1.append(r3)
            java.lang.String r3 = "\n"
            r1.append(r3)
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            r3 = 0
            r0 = r0[r3]
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.arlosoft.macrodroid.logging.systemlog.C4878b.m18868g(r0)
        L_0x051e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.arlosoft.macrodroid.celltowers.C3943v.m15317a(android.content.Context):java.util.List");
    }

    /* renamed from: b */
    public static String m15318b(Context context) throws SecurityException {
        List<CellInfo> allCellInfo = ((TelephonyManager) context.getSystemService("phone")).getAllCellInfo();
        String str = null;
        if (allCellInfo != null) {
            for (int i = 0; i < allCellInfo.size(); i++) {
                if (allCellInfo.get(i).isRegistered()) {
                    if (allCellInfo.get(i) instanceof CellInfoWcdma) {
                        str = String.valueOf(((CellInfoWcdma) allCellInfo.get(i)).getCellSignalStrength().getDbm());
                    } else if (allCellInfo.get(i) instanceof CellInfoGsm) {
                        str = String.valueOf(((CellInfoGsm) allCellInfo.get(i)).getCellSignalStrength().getDbm());
                    } else if (allCellInfo.get(i) instanceof CellInfoLte) {
                        str = String.valueOf(((CellInfoLte) allCellInfo.get(i)).getCellSignalStrength().getDbm());
                    } else if (allCellInfo.get(i) instanceof CellInfoCdma) {
                        str = String.valueOf(((CellInfoCdma) allCellInfo.get(i)).getCellSignalStrength().getDbm());
                    }
                }
            }
        }
        return str;
    }
}
