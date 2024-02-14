package androidx.window.layout;

import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.ExtensionWindowLayoutInfoBackend;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import kotlin.jvm.internal.C13708q;
import p297ja.C13339u;
import p370qa.C16265l;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, mo71668d2 = {"Landroidx/window/extensions/layout/WindowLayoutInfo;", "value", "Lja/u;", "invoke", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "<anonymous>"}, mo71669k = 3, mo71670mv = {1, 7, 1})
/* renamed from: androidx.window.layout.ExtensionWindowLayoutInfoBackend$registerLayoutChangeCallback$1$2$disposableToken$1 */
/* compiled from: ExtensionWindowLayoutInfoBackend.kt */
final class C1307xa47eee96 extends C13708q implements C16265l<WindowLayoutInfo, C13339u> {
    final /* synthetic */ ExtensionWindowLayoutInfoBackend.MulticastConsumer $consumer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C1307xa47eee96(ExtensionWindowLayoutInfoBackend.MulticastConsumer multicastConsumer) {
        super(1);
        this.$consumer = multicastConsumer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((WindowLayoutInfo) obj);
        return C13339u.f61331a;
    }

    public final void invoke(WindowLayoutInfo windowLayoutInfo) {
        C13706o.m87929f(windowLayoutInfo, "value");
        this.$consumer.accept(windowLayoutInfo);
    }
}
