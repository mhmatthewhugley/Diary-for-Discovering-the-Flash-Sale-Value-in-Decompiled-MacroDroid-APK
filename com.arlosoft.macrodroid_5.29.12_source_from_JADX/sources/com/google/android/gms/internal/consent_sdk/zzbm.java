package com.google.android.gms.internal.consent_sdk;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.UiThread;
import java.io.ByteArrayOutputStream;
import java.util.Locale;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
final class zzbm implements zzg {

    /* renamed from: a */
    private final Application f39354a;

    /* renamed from: b */
    private final zzbi f39355b;

    /* renamed from: c */
    private final Handler f39356c;

    /* renamed from: d */
    private final Executor f39357d;

    /* renamed from: e */
    private final zzh f39358e;

    /* renamed from: f */
    private final zzak f39359f;

    /* renamed from: g */
    private final zzay f39360g;

    /* renamed from: h */
    private final zzam f39361h;

    @UiThread
    /* renamed from: e */
    private final void m55955e(JSONObject jSONObject) {
        String optString = jSONObject.optString("url");
        TextUtils.isEmpty(optString);
        Uri parse = Uri.parse(optString);
        if (parse.getScheme() == null) {
            String valueOf = String.valueOf(optString);
            if (valueOf.length() != 0) {
                "Action[browser]: empty scheme: ".concat(valueOf);
            }
        }
        try {
            this.f39355b.startActivity(new Intent("android.intent.action.VIEW", parse));
        } catch (ActivityNotFoundException unused) {
            String valueOf2 = String.valueOf(optString);
            if (valueOf2.length() != 0) {
                "Action[browser]: can not open url: ".concat(valueOf2);
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    @androidx.annotation.UiThread
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo48672a(java.lang.String r7, org.json.JSONObject r8) {
        /*
            r6 = this;
            int r0 = r7.hashCode()
            r1 = -1
            r2 = 0
            r3 = 2
            r4 = 3
            r5 = 1
            switch(r0) {
                case -1370505102: goto L_0x002b;
                case -278739366: goto L_0x0021;
                case 150940456: goto L_0x0017;
                case 1671672458: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0035
        L_0x000d:
            java.lang.String r0 = "dismiss"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 1
            goto L_0x0036
        L_0x0017:
            java.lang.String r0 = "browser"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 2
            goto L_0x0036
        L_0x0021:
            java.lang.String r0 = "configure_app_assets"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 3
            goto L_0x0036
        L_0x002b:
            java.lang.String r0 = "load_complete"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x0035
            r7 = 0
            goto L_0x0036
        L_0x0035:
            r7 = -1
        L_0x0036:
            if (r7 == 0) goto L_0x00ab
            if (r7 == r5) goto L_0x004e
            if (r7 == r3) goto L_0x004a
            if (r7 == r4) goto L_0x003f
            return r2
        L_0x003f:
            java.util.concurrent.Executor r7 = r6.f39357d
            com.google.android.gms.internal.consent_sdk.zzbk r8 = new com.google.android.gms.internal.consent_sdk.zzbk
            r8.<init>(r6)
            r7.execute(r8)
            return r5
        L_0x004a:
            r6.m55955e(r8)
            return r5
        L_0x004e:
            java.lang.String r7 = "status"
            java.lang.String r7 = r8.optString(r7)
            int r8 = r7.hashCode()
            r0 = 4
            switch(r8) {
                case -954325659: goto L_0x0085;
                case -258041904: goto L_0x007b;
                case 429411856: goto L_0x0071;
                case 467888915: goto L_0x0067;
                case 1666911234: goto L_0x005d;
                default: goto L_0x005c;
            }
        L_0x005c:
            goto L_0x008e
        L_0x005d:
            java.lang.String r8 = "non_personalized"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x008e
            r1 = 2
            goto L_0x008e
        L_0x0067:
            java.lang.String r8 = "CONSENT_SIGNAL_PERSONALIZED_ADS"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x008e
            r1 = 1
            goto L_0x008e
        L_0x0071:
            java.lang.String r8 = "CONSENT_SIGNAL_SUFFICIENT"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x008e
            r1 = 4
            goto L_0x008e
        L_0x007b:
            java.lang.String r8 = "personalized"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x008e
            r1 = 0
            goto L_0x008e
        L_0x0085:
            java.lang.String r8 = "CONSENT_SIGNAL_NON_PERSONALIZED_ADS"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x008e
            r1 = 3
        L_0x008e:
            if (r1 == 0) goto L_0x00a5
            if (r1 == r5) goto L_0x00a5
            if (r1 == r3) goto L_0x00a5
            if (r1 == r4) goto L_0x00a5
            if (r1 == r0) goto L_0x00a5
            com.google.android.gms.internal.consent_sdk.zzay r7 = r6.f39360g
            com.google.android.gms.internal.consent_sdk.zzj r8 = new com.google.android.gms.internal.consent_sdk.zzj
            java.lang.String r0 = "We are getting something wrong with the webview."
            r8.<init>(r5, r0)
            r7.mo48691c(r8)
            goto L_0x00aa
        L_0x00a5:
            com.google.android.gms.internal.consent_sdk.zzay r7 = r6.f39360g
            r7.mo48690b(r4)
        L_0x00aa:
            return r5
        L_0x00ab:
            com.google.android.gms.internal.consent_sdk.zzay r7 = r6.f39360g
            r7.mo48692d()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzbm.mo48672a(java.lang.String, org.json.JSONObject):boolean");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo48708b() {
        String str;
        Application application = this.f39354a;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", application.getPackageManager().getApplicationLabel(application.getApplicationInfo()).toString());
            Drawable applicationIcon = application.getPackageManager().getApplicationIcon(application.getApplicationInfo());
            if (applicationIcon == null) {
                str = null;
            } else {
                Bitmap createBitmap = Bitmap.createBitmap(applicationIcon.getIntrinsicWidth(), applicationIcon.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                applicationIcon.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                applicationIcon.draw(canvas);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                createBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                String valueOf = String.valueOf(Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2));
                str = valueOf.length() != 0 ? "data:image/png;base64,".concat(valueOf) : new String("data:image/png;base64,");
            }
            jSONObject.put("app_icon", str);
            jSONObject.put("stored_infos_map", this.f39361h.mo48674a());
        } catch (JSONException unused) {
        }
        this.f39360g.mo48689a().mo48702b("UMP_configureFormWithAppAssets", jSONObject.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo48709c(String str) {
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            "Receive consent action: ".concat(valueOf);
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("action");
        String queryParameter2 = parse.getQueryParameter("args");
        this.f39358e.mo48719b(queryParameter, queryParameter2, this, this.f39359f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo48710d(int i, String str, String str2) {
        this.f39360g.mo48693e(new zzj(2, String.format(Locale.US, "WebResourceError(%d, %s): %s", new Object[]{Integer.valueOf(i), str2, str})));
    }

    public final Executor zza() {
        return new zzbl(this.f39356c);
    }
}
