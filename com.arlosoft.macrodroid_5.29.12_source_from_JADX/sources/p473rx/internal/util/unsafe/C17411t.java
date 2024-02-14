package p473rx.internal.util.unsafe;

/* renamed from: rx.internal.util.unsafe.t */
/* compiled from: SpscArrayQueue */
abstract class C17411t<E> extends C17392a<E> {

    /* renamed from: p */
    private static final Integer f69164p = Integer.getInteger("jctools.spsc.max.lookahead.step", 4096);

    /* renamed from: o */
    protected final int f69165o;

    public C17411t(int i) {
        super(i);
        this.f69165o = Math.min(i / 4, f69164p.intValue());
    }
}
