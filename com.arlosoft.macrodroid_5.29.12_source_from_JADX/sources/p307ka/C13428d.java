package p307ka;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.io.NotSerializableException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C13603n0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p379ra.C16368a;
import p379ra.C16372e;
import p424wa.C16788e;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0000\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u000f\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006mnopqrBG\b\u0002\u0012\f\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u000e\u0010c\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e\u0012\u0006\u0010e\u001a\u00020d\u0012\u0006\u0010f\u001a\u00020d\u0012\u0006\u0010g\u001a\u00020\b\u0012\u0006\u0010h\u001a\u00020\b¢\u0006\u0004\bi\u0010jB\t\b\u0016¢\u0006\u0004\bi\u00109B\u0011\b\u0016\u0012\u0006\u0010k\u001a\u00020\b¢\u0006\u0004\bi\u0010lJ\b\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0002J\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0014\u001a\u00020\nH\u0002J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\bH\u0002J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\bH\u0002J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u001a\u0010\u0013J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\bH\u0002J\u0010\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\bH\u0002J\u0018\u0010\t\u001a\u00020\u00182\u000e\u0010\"\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030!H\u0002J\u001c\u0010%\u001a\u00020\u00182\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002J\"\u0010(\u001a\u00020\u00182\u0018\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#0&H\u0002J\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!J\b\u0010)\u001a\u00020\u0018H\u0016J\u0017\u0010*\u001a\u00020\u00182\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b,\u0010+J\u001a\u0010-\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0002¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b/\u00100J\u001e\u00101\u001a\u00020\n2\u0014\u0010'\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010!H\u0016J\u0019\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0004\b2\u0010.J\b\u00103\u001a\u00020\nH\u0016J\u0013\u00104\u001a\u00020\u00182\b\u0010\"\u001a\u0004\u0018\u00010\u0006H\u0002J\b\u00105\u001a\u00020\bH\u0016J\b\u00107\u001a\u000206H\u0016J\u000f\u00108\u001a\u00020\nH\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b:\u0010\u0013J\u0017\u0010;\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b;\u0010\u0013J#\u0010<\u001a\u00020\u00182\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0000¢\u0006\u0004\b<\u0010=J\u001b\u0010>\u001a\u00020\u00182\n\u0010<\u001a\u0006\u0012\u0002\b\u00030&H\u0000¢\u0006\u0004\b>\u0010?J#\u0010@\u001a\u00020\u00182\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0000¢\u0006\u0004\b@\u0010=J\u0017\u0010B\u001a\u00020\u00182\u0006\u0010A\u001a\u00028\u0001H\u0000¢\u0006\u0004\bB\u0010+J\u001b\u0010D\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010CH\u0000¢\u0006\u0004\bD\u0010EJ\u001b\u0010G\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010FH\u0000¢\u0006\u0004\bG\u0010HJ\u001b\u0010J\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010IH\u0000¢\u0006\u0004\bJ\u0010KR\u0014\u0010\f\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020\b8BX\u0004¢\u0006\u0006\u001a\u0004\bN\u0010MR$\u0010Q\u001a\u00020\b2\u0006\u0010P\u001a\u00020\b8\u0016@RX\u000e¢\u0006\f\n\u0004\bQ\u0010\u0016\u001a\u0004\bR\u0010MR$\u0010S\u001a\u00020\u00182\u0006\u0010P\u001a\u00020\u00188\u0000@BX\u000e¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000W8VX\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00010[8VX\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R&\u0010a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010_0W8VX\u0004¢\u0006\u0006\u001a\u0004\b`\u0010Y¨\u0006s"}, mo71668d2 = {"Lka/d;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "writeReplace", "", "n", "Lja/u;", "q", "capacity", "p", "", "h", "()[Ljava/lang/Object;", "key", "B", "(Ljava/lang/Object;)I", "k", "newHashSize", "I", "i", "", "G", "t", "value", "u", "index", "O", "removedHash", "M", "", "other", "", "entry", "F", "", "from", "E", "isEmpty", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "remove", "clear", "equals", "hashCode", "", "toString", "j", "()V", "g", "N", "m", "(Ljava/util/Map$Entry;)Z", "l", "(Ljava/util/Collection;)Z", "L", "element", "P", "Lka/d$e;", "D", "()Lka/d$e;", "Lka/d$f;", "Q", "()Lka/d$f;", "Lka/d$b;", "r", "()Lka/d$b;", "v", "()I", "x", "hashSize", "<set-?>", "size", "z", "isReadOnly", "Z", "C", "()Z", "", "y", "()Ljava/util/Set;", "keys", "", "A", "()Ljava/util/Collection;", "values", "", "w", "entries", "keysArray", "valuesArray", "", "presenceArray", "hashArray", "maxProbeDistance", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "initialCapacity", "(I)V", "a", "b", "c", "d", "e", "f", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* renamed from: ka.d */
/* compiled from: MapBuilder.kt */
public final class C13428d<K, V> implements Map<K, V>, Serializable, C16372e {

    /* renamed from: a */
    private static final C13429a f61505a = new C13429a((C13695i) null);
    private C13435e<K, V> entriesView;
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;
    /* access modifiers changed from: private */
    public K[] keysArray;
    private C13436f<K> keysView;
    /* access modifiers changed from: private */
    public int length;
    private int maxProbeDistance;
    /* access modifiers changed from: private */
    public int[] presenceArray;
    private int size;
    /* access modifiers changed from: private */
    public V[] valuesArray;
    private C13437g<V> valuesView;

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002R\u0014\u0010\u0007\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00028\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, mo71668d2 = {"Lka/d$a;", "", "", "capacity", "c", "hashSize", "d", "INITIAL_CAPACITY", "I", "INITIAL_MAX_PROBE_DISTANCE", "MAGIC", "TOMBSTONE", "<init>", "()V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: ka.d$a */
    /* compiled from: MapBuilder.kt */
    private static final class C13429a {
        private C13429a() {
        }

        public /* synthetic */ C13429a(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final int m85940c(int i) {
            return Integer.highestOneBit(C16792h.m99540b(i, 1) * 3);
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final int m85941d(int i) {
            return Integer.numberOfLeadingZeros(i) + 1;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006H\u0002J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\f¨\u0006\u0014"}, mo71668d2 = {"Lka/d$b;", "K", "V", "Lka/d$d;", "", "", "Lka/d$c;", "h", "", "j", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "Lja/u;", "i", "Lka/d;", "map", "<init>", "(Lka/d;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: ka.d$b */
    /* compiled from: MapBuilder.kt */
    public static final class C13430b<K, V> extends C13432d<K, V> implements Iterator<Map.Entry<K, V>>, C16368a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13430b(C13428d<K, V> dVar) {
            super(dVar);
            C13706o.m87929f(dVar, "map");
        }

        /* renamed from: h */
        public C13431c<K, V> next() {
            if (mo70955a() < mo70957c().length) {
                int a = mo70955a();
                mo70959e(a + 1);
                mo70960g(a);
                C13431c<K, V> cVar = new C13431c<>(mo70957c(), mo70956b());
                mo70958d();
                return cVar;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: i */
        public final void mo70946i(StringBuilder sb) {
            C13706o.m87929f(sb, "sb");
            if (mo70955a() < mo70957c().length) {
                int a = mo70955a();
                mo70959e(a + 1);
                mo70960g(a);
                Object obj = mo70957c().keysArray[mo70956b()];
                if (C13706o.m87924a(obj, mo70957c())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj);
                }
                sb.append('=');
                Object[] e = mo70957c().valuesArray;
                C13706o.m87926c(e);
                Object obj2 = e[mo70956b()];
                if (C13706o.m87924a(obj2, mo70957c())) {
                    sb.append("(this Map)");
                } else {
                    sb.append(obj2);
                }
                mo70958d();
                return;
            }
            throw new NoSuchElementException();
        }

        /* renamed from: j */
        public final int mo70947j() {
            if (mo70955a() < mo70957c().length) {
                int a = mo70955a();
                mo70959e(a + 1);
                mo70960g(a);
                Object obj = mo70957c().keysArray[mo70956b()];
                int i = 0;
                int hashCode = obj != null ? obj.hashCode() : 0;
                Object[] e = mo70957c().valuesArray;
                C13706o.m87926c(e);
                Object obj2 = e[mo70956b()];
                if (obj2 != null) {
                    i = obj2.hashCode();
                }
                int i2 = hashCode ^ i;
                mo70958d();
                return i2;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0005\u001a\u00028\u00032\u0006\u0010\u0004\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u0014\u0010\u0011\u001a\u00028\u00028VX\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00028\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0019"}, mo71668d2 = {"Lka/d$c;", "K", "V", "", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "", "hashCode", "", "toString", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "Lka/d;", "map", "index", "<init>", "(Lka/d;I)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: ka.d$c */
    /* compiled from: MapBuilder.kt */
    public static final class C13431c<K, V> implements Map.Entry<K, V>, C16372e.C16373a {

        /* renamed from: a */
        private final C13428d<K, V> f61506a;

        /* renamed from: c */
        private final int f61507c;

        public C13431c(C13428d<K, V> dVar, int i) {
            C13706o.m87929f(dVar, "map");
            this.f61506a = dVar;
            this.f61507c = i;
        }

        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return C13706o.m87924a(entry.getKey(), getKey()) && C13706o.m87924a(entry.getValue(), getValue());
            }
        }

        public K getKey() {
            return this.f61506a.keysArray[this.f61507c];
        }

        public V getValue() {
            V[] e = this.f61506a.valuesArray;
            C13706o.m87926c(e);
            return e[this.f61507c];
        }

        public int hashCode() {
            Object key = getKey();
            int i = 0;
            int hashCode = key != null ? key.hashCode() : 0;
            Object value = getValue();
            if (value != null) {
                i = value.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            this.f61506a.mo70931j();
            V[] a = this.f61506a.m85913h();
            int i = this.f61507c;
            V v2 = a[i];
            a[i] = v;
            return v2;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(getKey());
            sb.append('=');
            sb.append(getValue());
            return sb.toString();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\b\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0004R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\n8\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0010\u001a\u00020\u000f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u0016\u001a\u00020\u000f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015¨\u0006\u001b"}, mo71668d2 = {"Lka/d$d;", "K", "V", "", "Lja/u;", "d", "()V", "", "hasNext", "remove", "Lka/d;", "map", "Lka/d;", "c", "()Lka/d;", "", "index", "I", "a", "()I", "e", "(I)V", "lastIndex", "b", "g", "<init>", "(Lka/d;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: ka.d$d */
    /* compiled from: MapBuilder.kt */
    public static class C13432d<K, V> {

        /* renamed from: a */
        private final C13428d<K, V> f61508a;

        /* renamed from: c */
        private int f61509c;

        /* renamed from: d */
        private int f61510d = -1;

        public C13432d(C13428d<K, V> dVar) {
            C13706o.m87929f(dVar, "map");
            this.f61508a = dVar;
            mo70958d();
        }

        /* renamed from: a */
        public final int mo70955a() {
            return this.f61509c;
        }

        /* renamed from: b */
        public final int mo70956b() {
            return this.f61510d;
        }

        /* renamed from: c */
        public final C13428d<K, V> mo70957c() {
            return this.f61508a;
        }

        /* renamed from: d */
        public final void mo70958d() {
            while (this.f61509c < this.f61508a.length) {
                int[] d = this.f61508a.presenceArray;
                int i = this.f61509c;
                if (d[i] < 0) {
                    this.f61509c = i + 1;
                } else {
                    return;
                }
            }
        }

        /* renamed from: e */
        public final void mo70959e(int i) {
            this.f61509c = i;
        }

        /* renamed from: g */
        public final void mo70960g(int i) {
            this.f61510d = i;
        }

        public final boolean hasNext() {
            return this.f61509c < this.f61508a.length;
        }

        public final void remove() {
            if (this.f61510d != -1) {
                this.f61508a.mo70931j();
                this.f61508a.m85906O(this.f61510d);
                this.f61510d = -1;
                return;
            }
            throw new IllegalStateException("Call next() before removing element from the iterator.".toString());
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo71668d2 = {"Lka/d$e;", "K", "V", "Lka/d$d;", "", "next", "()Ljava/lang/Object;", "Lka/d;", "map", "<init>", "(Lka/d;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: ka.d$e */
    /* compiled from: MapBuilder.kt */
    public static final class C13433e<K, V> extends C13432d<K, V> implements Iterator<K>, C16368a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13433e(C13428d<K, V> dVar) {
            super(dVar);
            C13706o.m87929f(dVar, "map");
        }

        public K next() {
            if (mo70955a() < mo70957c().length) {
                int a = mo70955a();
                mo70959e(a + 1);
                mo70960g(a);
                K k = mo70957c().keysArray[mo70956b()];
                mo70958d();
                return k;
            }
            throw new NoSuchElementException();
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00028\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, mo71668d2 = {"Lka/d$f;", "K", "V", "Lka/d$d;", "", "next", "()Ljava/lang/Object;", "Lka/d;", "map", "<init>", "(Lka/d;)V", "kotlin-stdlib"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* renamed from: ka.d$f */
    /* compiled from: MapBuilder.kt */
    public static final class C13434f<K, V> extends C13432d<K, V> implements Iterator<V>, C16368a {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C13434f(C13428d<K, V> dVar) {
            super(dVar);
            C13706o.m87929f(dVar, "map");
        }

        public V next() {
            if (mo70955a() < mo70957c().length) {
                int a = mo70955a();
                mo70959e(a + 1);
                mo70960g(a);
                V[] e = mo70957c().valuesArray;
                C13706o.m87926c(e);
                V v = e[mo70956b()];
                mo70958d();
                return v;
            }
            throw new NoSuchElementException();
        }
    }

    private C13428d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i, int i2) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i;
        this.length = i2;
        this.hashShift = f61505a.m85941d(m85921x());
    }

    /* renamed from: B */
    private final int m85900B(K k) {
        return ((k != null ? k.hashCode() : 0) * -1640531527) >>> this.hashShift;
    }

    /* renamed from: E */
    private final boolean m85901E(Collection<? extends Map.Entry<? extends K, ? extends V>> collection) {
        boolean z = false;
        if (collection.isEmpty()) {
            return false;
        }
        m85917q(collection.size());
        for (Map.Entry F : collection) {
            if (m85902F(F)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: F */
    private final boolean m85902F(Map.Entry<? extends K, ? extends V> entry) {
        int g = mo70926g(entry.getKey());
        Object[] h = m85913h();
        if (g >= 0) {
            h[g] = entry.getValue();
            return true;
        }
        int i = (-g) - 1;
        if (C13706o.m87924a(entry.getValue(), h[i])) {
            return false;
        }
        h[i] = entry.getValue();
        return true;
    }

    /* renamed from: G */
    private final boolean m85903G(int i) {
        int B = m85900B(this.keysArray[i]);
        int i2 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[B] == 0) {
                iArr[B] = i + 1;
                this.presenceArray[i] = B;
                return true;
            }
            i2--;
            if (i2 < 0) {
                return false;
            }
            B = B == 0 ? m85921x() - 1 : B - 1;
        }
    }

    /* renamed from: I */
    private final void m85904I(int i) {
        if (this.length > size()) {
            m85914k();
        }
        int i2 = 0;
        if (i != m85921x()) {
            this.hashArray = new int[i];
            this.hashShift = f61505a.m85941d(i);
        } else {
            C13593l.m87564k(this.hashArray, 0, 0, m85921x());
        }
        while (i2 < this.length) {
            int i3 = i2 + 1;
            if (m85903G(i2)) {
                i2 = i3;
            } else {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
        }
    }

    /* renamed from: M */
    private final void m85905M(int i) {
        int d = C16792h.m99542d(this.maxProbeDistance * 2, m85921x() / 2);
        int i2 = 0;
        int i3 = i;
        do {
            i = i == 0 ? m85921x() - 1 : i - 1;
            i2++;
            if (i2 > this.maxProbeDistance) {
                this.hashArray[i3] = 0;
                return;
            }
            int[] iArr = this.hashArray;
            int i4 = iArr[i];
            if (i4 == 0) {
                iArr[i3] = 0;
                return;
            }
            if (i4 < 0) {
                iArr[i3] = -1;
            } else {
                int i5 = i4 - 1;
                if (((m85900B(this.keysArray[i5]) - i) & (m85921x() - 1)) >= i2) {
                    this.hashArray[i3] = i4;
                    this.presenceArray[i5] = i3;
                }
                d--;
            }
            i3 = i;
            i2 = 0;
            d--;
        } while (d >= 0);
        this.hashArray[i3] = -1;
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public final void m85906O(int i) {
        C13427c.m85895f(this.keysArray, i);
        m85905M(this.presenceArray[i]);
        this.presenceArray[i] = -1;
        this.size = size() - 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final V[] m85913h() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] d = C13427c.m85893d(m85920v());
        this.valuesArray = d;
        return d;
    }

    /* renamed from: k */
    private final void m85914k() {
        int i;
        V[] vArr = this.valuesArray;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.length;
            if (i2 >= i) {
                break;
            }
            if (this.presenceArray[i2] >= 0) {
                K[] kArr = this.keysArray;
                kArr[i3] = kArr[i2];
                if (vArr != null) {
                    vArr[i3] = vArr[i2];
                }
                i3++;
            }
            i2++;
        }
        C13427c.m85896g(this.keysArray, i3, i);
        if (vArr != null) {
            C13427c.m85896g(vArr, i3, this.length);
        }
        this.length = i3;
    }

    /* renamed from: n */
    private final boolean m85915n(Map<?, ?> map) {
        return size() == map.size() && mo70933l(map.entrySet());
    }

    /* renamed from: p */
    private final void m85916p(int i) {
        if (i < 0) {
            throw new OutOfMemoryError();
        } else if (i > m85920v()) {
            int v = (m85920v() * 3) / 2;
            if (i <= v) {
                i = v;
            }
            this.keysArray = C13427c.m85894e(this.keysArray, i);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? C13427c.m85894e(vArr, i) : null;
            int[] copyOf = Arrays.copyOf(this.presenceArray, i);
            C13706o.m87928e(copyOf, "copyOf(this, newSize)");
            this.presenceArray = copyOf;
            int a = f61505a.m85940c(i);
            if (a > m85921x()) {
                m85904I(a);
            }
        } else if ((this.length + i) - size() > m85920v()) {
            m85904I(m85921x());
        }
    }

    /* renamed from: q */
    private final void m85917q(int i) {
        m85916p(this.length + i);
    }

    /* renamed from: t */
    private final int m85918t(K k) {
        int B = m85900B(k);
        int i = this.maxProbeDistance;
        while (true) {
            int i2 = this.hashArray[B];
            if (i2 == 0) {
                return -1;
            }
            if (i2 > 0) {
                int i3 = i2 - 1;
                if (C13706o.m87924a(this.keysArray[i3], k)) {
                    return i3;
                }
            }
            i--;
            if (i < 0) {
                return -1;
            }
            B = B == 0 ? m85921x() - 1 : B - 1;
        }
    }

    /* renamed from: u */
    private final int m85919u(V v) {
        int i = this.length;
        while (true) {
            i--;
            if (i < 0) {
                return -1;
            }
            if (this.presenceArray[i] >= 0) {
                V[] vArr = this.valuesArray;
                C13706o.m87926c(vArr);
                if (C13706o.m87924a(vArr[i], v)) {
                    return i;
                }
            }
        }
    }

    /* renamed from: v */
    private final int m85920v() {
        return this.keysArray.length;
    }

    private final Object writeReplace() {
        if (this.isReadOnly) {
            return new C13440i(this);
        }
        throw new NotSerializableException("The map cannot be serialized while it is being built.");
    }

    /* renamed from: x */
    private final int m85921x() {
        return this.hashArray.length;
    }

    /* renamed from: A */
    public Collection<V> mo70914A() {
        C13437g<V> gVar = this.valuesView;
        if (gVar != null) {
            return gVar;
        }
        C13437g<V> gVar2 = new C13437g<>(this);
        this.valuesView = gVar2;
        return gVar2;
    }

    /* renamed from: C */
    public final boolean mo70915C() {
        return this.isReadOnly;
    }

    /* renamed from: D */
    public final C13433e<K, V> mo70916D() {
        return new C13433e<>(this);
    }

    /* renamed from: L */
    public final boolean mo70917L(Map.Entry<? extends K, ? extends V> entry) {
        C13706o.m87929f(entry, "entry");
        mo70931j();
        int t = m85918t(entry.getKey());
        if (t < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        C13706o.m87926c(vArr);
        if (!C13706o.m87924a(vArr[t], entry.getValue())) {
            return false;
        }
        m85906O(t);
        return true;
    }

    /* renamed from: N */
    public final int mo70918N(K k) {
        mo70931j();
        int t = m85918t(k);
        if (t < 0) {
            return -1;
        }
        m85906O(t);
        return t;
    }

    /* renamed from: P */
    public final boolean mo70919P(V v) {
        mo70931j();
        int u = m85919u(v);
        if (u < 0) {
            return false;
        }
        m85906O(u);
        return true;
    }

    /* renamed from: Q */
    public final C13434f<K, V> mo70920Q() {
        return new C13434f<>(this);
    }

    public void clear() {
        mo70931j();
        C13603n0 i = new C16788e(0, this.length - 1).iterator();
        while (i.hasNext()) {
            int nextInt = i.nextInt();
            int[] iArr = this.presenceArray;
            int i2 = iArr[nextInt];
            if (i2 >= 0) {
                this.hashArray[i2] = 0;
                iArr[nextInt] = -1;
            }
        }
        C13427c.m85896g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            C13427c.m85896g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
    }

    public boolean containsKey(Object obj) {
        return m85918t(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return m85919u(obj) >= 0;
    }

    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return mo70942w();
    }

    public boolean equals(Object obj) {
        return obj == this || ((obj instanceof Map) && m85915n((Map) obj));
    }

    /* renamed from: g */
    public final int mo70926g(K k) {
        mo70931j();
        while (true) {
            int B = m85900B(k);
            int d = C16792h.m99542d(this.maxProbeDistance * 2, m85921x() / 2);
            int i = 0;
            while (true) {
                int i2 = this.hashArray[B];
                if (i2 <= 0) {
                    if (this.length >= m85920v()) {
                        m85917q(1);
                    } else {
                        int i3 = this.length;
                        int i4 = i3 + 1;
                        this.length = i4;
                        this.keysArray[i3] = k;
                        this.presenceArray[i3] = B;
                        this.hashArray[B] = i4;
                        this.size = size() + 1;
                        if (i > this.maxProbeDistance) {
                            this.maxProbeDistance = i;
                        }
                        return i3;
                    }
                } else if (C13706o.m87924a(this.keysArray[i2 - 1], k)) {
                    return -i2;
                } else {
                    i++;
                    if (i > d) {
                        m85904I(m85921x() * 2);
                        break;
                    }
                    B = B == 0 ? m85921x() - 1 : B - 1;
                }
            }
        }
    }

    public V get(Object obj) {
        int t = m85918t(obj);
        if (t < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        C13706o.m87926c(vArr);
        return vArr[t];
    }

    public int hashCode() {
        C13430b r = mo70937r();
        int i = 0;
        while (r.hasNext()) {
            i += r.mo70947j();
        }
        return i;
    }

    /* renamed from: i */
    public final Map<K, V> mo70929i() {
        mo70931j();
        this.isReadOnly = true;
        return this;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: j */
    public final void mo70931j() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    public final /* bridge */ Set<K> keySet() {
        return mo70943y();
    }

    /* renamed from: l */
    public final boolean mo70933l(Collection<?> collection) {
        C13706o.m87929f(collection, "m");
        for (Object next : collection) {
            if (next != null) {
                try {
                    if (!mo70934m((Map.Entry) next)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public final boolean mo70934m(Map.Entry<? extends K, ? extends V> entry) {
        C13706o.m87929f(entry, "entry");
        int t = m85918t(entry.getKey());
        if (t < 0) {
            return false;
        }
        V[] vArr = this.valuesArray;
        C13706o.m87926c(vArr);
        return C13706o.m87924a(vArr[t], entry.getValue());
    }

    public V put(K k, V v) {
        mo70931j();
        int g = mo70926g(k);
        V[] h = m85913h();
        if (g < 0) {
            int i = (-g) - 1;
            V v2 = h[i];
            h[i] = v;
            return v2;
        }
        h[g] = v;
        return null;
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        C13706o.m87929f(map, TypedValues.Transition.S_FROM);
        mo70931j();
        m85901E(map.entrySet());
    }

    /* renamed from: r */
    public final C13430b<K, V> mo70937r() {
        return new C13430b<>(this);
    }

    public V remove(Object obj) {
        int N = mo70918N(obj);
        if (N < 0) {
            return null;
        }
        V[] vArr = this.valuesArray;
        C13706o.m87926c(vArr);
        V v = vArr[N];
        C13427c.m85895f(vArr, N);
        return v;
    }

    public final /* bridge */ int size() {
        return mo70944z();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder((size() * 3) + 2);
        sb.append("{");
        C13430b r = mo70937r();
        int i = 0;
        while (r.hasNext()) {
            if (i > 0) {
                sb.append(", ");
            }
            r.mo70946i(sb);
            i++;
        }
        sb.append("}");
        String sb2 = sb.toString();
        C13706o.m87928e(sb2, "sb.toString()");
        return sb2;
    }

    public final /* bridge */ Collection<V> values() {
        return mo70914A();
    }

    /* renamed from: w */
    public Set<Map.Entry<K, V>> mo70942w() {
        C13435e<K, V> eVar = this.entriesView;
        if (eVar != null) {
            return eVar;
        }
        C13435e<K, V> eVar2 = new C13435e<>(this);
        this.entriesView = eVar2;
        return eVar2;
    }

    /* renamed from: y */
    public Set<K> mo70943y() {
        C13436f<K> fVar = this.keysView;
        if (fVar != null) {
            return fVar;
        }
        C13436f<K> fVar2 = new C13436f<>(this);
        this.keysView = fVar2;
        return fVar2;
    }

    /* renamed from: z */
    public int mo70944z() {
        return this.size;
    }

    public C13428d() {
        this(8);
    }

    public C13428d(int i) {
        this(C13427c.m85893d(i), (V[]) null, new int[i], new int[f61505a.m85940c(i)], 2, 0);
    }
}
