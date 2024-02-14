package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzb;
import com.google.android.gms.ads.internal.zzt;
import org.apache.commons.p353io.FileUtils;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class zzcmo extends WebChromeClient {

    /* renamed from: a */
    private final zzcmp f28997a;

    public zzcmo(zzcmp zzcmp) {
        this.f28997a = zzcmp;
    }

    /* renamed from: b */
    private static final Context m45812b(WebView webView) {
        if (!(webView instanceof zzcmp)) {
            return webView.getContext();
        }
        zzcmp zzcmp = (zzcmp) webView;
        Activity i = zzcmp.mo43756i();
        if (i != null) {
            return i;
        }
        return zzcmp.getContext();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo43993a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        zzb d;
        try {
            zzcmp zzcmp = this.f28997a;
            if (zzcmp == null || zzcmp.mo44044e0() == null || this.f28997a.mo44044e0().mo44098d() == null || (d = this.f28997a.mo44044e0().mo44098d()) == null || d.mo20416c()) {
                zzt.m2905r();
                AlertDialog.Builder g = zzs.m2756g(context);
                g.setTitle(str2);
                if (z) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    TextView textView = new TextView(context);
                    textView.setText(str3);
                    EditText editText = new EditText(context);
                    editText.setText(str4);
                    linearLayout.addView(textView);
                    linearLayout.addView(editText);
                    g.setView(linearLayout).setPositiveButton(17039370, new zzcmm(jsPromptResult, editText)).setNegativeButton(17039360, new zzcml(jsPromptResult)).setOnCancelListener(new zzcmk(jsPromptResult)).create().show();
                } else {
                    g.setMessage(str3).setPositiveButton(17039370, new zzcmj(jsResult)).setNegativeButton(17039360, new zzcmi(jsResult)).setOnCancelListener(new zzcmh(jsResult)).create().show();
                }
                return true;
            }
            d.mo20415b("window." + str + "('" + str3 + "')");
            return false;
        } catch (WindowManager.BadTokenException e) {
            zzcgp.m45230h("Fail to display Dialog.", e);
        }
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof zzcmp)) {
            zzcgp.m45229g("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        zzl M = ((zzcmp) webView).mo44020M();
        if (M == null) {
            zzcgp.m45229g("Tried to close an AdWebView not associated with an overlay.");
        } else {
            M.zzb();
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String str = "JS: " + consoleMessage.message() + " (" + consoleMessage.sourceId() + ":" + consoleMessage.lineNumber() + ")";
        if (str.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i = zzcmn.f28996a[consoleMessage.messageLevel().ordinal()];
        if (i == 1) {
            zzcgp.m45226d(str);
        } else if (i == 2) {
            zzcgp.m45229g(str);
        } else if (i == 3 || i == 4) {
            zzcgp.m45228f(str);
        } else if (i != 5) {
            zzcgp.m45228f(str);
        } else {
            zzcgp.m45224b(str);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f28997a.mo44025Q() != null) {
            webView2.setWebViewClient(this.f28997a.mo44025Q());
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, WebStorage.QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j == 0) {
            if (j2 > j4 || j2 > FileUtils.ONE_MB) {
                j2 = 0;
            }
        } else if (j2 == 0) {
            j2 = Math.min(j + Math.min(131072, j4), FileUtils.ONE_MB);
        } else {
            if (j2 <= Math.min(FileUtils.ONE_MB - j, j4)) {
                j += j2;
            }
            j2 = j;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        boolean z;
        if (callback != null) {
            zzt.m2905r();
            if (!zzs.m2747U(this.f28997a.getContext(), "android.permission.ACCESS_FINE_LOCATION")) {
                zzt.m2905r();
                if (!zzs.m2747U(this.f28997a.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) {
                    z = false;
                    callback.invoke(str, z, true);
                }
            }
            z = true;
            callback.invoke(str, z, true);
        }
    }

    public final void onHideCustomView() {
        zzl M = this.f28997a.mo44020M();
        if (M == null) {
            zzcgp.m45229g("Could not get ad overlay when hiding custom view.");
        } else {
            M.mo20197c();
        }
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return mo43993a(m45812b(webView), "alert", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return mo43993a(m45812b(webView), "onBeforeUnload", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return mo43993a(m45812b(webView), "confirm", str, str2, (String) null, jsResult, (JsPromptResult) null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return mo43993a(m45812b(webView), "prompt", str, str2, str3, (JsResult) null, jsPromptResult, true);
    }

    @Deprecated
    public final void onShowCustomView(View view, int i, WebChromeClient.CustomViewCallback customViewCallback) {
        zzl M = this.f28997a.mo44020M();
        if (M == null) {
            zzcgp.m45229g("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        M.mo20186Kb(view, customViewCallback);
        M.mo20191Qb(i);
    }

    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
