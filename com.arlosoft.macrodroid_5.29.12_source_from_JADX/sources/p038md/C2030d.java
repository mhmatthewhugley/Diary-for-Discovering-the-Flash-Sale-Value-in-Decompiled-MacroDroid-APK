package p038md;

import android.content.Context;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001e\u0010\u0004\u001a\u00020\u0002*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0005"}, mo71668d2 = {"Landroid/content/Context;", "Lkotlin/Function1;", "Lja/u;", "f", "a", "commons-base_release"}, mo71669k = 2, mo71670mv = {1, 4, 0})
/* renamed from: md.d */
/* compiled from: Async.kt */
public final class C2030d {

    /* renamed from: a */
    private static final C16265l<Throwable, C13339u> f6254a = C2031a.f6255a;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"", "throwable", "Lja/u;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: md.d$a */
    /* compiled from: Async.kt */
    static final class C2031a extends C13708q implements C16265l<Throwable, C13339u> {

        /* renamed from: a */
        public static final C2031a f6255a = new C2031a();

        C2031a() {
            super(1);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((Throwable) obj);
            return C13339u.f61331a;
        }

        public final void invoke(Throwable th) {
            C13706o.m87930g(th, "throwable");
            th.printStackTrace();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, mo71668d2 = {"Lja/u;", "run", "()V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 4, 0})
    /* renamed from: md.d$b */
    /* compiled from: Async.kt */
    static final class C2032b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Context f6256a;

        /* renamed from: c */
        final /* synthetic */ C16265l f6257c;

        C2032b(Context context, C16265l lVar) {
            this.f6256a = context;
            this.f6257c = lVar;
        }

        public final void run() {
            this.f6257c.invoke(this.f6256a);
        }
    }

    /* renamed from: a */
    public static final void m8417a(Context context, C16265l<? super Context, C13339u> lVar) {
        C13706o.m87930g(context, "receiver$0");
        C13706o.m87930g(lVar, "f");
        if (Looper.getMainLooper() == Looper.myLooper()) {
            lVar.invoke(context);
        } else {
            C2033e.f6259b.mo24119a().post(new C2032b(context, lVar));
        }
    }
}
