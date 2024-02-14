package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzacc {

    /* renamed from: a */
    private static final String[] f23902a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* renamed from: b */
    private static final String[] f23903b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* renamed from: c */
    private static final String[] f23904c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    @Nullable
    /* renamed from: a */
    public static zzaby m41041a(String str) throws IOException {
        long j;
        try {
            XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
            newPullParser.setInput(new StringReader(str));
            newPullParser.next();
            if (zzeo.m49326c(newPullParser, "x:xmpmeta")) {
                zzfvn w = zzfvn.m51135w();
                long j2 = -9223372036854775807L;
                do {
                    newPullParser.next();
                    if (zzeo.m49326c(newPullParser, "rdf:Description")) {
                        String[] strArr = f23902a;
                        int i = 0;
                        int i2 = 0;
                        while (i2 < 4) {
                            String a = zzeo.m49324a(newPullParser, strArr[i2]);
                            if (a == null) {
                                i2++;
                            } else if (Integer.parseInt(a) != 1) {
                                return null;
                            } else {
                                String[] strArr2 = f23903b;
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= 4) {
                                        break;
                                    }
                                    String a2 = zzeo.m49324a(newPullParser, strArr2[i3]);
                                    if (a2 != null) {
                                        j = Long.parseLong(a2);
                                        if (j == -1) {
                                        }
                                    } else {
                                        i3++;
                                    }
                                }
                                j = -9223372036854775807L;
                                String[] strArr3 = f23904c;
                                while (true) {
                                    if (i >= 2) {
                                        w = zzfvn.m51135w();
                                        break;
                                    }
                                    String a3 = zzeo.m49324a(newPullParser, strArr3[i]);
                                    if (a3 != null) {
                                        w = zzfvn.m51125B(new zzabx("image/jpeg", "Primary", 0, 0), new zzabx("video/mp4", "MotionPhoto", Long.parseLong(a3), 0));
                                        break;
                                    }
                                    i++;
                                }
                                j2 = j;
                            }
                        }
                        return null;
                    } else if (zzeo.m49326c(newPullParser, "Container:Directory")) {
                        w = m41042b(newPullParser, "Container", "Item");
                    } else if (zzeo.m49326c(newPullParser, "GContainer:Directory")) {
                        w = m41042b(newPullParser, "GContainer", "GContainerItem");
                    }
                } while (!zzeo.m49325b(newPullParser, "x:xmpmeta"));
                if (w.isEmpty()) {
                    return null;
                }
                return new zzaby(j2, w);
            }
            throw zzbu.m44135a("Couldn't find xmp metadata", (Throwable) null);
        } catch (zzbu | NumberFormatException | XmlPullParserException unused) {
            zzdw.m48255e("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* renamed from: b */
    private static zzfvn m41042b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        String concat = str.concat(":Item");
        String concat2 = str.concat(":Directory");
        zzfvk m = zzfvn.m51129m();
        do {
            xmlPullParser.next();
            if (zzeo.m49326c(xmlPullParser, concat)) {
                String a = zzeo.m49324a(xmlPullParser, str2.concat(":Mime"));
                String a2 = zzeo.m49324a(xmlPullParser, str2.concat(":Semantic"));
                String a3 = zzeo.m49324a(xmlPullParser, str2.concat(":Length"));
                String a4 = zzeo.m49324a(xmlPullParser, str2.concat(":Padding"));
                if (a == null || a2 == null) {
                    return zzfvn.m51135w();
                }
                m.mo46428f(new zzabx(a, a2, a3 != null ? Long.parseLong(a3) : 0, a4 != null ? Long.parseLong(a4) : 0));
            }
        } while (!zzeo.m49325b(xmlPullParser, concat2));
        return m.mo46430h();
    }
}
