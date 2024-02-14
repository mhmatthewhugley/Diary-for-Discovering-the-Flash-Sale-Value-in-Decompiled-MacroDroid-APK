package com.google.api.client.googleapis.batch;

import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpRequest;
import java.io.IOException;
import java.util.List;

public final class BatchRequest {

    /* renamed from: a */
    List<RequestInfo<?, ?>> f52266a;

    class BatchInterceptor implements HttpExecuteInterceptor {

        /* renamed from: a */
        private HttpExecuteInterceptor f52267a;

        /* renamed from: b */
        final /* synthetic */ BatchRequest f52268b;

        /* renamed from: b */
        public void mo60066b(HttpRequest httpRequest) throws IOException {
            HttpExecuteInterceptor httpExecuteInterceptor = this.f52267a;
            if (httpExecuteInterceptor != null) {
                httpExecuteInterceptor.mo60066b(httpRequest);
            }
            for (RequestInfo next : this.f52268b.f52266a) {
                HttpExecuteInterceptor g = next.f52269a.mo60422g();
                if (g != null) {
                    g.mo60066b(next.f52269a);
                }
            }
        }
    }

    static class RequestInfo<T, E> {

        /* renamed from: a */
        final HttpRequest f52269a;
    }
}
