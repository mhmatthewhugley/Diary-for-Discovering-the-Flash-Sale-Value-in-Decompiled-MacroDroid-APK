package com.facebook.stetho.okhttp3;

import com.facebook.stetho.inspector.network.DefaultResponseHandler;
import com.facebook.stetho.inspector.network.NetworkEventReporter;
import com.facebook.stetho.inspector.network.NetworkEventReporterImpl;
import com.facebook.stetho.inspector.network.RequestBodyHelper;
import java.io.IOException;
import java.io.InputStream;
import okhttp3.C15904b0;
import okhttp3.C15907c0;
import okhttp3.C15915d0;
import okhttp3.C15919e0;
import okhttp3.C15960j;
import okhttp3.C15993w;
import okhttp3.C15995x;
import org.apache.http.protocol.HTTP;
import p226cd.C11184c;
import p226cd.C11186d;
import p226cd.C11196l;

public class StethoInterceptor implements C15993w {
    private final NetworkEventReporter mEventReporter = NetworkEventReporterImpl.get();

    private static class ForwardingResponseBody extends C15919e0 {
        private final C15919e0 mBody;
        private final C11186d mInterceptedSource;

        public ForwardingResponseBody(C15919e0 e0Var, InputStream inputStream) {
            this.mBody = e0Var;
            this.mInterceptedSource = C11196l.m75163b(C11196l.m75168g(inputStream));
        }

        public long contentLength() {
            return this.mBody.contentLength();
        }

        public C15995x contentType() {
            return this.mBody.contentType();
        }

        public C11186d source() {
            return this.mInterceptedSource;
        }
    }

    private static class OkHttpInspectorRequest implements NetworkEventReporter.InspectorRequest {
        private final C15904b0 mRequest;
        private RequestBodyHelper mRequestBodyHelper;
        private final String mRequestId;

        public OkHttpInspectorRequest(String str, C15904b0 b0Var, RequestBodyHelper requestBodyHelper) {
            this.mRequestId = str;
            this.mRequest = b0Var;
            this.mRequestBodyHelper = requestBodyHelper;
        }

        /* JADX INFO: finally extract failed */
        public byte[] body() throws IOException {
            C15907c0 a = this.mRequest.mo75911a();
            if (a == null) {
                return null;
            }
            C11184c a2 = C11196l.m75162a(C11196l.m75165d(this.mRequestBodyHelper.createBodySink(firstHeaderValue(HTTP.CONTENT_ENCODING))));
            try {
                a.mo75941h(a2);
                a2.close();
                return this.mRequestBodyHelper.getDisplayBody();
            } catch (Throwable th) {
                a2.close();
                throw th;
            }
        }

        public String firstHeaderValue(String str) {
            return this.mRequest.mo75914d(str);
        }

        public String friendlyName() {
            return null;
        }

        public Integer friendlyNameExtra() {
            return null;
        }

        public int headerCount() {
            return this.mRequest.mo75915e().size();
        }

        public String headerName(int i) {
            return this.mRequest.mo75915e().mo76242d(i);
        }

        public String headerValue(int i) {
            return this.mRequest.mo75915e().mo76246i(i);
        }

        /* renamed from: id */
        public String mo33610id() {
            return this.mRequestId;
        }

        public String method() {
            return this.mRequest.mo75917g();
        }

        public String url() {
            return this.mRequest.mo75920j().toString();
        }
    }

    private static class OkHttpInspectorResponse implements NetworkEventReporter.InspectorResponse {
        private final C15960j mConnection;
        private final C15904b0 mRequest;
        private final String mRequestId;
        private final C15915d0 mResponse;

        public OkHttpInspectorResponse(String str, C15904b0 b0Var, C15915d0 d0Var, C15960j jVar) {
            this.mRequestId = str;
            this.mRequest = b0Var;
            this.mResponse = d0Var;
            this.mConnection = jVar;
        }

        public int connectionId() {
            C15960j jVar = this.mConnection;
            if (jVar == null) {
                return 0;
            }
            return jVar.hashCode();
        }

        public boolean connectionReused() {
            return false;
        }

        public String firstHeaderValue(String str) {
            return this.mResponse.mo75974j(str);
        }

        public boolean fromDiskCache() {
            return this.mResponse.mo75969e() != null;
        }

        public int headerCount() {
            return this.mResponse.mo75976p().size();
        }

        public String headerName(int i) {
            return this.mResponse.mo75976p().mo76242d(i);
        }

        public String headerValue(int i) {
            return this.mResponse.mo75976p().mo76246i(i);
        }

        public String reasonPhrase() {
            return this.mResponse.mo75977r();
        }

        public String requestId() {
            return this.mRequestId;
        }

        public int statusCode() {
            return this.mResponse.mo75971g();
        }

        public String url() {
            return this.mRequest.mo75920j().toString();
        }
    }

    public C15915d0 intercept(C15993w.C15994a aVar) throws IOException {
        RequestBodyHelper requestBodyHelper;
        InputStream inputStream;
        C15995x xVar;
        String nextRequestId = this.mEventReporter.nextRequestId();
        C15904b0 m = aVar.mo76312m();
        String str = null;
        if (this.mEventReporter.isEnabled()) {
            requestBodyHelper = new RequestBodyHelper(this.mEventReporter, nextRequestId);
            this.mEventReporter.requestWillBeSent(new OkHttpInspectorRequest(nextRequestId, m, requestBodyHelper));
        } else {
            requestBodyHelper = null;
        }
        try {
            C15915d0 a = aVar.mo76309a(m);
            if (!this.mEventReporter.isEnabled()) {
                return a;
            }
            if (requestBodyHelper != null && requestBodyHelper.hasBody()) {
                requestBodyHelper.reportDataSent();
            }
            C15960j b = aVar.mo76310b();
            if (b != null) {
                this.mEventReporter.responseHeadersReceived(new OkHttpInspectorResponse(nextRequestId, m, a, b));
                C15919e0 b2 = a.mo75966b();
                if (b2 != null) {
                    xVar = b2.contentType();
                    inputStream = b2.byteStream();
                } else {
                    xVar = null;
                    inputStream = null;
                }
                NetworkEventReporter networkEventReporter = this.mEventReporter;
                if (xVar != null) {
                    str = xVar.toString();
                }
                InputStream interpretResponseStream = networkEventReporter.interpretResponseStream(nextRequestId, str, a.mo75974j(HTTP.CONTENT_ENCODING), inputStream, new DefaultResponseHandler(this.mEventReporter, nextRequestId));
                if (interpretResponseStream != null) {
                    return a.mo75980u().mo75987b(new ForwardingResponseBody(b2, interpretResponseStream)).mo75988c();
                }
                return a;
            }
            throw new IllegalStateException("No connection associated with this request; did you use addInterceptor instead of addNetworkInterceptor?");
        } catch (IOException e) {
            if (this.mEventReporter.isEnabled()) {
                this.mEventReporter.httpExchangeFailed(nextRequestId, e.toString());
            }
            throw e;
        }
    }
}
