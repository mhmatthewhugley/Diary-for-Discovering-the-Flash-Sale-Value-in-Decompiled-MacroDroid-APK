package p083e4;

import p079d5.C7257a;
import p079d5.C7261c;
import p083e4.C7281j;

/* renamed from: e4.j */
/* compiled from: TransitionOptions */
public abstract class C7281j<CHILD extends C7281j<CHILD, TranscodeType>, TranscodeType> implements Cloneable {

    /* renamed from: a */
    private C7261c<? super TranscodeType> f17791a = C7257a.m29974b();

    /* renamed from: a */
    public final CHILD clone() {
        try {
            return (C7281j) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C7261c<? super TranscodeType> mo37200b() {
        return this.f17791a;
    }
}
