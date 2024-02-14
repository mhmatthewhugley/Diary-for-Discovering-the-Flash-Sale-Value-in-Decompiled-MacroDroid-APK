package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\"\u0010\u000f\u001a\u00020\b8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108VX\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00148VX\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, mo71668d2 = {"Lkotlinx/coroutines/c2;", "Lkotlinx/coroutines/d0;", "Lkotlinx/coroutines/c1;", "Lkotlinx/coroutines/r1;", "Lja/u;", "dispose", "", "toString", "Lkotlinx/coroutines/d2;", "f", "Lkotlinx/coroutines/d2;", "E", "()Lkotlinx/coroutines/d2;", "F", "(Lkotlinx/coroutines/d2;)V", "job", "", "b", "()Z", "isActive", "Lkotlinx/coroutines/i2;", "c", "()Lkotlinx/coroutines/i2;", "list", "<init>", "()V", "kotlinx-coroutines-core"}, mo71669k = 1, mo71670mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.c2 */
/* compiled from: JobSupport.kt */
public abstract class C15203c2 extends C15250d0 implements C15202c1, C15511r1 {

    /* renamed from: f */
    public C15252d2 f64409f;

    /* renamed from: E */
    public final C15252d2 mo74519E() {
        C15252d2 d2Var = this.f64409f;
        if (d2Var != null) {
            return d2Var;
        }
        C13706o.m87945v("job");
        return null;
    }

    /* renamed from: F */
    public final void mo74520F(C15252d2 d2Var) {
        this.f64409f = d2Var;
    }

    /* renamed from: b */
    public boolean mo74521b() {
        return true;
    }

    /* renamed from: c */
    public C15427i2 mo74522c() {
        return null;
    }

    public void dispose() {
        mo74519E().mo74622u0(this);
    }

    public String toString() {
        return C15498o0.m94571a(this) + '@' + C15498o0.m94572b(this) + "[job@" + C15498o0.m94572b(mo74519E()) + ']';
    }
}
