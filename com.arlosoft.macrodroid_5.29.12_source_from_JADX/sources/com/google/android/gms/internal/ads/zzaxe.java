package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzaxe {

    /* renamed from: a */
    private static final zzaws f26161a = zzaws.m42679b("OMX.google.raw.decoder");

    /* renamed from: b */
    private static final Pattern f26162b = Pattern.compile("^\\D?(\\d+)$");

    /* renamed from: c */
    private static final HashMap f26163c = new HashMap();

    /* renamed from: d */
    private static final SparseIntArray f26164d;

    /* renamed from: e */
    private static final SparseIntArray f26165e;

    /* renamed from: f */
    private static final Map f26166f;

    /* renamed from: g */
    private static int f26167g = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f26164d = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        f26165e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        f26166f = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    /* renamed from: a */
    public static int m42722a() throws zzawz {
        int i = f26167g;
        if (i == -1) {
            zzaws c = m42724c("video/avc", false);
            if (c != null) {
                int i2 = 0;
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : c.mo42152g()) {
                    int i3 = codecProfileLevel.level;
                    int i4 = 9437184;
                    if (i3 != 1 && i3 != 2) {
                        switch (i3) {
                            case 8:
                            case 16:
                            case 32:
                                i4 = 101376;
                                break;
                            case 64:
                                i4 = 202752;
                                break;
                            case 128:
                            case 256:
                                i4 = 414720;
                                break;
                            case 512:
                                i4 = 921600;
                                break;
                            case 1024:
                                i4 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i4 = 2097152;
                                break;
                            case 8192:
                                i4 = 2228224;
                                break;
                            case 16384:
                                i4 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i4 = -1;
                                break;
                        }
                    } else {
                        i4 = 25344;
                    }
                    i2 = Math.max(i4, i2);
                }
                i = Math.max(i2, zzbar.f26418a >= 21 ? 345600 : 172800);
            } else {
                i = 0;
            }
            f26167g = i;
        }
        return i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.Pair m42723b(java.lang.String r12) {
        /*
            java.lang.String r0 = "\\."
            java.lang.String[] r0 = r12.split(r0)
            r1 = 0
            r2 = r0[r1]
            int r3 = r2.hashCode()
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r3) {
                case 3006243: goto L_0x0032;
                case 3006244: goto L_0x0028;
                case 3199032: goto L_0x001e;
                case 3214780: goto L_0x0014;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x003c
        L_0x0014:
            java.lang.String r3 = "hvc1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003c
            r2 = 1
            goto L_0x003d
        L_0x001e:
            java.lang.String r3 = "hev1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003c
            r2 = 0
            goto L_0x003d
        L_0x0028:
            java.lang.String r3 = "avc2"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003c
            r2 = 3
            goto L_0x003d
        L_0x0032:
            java.lang.String r3 = "avc1"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x003c
            r2 = 2
            goto L_0x003d
        L_0x003c:
            r2 = -1
        L_0x003d:
            r3 = 4
            java.lang.String r7 = "MediaCodecUtil"
            r8 = 0
            if (r2 == 0) goto L_0x00d3
            if (r2 == r6) goto L_0x00d3
            if (r2 == r5) goto L_0x004a
            if (r2 == r4) goto L_0x004a
            return r8
        L_0x004a:
            int r2 = r0.length
            java.lang.String r9 = "Ignoring malformed AVC codec string: "
            if (r2 >= r5) goto L_0x0058
            java.lang.String r12 = r9.concat(r12)
            android.util.Log.w(r7, r12)
            goto L_0x00d2
        L_0x0058:
            r10 = r0[r6]     // Catch:{ NumberFormatException -> 0x00cb }
            int r10 = r10.length()     // Catch:{ NumberFormatException -> 0x00cb }
            r11 = 6
            if (r10 != r11) goto L_0x0080
            r2 = r0[r6]     // Catch:{ NumberFormatException -> 0x00cb }
            java.lang.String r1 = r2.substring(r1, r5)     // Catch:{ NumberFormatException -> 0x00cb }
            r2 = 16
            int r1 = java.lang.Integer.parseInt(r1, r2)     // Catch:{ NumberFormatException -> 0x00cb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x00cb }
            r0 = r0[r6]     // Catch:{ NumberFormatException -> 0x00cb }
            java.lang.String r0 = r0.substring(r3)     // Catch:{ NumberFormatException -> 0x00cb }
            int r0 = java.lang.Integer.parseInt(r0, r2)     // Catch:{ NumberFormatException -> 0x00cb }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00cb }
            goto L_0x0096
        L_0x0080:
            if (r2 < r4) goto L_0x00b8
            r1 = r0[r6]     // Catch:{ NumberFormatException -> 0x00cb }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ NumberFormatException -> 0x00cb }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ NumberFormatException -> 0x00cb }
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x00cb }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x00cb }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ NumberFormatException -> 0x00cb }
        L_0x0096:
            android.util.SparseIntArray r0 = f26164d
            int r1 = r1.intValue()
            int r0 = r0.get(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.SparseIntArray r1 = f26165e
            int r12 = r12.intValue()
            int r12 = r1.get(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            android.util.Pair r8 = new android.util.Pair
            r8.<init>(r0, r12)
            goto L_0x00d2
        L_0x00b8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x00cb }
            r0.<init>()     // Catch:{ NumberFormatException -> 0x00cb }
            r0.append(r9)     // Catch:{ NumberFormatException -> 0x00cb }
            r0.append(r12)     // Catch:{ NumberFormatException -> 0x00cb }
            java.lang.String r0 = r0.toString()     // Catch:{ NumberFormatException -> 0x00cb }
            android.util.Log.w(r7, r0)     // Catch:{ NumberFormatException -> 0x00cb }
            goto L_0x00d2
        L_0x00cb:
            java.lang.String r12 = r9.concat(r12)
            android.util.Log.w(r7, r12)
        L_0x00d2:
            return r8
        L_0x00d3:
            int r1 = r0.length
            java.lang.String r2 = "Ignoring malformed HEVC codec string: "
            if (r1 >= r3) goto L_0x00e0
            java.lang.String r12 = r2.concat(r12)
            android.util.Log.w(r7, r12)
            goto L_0x0141
        L_0x00e0:
            java.util.regex.Pattern r1 = f26162b
            r3 = r0[r6]
            java.util.regex.Matcher r1 = r1.matcher(r3)
            boolean r3 = r1.matches()
            if (r3 != 0) goto L_0x00f6
            java.lang.String r12 = r2.concat(r12)
            android.util.Log.w(r7, r12)
            goto L_0x0141
        L_0x00f6:
            java.lang.String r12 = r1.group(r6)
            java.lang.String r2 = "1"
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L_0x0104
            r5 = 1
            goto L_0x010c
        L_0x0104:
            java.lang.String r2 = "2"
            boolean r2 = r2.equals(r12)
            if (r2 == 0) goto L_0x0134
        L_0x010c:
            java.util.Map r12 = f26166f
            r0 = r0[r4]
            java.lang.Object r12 = r12.get(r0)
            java.lang.Integer r12 = (java.lang.Integer) r12
            if (r12 != 0) goto L_0x012a
            java.lang.String r12 = r1.group(r6)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "Unknown HEVC level string: "
            java.lang.String r12 = r0.concat(r12)
            android.util.Log.w(r7, r12)
            goto L_0x0141
        L_0x012a:
            android.util.Pair r8 = new android.util.Pair
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r8.<init>(r0, r12)
            goto L_0x0141
        L_0x0134:
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "Unknown HEVC profile string: "
            java.lang.String r12 = r0.concat(r12)
            android.util.Log.w(r7, r12)
        L_0x0141:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxe.m42723b(java.lang.String):android.util.Pair");
    }

    /* renamed from: c */
    public static zzaws m42724c(String str, boolean z) throws zzawz {
        List d = m42725d(str, z);
        if (d.isEmpty()) {
            return null;
        }
        return (zzaws) d.get(0);
    }

    /* renamed from: d */
    public static synchronized List m42725d(String str, boolean z) throws zzawz {
        zzaxa zzaxa;
        synchronized (zzaxe.class) {
            zzawx zzawx = new zzawx(str, z);
            HashMap hashMap = f26163c;
            List list = (List) hashMap.get(zzawx);
            if (list != null) {
                return list;
            }
            int i = zzbar.f26418a;
            if (i >= 21) {
                zzaxa = new zzaxd(z);
            } else {
                zzaxa = new zzaxc((zzaxb) null);
            }
            List e = m42726e(zzawx, zzaxa);
            if (z && e.isEmpty() && i >= 21 && i <= 23) {
                e = m42726e(zzawx, new zzaxc((zzaxb) null));
                if (!e.isEmpty()) {
                    String str2 = ((zzaws) e.get(0)).f26116a;
                    Log.w("MediaCodecUtil", "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + str2);
                }
            }
            List unmodifiableList = Collections.unmodifiableList(e);
            hashMap.put(zzawx, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:119:0x01be A[Catch:{ Exception -> 0x01b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x0201 A[SYNTHETIC, Splitter:B:142:0x0201] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0221 A[SYNTHETIC] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.List m42726e(com.google.android.gms.internal.ads.zzawx r18, com.google.android.gms.internal.ads.zzaxa r19) throws com.google.android.gms.internal.ads.zzawz {
        /*
            r1 = r18
            r2 = r19
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x025e }
            r3.<init>()     // Catch:{ Exception -> 0x025e }
            java.lang.String r4 = r1.f26157a     // Catch:{ Exception -> 0x025e }
            int r5 = r19.zza()     // Catch:{ Exception -> 0x025e }
            boolean r6 = r19.mo42164d()     // Catch:{ Exception -> 0x025e }
            r8 = 0
        L_0x0014:
            if (r8 >= r5) goto L_0x025d
            android.media.MediaCodecInfo r9 = r2.mo42162B(r8)     // Catch:{ Exception -> 0x025e }
            java.lang.String r10 = r9.getName()     // Catch:{ Exception -> 0x025e }
            boolean r0 = r9.isEncoder()     // Catch:{ Exception -> 0x025e }
            if (r0 != 0) goto L_0x0252
            java.lang.String r11 = ".secure"
            if (r6 != 0) goto L_0x0030
            boolean r0 = r10.endsWith(r11)     // Catch:{ Exception -> 0x025e }
            if (r0 == 0) goto L_0x0030
            goto L_0x0252
        L_0x0030:
            int r0 = com.google.android.gms.internal.ads.zzbar.f26418a     // Catch:{ Exception -> 0x025e }
            r12 = 21
            if (r0 >= r12) goto L_0x0066
            java.lang.String r12 = "CIPAACDecoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x025e }
            if (r12 != 0) goto L_0x0252
            java.lang.String r12 = "CIPMP3Decoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x025e }
            if (r12 != 0) goto L_0x0252
            java.lang.String r12 = "CIPVorbisDecoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x025e }
            if (r12 != 0) goto L_0x0252
            java.lang.String r12 = "CIPAMRNBDecoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x025e }
            if (r12 != 0) goto L_0x0252
            java.lang.String r12 = "AACDecoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x025e }
            if (r12 != 0) goto L_0x0252
            java.lang.String r12 = "MP3Decoder"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x025e }
            if (r12 != 0) goto L_0x0252
        L_0x0066:
            r12 = 18
            if (r0 >= r12) goto L_0x0072
            java.lang.String r13 = "OMX.SEC.MP3.Decoder"
            boolean r13 = r13.equals(r10)     // Catch:{ Exception -> 0x025e }
            if (r13 != 0) goto L_0x0252
        L_0x0072:
            if (r0 >= r12) goto L_0x0086
            java.lang.String r12 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x025e }
            if (r12 == 0) goto L_0x0086
            java.lang.String r12 = "a70"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzbar.f26419b     // Catch:{ Exception -> 0x025e }
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x025e }
            if (r12 != 0) goto L_0x0252
        L_0x0086:
            r12 = 16
            if (r0 != r12) goto L_0x00f4
            java.lang.String r13 = "OMX.qcom.audio.decoder.mp3"
            boolean r13 = r13.equals(r10)     // Catch:{ Exception -> 0x025e }
            if (r13 == 0) goto L_0x00f4
            java.lang.String r13 = "dlxu"
            java.lang.String r14 = com.google.android.gms.internal.ads.zzbar.f26419b     // Catch:{ Exception -> 0x025e }
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x025e }
            if (r13 != 0) goto L_0x0252
            java.lang.String r13 = "protou"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x025e }
            if (r13 != 0) goto L_0x0252
            java.lang.String r13 = "ville"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x025e }
            if (r13 != 0) goto L_0x0252
            java.lang.String r13 = "villeplus"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x025e }
            if (r13 != 0) goto L_0x0252
            java.lang.String r13 = "villec2"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x025e }
            if (r13 != 0) goto L_0x0252
            java.lang.String r13 = "gee"
            boolean r13 = r14.startsWith(r13)     // Catch:{ Exception -> 0x025e }
            if (r13 != 0) goto L_0x0252
            java.lang.String r13 = "C6602"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x025e }
            if (r13 != 0) goto L_0x0252
            java.lang.String r13 = "C6603"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x025e }
            if (r13 != 0) goto L_0x0252
            java.lang.String r13 = "C6606"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x025e }
            if (r13 != 0) goto L_0x0252
            java.lang.String r13 = "C6616"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x025e }
            if (r13 != 0) goto L_0x0252
            java.lang.String r13 = "L36h"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x025e }
            if (r13 != 0) goto L_0x0252
            java.lang.String r13 = "SO-02E"
            boolean r13 = r13.equals(r14)     // Catch:{ Exception -> 0x025e }
            if (r13 != 0) goto L_0x0252
        L_0x00f4:
            if (r0 != r12) goto L_0x0120
            java.lang.String r12 = "OMX.qcom.audio.decoder.aac"
            boolean r12 = r12.equals(r10)     // Catch:{ Exception -> 0x025e }
            if (r12 == 0) goto L_0x0120
            java.lang.String r12 = "C1504"
            java.lang.String r13 = com.google.android.gms.internal.ads.zzbar.f26419b     // Catch:{ Exception -> 0x025e }
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x025e }
            if (r12 != 0) goto L_0x0252
            java.lang.String r12 = "C1505"
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x025e }
            if (r12 != 0) goto L_0x0252
            java.lang.String r12 = "C1604"
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x025e }
            if (r12 != 0) goto L_0x0252
            java.lang.String r12 = "C1605"
            boolean r12 = r12.equals(r13)     // Catch:{ Exception -> 0x025e }
            if (r12 != 0) goto L_0x0252
        L_0x0120:
            java.lang.String r12 = "jflte"
            r13 = 19
            if (r0 > r13) goto L_0x0160
            java.lang.String r14 = "OMX.SEC.vp8.dec"
            boolean r14 = r14.equals(r10)     // Catch:{ Exception -> 0x025e }
            if (r14 == 0) goto L_0x0160
            java.lang.String r14 = "samsung"
            java.lang.String r15 = com.google.android.gms.internal.ads.zzbar.f26420c     // Catch:{ Exception -> 0x025e }
            boolean r14 = r14.equals(r15)     // Catch:{ Exception -> 0x025e }
            if (r14 == 0) goto L_0x0160
            java.lang.String r14 = com.google.android.gms.internal.ads.zzbar.f26419b     // Catch:{ Exception -> 0x025e }
            java.lang.String r15 = "d2"
            boolean r15 = r14.startsWith(r15)     // Catch:{ Exception -> 0x025e }
            if (r15 != 0) goto L_0x0252
            java.lang.String r15 = "serrano"
            boolean r15 = r14.startsWith(r15)     // Catch:{ Exception -> 0x025e }
            if (r15 != 0) goto L_0x0252
            boolean r15 = r14.startsWith(r12)     // Catch:{ Exception -> 0x025e }
            if (r15 != 0) goto L_0x0252
            java.lang.String r15 = "santos"
            boolean r15 = r14.startsWith(r15)     // Catch:{ Exception -> 0x025e }
            if (r15 != 0) goto L_0x0252
            java.lang.String r15 = "t0"
            boolean r14 = r14.startsWith(r15)     // Catch:{ Exception -> 0x025e }
            if (r14 != 0) goto L_0x0252
        L_0x0160:
            if (r0 > r13) goto L_0x0172
            java.lang.String r0 = com.google.android.gms.internal.ads.zzbar.f26419b     // Catch:{ Exception -> 0x025e }
            boolean r0 = r0.startsWith(r12)     // Catch:{ Exception -> 0x025e }
            if (r0 == 0) goto L_0x0172
            java.lang.String r0 = "OMX.qcom.video.decoder.vp8"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x025e }
            if (r0 != 0) goto L_0x0252
        L_0x0172:
            java.lang.String[] r12 = r9.getSupportedTypes()     // Catch:{ Exception -> 0x025e }
            int r13 = r12.length     // Catch:{ Exception -> 0x025e }
            r14 = 0
        L_0x0178:
            if (r14 >= r13) goto L_0x0252
            r15 = r12[r14]     // Catch:{ Exception -> 0x025e }
            boolean r0 = r15.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x025e }
            if (r0 == 0) goto L_0x0243
            android.media.MediaCodecInfo$CodecCapabilities r0 = r9.getCapabilitiesForType(r15)     // Catch:{ Exception -> 0x01f3 }
            boolean r7 = r2.mo42163a(r4, r0)     // Catch:{ Exception -> 0x01f3 }
            int r2 = com.google.android.gms.internal.ads.zzbar.f26418a     // Catch:{ Exception -> 0x01f3 }
            r16 = r5
            r5 = 22
            r17 = r9
            r9 = 1
            if (r2 > r5) goto L_0x01bb
            java.lang.String r2 = com.google.android.gms.internal.ads.zzbar.f26421d     // Catch:{ Exception -> 0x01b9 }
            java.lang.String r5 = "ODROID-XU3"
            boolean r5 = r2.equals(r5)     // Catch:{ Exception -> 0x01b9 }
            if (r5 != 0) goto L_0x01a7
            java.lang.String r5 = "Nexus 10"
            boolean r2 = r2.equals(r5)     // Catch:{ Exception -> 0x01b9 }
            if (r2 == 0) goto L_0x01bb
        L_0x01a7:
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x01b9 }
            if (r2 != 0) goto L_0x01b7
            java.lang.String r2 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r2 = r2.equals(r10)     // Catch:{ Exception -> 0x01b9 }
            if (r2 == 0) goto L_0x01bb
        L_0x01b7:
            r2 = 1
            goto L_0x01bc
        L_0x01b9:
            r0 = move-exception
            goto L_0x01f8
        L_0x01bb:
            r2 = 0
        L_0x01bc:
            if (r6 == 0) goto L_0x01c5
            boolean r5 = r1.f26158b     // Catch:{ Exception -> 0x01b9 }
            if (r5 == r7) goto L_0x01c3
            goto L_0x01c5
        L_0x01c3:
            r5 = 0
            goto L_0x01cc
        L_0x01c5:
            if (r6 != 0) goto L_0x01d7
            boolean r5 = r1.f26158b     // Catch:{ Exception -> 0x01b9 }
            if (r5 != 0) goto L_0x01d7
            goto L_0x01c3
        L_0x01cc:
            com.google.android.gms.internal.ads.zzaws r0 = com.google.android.gms.internal.ads.zzaws.m42678a(r10, r4, r0, r2, r5)     // Catch:{ Exception -> 0x01d5 }
            r3.add(r0)     // Catch:{ Exception -> 0x01d5 }
            goto L_0x0248
        L_0x01d5:
            r0 = move-exception
            goto L_0x01f9
        L_0x01d7:
            r5 = 0
            if (r6 != 0) goto L_0x0248
            if (r7 == 0) goto L_0x0248
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01d5 }
            r7.<init>()     // Catch:{ Exception -> 0x01d5 }
            r7.append(r10)     // Catch:{ Exception -> 0x01d5 }
            r7.append(r11)     // Catch:{ Exception -> 0x01d5 }
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x01d5 }
            com.google.android.gms.internal.ads.zzaws r0 = com.google.android.gms.internal.ads.zzaws.m42678a(r7, r4, r0, r2, r9)     // Catch:{ Exception -> 0x01d5 }
            r3.add(r0)     // Catch:{ Exception -> 0x01d5 }
            return r3
        L_0x01f3:
            r0 = move-exception
            r16 = r5
            r17 = r9
        L_0x01f8:
            r5 = 0
        L_0x01f9:
            int r2 = com.google.android.gms.internal.ads.zzbar.f26418a     // Catch:{ Exception -> 0x025e }
            r7 = 23
            java.lang.String r9 = "MediaCodecUtil"
            if (r2 > r7) goto L_0x0221
            boolean r2 = r3.isEmpty()     // Catch:{ Exception -> 0x025e }
            if (r2 != 0) goto L_0x0221
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025e }
            r0.<init>()     // Catch:{ Exception -> 0x025e }
            java.lang.String r2 = "Skipping codec "
            r0.append(r2)     // Catch:{ Exception -> 0x025e }
            r0.append(r10)     // Catch:{ Exception -> 0x025e }
            java.lang.String r2 = " (failed to query capabilities)"
            r0.append(r2)     // Catch:{ Exception -> 0x025e }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x025e }
            android.util.Log.e(r9, r0)     // Catch:{ Exception -> 0x025e }
            goto L_0x0248
        L_0x0221:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x025e }
            r1.<init>()     // Catch:{ Exception -> 0x025e }
            java.lang.String r2 = "Failed to query codec "
            r1.append(r2)     // Catch:{ Exception -> 0x025e }
            r1.append(r10)     // Catch:{ Exception -> 0x025e }
            java.lang.String r2 = " ("
            r1.append(r2)     // Catch:{ Exception -> 0x025e }
            r1.append(r15)     // Catch:{ Exception -> 0x025e }
            java.lang.String r2 = ")"
            r1.append(r2)     // Catch:{ Exception -> 0x025e }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x025e }
            android.util.Log.e(r9, r1)     // Catch:{ Exception -> 0x025e }
            throw r0     // Catch:{ Exception -> 0x025e }
        L_0x0243:
            r16 = r5
            r17 = r9
            r5 = 0
        L_0x0248:
            int r14 = r14 + 1
            r2 = r19
            r5 = r16
            r9 = r17
            goto L_0x0178
        L_0x0252:
            r16 = r5
            r5 = 0
            int r8 = r8 + 1
            r2 = r19
            r5 = r16
            goto L_0x0014
        L_0x025d:
            return r3
        L_0x025e:
            r0 = move-exception
            com.google.android.gms.internal.ads.zzawz r1 = new com.google.android.gms.internal.ads.zzawz
            r2 = 0
            r1.<init>(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxe.m42726e(com.google.android.gms.internal.ads.zzawx, com.google.android.gms.internal.ads.zzaxa):java.util.List");
    }
}
