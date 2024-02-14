package p108i4;

import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import p108i4.C7403e;
import p126l4.C7667b;
import p164s4.C10217r;

/* renamed from: i4.k */
/* compiled from: InputStreamRewinder */
public final class C7414k implements C7403e<InputStream> {

    /* renamed from: a */
    private final C10217r f18119a;

    /* renamed from: i4.k$a */
    /* compiled from: InputStreamRewinder */
    public static final class C7415a implements C7403e.C7404a<InputStream> {

        /* renamed from: a */
        private final C7667b f18120a;

        public C7415a(C7667b bVar) {
            this.f18120a = bVar;
        }

        @NonNull
        /* renamed from: a */
        public Class<InputStream> mo37448a() {
            return InputStream.class;
        }

        @NonNull
        /* renamed from: c */
        public C7403e<InputStream> mo37449b(InputStream inputStream) {
            return new C7414k(inputStream, this.f18120a);
        }
    }

    C7414k(InputStream inputStream, C7667b bVar) {
        C10217r rVar = new C10217r(inputStream, bVar);
        this.f18119a = rVar;
        rVar.mark(5242880);
    }

    /* renamed from: b */
    public void mo37447b() {
        this.f18119a.mo40818e();
    }

    @NonNull
    /* renamed from: c */
    public InputStream mo37446a() throws IOException {
        this.f18119a.reset();
        return this.f18119a;
    }
}
