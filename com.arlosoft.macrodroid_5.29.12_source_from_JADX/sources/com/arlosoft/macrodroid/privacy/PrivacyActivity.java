package com.arlosoft.macrodroid.privacy;

import android.net.Uri;
import android.os.Bundle;
import android.view.InflateException;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ViewFlipper;
import com.arlosoft.macrodroid.C17532R$id;
import com.arlosoft.macrodroid.C17535R$layout;
import com.arlosoft.macrodroid.C17541R$string;
import com.arlosoft.macrodroid.app.base.MacroDroidDaggerBaseActivity;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;
import com.arlosoft.macrodroid.remoteconfig.C5070a;
import p342o2.C15801a;

public class PrivacyActivity extends MacroDroidDaggerBaseActivity {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f12672A = false;

    /* renamed from: B */
    C5070a f12673B;

    /* renamed from: s */
    private WebView f12674s;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public ViewFlipper f12675z;

    /* renamed from: com.arlosoft.macrodroid.privacy.PrivacyActivity$a */
    class C5062a extends WebViewClient {
        C5062a() {
        }

        public void onPageFinished(WebView webView, String str) {
            if (!PrivacyActivity.this.f12672A) {
                PrivacyActivity.this.f12675z.setDisplayedChild(3);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            boolean unused = PrivacyActivity.this.f12672A = true;
            PrivacyActivity.this.f12675z.setDisplayedChild(2);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: W1 */
    public /* synthetic */ void m19512W1(String str, View view) {
        m19513X1(str);
    }

    /* renamed from: X1 */
    private void m19513X1(String str) {
        this.f12672A = false;
        this.f12675z.setDisplayedChild(1);
        if (!str.contains("://")) {
            str = "http://" + str;
        }
        this.f12674s.resumeTimers();
        this.f12674s.loadUrl(str);
    }

    /* renamed from: V1 */
    public void mo29934V1() {
        this.f12675z.removeAllViews();
        WebSettings settings = this.f12674s.getSettings();
        settings.setJavaScriptEnabled(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportZoom(false);
        this.f12674s.clearHistory();
        this.f12674s.clearCache(true);
        this.f12674s.loadUrl("about:blank");
        this.f12674s.onPause();
        this.f12674s.removeAllViews();
        this.f12674s.destroyDrawingCache();
        this.f12674s.pauseTimers();
        this.f12674s.destroy();
        this.f12674s = null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(C17535R$layout.remote_web_activity);
            setTitle(C17541R$string.privacy_policy);
            Uri data = getIntent().getData();
            WebView webView = (WebView) findViewById(C17532R$id.remote_web_view);
            this.f12674s = webView;
            webView.getSettings().setJavaScriptEnabled(false);
            this.f12675z = (ViewFlipper) findViewById(C17532R$id.view_flipper);
            Button button = (Button) findViewById(C17532R$id.retry_button);
            this.f12674s.setWebViewClient(new C5062a());
            WebSettings settings = this.f12674s.getSettings();
            settings.setJavaScriptEnabled(false);
            settings.setBuiltInZoomControls(false);
            settings.setSupportZoom(true);
            this.f12674s.setWebChromeClient(new WebChromeClient());
            String g = this.f12673B.mo29980g();
            m19513X1(data != null ? data.toString() : g);
            button.setOnClickListener(new C15801a(this, g));
        } catch (InflateException e) {
            C4878b.m18868g("Failed to initialse web view, maybe Google Play is currently updating your web view? : " + e.toString());
            finish();
        }
    }

    public void onDestroy() {
        try {
            mo29934V1();
        } catch (Exception unused) {
        }
        super.onDestroy();
    }
}
