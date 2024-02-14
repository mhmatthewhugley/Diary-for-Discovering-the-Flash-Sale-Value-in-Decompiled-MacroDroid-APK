package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavArgs;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C13706o;
import p297ja.C13321g;
import p361pa.C16147a;
import p370qa.C16254a;
import p433xa.C16875d;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B#\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0018\u0010\u0006\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00028\u00008VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, mo71668d2 = {"Landroidx/navigation/NavArgsLazy;", "Landroidx/navigation/NavArgs;", "Args", "Lja/g;", "", "isInitialized", "cached", "Landroidx/navigation/NavArgs;", "getValue", "()Landroidx/navigation/NavArgs;", "value", "Lxa/d;", "navArgsClass", "Lkotlin/Function0;", "Landroid/os/Bundle;", "argumentProducer", "<init>", "(Lxa/d;Lqa/a;)V", "navigation-common-ktx_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
/* compiled from: NavArgsLazy.kt */
public final class NavArgsLazy<Args extends NavArgs> implements C13321g<Args> {
    private final C16254a<Bundle> argumentProducer;
    private Args cached;
    private final C16875d<Args> navArgsClass;

    public NavArgsLazy(C16875d<Args> dVar, C16254a<Bundle> aVar) {
        C13706o.m87930g(dVar, "navArgsClass");
        C13706o.m87930g(aVar, "argumentProducer");
        this.navArgsClass = dVar;
        this.argumentProducer = aVar;
    }

    public boolean isInitialized() {
        return this.cached != null;
    }

    public Args getValue() {
        Args args = this.cached;
        if (args != null) {
            return args;
        }
        Bundle invoke = this.argumentProducer.invoke();
        Method method = NavArgsLazyKt.getMethodMap().get(this.navArgsClass);
        if (method == null) {
            Class<Args> b = C16147a.m96968b(this.navArgsClass);
            Class[] methodSignature = NavArgsLazyKt.getMethodSignature();
            method = b.getMethod("fromBundle", (Class[]) Arrays.copyOf(methodSignature, methodSignature.length));
            NavArgsLazyKt.getMethodMap().put(this.navArgsClass, method);
            C13706o.m87925b(method, "navArgsClass.java.getMet…hod\n                    }");
        }
        Args invoke2 = method.invoke((Object) null, new Object[]{invoke});
        if (invoke2 != null) {
            Args args2 = (NavArgs) invoke2;
            this.cached = args2;
            return args2;
        }
        throw new TypeCastException("null cannot be cast to non-null type Args");
    }
}
