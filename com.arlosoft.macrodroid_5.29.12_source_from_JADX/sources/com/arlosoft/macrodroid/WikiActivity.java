package com.arlosoft.macrodroid;

import android.net.Uri;
import android.os.Bundle;
import android.view.InflateException;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ViewFlipper;
import com.arlosoft.macrodroid.app.base.MacroDroidBaseActivity;
import com.arlosoft.macrodroid.logging.systemlog.C4878b;

public class WikiActivity extends MacroDroidBaseActivity {

    /* renamed from: o */
    private WebView f7102o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public ViewFlipper f7103p;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f7104s = false;

    /* renamed from: com.arlosoft.macrodroid.WikiActivity$a */
    class C2299a extends WebViewClient {
        C2299a() {
        }

        public void onPageFinished(WebView webView, String str) {
            if (!WikiActivity.this.f7104s) {
                WikiActivity.this.f7103p.setDisplayedChild(3);
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            boolean unused = WikiActivity.this.f7104s = true;
            WikiActivity.this.f7103p.setDisplayedChild(2);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V1 */
    public /* synthetic */ void m9537V1(View view) {
        m9538W1("https://www.macrodroidforum.com/wiki");
    }

    /* renamed from: W1 */
    private void m9538W1(String str) {
        this.f7104s = false;
        this.f7103p.setDisplayedChild(1);
        if (!str.contains("://")) {
            str = "http://" + str;
        }
        this.f7102o.resumeTimers();
        this.f7102o.loadUrl(str);
    }

    /* renamed from: U1 */
    public void mo24649U1() {
        this.f7103p.removeAllViews();
        WebSettings settings = this.f7102o.getSettings();
        settings.setJavaScriptEnabled(false);
        settings.setBuiltInZoomControls(false);
        settings.setSupportZoom(false);
        this.f7102o.clearHistory();
        this.f7102o.clearCache(true);
        this.f7102o.loadUrl("about:blank");
        this.f7102o.onPause();
        this.f7102o.removeAllViews();
        this.f7102o.destroyDrawingCache();
        this.f7102o.pauseTimers();
        this.f7102o.destroy();
        this.f7102o = null;
    }

    public void onBackPressed() {
        if (this.f7102o.canGoBack()) {
            this.f7102o.goBack();
        } else {
            super.onBackPressed();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            setContentView(C17535R$layout.remote_web_activity);
            setTitle(C17541R$string.wiki);
            Uri data = getIntent().getData();
            WebView webView = (WebView) findViewById(C17532R$id.remote_web_view);
            this.f7102o = webView;
            webView.getSettings().setJavaScriptEnabled(false);
            this.f7103p = (ViewFlipper) findViewById(C17532R$id.view_flipper);
            Button button = (Button) findViewById(C17532R$id.retry_button);
            this.f7102o.setWebViewClient(new C2299a());
            WebSettings settings = this.f7102o.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setDomStorageEnabled(true);
            settings.setLoadWithOverviewMode(true);
            settings.setAllowContentAccess(true);
            settings.setDatabaseEnabled(true);
            settings.setUserAgentString(settings.getUserAgentString().replace("; wv", ""));
            this.f7102o.setWebChromeClient(new WebChromeClient());
            m9538W1(data != null ? data.toString() : "https://www.macrodroidforum.com/wiki");
            button.setOnClickListener(new C5065q0(this));
        } catch (InflateException e) {
            C4878b.m18868g("Failed to initialse web view, maybe Google Play is currently updating your web view? : " + e.toString());
            finish();
        }
    }

    public void onDestroy() {
        try {
            mo24649U1();
        } catch (Exception unused) {
        }
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        super.onBackPressed();
        return true;
    }
}
