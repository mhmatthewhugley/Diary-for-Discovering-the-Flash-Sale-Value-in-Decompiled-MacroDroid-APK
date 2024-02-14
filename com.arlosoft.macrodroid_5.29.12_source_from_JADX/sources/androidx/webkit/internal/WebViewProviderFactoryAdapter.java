package androidx.webkit.internal;

import android.webkit.WebView;
import androidx.annotation.NonNull;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.TracingControllerBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;
import p320ld.C15627a;

public class WebViewProviderFactoryAdapter implements WebViewProviderFactory {
    WebViewProviderFactoryBoundaryInterface mImpl;

    public WebViewProviderFactoryAdapter(WebViewProviderFactoryBoundaryInterface webViewProviderFactoryBoundaryInterface) {
        this.mImpl = webViewProviderFactoryBoundaryInterface;
    }

    public WebViewProviderBoundaryInterface createWebView(WebView webView) {
        return (WebViewProviderBoundaryInterface) C15627a.m94878a(WebViewProviderBoundaryInterface.class, this.mImpl.createWebView(webView));
    }

    public ProxyControllerBoundaryInterface getProxyController() {
        return (ProxyControllerBoundaryInterface) C15627a.m94878a(ProxyControllerBoundaryInterface.class, this.mImpl.getProxyController());
    }

    @NonNull
    public ServiceWorkerControllerBoundaryInterface getServiceWorkerController() {
        return (ServiceWorkerControllerBoundaryInterface) C15627a.m94878a(ServiceWorkerControllerBoundaryInterface.class, this.mImpl.getServiceWorkerController());
    }

    public StaticsBoundaryInterface getStatics() {
        return (StaticsBoundaryInterface) C15627a.m94878a(StaticsBoundaryInterface.class, this.mImpl.getStatics());
    }

    public TracingControllerBoundaryInterface getTracingController() {
        return (TracingControllerBoundaryInterface) C15627a.m94878a(TracingControllerBoundaryInterface.class, this.mImpl.getTracingController());
    }

    public String[] getWebViewFeatures() {
        return this.mImpl.getSupportedFeatures();
    }

    public WebkitToCompatConverterBoundaryInterface getWebkitToCompatConverter() {
        return (WebkitToCompatConverterBoundaryInterface) C15627a.m94878a(WebkitToCompatConverterBoundaryInterface.class, this.mImpl.getWebkitToCompatConverter());
    }
}
