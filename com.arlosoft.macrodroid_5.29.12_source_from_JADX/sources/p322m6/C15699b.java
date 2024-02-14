package p322m6;

import android.content.Context;
import java.io.IOException;
import java.io.InputStream;
import p401te.C16625c;
import p401te.C16633g;
import p401te.C16636h;

/* renamed from: m6.b */
/* compiled from: AssetsZoneRulesInitializer */
final class C15699b extends C16633g {

    /* renamed from: d */
    private final Context f64987d;

    /* renamed from: e */
    private final String f64988e;

    C15699b(Context context, String str) {
        this.f64987d = context;
        this.f64988e = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo75090b() {
        InputStream inputStream = null;
        try {
            inputStream = this.f64987d.getAssets().open(this.f64988e);
            C16625c cVar = new C16625c(inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            C16636h.m99053e(cVar);
        } catch (IOException e) {
            throw new IllegalStateException(this.f64988e + " missing from assets", e);
        } catch (Throwable th) {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }
}
