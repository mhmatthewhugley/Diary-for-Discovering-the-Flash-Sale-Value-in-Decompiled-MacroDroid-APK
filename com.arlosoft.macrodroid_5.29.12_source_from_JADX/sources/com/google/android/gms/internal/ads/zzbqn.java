package com.google.android.gms.internal.ads;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.ClientCertRequest;
import android.webkit.HttpAuthHandler;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SafeBrowsingResponse;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.3.0 */
public abstract class zzbqn extends WebViewClient {
    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public abstract WebViewClient mo19840a();

    public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        WebViewClient a = mo19840a();
        if (a != null) {
            a.doUpdateVisitedHistory(webView, str, z);
        }
    }

    public final void onFormResubmission(WebView webView, Message message, Message message2) {
        WebViewClient a = mo19840a();
        if (a != null) {
            a.onFormResubmission(webView, message, message2);
        }
    }

    public void onLoadResource(WebView webView, String str) {
        WebViewClient a = mo19840a();
        if (a != null) {
            a.onLoadResource(webView, str);
        }
    }

    @RequiresApi(api = 23)
    public final void onPageCommitVisible(WebView webView, String str) {
        WebViewClient a = mo19840a();
        if (a != null) {
            a.onPageCommitVisible(webView, str);
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        WebViewClient a = mo19840a();
        if (a != null) {
            a.onPageFinished(webView, str);
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebViewClient a = mo19840a();
        if (a != null) {
            a.onPageStarted(webView, str, bitmap);
        }
    }

    @RequiresApi(api = 21)
    public final void onReceivedClientCertRequest(WebView webView, ClientCertRequest clientCertRequest) {
        WebViewClient a = mo19840a();
        if (a != null) {
            a.onReceivedClientCertRequest(webView, clientCertRequest);
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        WebViewClient a = mo19840a();
        if (a != null) {
            a.onReceivedError(webView, i, str, str2);
        }
    }

    public final void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        WebViewClient a = mo19840a();
        if (a != null) {
            a.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
        }
    }

    @RequiresApi(api = 23)
    public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        WebViewClient a = mo19840a();
        if (a != null) {
            a.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        }
    }

    public final void onReceivedLoginRequest(WebView webView, String str, @Nullable String str2, String str3) {
        WebViewClient a = mo19840a();
        if (a != null) {
            a.onReceivedLoginRequest(webView, str, str2, str3);
        }
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        WebViewClient a = mo19840a();
        if (a != null) {
            a.onReceivedSslError(webView, sslErrorHandler, sslError);
        }
    }

    @RequiresApi(api = 26)
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        WebViewClient a = mo19840a();
        if (a == null) {
            return false;
        }
        return a.onRenderProcessGone(webView, renderProcessGoneDetail);
    }

    @RequiresApi(api = 27)
    public final void onSafeBrowsingHit(WebView webView, WebResourceRequest webResourceRequest, int i, SafeBrowsingResponse safeBrowsingResponse) {
        WebViewClient a = mo19840a();
        if (a != null) {
            a.onSafeBrowsingHit(webView, webResourceRequest, i, safeBrowsingResponse);
        }
    }

    public final void onScaleChanged(WebView webView, float f, float f2) {
        WebViewClient a = mo19840a();
        if (a != null) {
            a.onScaleChanged(webView, f, f2);
        }
    }

    public final void onTooManyRedirects(WebView webView, Message message, Message message2) {
        WebViewClient a = mo19840a();
        if (a != null) {
            a.onTooManyRedirects(webView, message, message2);
        }
    }

    public final void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient a = mo19840a();
        if (a != null) {
            a.onUnhandledKeyEvent(webView, keyEvent);
        }
    }

    @RequiresApi(api = 21)
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient a = mo19840a();
        if (a == null) {
            return null;
        }
        return a.shouldInterceptRequest(webView, webResourceRequest);
    }

    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        WebViewClient a = mo19840a();
        if (a == null) {
            return false;
        }
        return a.shouldOverrideKeyEvent(webView, keyEvent);
    }

    @RequiresApi(api = 24)
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        WebViewClient a = mo19840a();
        if (a == null) {
            return false;
        }
        return a.shouldOverrideUrlLoading(webView, webResourceRequest);
    }

    @RequiresApi(api = 23)
    public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        WebViewClient a = mo19840a();
        if (a != null) {
            a.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebViewClient a = mo19840a();
        if (a == null) {
            return null;
        }
        return a.shouldInterceptRequest(webView, str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        WebViewClient a = mo19840a();
        if (a == null) {
            return false;
        }
        return a.shouldOverrideUrlLoading(webView, str);
    }
}
