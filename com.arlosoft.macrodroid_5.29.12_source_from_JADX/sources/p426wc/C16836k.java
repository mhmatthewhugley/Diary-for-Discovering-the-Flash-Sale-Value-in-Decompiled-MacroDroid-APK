package p426wc;

import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p226cd.C11186d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0013J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H&J&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H&J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H&J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0014"}, mo71668d2 = {"Lwc/k;", "", "", "streamId", "", "Lwc/b;", "requestHeaders", "", "c", "responseHeaders", "last", "d", "Lcd/d;", "source", "byteCount", "b", "Lwc/a;", "errorCode", "Lja/u;", "a", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* renamed from: wc.k */
/* compiled from: PushObserver.kt */
public interface C16836k {

    /* renamed from: a */
    public static final C16836k f68007a = new C16837a.C16838a();

    /* renamed from: b */
    public static final C16837a f68008b = new C16837a((C13695i) null);

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0002\u0007\n\u0005\bF0\u0001¨\u0006\b"}, mo71668d2 = {"Lwc/k$a;", "", "Lwc/k;", "CANCEL", "Lwc/k;", "<init>", "()V", "a", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
    /* renamed from: wc.k$a */
    /* compiled from: PushObserver.kt */
    public static final class C16837a {

        @Metadata(mo71666bv = {}, mo71667d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001e\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J&\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0016J(\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0007H\u0016J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¨\u0006\u0016"}, mo71668d2 = {"Lwc/k$a$a;", "Lwc/k;", "", "streamId", "", "Lwc/b;", "requestHeaders", "", "c", "responseHeaders", "last", "d", "Lcd/d;", "source", "byteCount", "b", "Lwc/a;", "errorCode", "Lja/u;", "a", "<init>", "()V", "okhttp"}, mo71669k = 1, mo71670mv = {1, 4, 0})
        /* renamed from: wc.k$a$a */
        /* compiled from: PushObserver.kt */
        private static final class C16838a implements C16836k {
            /* renamed from: a */
            public void mo79944a(int i, C16794a aVar) {
                C13706o.m87929f(aVar, "errorCode");
            }

            /* renamed from: b */
            public boolean mo79945b(int i, C11186d dVar, int i2, boolean z) throws IOException {
                C13706o.m87929f(dVar, "source");
                dVar.skip((long) i2);
                return true;
            }

            /* renamed from: c */
            public boolean mo79946c(int i, List<C16796b> list) {
                C13706o.m87929f(list, "requestHeaders");
                return true;
            }

            /* renamed from: d */
            public boolean mo79947d(int i, List<C16796b> list, boolean z) {
                C13706o.m87929f(list, "responseHeaders");
                return true;
            }
        }

        private C16837a() {
        }

        public /* synthetic */ C16837a(C13695i iVar) {
            this();
        }
    }

    /* renamed from: a */
    void mo79944a(int i, C16794a aVar);

    /* renamed from: b */
    boolean mo79945b(int i, C11186d dVar, int i2, boolean z) throws IOException;

    /* renamed from: c */
    boolean mo79946c(int i, List<C16796b> list);

    /* renamed from: d */
    boolean mo79947d(int i, List<C16796b> list, boolean z);
}
