package com.google.android.gms.internal.consent_sdk;

import androidx.annotation.Nullable;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
public final class zzbw {
    @Nullable

    /* renamed from: a */
    public String f39396a;
    @Nullable

    /* renamed from: b */
    public String f39397b;
    @Nullable

    /* renamed from: c */
    public String f39398c;

    /* renamed from: d */
    public List<String> f39399d = Collections.emptyList();

    /* renamed from: e */
    public List<zzbv> f39400e = Collections.emptyList();

    /* renamed from: f */
    public int f39401f = 1;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01ae, code lost:
        if (r1.equals("CONSENT_SIGNAL_UNKNOWN") != false) goto L_0x01c6;
     */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00fc  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x011d  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.consent_sdk.zzbw m55960a(android.util.JsonReader r12) throws java.io.IOException {
        /*
            com.google.android.gms.internal.consent_sdk.zzbw r0 = new com.google.android.gms.internal.consent_sdk.zzbw
            r0.<init>()
            r12.beginObject()
        L_0x0008:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x01f4
            java.lang.String r1 = r12.nextName()
            int r2 = r1.hashCode()
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = -1
            r7 = 3
            r8 = 2
            r9 = 1
            switch(r2) {
                case -2001388947: goto L_0x0053;
                case -1938755376: goto L_0x0049;
                case -1851537225: goto L_0x003f;
                case -1161803523: goto L_0x0035;
                case -986806987: goto L_0x002b;
                case -790907624: goto L_0x0021;
                default: goto L_0x0020;
            }
        L_0x0020:
            goto L_0x005d
        L_0x0021:
            java.lang.String r2 = "consent_form_payload"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005d
            r1 = 1
            goto L_0x005e
        L_0x002b:
            java.lang.String r2 = "request_info_keys"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005d
            r1 = 4
            goto L_0x005e
        L_0x0035:
            java.lang.String r2 = "actions"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005d
            r1 = 5
            goto L_0x005e
        L_0x003f:
            java.lang.String r2 = "consent_form_base_url"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005d
            r1 = 2
            goto L_0x005e
        L_0x0049:
            java.lang.String r2 = "error_message"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005d
            r1 = 3
            goto L_0x005e
        L_0x0053:
            java.lang.String r2 = "consent_signal"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x005d
            r1 = 0
            goto L_0x005e
        L_0x005d:
            r1 = -1
        L_0x005e:
            if (r1 == 0) goto L_0x0168
            if (r1 == r9) goto L_0x0160
            if (r1 == r8) goto L_0x0158
            if (r1 == r7) goto L_0x0150
            if (r1 == r5) goto L_0x0131
            if (r1 == r4) goto L_0x006e
            r12.skipValue()
            goto L_0x0008
        L_0x006e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f39400e = r1
            r12.beginArray()
        L_0x0078:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x012c
            com.google.android.gms.internal.consent_sdk.zzbv r1 = new com.google.android.gms.internal.consent_sdk.zzbv
            r1.<init>()
            r12.beginObject()
        L_0x0086:
            boolean r2 = r12.hasNext()
            if (r2 == 0) goto L_0x0122
            java.lang.String r2 = r12.nextName()
            int r4 = r2.hashCode()
            r5 = -2105551094(0xffffffff827fd70a, float:-1.8796154E-37)
            if (r4 == r5) goto L_0x00a9
            r5 = 1583758243(0x5e663ba3, float:4.14750822E18)
            if (r4 == r5) goto L_0x009f
            goto L_0x00b3
        L_0x009f:
            java.lang.String r4 = "action_type"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00b3
            r2 = 0
            goto L_0x00b4
        L_0x00a9:
            java.lang.String r4 = "args_json"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x00b3
            r2 = 1
            goto L_0x00b4
        L_0x00b3:
            r2 = -1
        L_0x00b4:
            if (r2 == 0) goto L_0x00c3
            if (r2 == r9) goto L_0x00bc
            r12.skipValue()
            goto L_0x0086
        L_0x00bc:
            java.lang.String r2 = r12.nextString()
            r1.f39394a = r2
            goto L_0x0086
        L_0x00c3:
            java.lang.String r2 = r12.nextString()
            int r4 = r2.hashCode()
            r5 = 64208429(0x3d3be2d, float:1.2445128E-36)
            if (r4 == r5) goto L_0x00ef
            r5 = 82862015(0x4f05fbf, float:5.6511658E-36)
            if (r4 == r5) goto L_0x00e5
            r5 = 1856333582(0x6ea5670e, float:2.5594806E28)
            if (r4 == r5) goto L_0x00db
            goto L_0x00f9
        L_0x00db:
            java.lang.String r4 = "UNKNOWN_ACTION_TYPE"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x00f9
            r4 = 0
            goto L_0x00fa
        L_0x00e5:
            java.lang.String r4 = "WRITE"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x00f9
            r4 = 1
            goto L_0x00fa
        L_0x00ef:
            java.lang.String r4 = "CLEAR"
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L_0x00f9
            r4 = 2
            goto L_0x00fa
        L_0x00f9:
            r4 = -1
        L_0x00fa:
            if (r4 == 0) goto L_0x011d
            if (r4 == r9) goto L_0x011b
            if (r4 == r8) goto L_0x0119
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.Action.ActionTypefrom: "
            int r1 = r2.length()
            if (r1 == 0) goto L_0x010f
            java.lang.String r0 = r0.concat(r2)
            goto L_0x0115
        L_0x010f:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x0115:
            r12.<init>(r0)
            throw r12
        L_0x0119:
            r2 = 3
            goto L_0x011e
        L_0x011b:
            r2 = 2
            goto L_0x011e
        L_0x011d:
            r2 = 1
        L_0x011e:
            r1.f39395b = r2
            goto L_0x0086
        L_0x0122:
            r12.endObject()
            java.util.List<com.google.android.gms.internal.consent_sdk.zzbv> r2 = r0.f39400e
            r2.add(r1)
            goto L_0x0078
        L_0x012c:
            r12.endArray()
            goto L_0x0008
        L_0x0131:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f39399d = r1
            r12.beginArray()
        L_0x013b:
            boolean r1 = r12.hasNext()
            if (r1 == 0) goto L_0x014b
            java.lang.String r1 = r12.nextString()
            java.util.List<java.lang.String> r2 = r0.f39399d
            r2.add(r1)
            goto L_0x013b
        L_0x014b:
            r12.endArray()
            goto L_0x0008
        L_0x0150:
            java.lang.String r1 = r12.nextString()
            r0.f39398c = r1
            goto L_0x0008
        L_0x0158:
            java.lang.String r1 = r12.nextString()
            r0.f39397b = r1
            goto L_0x0008
        L_0x0160:
            java.lang.String r1 = r12.nextString()
            r0.f39396a = r1
            goto L_0x0008
        L_0x0168:
            java.lang.String r1 = r12.nextString()
            int r2 = r1.hashCode()
            r10 = 7
            r11 = 6
            switch(r2) {
                case -2058725357: goto L_0x01bb;
                case -1969035850: goto L_0x01b1;
                case -1263695752: goto L_0x01a8;
                case -954325659: goto L_0x019e;
                case -918677260: goto L_0x0194;
                case 429411856: goto L_0x018a;
                case 467888915: goto L_0x0180;
                case 1725474845: goto L_0x0176;
                default: goto L_0x0175;
            }
        L_0x0175:
            goto L_0x01c5
        L_0x0176:
            java.lang.String r2 = "CONSENT_SIGNAL_NOT_REQUIRED"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x01c5
            r3 = 5
            goto L_0x01c6
        L_0x0180:
            java.lang.String r2 = "CONSENT_SIGNAL_PERSONALIZED_ADS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x01c5
            r3 = 1
            goto L_0x01c6
        L_0x018a:
            java.lang.String r2 = "CONSENT_SIGNAL_SUFFICIENT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x01c5
            r3 = 3
            goto L_0x01c6
        L_0x0194:
            java.lang.String r2 = "CONSENT_SIGNAL_PUBLISHER_MISCONFIGURATION"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x01c5
            r3 = 7
            goto L_0x01c6
        L_0x019e:
            java.lang.String r2 = "CONSENT_SIGNAL_NON_PERSONALIZED_ADS"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x01c5
            r3 = 2
            goto L_0x01c6
        L_0x01a8:
            java.lang.String r2 = "CONSENT_SIGNAL_UNKNOWN"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x01c5
            goto L_0x01c6
        L_0x01b1:
            java.lang.String r2 = "CONSENT_SIGNAL_ERROR"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x01c5
            r3 = 6
            goto L_0x01c6
        L_0x01bb:
            java.lang.String r2 = "CONSENT_SIGNAL_COLLECT_CONSENT"
            boolean r2 = r1.equals(r2)
            if (r2 == 0) goto L_0x01c5
            r3 = 4
            goto L_0x01c6
        L_0x01c5:
            r3 = -1
        L_0x01c6:
            switch(r3) {
                case 0: goto L_0x01e5;
                case 1: goto L_0x01e3;
                case 2: goto L_0x01e1;
                case 3: goto L_0x01df;
                case 4: goto L_0x01e6;
                case 5: goto L_0x01dd;
                case 6: goto L_0x01db;
                case 7: goto L_0x01d8;
                default: goto L_0x01c9;
            }
        L_0x01c9:
            java.io.IOException r12 = new java.io.IOException
            java.lang.String r0 = "Failed to parse contentads.contributor.direct.serving.gdpr.appapi.ApplicationGdprResponse.ConsentSignalfrom: "
            int r2 = r1.length()
            if (r2 == 0) goto L_0x01ea
            java.lang.String r0 = r0.concat(r1)
            goto L_0x01f0
        L_0x01d8:
            r4 = 8
            goto L_0x01e6
        L_0x01db:
            r4 = 7
            goto L_0x01e6
        L_0x01dd:
            r4 = 6
            goto L_0x01e6
        L_0x01df:
            r4 = 4
            goto L_0x01e6
        L_0x01e1:
            r4 = 3
            goto L_0x01e6
        L_0x01e3:
            r4 = 2
            goto L_0x01e6
        L_0x01e5:
            r4 = 1
        L_0x01e6:
            r0.f39401f = r4
            goto L_0x0008
        L_0x01ea:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r0)
            r0 = r1
        L_0x01f0:
            r12.<init>(r0)
            throw r12
        L_0x01f4:
            r12.endObject()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzbw.m55960a(android.util.JsonReader):com.google.android.gms.internal.consent_sdk.zzbw");
    }
}
