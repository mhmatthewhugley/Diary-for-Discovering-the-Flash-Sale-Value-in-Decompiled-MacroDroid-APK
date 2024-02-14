package p164s4;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.io.IOException;
import java.io.InputStream;
import p090f5.C7307d;
import p090f5.C7313h;
import p102h4.C7384g;
import p102h4.C7385h;
import p120k4.C7587c;
import p126l4.C7667b;
import p126l4.C7669d;
import p164s4.C10207k;

/* renamed from: s4.t */
/* compiled from: StreamBitmapDecoder */
public class C10220t implements C7385h<InputStream, Bitmap> {

    /* renamed from: a */
    private final C10207k f23350a;

    /* renamed from: b */
    private final C7667b f23351b;

    /* renamed from: s4.t$a */
    /* compiled from: StreamBitmapDecoder */
    static class C10221a implements C10207k.C10209b {

        /* renamed from: a */
        private final C10217r f23352a;

        /* renamed from: b */
        private final C7307d f23353b;

        C10221a(C10217r rVar, C7307d dVar) {
            this.f23352a = rVar;
            this.f23353b = dVar;
        }

        /* renamed from: a */
        public void mo40810a(C7669d dVar, Bitmap bitmap) throws IOException {
            IOException b = this.f23353b.mo37240b();
            if (b != null) {
                if (bitmap != null) {
                    dVar.mo37692c(bitmap);
                }
                throw b;
            }
        }

        /* renamed from: b */
        public void mo40811b() {
            this.f23352a.mo40816c();
        }
    }

    public C10220t(C10207k kVar, C7667b bVar) {
        this.f23350a = kVar;
        this.f23351b = bVar;
    }

    /* renamed from: c */
    public C7587c<Bitmap> mo37384b(@NonNull InputStream inputStream, int i, int i2, @NonNull C7384g gVar) throws IOException {
        C10217r rVar;
        boolean z;
        if (inputStream instanceof C10217r) {
            rVar = (C10217r) inputStream;
            z = false;
        } else {
            rVar = new C10217r(inputStream, this.f23351b);
            z = true;
        }
        C7307d c = C7307d.m30181c(rVar);
        try {
            return this.f23350a.mo40807e(new C7313h(c), i, i2, gVar, new C10221a(rVar, c));
        } finally {
            c.mo37242e();
            if (z) {
                rVar.mo40818e();
            }
        }
    }

    /* renamed from: d */
    public boolean mo37383a(@NonNull InputStream inputStream, @NonNull C7384g gVar) {
        return this.f23350a.mo40808m(inputStream);
    }
}
