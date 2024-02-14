package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlinx.coroutines.internal.C15431b0;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u0004*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001\u0005¨\u0006\u0006"}, mo71668d2 = {"Lkotlinx/coroutines/channels/f;", "E", "Lkotlinx/coroutines/channels/x;", "Lkotlinx/coroutines/channels/t;", "y", "a", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.channels.f */
/* compiled from: Channel.kt */
public interface C15221f<E> extends C15245x<E>, C15241t<E> {

    /* renamed from: y */
    public static final C15222a f64445y = C15222a.f64446a;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, mo71668d2 = {"Lkotlinx/coroutines/channels/f$a;", "", "", "b", "I", "a", "()I", "CHANNEL_DEFAULT_CAPACITY", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.channels.f$a */
    /* compiled from: Channel.kt */
    public static final class C15222a {

        /* renamed from: a */
        static final /* synthetic */ C15222a f64446a = new C15222a();

        /* renamed from: b */
        private static final int f64447b = C15431b0.m94340b("kotlinx.coroutines.channels.defaultBuffer", 64, 1, 2147483646);

        private C15222a() {
        }

        /* renamed from: a */
        public final int mo74570a() {
            return f64447b;
        }
    }
}
