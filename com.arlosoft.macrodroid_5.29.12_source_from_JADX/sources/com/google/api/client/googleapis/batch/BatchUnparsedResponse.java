package com.google.api.client.googleapis.batch;

import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.LowLevelHttpRequest;
import com.google.api.client.http.LowLevelHttpResponse;
import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

final class BatchUnparsedResponse {

    /* renamed from: com.google.api.client.googleapis.batch.BatchUnparsedResponse$1 */
    class C108251 extends FilterInputStream {
        public void close() {
        }
    }

    private static class FakeLowLevelHttpRequest extends LowLevelHttpRequest {

        /* renamed from: e */
        private InputStream f52270e;

        /* renamed from: f */
        private int f52271f;

        /* renamed from: g */
        private List<String> f52272g;

        /* renamed from: h */
        private List<String> f52273h;

        FakeLowLevelHttpRequest(InputStream inputStream, int i, List<String> list, List<String> list2) {
            this.f52270e = inputStream;
            this.f52271f = i;
            this.f52272g = list;
            this.f52273h = list2;
        }

        /* renamed from: a */
        public void mo60255a(String str, String str2) {
        }

        /* renamed from: b */
        public LowLevelHttpResponse mo60256b() {
            return new FakeLowLevelHttpResponse(this.f52270e, this.f52271f, this.f52272g, this.f52273h);
        }
    }

    private static class FakeLowLevelHttpResponse extends LowLevelHttpResponse {

        /* renamed from: a */
        private InputStream f52274a;

        /* renamed from: b */
        private int f52275b;

        /* renamed from: c */
        private List<String> f52276c = new ArrayList();

        /* renamed from: d */
        private List<String> f52277d;

        FakeLowLevelHttpResponse(InputStream inputStream, int i, List<String> list, List<String> list2) {
            new ArrayList();
            this.f52274a = inputStream;
            this.f52275b = i;
            this.f52276c = list;
            this.f52277d = list2;
        }

        /* renamed from: b */
        public InputStream mo60257b() {
            return this.f52274a;
        }

        /* renamed from: c */
        public String mo60258c() {
            return null;
        }

        /* renamed from: d */
        public String mo60259d() {
            return null;
        }

        /* renamed from: e */
        public int mo60260e() {
            return this.f52276c.size();
        }

        /* renamed from: f */
        public String mo60261f(int i) {
            return this.f52276c.get(i);
        }

        /* renamed from: g */
        public String mo60262g(int i) {
            return this.f52277d.get(i);
        }

        /* renamed from: h */
        public String mo60263h() {
            return null;
        }

        /* renamed from: i */
        public int mo60264i() {
            return this.f52275b;
        }

        /* renamed from: j */
        public String mo60265j() {
            return null;
        }
    }

    private static class FakeResponseHttpTransport extends HttpTransport {

        /* renamed from: c */
        private int f52278c;

        /* renamed from: d */
        private InputStream f52279d;

        /* renamed from: e */
        private List<String> f52280e;

        /* renamed from: f */
        private List<String> f52281f;

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public LowLevelHttpRequest mo60266b(String str, String str2) {
            return new FakeLowLevelHttpRequest(this.f52279d, this.f52278c, this.f52280e, this.f52281f);
        }
    }
}
