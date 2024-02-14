package kotlinx.coroutines;

import androidx.concurrent.futures.C0320a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.C13635d;
import kotlin.coroutines.C13640g;
import kotlin.coroutines.jvm.internal.C13660h;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import kotlinx.coroutines.C15561w1;
import kotlinx.coroutines.internal.C15454n;
import kotlinx.coroutines.internal.C15455o;
import kotlinx.coroutines.internal.C15468v;
import p297ja.C13339u;
import p370qa.C16265l;
import p370qa.C16269p;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0005¥\u0001\u0001kB\u0012\u0012\u0007\u0010¢\u0001\u001a\u00020\u0015¢\u0006\u0006\b£\u0001\u0010¤\u0001J#\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010!\u001a\u00020\u0010*\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b!\u0010\u001eJ\u0019\u0010#\u001a\u00020\"2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b#\u0010$J1\u0010*\u001a\u00020)2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&2\u0006\u0010(\u001a\u00020\u0015H\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u00152\u0006\u0010,\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020)H\u0002¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u000200H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020)H\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\u0015H\u0002¢\u0006\u0004\b5\u00106J\u0013\u00107\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\b7\u00108J\u001b\u00109\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b9\u0010:J\u0019\u0010;\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b;\u0010<J\u001b\u0010=\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b=\u0010:J\u0019\u0010>\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\b>\u0010?J\u001f\u0010@\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00132\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b@\u0010AJ%\u0010B\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bB\u0010CJ#\u0010D\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0006\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bD\u0010EJ\u0019\u0010G\u001a\u0004\u0018\u00010F2\u0006\u0010\u0006\u001a\u00020\u0013H\u0002¢\u0006\u0004\bG\u0010HJ*\u0010J\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010I\u001a\u00020F2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0010¢\u0006\u0004\bJ\u0010KJ)\u0010M\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010L\u001a\u00020F2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bM\u0010NJ\u0015\u0010P\u001a\u0004\u0018\u00010F*\u00020OH\u0002¢\u0006\u0004\bP\u0010QJ\u0019\u0010S\u001a\u00020R2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\bS\u0010TJ\u0015\u0010U\u001a\u0004\u0018\u00010\u0004H@ø\u0001\u0000¢\u0006\u0004\bU\u00108J\u0019\u0010W\u001a\u00020\u00102\b\u0010V\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bW\u0010XJ\r\u0010Y\u001a\u00020\u0015¢\u0006\u0004\bY\u00106J\u000f\u0010Z\u001a\u00020\u0010H\u0014¢\u0006\u0004\bZ\u0010[J\u0011\u0010^\u001a\u00060\\j\u0002`]¢\u0006\u0004\b^\u0010_J#\u0010a\u001a\u00060\\j\u0002`]*\u00020\u000b2\n\b\u0002\u0010`\u001a\u0004\u0018\u00010RH\u0004¢\u0006\u0004\ba\u0010bJ'\u0010d\u001a\u00020c2\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&¢\u0006\u0004\bd\u0010eJ7\u0010g\u001a\u00020c2\u0006\u0010(\u001a\u00020\u00152\u0006\u0010f\u001a\u00020\u00152\u0018\u0010'\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u00100%j\u0002`&¢\u0006\u0004\bg\u0010hJ\u0013\u0010i\u001a\u00020\u0010H@ø\u0001\u0000¢\u0006\u0004\bi\u00108J\u0017\u0010j\u001a\u00020\u00102\u0006\u0010-\u001a\u00020)H\u0000¢\u0006\u0004\bj\u00104J\u001f\u0010k\u001a\u00020\u00102\u000e\u0010\u001c\u001a\n\u0018\u00010\\j\u0004\u0018\u0001`]H\u0016¢\u0006\u0004\bk\u0010lJ\u000f\u0010m\u001a\u00020RH\u0014¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\bo\u0010pJ\u0015\u0010r\u001a\u00020\u00102\u0006\u0010q\u001a\u00020\u0003¢\u0006\u0004\br\u0010sJ\u0017\u0010t\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u000bH\u0016¢\u0006\u0004\bt\u0010 J\u0017\u0010u\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\bu\u0010 J\u0019\u0010v\u001a\u00020\u00152\b\u0010\u001c\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bv\u0010wJ\u0013\u0010x\u001a\u00060\\j\u0002`]H\u0016¢\u0006\u0004\bx\u0010_J\u0019\u0010y\u001a\u00020\u00152\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\by\u0010wJ\u001b\u0010z\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\bz\u0010:J\u0015\u0010|\u001a\u00020{2\u0006\u0010I\u001a\u00020\u0002¢\u0006\u0004\b|\u0010}J\u0017\u0010\u001a\u00020\u00102\u0006\u0010~\u001a\u00020\u000bH\u0010¢\u0006\u0004\b\u0010pJ\u001b\u0010\u0001\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0005\b\u0001\u0010pJ\u0019\u0010\u0001\u001a\u00020\u00152\u0006\u0010~\u001a\u00020\u000bH\u0014¢\u0006\u0005\b\u0001\u0010 J\u001c\u0010\u0001\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0006\b\u0001\u0010\u0001J\u001c\u0010\u0001\u001a\u00020\u00102\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0006\b\u0001\u0010\u0001J\u0011\u0010\u0001\u001a\u00020RH\u0016¢\u0006\u0005\b\u0001\u0010nJ\u0011\u0010\u0001\u001a\u00020RH\u0007¢\u0006\u0005\b\u0001\u0010nJ\u0011\u0010\u0001\u001a\u00020RH\u0010¢\u0006\u0005\b\u0001\u0010nJ\u0017\u0010\u0001\u001a\u0004\u0018\u00010\u0004H@ø\u0001\u0000¢\u0006\u0005\b\u0001\u00108R\u001e\u0010\u0001\u001a\u0004\u0018\u00010\u000b*\u0004\u0018\u00010\u00048BX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u0010<R\u0019\u0010\u0001\u001a\u0007\u0012\u0002\b\u00030\u00018F¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R.\u0010\u0001\u001a\u0004\u0018\u00010{2\t\u0010\u0001\u001a\u0004\u0018\u00010{8@@@X\u000e¢\u0006\u0010\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048@X\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020\u00158VX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u00106R\u0013\u0010\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b\u0001\u00106R\u0013\u0010\u0001\u001a\u00020\u00158F¢\u0006\u0007\u001a\u0005\b\u0001\u00106R\u0016\u0010\u0001\u001a\u00020\u00158PX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u00106R\u0016\u0010\u0001\u001a\u00020\u00158TX\u0004¢\u0006\u0007\u001a\u0005\b\u0001\u00106R\u0016\u0010¡\u0001\u001a\u00020\u00158PX\u0004¢\u0006\u0007\u001a\u0005\b \u0001\u00106\u0002\u0004\n\u0002\b\u0019¨\u0006¦\u0001"}, mo71668d2 = {"Lkotlinx/coroutines/d2;", "Lkotlinx/coroutines/w1;", "Lkotlinx/coroutines/v;", "Lkotlinx/coroutines/l2;", "", "Lkotlinx/coroutines/d2$c;", "state", "proposedUpdate", "S", "(Lkotlinx/coroutines/d2$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "V", "(Lkotlinx/coroutines/d2$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "Lja/u;", "E", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lkotlinx/coroutines/r1;", "update", "", "B0", "(Lkotlinx/coroutines/r1;Ljava/lang/Object;)Z", "P", "(Lkotlinx/coroutines/r1;Ljava/lang/Object;)V", "Lkotlinx/coroutines/i2;", "list", "cause", "n0", "(Lkotlinx/coroutines/i2;Ljava/lang/Throwable;)V", "M", "(Ljava/lang/Throwable;)Z", "o0", "", "w0", "(Ljava/lang/Object;)I", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "onCancelling", "Lkotlinx/coroutines/c2;", "k0", "(Lqa/l;Z)Lkotlinx/coroutines/c2;", "expect", "node", "D", "(Ljava/lang/Object;Lkotlinx/coroutines/i2;Lkotlinx/coroutines/c2;)Z", "Lkotlinx/coroutines/f1;", "s0", "(Lkotlinx/coroutines/f1;)V", "t0", "(Lkotlinx/coroutines/c2;)V", "f0", "()Z", "g0", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "L", "(Ljava/lang/Object;)Ljava/lang/Object;", "R", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "h0", "Y", "(Lkotlinx/coroutines/r1;)Lkotlinx/coroutines/i2;", "C0", "(Lkotlinx/coroutines/r1;Ljava/lang/Throwable;)Z", "D0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "E0", "(Lkotlinx/coroutines/r1;Ljava/lang/Object;)Ljava/lang/Object;", "Lkotlinx/coroutines/u;", "T", "(Lkotlinx/coroutines/r1;)Lkotlinx/coroutines/u;", "child", "F0", "(Lkotlinx/coroutines/d2$c;Lkotlinx/coroutines/u;Ljava/lang/Object;)Z", "lastChild", "Q", "(Lkotlinx/coroutines/d2$c;Lkotlinx/coroutines/u;Ljava/lang/Object;)V", "Lkotlinx/coroutines/internal/o;", "m0", "(Lkotlinx/coroutines/internal/o;)Lkotlinx/coroutines/u;", "", "x0", "(Ljava/lang/Object;)Ljava/lang/String;", "H", "parent", "d0", "(Lkotlinx/coroutines/w1;)V", "start", "r0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "g", "()Ljava/util/concurrent/CancellationException;", "message", "y0", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/c1;", "p", "(Lqa/l;)Lkotlinx/coroutines/c1;", "invokeImmediately", "y", "(ZZLqa/l;)Lkotlinx/coroutines/c1;", "x", "u0", "c", "(Ljava/util/concurrent/CancellationException;)V", "N", "()Ljava/lang/String;", "K", "(Ljava/lang/Throwable;)V", "parentJob", "i", "(Lkotlinx/coroutines/l2;)V", "O", "I", "J", "(Ljava/lang/Object;)Z", "v", "i0", "j0", "Lkotlinx/coroutines/t;", "A", "(Lkotlinx/coroutines/v;)Lkotlinx/coroutines/t;", "exception", "c0", "p0", "b0", "q0", "(Ljava/lang/Object;)V", "F", "toString", "A0", "l0", "G", "U", "exceptionOrNull", "Lkotlin/coroutines/g$c;", "getKey", "()Lkotlin/coroutines/g$c;", "key", "value", "Z", "()Lkotlinx/coroutines/t;", "v0", "(Lkotlinx/coroutines/t;)V", "parentHandle", "a0", "()Ljava/lang/Object;", "b", "isActive", "w", "isCompleted", "isCancelled", "X", "onCancelComplete", "e0", "isScopedCoroutine", "W", "handlesException", "active", "<init>", "(Z)V", "a", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.d2 */
/* compiled from: JobSupport.kt */
public class C15252d2 implements C15561w1, C15555v, C15484l2 {

    /* renamed from: a */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f64461a = AtomicReferenceFieldUpdater.newUpdater(C15252d2.class, Object.class, "_state");
    private volatile /* synthetic */ Object _parentHandle;
    private volatile /* synthetic */ Object _state;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0014R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0011"}, mo71668d2 = {"Lkotlinx/coroutines/d2$a;", "T", "Lkotlinx/coroutines/o;", "Lkotlinx/coroutines/w1;", "parent", "", "v", "", "G", "Lkotlinx/coroutines/d2;", "z", "Lkotlinx/coroutines/d2;", "job", "Lkotlin/coroutines/d;", "delegate", "<init>", "(Lkotlin/coroutines/d;Lkotlinx/coroutines/d2;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.d2$a */
    /* compiled from: JobSupport.kt */
    private static final class C15253a<T> extends C15497o<T> {

        /* renamed from: z */
        private final C15252d2 f64462z;

        public C15253a(C13635d<? super T> dVar, C15252d2 d2Var) {
            super(dVar, 1);
            this.f64462z = d2Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: G */
        public String mo74629G() {
            return "AwaitContinuation";
        }

        /* renamed from: v */
        public Throwable mo74630v(C15561w1 w1Var) {
            Throwable f;
            Object a0 = this.f64462z.mo74608a0();
            if ((a0 instanceof C15255c) && (f = ((C15255c) a0).mo74632f()) != null) {
                return f;
            }
            if (a0 instanceof C15196b0) {
                return ((C15196b0) a0).f64404a;
            }
            return w1Var.mo74612g();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\u000e\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0018"}, mo71668d2 = {"Lkotlinx/coroutines/d2$b;", "Lkotlinx/coroutines/c2;", "", "cause", "Lja/u;", "D", "Lkotlinx/coroutines/d2;", "g", "Lkotlinx/coroutines/d2;", "parent", "Lkotlinx/coroutines/d2$c;", "o", "Lkotlinx/coroutines/d2$c;", "state", "Lkotlinx/coroutines/u;", "p", "Lkotlinx/coroutines/u;", "child", "", "s", "Ljava/lang/Object;", "proposedUpdate", "<init>", "(Lkotlinx/coroutines/d2;Lkotlinx/coroutines/d2$c;Lkotlinx/coroutines/u;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.d2$b */
    /* compiled from: JobSupport.kt */
    private static final class C15254b extends C15203c2 {

        /* renamed from: g */
        private final C15252d2 f64463g;

        /* renamed from: o */
        private final C15255c f64464o;

        /* renamed from: p */
        private final C15551u f64465p;

        /* renamed from: s */
        private final Object f64466s;

        public C15254b(C15252d2 d2Var, C15255c cVar, C15551u uVar, Object obj) {
            this.f64463g = d2Var;
            this.f64464o = cVar;
            this.f64465p = uVar;
            this.f64466s = obj;
        }

        /* renamed from: D */
        public void mo74596D(Throwable th) {
            this.f64463g.m93946Q(this.f64464o, this.f64465p, this.f64466s);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo74596D((Throwable) obj);
            return C13339u.f61331a;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0018\u001a\u00020\u0014\u0012\u0006\u0010$\u001a\u00020\u001f\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b/\u00100J\u001f\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00148\u0016X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R(\u0010\u001e\u001a\u0004\u0018\u00010\u00012\b\u0010\u0019\u001a\u0004\u0018\u00010\u00018B@BX\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR$\u0010$\u001a\u00020\u001f2\u0006\u0010\u0019\u001a\u00020\u001f8F@FX\u000e¢\u0006\f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R(\u0010(\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00058F@FX\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010\u0010R\u0011\u0010*\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b)\u0010!R\u0011\u0010,\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b+\u0010!R\u0014\u0010.\u001a\u00020\u001f8VX\u0004¢\u0006\u0006\u001a\u0004\b-\u0010!¨\u00061"}, mo71668d2 = {"Lkotlinx/coroutines/d2$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lkotlinx/coroutines/r1;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "d", "()Ljava/util/ArrayList;", "proposedException", "", "j", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "Lja/u;", "a", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/i2;", "Lkotlinx/coroutines/i2;", "c", "()Lkotlinx/coroutines/i2;", "list", "value", "e", "()Ljava/lang/Object;", "l", "(Ljava/lang/Object;)V", "exceptionsHolder", "", "h", "()Z", "k", "(Z)V", "isCompleting", "f", "()Ljava/lang/Throwable;", "m", "rootCause", "i", "isSealed", "g", "isCancelling", "b", "isActive", "<init>", "(Lkotlinx/coroutines/i2;ZLjava/lang/Throwable;)V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.d2$c */
    /* compiled from: JobSupport.kt */
    private static final class C15255c implements C15511r1 {
        private volatile /* synthetic */ Object _exceptionsHolder = null;
        private volatile /* synthetic */ int _isCompleting;
        private volatile /* synthetic */ Object _rootCause;

        /* renamed from: a */
        private final C15427i2 f64467a;

        public C15255c(C15427i2 i2Var, boolean z, Throwable th) {
            this.f64467a = i2Var;
            this._isCompleting = z ? 1 : 0;
            this._rootCause = th;
        }

        /* renamed from: d */
        private final ArrayList<Throwable> m94004d() {
            return new ArrayList<>(4);
        }

        /* renamed from: e */
        private final Object m94005e() {
            return this._exceptionsHolder;
        }

        /* renamed from: l */
        private final void m94006l(Object obj) {
            this._exceptionsHolder = obj;
        }

        /* renamed from: a */
        public final void mo74631a(Throwable th) {
            Throwable f = mo74632f();
            if (f == null) {
                mo74638m(th);
            } else if (th != f) {
                Object e = m94005e();
                if (e == null) {
                    m94006l(th);
                } else if (e instanceof Throwable) {
                    if (th != e) {
                        ArrayList<Throwable> d = m94004d();
                        d.add(e);
                        d.add(th);
                        m94006l(d);
                    }
                } else if (e instanceof ArrayList) {
                    ((ArrayList) e).add(th);
                } else {
                    throw new IllegalStateException(C13706o.m87936m("State is ", e).toString());
                }
            }
        }

        /* renamed from: b */
        public boolean mo74521b() {
            return mo74632f() == null;
        }

        /* renamed from: c */
        public C15427i2 mo74522c() {
            return this.f64467a;
        }

        /* renamed from: f */
        public final Throwable mo74632f() {
            return (Throwable) this._rootCause;
        }

        /* renamed from: g */
        public final boolean mo74633g() {
            return mo74632f() != null;
        }

        /* JADX WARNING: type inference failed for: r0v0, types: [int, boolean] */
        /* renamed from: h */
        public final boolean mo74634h() {
            return this._isCompleting;
        }

        /* renamed from: i */
        public final boolean mo74635i() {
            return m94005e() == C15262e2.f64478e;
        }

        /* renamed from: j */
        public final List<Throwable> mo74636j(Throwable th) {
            ArrayList<Throwable> arrayList;
            Object e = m94005e();
            if (e == null) {
                arrayList = m94004d();
            } else if (e instanceof Throwable) {
                ArrayList<Throwable> d = m94004d();
                d.add(e);
                arrayList = d;
            } else if (e instanceof ArrayList) {
                arrayList = (ArrayList) e;
            } else {
                throw new IllegalStateException(C13706o.m87936m("State is ", e).toString());
            }
            Throwable f = mo74632f();
            if (f != null) {
                arrayList.add(0, f);
            }
            if (th != null && !C13706o.m87924a(th, f)) {
                arrayList.add(th);
            }
            m94006l(C15262e2.f64478e);
            return arrayList;
        }

        /* renamed from: k */
        public final void mo74637k(boolean z) {
            this._isCompleting = z ? 1 : 0;
        }

        /* renamed from: m */
        public final void mo74638m(Throwable th) {
            this._rootCause = th;
        }

        public String toString() {
            return "Finishing[cancelling=" + mo74633g() + ", completing=" + mo74634h() + ", rootCause=" + mo74632f() + ", exceptions=" + m94005e() + ", list=" + mo74522c() + ']';
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¨\u0006\u0007"}, mo71668d2 = {"kotlinx/coroutines/d2$d", "Lkotlinx/coroutines/internal/o$a;", "Lkotlinx/coroutines/internal/o;", "Lkotlinx/coroutines/internal/Node;", "affected", "", "i", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
    /* renamed from: kotlinx.coroutines.d2$d */
    /* compiled from: LockFreeLinkedList.kt */
    public static final class C15256d extends C15455o.C15456a {

        /* renamed from: d */
        final /* synthetic */ C15455o f64468d;

        /* renamed from: e */
        final /* synthetic */ C15252d2 f64469e;

        /* renamed from: f */
        final /* synthetic */ Object f64470f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15256d(C15455o oVar, C15252d2 d2Var, Object obj) {
            super(oVar);
            this.f64468d = oVar;
            this.f64469e = d2Var;
            this.f64470f = obj;
        }

        /* renamed from: i */
        public Object mo74551g(C15455o oVar) {
            if (this.f64469e.mo74608a0() == this.f64470f) {
                return null;
            }
            return C15454n.m94421a();
        }
    }

    public C15252d2(boolean z) {
        this._state = z ? C15262e2.f64480g : C15262e2.f64479f;
        this._parentHandle = null;
    }

    /* renamed from: B0 */
    private final boolean m93934B0(C15511r1 r1Var, Object obj) {
        if (!C0320a.m383a(f64461a, this, r1Var, C15262e2.m94030g(obj))) {
            return false;
        }
        mo74618p0((Throwable) null);
        mo74490q0(obj);
        m93945P(r1Var, obj);
        return true;
    }

    /* renamed from: C0 */
    private final boolean m93936C0(C15511r1 r1Var, Throwable th) {
        C15427i2 Y = m93952Y(r1Var);
        if (Y == null) {
            return false;
        }
        if (!C0320a.m383a(f64461a, this, r1Var, new C15255c(Y, false, th))) {
            return false;
        }
        m93958n0(Y, th);
        return true;
    }

    /* renamed from: D */
    private final boolean m93937D(Object obj, C15427i2 i2Var, C15203c2 c2Var) {
        int C;
        C15256d dVar = new C15256d(c2Var, this, obj);
        do {
            C = i2Var.mo74804u().mo74798C(c2Var, i2Var, dVar);
            if (C == 1) {
                return true;
            }
        } while (C != 2);
        return false;
    }

    /* renamed from: D0 */
    private final Object m93938D0(Object obj, Object obj2) {
        if (!(obj instanceof C15511r1)) {
            return C15262e2.f64474a;
        }
        if ((!(obj instanceof C15266f1) && !(obj instanceof C15203c2)) || (obj instanceof C15551u) || (obj2 instanceof C15196b0)) {
            return m93940E0((C15511r1) obj, obj2);
        }
        if (m93934B0((C15511r1) obj, obj2)) {
            return obj2;
        }
        return C15262e2.f64476c;
    }

    /* renamed from: E */
    private final void m93939E(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            for (Throwable th2 : list) {
                if (th2 != th && th2 != th && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                    C13315b.m85661a(th, th2);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x005e, code lost:
        if (r2 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0061, code lost:
        m93958n0(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0064, code lost:
        r7 = m93949T(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0068, code lost:
        if (r7 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x006e, code lost:
        if (m93941F0(r1, r7, r8) == false) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0072, code lost:
        return kotlinx.coroutines.C15262e2.f64475b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0077, code lost:
        return m93948S(r1, r8);
     */
    /* renamed from: E0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m93940E0(kotlinx.coroutines.C15511r1 r7, java.lang.Object r8) {
        /*
            r6 = this;
            kotlinx.coroutines.i2 r0 = r6.m93952Y(r7)
            if (r0 != 0) goto L_0x000b
            kotlinx.coroutines.internal.a0 r7 = kotlinx.coroutines.C15262e2.f64476c
            return r7
        L_0x000b:
            boolean r1 = r7 instanceof kotlinx.coroutines.C15252d2.C15255c
            r2 = 0
            if (r1 == 0) goto L_0x0014
            r1 = r7
            kotlinx.coroutines.d2$c r1 = (kotlinx.coroutines.C15252d2.C15255c) r1
            goto L_0x0015
        L_0x0014:
            r1 = r2
        L_0x0015:
            if (r1 != 0) goto L_0x001d
            kotlinx.coroutines.d2$c r1 = new kotlinx.coroutines.d2$c
            r3 = 0
            r1.<init>(r0, r3, r2)
        L_0x001d:
            monitor-enter(r1)
            boolean r3 = r1.mo74634h()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x002a
            kotlinx.coroutines.internal.a0 r7 = kotlinx.coroutines.C15262e2.f64474a     // Catch:{ all -> 0x0078 }
            monitor-exit(r1)
            return r7
        L_0x002a:
            r3 = 1
            r1.mo74637k(r3)     // Catch:{ all -> 0x0078 }
            if (r1 == r7) goto L_0x003e
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = f64461a     // Catch:{ all -> 0x0078 }
            boolean r4 = androidx.concurrent.futures.C0320a.m383a(r4, r6, r7, r1)     // Catch:{ all -> 0x0078 }
            if (r4 != 0) goto L_0x003e
            kotlinx.coroutines.internal.a0 r7 = kotlinx.coroutines.C15262e2.f64476c     // Catch:{ all -> 0x0078 }
            monitor-exit(r1)
            return r7
        L_0x003e:
            boolean r4 = r1.mo74633g()     // Catch:{ all -> 0x0078 }
            boolean r5 = r8 instanceof kotlinx.coroutines.C15196b0     // Catch:{ all -> 0x0078 }
            if (r5 == 0) goto L_0x004a
            r5 = r8
            kotlinx.coroutines.b0 r5 = (kotlinx.coroutines.C15196b0) r5     // Catch:{ all -> 0x0078 }
            goto L_0x004b
        L_0x004a:
            r5 = r2
        L_0x004b:
            if (r5 != 0) goto L_0x004e
            goto L_0x0053
        L_0x004e:
            java.lang.Throwable r5 = r5.f64404a     // Catch:{ all -> 0x0078 }
            r1.mo74631a(r5)     // Catch:{ all -> 0x0078 }
        L_0x0053:
            java.lang.Throwable r5 = r1.mo74632f()     // Catch:{ all -> 0x0078 }
            r3 = r3 ^ r4
            if (r3 == 0) goto L_0x005b
            r2 = r5
        L_0x005b:
            ja.u r3 = p297ja.C13339u.f61331a     // Catch:{ all -> 0x0078 }
            monitor-exit(r1)
            if (r2 != 0) goto L_0x0061
            goto L_0x0064
        L_0x0061:
            r6.m93958n0(r0, r2)
        L_0x0064:
            kotlinx.coroutines.u r7 = r6.m93949T(r7)
            if (r7 == 0) goto L_0x0073
            boolean r7 = r6.m93941F0(r1, r7, r8)
            if (r7 == 0) goto L_0x0073
            kotlinx.coroutines.internal.a0 r7 = kotlinx.coroutines.C15262e2.f64475b
            return r7
        L_0x0073:
            java.lang.Object r7 = r6.m93948S(r1, r8)
            return r7
        L_0x0078:
            r7 = move-exception
            monitor-exit(r1)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C15252d2.m93940E0(kotlinx.coroutines.r1, java.lang.Object):java.lang.Object");
    }

    /* renamed from: F0 */
    private final boolean m93941F0(C15255c cVar, C15551u uVar, Object obj) {
        while (C15561w1.C15562a.m94726d(uVar.f64801g, false, false, new C15254b(this, cVar, uVar, obj), 1, (Object) null) == C15476j2.f64699a) {
            uVar = m93957m0(uVar);
            if (uVar == null) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: H */
    private final Object m93942H(C13635d<Object> dVar) {
        C15253a aVar = new C15253a(C13649c.m87831b(dVar), this);
        aVar.mo74864z();
        C15505q.m94587a(aVar, mo74617p(new C15496n2(aVar)));
        Object w = aVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w;
    }

    /* renamed from: L */
    private final Object m93943L(Object obj) {
        Object D0;
        do {
            Object a0 = mo74608a0();
            if (!(a0 instanceof C15511r1) || ((a0 instanceof C15255c) && ((C15255c) a0).mo74634h())) {
                return C15262e2.f64474a;
            }
            D0 = m93938D0(a0, new C15196b0(m93947R(obj), false, 2, (C13695i) null));
        } while (D0 == C15262e2.f64476c);
        return D0;
    }

    /* renamed from: M */
    private final boolean m93944M(Throwable th) {
        if (mo74611e0()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        C15545t Z = mo74607Z();
        if (Z == null || Z == C15476j2.f64699a) {
            return z;
        }
        if (Z.mo74833d(th) || z) {
            return true;
        }
        return false;
    }

    /* renamed from: P */
    private final void m93945P(C15511r1 r1Var, Object obj) {
        C15545t Z = mo74607Z();
        if (Z != null) {
            Z.dispose();
            mo74624v0(C15476j2.f64699a);
        }
        Throwable th = null;
        C15196b0 b0Var = obj instanceof C15196b0 ? (C15196b0) obj : null;
        if (b0Var != null) {
            th = b0Var.f64404a;
        }
        if (r1Var instanceof C15203c2) {
            try {
                ((C15203c2) r1Var).mo74596D(th);
            } catch (Throwable th2) {
                mo74488c0(new CompletionHandlerException("Exception in completion handler " + r1Var + " for " + this, th2));
            }
        } else {
            C15427i2 c = r1Var.mo74522c();
            if (c != null) {
                m93959o0(c, th);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: Q */
    public final void m93946Q(C15255c cVar, C15551u uVar, Object obj) {
        C15551u m0 = m93957m0(uVar);
        if (m0 == null || !m93941F0(cVar, m0, obj)) {
            mo74600F(m93948S(cVar, obj));
        }
    }

    /* renamed from: R */
    private final Throwable m93947R(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th = (Throwable) obj;
            if (th == null) {
                return new JobCancellationException(mo74486N(), (Throwable) null, this);
            }
            return th;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((C15484l2) obj).mo74623v();
    }

    /* renamed from: S */
    private final Object m93948S(C15255c cVar, Object obj) {
        boolean g;
        Throwable V;
        C15196b0 b0Var = obj instanceof C15196b0 ? (C15196b0) obj : null;
        Throwable th = b0Var == null ? null : b0Var.f64404a;
        synchronized (cVar) {
            g = cVar.mo74633g();
            List<Throwable> j = cVar.mo74636j(th);
            V = m93951V(cVar, j);
            if (V != null) {
                m93939E(V, j);
            }
        }
        boolean z = false;
        if (!(V == null || V == th)) {
            obj = new C15196b0(V, false, 2, (C13695i) null);
        }
        if (V != null) {
            if (m93944M(V) || mo74609b0(V)) {
                z = true;
            }
            if (z) {
                Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
                ((C15196b0) obj).mo74511b();
            }
        }
        if (!g) {
            mo74618p0(V);
        }
        mo74490q0(obj);
        C0320a.m383a(f64461a, this, cVar, C15262e2.m94030g(obj));
        m93945P(cVar, obj);
        return obj;
    }

    /* renamed from: T */
    private final C15551u m93949T(C15511r1 r1Var) {
        C15551u uVar = r1Var instanceof C15551u ? (C15551u) r1Var : null;
        if (uVar != null) {
            return uVar;
        }
        C15427i2 c = r1Var.mo74522c();
        if (c == null) {
            return null;
        }
        return m93957m0(c);
    }

    /* renamed from: U */
    private final Throwable m93950U(Object obj) {
        C15196b0 b0Var = obj instanceof C15196b0 ? (C15196b0) obj : null;
        if (b0Var == null) {
            return null;
        }
        return b0Var.f64404a;
    }

    /* renamed from: V */
    private final Throwable m93951V(C15255c cVar, List<? extends Throwable> list) {
        T t;
        boolean z;
        T t2 = null;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    t = null;
                    break;
                }
                t = it.next();
                if (!(((Throwable) t) instanceof CancellationException)) {
                    break;
                }
            }
            Throwable th = (Throwable) t;
            if (th != null) {
                return th;
            }
            Throwable th2 = (Throwable) list.get(0);
            if (th2 instanceof TimeoutCancellationException) {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    T next = it2.next();
                    Throwable th3 = (Throwable) next;
                    if (th3 == th2 || !(th3 instanceof TimeoutCancellationException)) {
                        z = false;
                        continue;
                    } else {
                        z = true;
                        continue;
                    }
                    if (z) {
                        t2 = next;
                        break;
                    }
                }
                Throwable th4 = (Throwable) t2;
                if (th4 != null) {
                    return th4;
                }
            }
            return th2;
        } else if (cVar.mo74633g()) {
            return new JobCancellationException(mo74486N(), (Throwable) null, this);
        } else {
            return null;
        }
    }

    /* renamed from: Y */
    private final C15427i2 m93952Y(C15511r1 r1Var) {
        C15427i2 c = r1Var.mo74522c();
        if (c != null) {
            return c;
        }
        if (r1Var instanceof C15266f1) {
            return new C15427i2();
        }
        if (r1Var instanceof C15203c2) {
            m93962t0((C15203c2) r1Var);
            return null;
        }
        throw new IllegalStateException(C13706o.m87936m("State should have list: ", r1Var).toString());
    }

    /* renamed from: f0 */
    private final boolean m93953f0() {
        Object a0;
        do {
            a0 = mo74608a0();
            if (!(a0 instanceof C15511r1)) {
                return false;
            }
        } while (m93963w0(a0) < 0);
        return true;
    }

    /* renamed from: g0 */
    private final Object m93954g0(C13635d<? super C13339u> dVar) {
        C15497o oVar = new C15497o(C13649c.m87831b(dVar), 1);
        oVar.mo74864z();
        C15505q.m94587a(oVar, mo74617p(new C15500o2(oVar)));
        Object w = oVar.mo74862w();
        if (w == C13652d.m87832c()) {
            C13660h.m87847c(dVar);
        }
        return w == C13652d.m87832c() ? w : C13339u.f61331a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003e, code lost:
        if (r0 != null) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        m93958n0(((kotlinx.coroutines.C15252d2.C15255c) r2).mo74522c(), r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004e, code lost:
        return kotlinx.coroutines.C15262e2.m94024a();
     */
    /* renamed from: h0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.Object m93955h0(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 0
            r1 = r0
        L_0x0002:
            java.lang.Object r2 = r6.mo74608a0()
            boolean r3 = r2 instanceof kotlinx.coroutines.C15252d2.C15255c
            if (r3 == 0) goto L_0x0052
            monitor-enter(r2)
            r3 = r2
            kotlinx.coroutines.d2$c r3 = (kotlinx.coroutines.C15252d2.C15255c) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.mo74635i()     // Catch:{ all -> 0x004f }
            if (r3 == 0) goto L_0x001a
            kotlinx.coroutines.internal.a0 r7 = kotlinx.coroutines.C15262e2.f64477d     // Catch:{ all -> 0x004f }
            monitor-exit(r2)
            return r7
        L_0x001a:
            r3 = r2
            kotlinx.coroutines.d2$c r3 = (kotlinx.coroutines.C15252d2.C15255c) r3     // Catch:{ all -> 0x004f }
            boolean r3 = r3.mo74633g()     // Catch:{ all -> 0x004f }
            if (r7 != 0) goto L_0x0025
            if (r3 != 0) goto L_0x0031
        L_0x0025:
            if (r1 != 0) goto L_0x002b
            java.lang.Throwable r1 = r6.m93947R(r7)     // Catch:{ all -> 0x004f }
        L_0x002b:
            r7 = r2
            kotlinx.coroutines.d2$c r7 = (kotlinx.coroutines.C15252d2.C15255c) r7     // Catch:{ all -> 0x004f }
            r7.mo74631a(r1)     // Catch:{ all -> 0x004f }
        L_0x0031:
            r7 = r2
            kotlinx.coroutines.d2$c r7 = (kotlinx.coroutines.C15252d2.C15255c) r7     // Catch:{ all -> 0x004f }
            java.lang.Throwable r7 = r7.mo74632f()     // Catch:{ all -> 0x004f }
            r1 = r3 ^ 1
            if (r1 == 0) goto L_0x003d
            r0 = r7
        L_0x003d:
            monitor-exit(r2)
            if (r0 != 0) goto L_0x0041
            goto L_0x004a
        L_0x0041:
            kotlinx.coroutines.d2$c r2 = (kotlinx.coroutines.C15252d2.C15255c) r2
            kotlinx.coroutines.i2 r7 = r2.mo74522c()
            r6.m93958n0(r7, r0)
        L_0x004a:
            kotlinx.coroutines.internal.a0 r7 = kotlinx.coroutines.C15262e2.f64474a
            return r7
        L_0x004f:
            r7 = move-exception
            monitor-exit(r2)
            throw r7
        L_0x0052:
            boolean r3 = r2 instanceof kotlinx.coroutines.C15511r1
            if (r3 == 0) goto L_0x009a
            if (r1 != 0) goto L_0x005c
            java.lang.Throwable r1 = r6.m93947R(r7)
        L_0x005c:
            r3 = r2
            kotlinx.coroutines.r1 r3 = (kotlinx.coroutines.C15511r1) r3
            boolean r4 = r3.mo74521b()
            if (r4 == 0) goto L_0x0070
            boolean r2 = r6.m93936C0(r3, r1)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.internal.a0 r7 = kotlinx.coroutines.C15262e2.f64474a
            return r7
        L_0x0070:
            kotlinx.coroutines.b0 r3 = new kotlinx.coroutines.b0
            r4 = 0
            r5 = 2
            r3.<init>(r1, r4, r5, r0)
            java.lang.Object r3 = r6.m93938D0(r2, r3)
            kotlinx.coroutines.internal.a0 r4 = kotlinx.coroutines.C15262e2.f64474a
            if (r3 == r4) goto L_0x008a
            kotlinx.coroutines.internal.a0 r2 = kotlinx.coroutines.C15262e2.f64476c
            if (r3 != r2) goto L_0x0089
            goto L_0x0002
        L_0x0089:
            return r3
        L_0x008a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot happen in "
            java.lang.String r0 = kotlin.jvm.internal.C13706o.m87936m(r0, r2)
            java.lang.String r0 = r0.toString()
            r7.<init>(r0)
            throw r7
        L_0x009a:
            kotlinx.coroutines.internal.a0 r7 = kotlinx.coroutines.C15262e2.f64477d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C15252d2.m93955h0(java.lang.Object):java.lang.Object");
    }

    /* renamed from: k0 */
    private final C15203c2 m93956k0(C16265l<? super Throwable, C13339u> lVar, boolean z) {
        C15203c2 c2Var = null;
        if (z) {
            if (lVar instanceof C15567x1) {
                c2Var = (C15567x1) lVar;
            }
            if (c2Var == null) {
                c2Var = new C15553u1(lVar);
            }
        } else {
            C15203c2 c2Var2 = lVar instanceof C15203c2 ? (C15203c2) lVar : null;
            if (c2Var2 != null) {
                c2Var = c2Var2;
            }
            if (c2Var == null) {
                c2Var = new C15557v1(lVar);
            }
        }
        c2Var.mo74520F(this);
        return c2Var;
    }

    /* renamed from: m0 */
    private final C15551u m93957m0(C15455o oVar) {
        while (oVar.mo74796x()) {
            oVar = oVar.mo74804u();
        }
        while (true) {
            oVar = oVar.mo74803t();
            if (!oVar.mo74796x()) {
                if (oVar instanceof C15551u) {
                    return (C15551u) oVar;
                }
                if (oVar instanceof C15427i2) {
                    return null;
                }
            }
        }
    }

    /* renamed from: n0 */
    private final void m93958n0(C15427i2 i2Var, Throwable th) {
        CompletionHandlerException completionHandlerException;
        mo74618p0(th);
        CompletionHandlerException completionHandlerException2 = null;
        for (C15455o oVar = (C15455o) i2Var.mo74802s(); !C13706o.m87924a(oVar, i2Var); oVar = oVar.mo74803t()) {
            if (oVar instanceof C15567x1) {
                C15203c2 c2Var = (C15203c2) oVar;
                try {
                    c2Var.mo74596D(th);
                } catch (Throwable th2) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        C13315b.m85661a(completionHandlerException2, th2);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + c2Var + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException2 != null) {
            mo74488c0(completionHandlerException2);
        }
        m93944M(th);
    }

    /* renamed from: o0 */
    private final void m93959o0(C15427i2 i2Var, Throwable th) {
        CompletionHandlerException completionHandlerException;
        CompletionHandlerException completionHandlerException2 = null;
        for (C15455o oVar = (C15455o) i2Var.mo74802s(); !C13706o.m87924a(oVar, i2Var); oVar = oVar.mo74803t()) {
            if (oVar instanceof C15203c2) {
                C15203c2 c2Var = (C15203c2) oVar;
                try {
                    c2Var.mo74596D(th);
                } catch (Throwable th2) {
                    if (completionHandlerException2 == null) {
                        completionHandlerException = null;
                    } else {
                        C13315b.m85661a(completionHandlerException2, th2);
                        completionHandlerException = completionHandlerException2;
                    }
                    if (completionHandlerException == null) {
                        completionHandlerException2 = new CompletionHandlerException("Exception in completion handler " + c2Var + " for " + this, th2);
                    }
                }
            }
        }
        if (completionHandlerException2 != null) {
            mo74488c0(completionHandlerException2);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [kotlinx.coroutines.q1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m93961s0(kotlinx.coroutines.C15266f1 r3) {
        /*
            r2 = this;
            kotlinx.coroutines.i2 r0 = new kotlinx.coroutines.i2
            r0.<init>()
            boolean r1 = r3.mo74521b()
            if (r1 == 0) goto L_0x000c
            goto L_0x0012
        L_0x000c:
            kotlinx.coroutines.q1 r1 = new kotlinx.coroutines.q1
            r1.<init>(r0)
            r0 = r1
        L_0x0012:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f64461a
            androidx.concurrent.futures.C0320a.m383a(r1, r2, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C15252d2.m93961s0(kotlinx.coroutines.f1):void");
    }

    /* renamed from: t0 */
    private final void m93962t0(C15203c2 c2Var) {
        c2Var.mo74801o(new C15427i2());
        C0320a.m383a(f64461a, this, c2Var, c2Var.mo74803t());
    }

    /* renamed from: w0 */
    private final int m93963w0(Object obj) {
        if (obj instanceof C15266f1) {
            if (((C15266f1) obj).mo74521b()) {
                return 0;
            }
            if (!C0320a.m383a(f64461a, this, obj, C15262e2.f64480g)) {
                return -1;
            }
            mo74619r0();
            return 1;
        } else if (!(obj instanceof C15507q1)) {
            return 0;
        } else {
            if (!C0320a.m383a(f64461a, this, obj, ((C15507q1) obj).mo74522c())) {
                return -1;
            }
            mo74619r0();
            return 1;
        }
    }

    /* renamed from: x0 */
    private final String m93964x0(Object obj) {
        if (obj instanceof C15255c) {
            C15255c cVar = (C15255c) obj;
            if (cVar.mo74633g()) {
                return "Cancelling";
            }
            if (cVar.mo74634h()) {
                return "Completing";
            }
            return "Active";
        } else if (!(obj instanceof C15511r1)) {
            return obj instanceof C15196b0 ? "Cancelled" : "Completed";
        } else {
            if (((C15511r1) obj).mo74521b()) {
                return "Active";
            }
            return "New";
        }
    }

    /* renamed from: z0 */
    public static /* synthetic */ CancellationException m93965z0(C15252d2 d2Var, Throwable th, String str, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                str = null;
            }
            return d2Var.mo74628y0(th, str);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
    }

    /* renamed from: A */
    public final C15545t mo74598A(C15555v vVar) {
        return (C15545t) C15561w1.C15562a.m94726d(this, true, false, new C15551u(vVar), 2, (Object) null);
    }

    /* renamed from: A0 */
    public final String mo74599A0() {
        return mo74489l0() + '{' + m93964x0(mo74608a0()) + '}';
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo74600F(Object obj) {
    }

    /* renamed from: G */
    public final Object mo74601G(C13635d<Object> dVar) {
        Object a0;
        do {
            a0 = mo74608a0();
            if (!(a0 instanceof C15511r1)) {
                if (!(a0 instanceof C15196b0)) {
                    return C15262e2.m94031h(a0);
                }
                throw ((C15196b0) a0).f64404a;
            }
        } while (m93963w0(a0) < 0);
        return m93942H(dVar);
    }

    /* renamed from: I */
    public final boolean mo74602I(Throwable th) {
        return mo74603J(th);
    }

    /* renamed from: J */
    public final boolean mo74603J(Object obj) {
        Object a = C15262e2.f64474a;
        if (mo74606X() && (a = m93943L(obj)) == C15262e2.f64475b) {
            return true;
        }
        if (a == C15262e2.f64474a) {
            a = m93955h0(obj);
        }
        if (a == C15262e2.f64474a || a == C15262e2.f64475b) {
            return true;
        }
        if (a == C15262e2.f64477d) {
            return false;
        }
        mo74600F(a);
        return true;
    }

    /* renamed from: K */
    public void mo74571K(Throwable th) {
        mo74603J(th);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public String mo74486N() {
        return "Job was cancelled";
    }

    /* renamed from: O */
    public boolean mo74604O(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        if (!mo74603J(th) || !mo74605W()) {
            return false;
        }
        return true;
    }

    /* renamed from: W */
    public boolean mo74605W() {
        return true;
    }

    /* renamed from: X */
    public boolean mo74606X() {
        return false;
    }

    /* renamed from: Z */
    public final C15545t mo74607Z() {
        return (C15545t) this._parentHandle;
    }

    /* renamed from: a0 */
    public final Object mo74608a0() {
        while (true) {
            Object obj = this._state;
            if (!(obj instanceof C15468v)) {
                return obj;
            }
            ((C15468v) obj).mo74756c(this);
        }
    }

    /* renamed from: b */
    public boolean mo74487b() {
        Object a0 = mo74608a0();
        return (a0 instanceof C15511r1) && ((C15511r1) a0).mo74521b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b0 */
    public boolean mo74609b0(Throwable th) {
        return false;
    }

    /* renamed from: c */
    public void mo74534c(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(mo74486N(), (Throwable) null, this);
        }
        mo74571K(cancellationException);
    }

    /* renamed from: c0 */
    public void mo74488c0(Throwable th) {
        throw th;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d0 */
    public final void mo74610d0(C15561w1 w1Var) {
        if (w1Var == null) {
            mo74624v0(C15476j2.f64699a);
            return;
        }
        w1Var.start();
        C15545t A = w1Var.mo74598A(this);
        mo74624v0(A);
        if (mo74625w()) {
            A.dispose();
            mo74624v0(C15476j2.f64699a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public boolean mo74611e0() {
        return false;
    }

    public <R> R fold(R r, C16269p<? super R, ? super C13640g.C13643b, ? extends R> pVar) {
        return C15561w1.C15562a.m94724b(this, r, pVar);
    }

    /* renamed from: g */
    public final CancellationException mo74612g() {
        Object a0 = mo74608a0();
        CancellationException cancellationException = null;
        if (a0 instanceof C15255c) {
            Throwable f = ((C15255c) a0).mo74632f();
            if (f != null) {
                cancellationException = mo74628y0(f, C13706o.m87936m(C15498o0.m94571a(this), " is cancelling"));
            }
            if (cancellationException != null) {
                return cancellationException;
            }
            throw new IllegalStateException(C13706o.m87936m("Job is still new or active: ", this).toString());
        } else if (a0 instanceof C15511r1) {
            throw new IllegalStateException(C13706o.m87936m("Job is still new or active: ", this).toString());
        } else if (a0 instanceof C15196b0) {
            return m93965z0(this, ((C15196b0) a0).f64404a, (String) null, 1, (Object) null);
        } else {
            return new JobCancellationException(C13706o.m87936m(C15498o0.m94571a(this), " has completed normally"), (Throwable) null, this);
        }
    }

    public <E extends C13640g.C13643b> E get(C13640g.C13645c<E> cVar) {
        return C15561w1.C15562a.m94725c(this, cVar);
    }

    public final C13640g.C13645c<?> getKey() {
        return C15561w1.f64808x;
    }

    /* renamed from: i */
    public final void mo74613i(C15484l2 l2Var) {
        mo74603J(l2Var);
    }

    /* renamed from: i0 */
    public final boolean mo74614i0(Object obj) {
        Object D0;
        do {
            D0 = m93938D0(mo74608a0(), obj);
            if (D0 == C15262e2.f64474a) {
                return false;
            }
            if (D0 == C15262e2.f64475b) {
                return true;
            }
        } while (D0 == C15262e2.f64476c);
        mo74600F(D0);
        return true;
    }

    public final boolean isCancelled() {
        Object a0 = mo74608a0();
        return (a0 instanceof C15196b0) || ((a0 instanceof C15255c) && ((C15255c) a0).mo74633g());
    }

    /* renamed from: j0 */
    public final Object mo74616j0(Object obj) {
        Object D0;
        do {
            D0 = m93938D0(mo74608a0(), obj);
            if (D0 == C15262e2.f64474a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, m93950U(obj));
            }
        } while (D0 == C15262e2.f64476c);
        return D0;
    }

    /* renamed from: l0 */
    public String mo74489l0() {
        return C15498o0.m94571a(this);
    }

    public C13640g minusKey(C13640g.C13645c<?> cVar) {
        return C15561w1.C15562a.m94727e(this, cVar);
    }

    /* renamed from: p */
    public final C15202c1 mo74617p(C16265l<? super Throwable, C13339u> lVar) {
        return mo74627y(false, true, lVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p0 */
    public void mo74618p0(Throwable th) {
    }

    public C13640g plus(C13640g gVar) {
        return C15561w1.C15562a.m94728f(this, gVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q0 */
    public void mo74490q0(Object obj) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: r0 */
    public void mo74619r0() {
    }

    public final boolean start() {
        int w0;
        do {
            w0 = m93963w0(mo74608a0());
            if (w0 == 0) {
                return false;
            }
        } while (w0 != 1);
        return true;
    }

    public String toString() {
        return mo74599A0() + '@' + C15498o0.m94572b(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: u0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo74622u0(kotlinx.coroutines.C15203c2 r4) {
        /*
            r3 = this;
        L_0x0000:
            java.lang.Object r0 = r3.mo74608a0()
            boolean r1 = r0 instanceof kotlinx.coroutines.C15203c2
            if (r1 == 0) goto L_0x0018
            if (r0 == r4) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f64461a
            kotlinx.coroutines.f1 r2 = kotlinx.coroutines.C15262e2.f64480g
            boolean r0 = androidx.concurrent.futures.C0320a.m383a(r1, r3, r0, r2)
            if (r0 == 0) goto L_0x0000
            return
        L_0x0018:
            boolean r1 = r0 instanceof kotlinx.coroutines.C15511r1
            if (r1 == 0) goto L_0x0027
            kotlinx.coroutines.r1 r0 = (kotlinx.coroutines.C15511r1) r0
            kotlinx.coroutines.i2 r0 = r0.mo74522c()
            if (r0 == 0) goto L_0x0027
            r4.mo74594y()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C15252d2.mo74622u0(kotlinx.coroutines.c2):void");
    }

    /* renamed from: v */
    public CancellationException mo74623v() {
        Throwable th;
        Object a0 = mo74608a0();
        CancellationException cancellationException = null;
        if (a0 instanceof C15255c) {
            th = ((C15255c) a0).mo74632f();
        } else if (a0 instanceof C15196b0) {
            th = ((C15196b0) a0).f64404a;
        } else if (!(a0 instanceof C15511r1)) {
            th = null;
        } else {
            throw new IllegalStateException(C13706o.m87936m("Cannot be cancelling child in this state: ", a0).toString());
        }
        if (th instanceof CancellationException) {
            cancellationException = (CancellationException) th;
        }
        return cancellationException == null ? new JobCancellationException(C13706o.m87936m("Parent job is ", m93964x0(a0)), th, this) : cancellationException;
    }

    /* renamed from: v0 */
    public final void mo74624v0(C15545t tVar) {
        this._parentHandle = tVar;
    }

    /* renamed from: w */
    public final boolean mo74625w() {
        return !(mo74608a0() instanceof C15511r1);
    }

    /* renamed from: x */
    public final Object mo74626x(C13635d<? super C13339u> dVar) {
        if (!m93953f0()) {
            C15575z1.m94759g(dVar.getContext());
            return C13339u.f61331a;
        }
        Object g0 = m93954g0(dVar);
        return g0 == C13652d.m87832c() ? g0 : C13339u.f61331a;
    }

    /* renamed from: y */
    public final C15202c1 mo74627y(boolean z, boolean z2, C16265l<? super Throwable, C13339u> lVar) {
        C15203c2 k0 = m93956k0(lVar, z);
        while (true) {
            Object a0 = mo74608a0();
            if (a0 instanceof C15266f1) {
                C15266f1 f1Var = (C15266f1) a0;
                if (!f1Var.mo74521b()) {
                    m93961s0(f1Var);
                } else if (C0320a.m383a(f64461a, this, a0, k0)) {
                    return k0;
                }
            } else {
                Throwable th = null;
                if (a0 instanceof C15511r1) {
                    C15427i2 c = ((C15511r1) a0).mo74522c();
                    if (c == null) {
                        Objects.requireNonNull(a0, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                        m93962t0((C15203c2) a0);
                    } else {
                        C15202c1 c1Var = C15476j2.f64699a;
                        if (z && (a0 instanceof C15255c)) {
                            synchronized (a0) {
                                th = ((C15255c) a0).mo74632f();
                                if (th == null || ((lVar instanceof C15551u) && !((C15255c) a0).mo74634h())) {
                                    if (m93937D(a0, c, k0)) {
                                        if (th == null) {
                                            return k0;
                                        }
                                        c1Var = k0;
                                    }
                                }
                                C13339u uVar = C13339u.f61331a;
                            }
                        }
                        if (th != null) {
                            if (z2) {
                                lVar.invoke(th);
                            }
                            return c1Var;
                        } else if (m93937D(a0, c, k0)) {
                            return k0;
                        }
                    }
                } else {
                    if (z2) {
                        C15196b0 b0Var = a0 instanceof C15196b0 ? (C15196b0) a0 : null;
                        if (b0Var != null) {
                            th = b0Var.f64404a;
                        }
                        lVar.invoke(th);
                    }
                    return C15476j2.f64699a;
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public final CancellationException mo74628y0(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException == null) {
            if (str == null) {
                str = mo74486N();
            }
            cancellationException = new JobCancellationException(str, th, this);
        }
        return cancellationException;
    }
}
