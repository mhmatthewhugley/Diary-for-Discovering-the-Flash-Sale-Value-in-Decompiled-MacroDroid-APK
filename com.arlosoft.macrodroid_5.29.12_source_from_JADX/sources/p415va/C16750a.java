package p415va;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import p406ua.C16676a;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, mo71668d2 = {"Lva/a;", "Lua/a;", "Ljava/util/Random;", "c", "()Ljava/util/Random;", "impl", "<init>", "()V", "kotlin-stdlib-jdk8"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: va.a */
/* compiled from: PlatformThreadLocalRandom.kt */
public final class C16750a extends C16676a {
    /* renamed from: c */
    public Random mo79578c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        C13706o.m87928e(current, "current()");
        return current;
    }
}
