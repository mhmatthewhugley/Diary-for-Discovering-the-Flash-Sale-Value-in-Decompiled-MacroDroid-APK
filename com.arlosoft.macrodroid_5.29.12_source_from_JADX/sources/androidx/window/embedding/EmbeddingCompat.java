package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.embedding.ActivityEmbeddingComponent;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, mo71668d2 = {"Landroidx/window/embedding/EmbeddingCompat;", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "", "Landroidx/window/embedding/EmbeddingRule;", "rules", "Lja/u;", "setSplitRules", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "embeddingCallback", "setEmbeddingCallback", "Landroid/app/Activity;", "activity", "", "isActivityEmbedded", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "embeddingExtension", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "Landroidx/window/embedding/EmbeddingAdapter;", "adapter", "Landroidx/window/embedding/EmbeddingAdapter;", "Landroidx/window/core/ConsumerAdapter;", "consumerAdapter", "Landroidx/window/core/ConsumerAdapter;", "<init>", "(Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;Landroidx/window/embedding/EmbeddingAdapter;Landroidx/window/core/ConsumerAdapter;)V", "Companion", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
@ExperimentalWindowApi
/* compiled from: EmbeddingCompat.kt */
public final class EmbeddingCompat implements EmbeddingInterfaceCompat {
    public static final Companion Companion = new Companion((C13695i) null);
    public static final boolean DEBUG = true;
    private static final String TAG = "EmbeddingCompat";
    /* access modifiers changed from: private */
    public final EmbeddingAdapter adapter;
    private final ConsumerAdapter consumerAdapter;
    private final ActivityEmbeddingComponent embeddingExtension;

    @Metadata(mo71667d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\r\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\r"}, mo71668d2 = {"Landroidx/window/embedding/EmbeddingCompat$Companion;", "", "()V", "DEBUG", "", "TAG", "", "embeddingComponent", "Landroidx/window/extensions/embedding/ActivityEmbeddingComponent;", "getExtensionApiLevel", "", "()Ljava/lang/Integer;", "isEmbeddingAvailable", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: EmbeddingCompat.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        /* access modifiers changed from: private */
        /* renamed from: embeddingComponent$lambda-0  reason: not valid java name */
        public static final C13339u m101281embeddingComponent$lambda0(Object obj, Method method, Object[] objArr) {
            return C13339u.f61331a;
        }

        /* access modifiers changed from: private */
        /* renamed from: embeddingComponent$lambda-1  reason: not valid java name */
        public static final C13339u m101282embeddingComponent$lambda1(Object obj, Method method, Object[] objArr) {
            return C13339u.f61331a;
        }

        public final ActivityEmbeddingComponent embeddingComponent() {
            Class<EmbeddingCompat> cls = EmbeddingCompat.class;
            if (isEmbeddingAvailable()) {
                ActivityEmbeddingComponent activityEmbeddingComponent = WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent();
                if (activityEmbeddingComponent != null) {
                    return activityEmbeddingComponent;
                }
                Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{ActivityEmbeddingComponent.class}, C1304a.f702a);
                C13706o.m87927d(newProxyInstance, "null cannot be cast to non-null type androidx.window.extensions.embedding.ActivityEmbeddingComponent");
                return (ActivityEmbeddingComponent) newProxyInstance;
            }
            Object newProxyInstance2 = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{ActivityEmbeddingComponent.class}, C1305b.f703a);
            C13706o.m87927d(newProxyInstance2, "null cannot be cast to non-null type androidx.window.extensions.embedding.ActivityEmbeddingComponent");
            return (ActivityEmbeddingComponent) newProxyInstance2;
        }

        public final Integer getExtensionApiLevel() {
            try {
                return Integer.valueOf(WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel());
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return null;
            }
        }

        public final boolean isEmbeddingAvailable() {
            try {
                return WindowExtensionsProvider.getWindowExtensions().getActivityEmbeddingComponent() != null;
            } catch (NoClassDefFoundError | UnsupportedOperationException unused) {
                return false;
            }
        }
    }

    public EmbeddingCompat(ActivityEmbeddingComponent activityEmbeddingComponent, EmbeddingAdapter embeddingAdapter, ConsumerAdapter consumerAdapter2) {
        C13706o.m87929f(activityEmbeddingComponent, "embeddingExtension");
        C13706o.m87929f(embeddingAdapter, "adapter");
        C13706o.m87929f(consumerAdapter2, "consumerAdapter");
        this.embeddingExtension = activityEmbeddingComponent;
        this.adapter = embeddingAdapter;
        this.consumerAdapter = consumerAdapter2;
    }

    public boolean isActivityEmbedded(Activity activity) {
        C13706o.m87929f(activity, "activity");
        return this.embeddingExtension.isActivityEmbedded(activity);
    }

    public void setEmbeddingCallback(EmbeddingInterfaceCompat.EmbeddingCallbackInterface embeddingCallbackInterface) {
        C13706o.m87929f(embeddingCallbackInterface, "embeddingCallback");
        this.consumerAdapter.addConsumer(this.embeddingExtension, C13687e0.m87868b(List.class), "setSplitInfoCallback", new EmbeddingCompat$setEmbeddingCallback$1(embeddingCallbackInterface, this));
    }

    public void setSplitRules(Set<? extends EmbeddingRule> set) {
        C13706o.m87929f(set, "rules");
        this.embeddingExtension.setEmbeddingRules(this.adapter.translate(set));
    }
}
