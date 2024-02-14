package com.github.javiersantos.piracychecker;

import com.github.javiersantos.piracychecker.callbacks.PiracyCheckerCallback;
import kotlin.Metadata;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\b\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¨\u0006\t"}, mo71668d2 = {"com/github/javiersantos/piracychecker/PiracyChecker$start$1", "Lcom/github/javiersantos/piracychecker/callbacks/PiracyCheckerCallback;", "Lja/u;", "a", "Lcom/github/javiersantos/piracychecker/enums/PiracyCheckerError;", "error", "Lcom/github/javiersantos/piracychecker/enums/PirateApp;", "app", "c", "library_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: PiracyChecker.kt */
public final class PiracyChecker$start$1 extends PiracyCheckerCallback {

    /* renamed from: a */
    final /* synthetic */ PiracyChecker f16297a;

    /* renamed from: a */
    public void mo34338a() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (r6 != null) goto L_0x0069;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r6 != null) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34339c(com.github.javiersantos.piracychecker.enums.PiracyCheckerError r6, com.github.javiersantos.piracychecker.enums.PirateApp r7) {
        /*
            r5 = this;
            java.lang.String r0 = "error"
            kotlin.jvm.internal.C13706o.m87930g(r6, r0)
            com.github.javiersantos.piracychecker.PiracyChecker r0 = r5.f16297a
            android.content.Context r0 = r0.f16291x
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L_0x0028
            com.github.javiersantos.piracychecker.PiracyChecker r0 = r5.f16297a
            android.content.Context r0 = r0.f16291x
            if (r0 == 0) goto L_0x0020
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isFinishing()
            if (r0 == 0) goto L_0x0028
            return
        L_0x0020:
            kotlin.TypeCastException r6 = new kotlin.TypeCastException
            java.lang.String r7 = "null cannot be cast to non-null type android.app.Activity"
            r6.<init>(r7)
            throw r6
        L_0x0028:
            r0 = 0
            java.lang.String r1 = ""
            if (r7 == 0) goto L_0x004c
            com.github.javiersantos.piracychecker.PiracyChecker r6 = r5.f16297a
            android.content.Context r6 = r6.f16291x
            if (r6 == 0) goto L_0x0046
            int r2 = com.github.javiersantos.piracychecker.C6918R.string.unauthorized_app_found
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            java.lang.String r7 = r7.mo34352a()
            r3[r4] = r7
            java.lang.String r6 = r6.getString(r2, r3)
            goto L_0x0047
        L_0x0046:
            r6 = r0
        L_0x0047:
            if (r6 == 0) goto L_0x004a
            goto L_0x0069
        L_0x004a:
            r6 = r1
            goto L_0x0069
        L_0x004c:
            com.github.javiersantos.piracychecker.enums.PiracyCheckerError r7 = com.github.javiersantos.piracychecker.enums.PiracyCheckerError.BLOCK_PIRATE_APP
            if (r6 != r7) goto L_0x0063
            com.github.javiersantos.piracychecker.PiracyChecker r6 = r5.f16297a
            android.content.Context r6 = r6.f16291x
            if (r6 == 0) goto L_0x005f
            int r7 = com.github.javiersantos.piracychecker.C6918R.string.unauthorized_app_blocked
            java.lang.String r6 = r6.getString(r7)
            goto L_0x0060
        L_0x005f:
            r6 = r0
        L_0x0060:
            if (r6 == 0) goto L_0x004a
            goto L_0x0069
        L_0x0063:
            com.github.javiersantos.piracychecker.PiracyChecker r6 = r5.f16297a
            java.lang.String r6 = r6.mo34344p()
        L_0x0069:
            com.github.javiersantos.piracychecker.PiracyChecker r7 = r5.f16297a
            com.github.javiersantos.piracychecker.enums.Display r7 = r7.f16268a
            com.github.javiersantos.piracychecker.enums.Display r2 = com.github.javiersantos.piracychecker.enums.Display.DIALOG
            if (r7 != r2) goto L_0x00a8
            com.github.javiersantos.piracychecker.PiracyChecker r7 = r5.f16297a
            r7.m26213n()
            com.github.javiersantos.piracychecker.PiracyChecker r7 = r5.f16297a
            com.github.javiersantos.piracychecker.PiracyCheckerDialog$Companion r0 = com.github.javiersantos.piracychecker.PiracyCheckerDialog.f16303f
            java.lang.String r2 = r7.mo34345q()
            if (r2 == 0) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r2 = r1
        L_0x0084:
            if (r6 == 0) goto L_0x0087
            r1 = r6
        L_0x0087:
            com.github.javiersantos.piracychecker.PiracyCheckerDialog r6 = r0.mo34348a(r2, r1)
            r7.f16290w = r6
            com.github.javiersantos.piracychecker.PiracyChecker r6 = r5.f16297a
            android.content.Context r6 = r6.f16291x
            if (r6 == 0) goto L_0x0113
            com.github.javiersantos.piracychecker.PiracyChecker r7 = r5.f16297a
            com.github.javiersantos.piracychecker.PiracyCheckerDialog r7 = r7.f16290w
            if (r7 == 0) goto L_0x00a2
            r7.mo34347Z(r6)
            goto L_0x0113
        L_0x00a2:
            com.github.javiersantos.piracychecker.PiracyChecker$start$1$doNotAllow$1$1 r6 = com.github.javiersantos.piracychecker.PiracyChecker$start$1$doNotAllow$1$1.f16298a
            r6.invoke()
            goto L_0x0113
        L_0x00a8:
            android.content.Intent r7 = new android.content.Intent
            com.github.javiersantos.piracychecker.PiracyChecker r1 = r5.f16297a
            android.content.Context r1 = r1.f16291x
            java.lang.Class<com.github.javiersantos.piracychecker.activities.LicenseActivity> r2 = com.github.javiersantos.piracychecker.activities.LicenseActivity.class
            r7.<init>(r1, r2)
            java.lang.String r1 = "content"
            android.content.Intent r6 = r7.putExtra(r1, r6)
            com.github.javiersantos.piracychecker.PiracyChecker r7 = r5.f16297a
            int r7 = r7.f16269b
            java.lang.String r1 = "colorPrimary"
            android.content.Intent r6 = r6.putExtra(r1, r7)
            com.github.javiersantos.piracychecker.PiracyChecker r7 = r5.f16297a
            int r7 = r7.f16270c
            java.lang.String r1 = "colorPrimaryDark"
            android.content.Intent r6 = r6.putExtra(r1, r7)
            com.github.javiersantos.piracychecker.PiracyChecker r7 = r5.f16297a
            boolean r7 = r7.f16271d
            java.lang.String r1 = "withLightStatusBar"
            android.content.Intent r6 = r6.putExtra(r1, r7)
            com.github.javiersantos.piracychecker.PiracyChecker r7 = r5.f16297a
            int r7 = r7.f16272e
            java.lang.String r1 = "layoutXML"
            android.content.Intent r6 = r6.putExtra(r1, r7)
            java.lang.String r7 = "Intent(context, LicenseA…a(\"layoutXML\", layoutXML)"
            kotlin.jvm.internal.C13706o.m87925b(r6, r7)
            com.github.javiersantos.piracychecker.PiracyChecker r7 = r5.f16297a
            android.content.Context r7 = r7.f16291x
            if (r7 == 0) goto L_0x00fb
            r7.startActivity(r6)
        L_0x00fb:
            com.github.javiersantos.piracychecker.PiracyChecker r6 = r5.f16297a
            android.content.Context r6 = r6.f16291x
            boolean r7 = r6 instanceof android.app.Activity
            if (r7 != 0) goto L_0x0106
            goto L_0x0107
        L_0x0106:
            r0 = r6
        L_0x0107:
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 == 0) goto L_0x010e
            r0.finish()
        L_0x010e:
            com.github.javiersantos.piracychecker.PiracyChecker r6 = r5.f16297a
            r6.mo34343l()
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.javiersantos.piracychecker.PiracyChecker$start$1.mo34339c(com.github.javiersantos.piracychecker.enums.PiracyCheckerError, com.github.javiersantos.piracychecker.enums.PirateApp):void");
    }
}
