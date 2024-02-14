package com.google.android.play.core.splitinstall.testing;

import com.google.android.play.core.internal.zzag;
import com.google.android.play.core.splitinstall.model.zza;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: com.google.android.play:core@@1.10.3 */
public final class zzy {

    /* renamed from: c */
    private static final zzag f51862c = new zzag("LocalTestingConfigParser");

    /* renamed from: a */
    private final XmlPullParser f51863a;

    /* renamed from: b */
    private final zzs f51864b = zzt.m71158c();

    zzy(XmlPullParser xmlPullParser) {
        this.f51863a = xmlPullParser;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x003d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.play.core.splitinstall.testing.zzt m71161a(java.io.File r4) {
        /*
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "local_testing_config.xml"
            r0.<init>(r4, r1)
            boolean r4 = r0.exists()
            if (r4 != 0) goto L_0x0010
            com.google.android.play.core.splitinstall.testing.zzt r4 = com.google.android.play.core.splitinstall.testing.zzt.f51858a
            return r4
        L_0x0010:
            java.io.FileReader r4 = new java.io.FileReader     // Catch:{ IOException -> 0x0042, XmlPullParserException -> 0x0040, RuntimeException -> 0x003e }
            r4.<init>(r0)     // Catch:{ IOException -> 0x0042, XmlPullParserException -> 0x0040, RuntimeException -> 0x003e }
            org.xmlpull.v1.XmlPullParserFactory r0 = org.xmlpull.v1.XmlPullParserFactory.newInstance()     // Catch:{ all -> 0x0039 }
            org.xmlpull.v1.XmlPullParser r0 = r0.newPullParser()     // Catch:{ all -> 0x0039 }
            r0.setInput(r4)     // Catch:{ all -> 0x0039 }
            com.google.android.play.core.splitinstall.testing.zzy r2 = new com.google.android.play.core.splitinstall.testing.zzy     // Catch:{ all -> 0x0039 }
            r2.<init>(r0)     // Catch:{ all -> 0x0039 }
            com.google.android.play.core.splitinstall.testing.zzu r0 = new com.google.android.play.core.splitinstall.testing.zzu     // Catch:{ all -> 0x0039 }
            r0.<init>(r2)     // Catch:{ all -> 0x0039 }
            java.lang.String r3 = "local-testing-config"
            r2.m71164e(r3, r0)     // Catch:{ all -> 0x0039 }
            com.google.android.play.core.splitinstall.testing.zzs r0 = r2.f51864b     // Catch:{ all -> 0x0039 }
            com.google.android.play.core.splitinstall.testing.zzt r0 = r0.mo59998e()     // Catch:{ all -> 0x0039 }
            r4.close()     // Catch:{ IOException -> 0x0042, XmlPullParserException -> 0x0040, RuntimeException -> 0x003e }
            return r0
        L_0x0039:
            r0 = move-exception
            r4.close()     // Catch:{ all -> 0x003d }
        L_0x003d:
            throw r0     // Catch:{ IOException -> 0x0042, XmlPullParserException -> 0x0040, RuntimeException -> 0x003e }
        L_0x003e:
            r4 = move-exception
            goto L_0x0043
        L_0x0040:
            r4 = move-exception
            goto L_0x0043
        L_0x0042:
            r4 = move-exception
        L_0x0043:
            com.google.android.play.core.internal.zzag r0 = f51862c
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r1
            r1 = 1
            java.lang.String r4 = r4.getMessage()
            r2[r1] = r4
            java.lang.String r4 = "%s can not be parsed, using default. Error: %s"
            r0.mo59809e(r4, r2)
            com.google.android.play.core.splitinstall.testing.zzt r4 = com.google.android.play.core.splitinstall.testing.zzt.f51858a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.splitinstall.testing.zzy.m71161a(java.io.File):com.google.android.play.core.splitinstall.testing.zzt");
    }

    /* renamed from: b */
    public static /* synthetic */ void m71162b(zzy zzy) {
        for (int i = 0; i < zzy.f51863a.getAttributeCount(); i++) {
            if ("defaultErrorCode".equals(zzy.f51863a.getAttributeName(i))) {
                zzy.f51864b.mo59980a(zza.m71124a(zzy.f51863a.getAttributeValue(i)));
            }
        }
        zzy.m71164e("split-install-error", new zzw(zzy));
    }

    /* renamed from: c */
    public static /* synthetic */ void m71163c(zzy zzy) {
        String str = null;
        String str2 = null;
        for (int i = 0; i < zzy.f51863a.getAttributeCount(); i++) {
            if ("module".equals(zzy.f51863a.getAttributeName(i))) {
                str = zzy.f51863a.getAttributeValue(i);
            }
            if ("errorCode".equals(zzy.f51863a.getAttributeName(i))) {
                str2 = zzy.f51863a.getAttributeValue(i);
            }
        }
        if (str == null || str2 == null) {
            throw new XmlPullParserException(String.format("'%s' element does not contain 'module'/'errorCode' attributes.", new Object[]{"split-install-error"}), zzy.f51863a, (Throwable) null);
        }
        zzy.f51864b.mo59983d().put(str, Integer.valueOf(zza.m71124a(str2)));
        do {
        } while (zzy.f51863a.next() != 3);
    }

    /* renamed from: e */
    private final void m71164e(String str, zzx zzx) throws IOException, XmlPullParserException {
        while (true) {
            int next = this.f51863a.next();
            if (next != 3 && next != 1) {
                if (this.f51863a.getEventType() == 2) {
                    if (this.f51863a.getName().equals(str)) {
                        zzx.zza();
                    } else {
                        throw new XmlPullParserException(String.format("Expected '%s' tag but found '%s'.", new Object[]{str, this.f51863a.getName()}), this.f51863a, (Throwable) null);
                    }
                }
            } else {
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo60000d() throws IOException, XmlPullParserException {
        m71164e("split-install-errors", new zzv(this));
    }
}
