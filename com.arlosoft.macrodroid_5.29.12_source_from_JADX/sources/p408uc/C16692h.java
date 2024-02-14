package p408uc;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import okhttp3.C15919e0;
import okhttp3.C15995x;
import p226cd.C11186d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\f"}, mo71668d2 = {"Luc/h;", "Lokhttp3/e0;", "", "contentLength", "Lokhttp3/x;", "contentType", "Lcd/d;", "source", "", "contentTypeString", "<init>", "(Ljava/lang/String;JLcd/d;)V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: uc.h */
/* compiled from: RealResponseBody.kt */
public final class C16692h extends C15919e0 {

    /* renamed from: a */
    private final String f67590a;

    /* renamed from: c */
    private final long f67591c;

    /* renamed from: d */
    private final C11186d f67592d;

    public C16692h(String str, long j, C11186d dVar) {
        C13706o.m87929f(dVar, "source");
        this.f67590a = str;
        this.f67591c = j;
        this.f67592d = dVar;
    }

    public long contentLength() {
        return this.f67591c;
    }

    public C15995x contentType() {
        String str = this.f67590a;
        if (str != null) {
            return C15995x.f65817g.mo76320b(str);
        }
        return null;
    }

    public C11186d source() {
        return this.f67592d;
    }
}
