package p292io.reactivex.processors;

import p329me.C15738c;
import p414v9.C16732f;
import p414v9.C16733g;

/* renamed from: io.reactivex.processors.a */
/* compiled from: FlowableProcessor */
public abstract class C13232a<T> extends C16732f<T> implements C15738c, C16733g<T> {
    /* renamed from: B */
    public final C13232a<T> mo70063B() {
        if (this instanceof C13237c) {
            return this;
        }
        return new C13237c(this);
    }
}
