package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzabg implements zzaay {

    /* renamed from: a */
    public final zzfvn f23826a;

    /* renamed from: b */
    private final int f23827b;

    private zzabg(int i, zzfvn zzfvn) {
        this.f23827b = i;
        this.f23826a = zzfvn;
    }

    /* renamed from: b */
    public static zzabg m40988b(int i, zzef zzef) {
        String str;
        zzef zzef2 = zzef;
        zzfvk zzfvk = new zzfvk();
        int l = zzef.mo45236l();
        int i2 = -2;
        while (zzef.mo45233i() > 8) {
            int o = zzef.mo45239o();
            int k = zzef.mo45235k() + zzef.mo45239o();
            zzef2.mo45229e(k);
            zzaay zzaay = null;
            if (o != 1414744396) {
                switch (o) {
                    case 1718776947:
                        if (i2 != 2) {
                            if (i2 != 1) {
                                zzdw.m48255e("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(zzen.m49176o(i2)));
                                break;
                            } else {
                                int q = zzef.mo45241q();
                                String str2 = q != 1 ? q != 85 ? q != 255 ? q != 8192 ? q != 8193 ? null : "audio/vnd.dts" : "audio/ac3" : "audio/mp4a-latm" : "audio/mpeg" : "audio/raw";
                                if (str2 != null) {
                                    int q2 = zzef.mo45241q();
                                    int o2 = zzef.mo45239o();
                                    zzef2.mo45231g(6);
                                    int X = zzen.m49149X(zzef.mo45247w());
                                    int q3 = zzef.mo45241q();
                                    byte[] bArr = new byte[q3];
                                    zzef2.mo45226b(bArr, 0, q3);
                                    zzad zzad = new zzad();
                                    zzad.mo41343s(str2);
                                    zzad.mo41326e0(q2);
                                    zzad.mo41344t(o2);
                                    if ("audio/raw".equals(str2) && X != 0) {
                                        zzad.mo41338n(X);
                                    }
                                    if ("audio/mp4a-latm".equals(str2) && q3 > 0) {
                                        zzad.mo41333i(zzfvn.m51136z(bArr));
                                    }
                                    zzaay = new zzabh(zzad.mo41349y());
                                    break;
                                } else {
                                    zzdw.m48255e("StreamFormatChunk", "Ignoring track with unsupported format tag " + q);
                                    break;
                                }
                            }
                        } else {
                            zzef2.mo45231g(4);
                            int o3 = zzef.mo45239o();
                            int o4 = zzef.mo45239o();
                            zzef2.mo45231g(4);
                            int o5 = zzef.mo45239o();
                            switch (o5) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str = "video/avc";
                                    break;
                                case 842289229:
                                    str = "video/mp42";
                                    break;
                                case 859066445:
                                    str = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str = "video/mjpeg";
                                    break;
                                default:
                                    str = null;
                                    break;
                            }
                            if (str != null) {
                                zzad zzad2 = new zzad();
                                zzad2.mo41348x(o3);
                                zzad2.mo41327f(o4);
                                zzad2.mo41343s(str);
                                zzaay = new zzabh(zzad2.mo41349y());
                                break;
                            } else {
                                zzdw.m48255e("StreamFormatChunk", "Ignoring track with unsupported compression " + o5);
                                break;
                            }
                        }
                    case 1751742049:
                        zzaay = zzabd.m40975a(zzef);
                        break;
                    case 1752331379:
                        zzaay = zzabe.m40976a(zzef);
                        break;
                    case 1852994675:
                        zzaay = zzabi.m40990a(zzef);
                        break;
                }
            } else {
                zzaay = m40988b(zzef.mo45239o(), zzef2);
            }
            if (zzaay != null) {
                if (zzaay.zza() == 1752331379) {
                    int i3 = ((zzabe) zzaay).f23809a;
                    if (i3 == 1935960438) {
                        i2 = 2;
                    } else if (i3 == 1935963489) {
                        i2 = 1;
                    } else if (i3 != 1937012852) {
                        zzdw.m48255e("AviStreamHeaderChunk", "Found unsupported streamType fourCC: ".concat(String.valueOf(Integer.toHexString(i3))));
                        i2 = -1;
                    } else {
                        i2 = 3;
                    }
                }
                zzfvk.mo46428f(zzaay);
            }
            zzef2.mo45230f(k);
            zzef2.mo45229e(l);
        }
        return new zzabg(i, zzfvk.mo46430h());
    }

    @Nullable
    /* renamed from: a */
    public final zzaay mo41241a(Class cls) {
        zzfvn zzfvn = this.f23826a;
        int size = zzfvn.size();
        int i = 0;
        while (i < size) {
            zzaay zzaay = (zzaay) zzfvn.get(i);
            i++;
            if (zzaay.getClass() == cls) {
                return zzaay;
            }
        }
        return null;
    }

    public final int zza() {
        return this.f23827b;
    }
}
