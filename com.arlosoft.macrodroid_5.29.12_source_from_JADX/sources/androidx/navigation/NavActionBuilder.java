package androidx.navigation;

import android.os.Bundle;
import androidx.core.p007os.BundleKt;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C13706o;
import p297ja.C13328m;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u000f\u0010\n\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\tR\"\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0019¨\u0006\u001c"}, mo71668d2 = {"Landroidx/navigation/NavActionBuilder;", "", "Lkotlin/Function1;", "Landroidx/navigation/NavOptionsBuilder;", "Lja/u;", "optionsBuilder", "navOptions", "Landroidx/navigation/NavAction;", "build$navigation_common_ktx_release", "()Landroidx/navigation/NavAction;", "build", "", "destinationId", "I", "getDestinationId", "()I", "setDestinationId", "(I)V", "", "", "defaultArguments", "Ljava/util/Map;", "getDefaultArguments", "()Ljava/util/Map;", "Landroidx/navigation/NavOptions;", "Landroidx/navigation/NavOptions;", "<init>", "()V", "navigation-common-ktx_release"}, mo71669k = 1, mo71670mv = {1, 4, 0})
@NavDestinationDsl
/* compiled from: NavDestinationBuilder.kt */
public final class NavActionBuilder {
    private final Map<String, Object> defaultArguments = new LinkedHashMap();
    private int destinationId;
    private NavOptions navOptions;

    public final NavAction build$navigation_common_ktx_release() {
        Bundle bundle;
        int i = this.destinationId;
        NavOptions navOptions2 = this.navOptions;
        if (this.defaultArguments.isEmpty()) {
            bundle = null;
        } else {
            Object[] array = C13619v0.m87777x(this.defaultArguments).toArray(new C13328m[0]);
            if (array != null) {
                C13328m[] mVarArr = (C13328m[]) array;
                bundle = BundleKt.bundleOf((C13328m[]) Arrays.copyOf(mVarArr, mVarArr.length));
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        }
        return new NavAction(i, navOptions2, bundle);
    }

    public final Map<String, Object> getDefaultArguments() {
        return this.defaultArguments;
    }

    public final int getDestinationId() {
        return this.destinationId;
    }

    public final void navOptions(C16265l<? super NavOptionsBuilder, C13339u> lVar) {
        C13706o.m87930g(lVar, "optionsBuilder");
        NavOptionsBuilder navOptionsBuilder = new NavOptionsBuilder();
        lVar.invoke(navOptionsBuilder);
        this.navOptions = navOptionsBuilder.build$navigation_common_ktx_release();
    }

    public final void setDestinationId(int i) {
        this.destinationId = i;
    }
}
