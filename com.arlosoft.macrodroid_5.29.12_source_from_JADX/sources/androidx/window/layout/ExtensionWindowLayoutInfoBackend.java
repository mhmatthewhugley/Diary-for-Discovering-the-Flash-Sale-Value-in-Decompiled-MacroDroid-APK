package androidx.window.layout;

import android.app.Activity;
import androidx.annotation.GuardedBy;
import androidx.core.util.Consumer;
import androidx.window.core.ConsumerAdapter;
import androidx.window.extensions.layout.WindowLayoutComponent;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u001dJ&\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016J\u0016\u0010\u000b\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R&\u0010\u0019\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0004\u0012\u00020\u00020\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R \u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u001a0\u00158\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018¨\u0006\u001f"}, mo71668d2 = {"Landroidx/window/layout/ExtensionWindowLayoutInfoBackend;", "Landroidx/window/layout/WindowBackend;", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "Landroidx/window/layout/WindowLayoutInfo;", "callback", "Lja/u;", "registerLayoutChangeCallback", "unregisterLayoutChangeCallback", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "Landroidx/window/core/ConsumerAdapter;", "consumerAdapter", "Landroidx/window/core/ConsumerAdapter;", "Ljava/util/concurrent/locks/ReentrantLock;", "extensionWindowBackendLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "Landroidx/window/layout/ExtensionWindowLayoutInfoBackend$MulticastConsumer;", "activityToListeners", "Ljava/util/Map;", "listenerToActivity", "Landroidx/window/core/ConsumerAdapter$Subscription;", "consumerToToken", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;Landroidx/window/core/ConsumerAdapter;)V", "MulticastConsumer", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
/* compiled from: ExtensionWindowLayoutInfoBackend.kt */
public final class ExtensionWindowLayoutInfoBackend implements WindowBackend {
    @GuardedBy("lock")
    private final Map<Activity, MulticastConsumer> activityToListeners = new LinkedHashMap();
    private final WindowLayoutComponent component;
    private final ConsumerAdapter consumerAdapter;
    @GuardedBy("lock")
    private final Map<MulticastConsumer, ConsumerAdapter.Subscription> consumerToToken = new LinkedHashMap();
    private final ReentrantLock extensionWindowBackendLock = new ReentrantLock();
    @GuardedBy("lock")
    private final Map<Consumer<WindowLayoutInfo>, Activity> listenerToActivity = new LinkedHashMap();

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0005\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0014\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001J\u0014\u0010\t\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001J\u0006\u0010\u000b\u001a\u00020\nR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00010\u00148\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, mo71668d2 = {"Landroidx/window/layout/ExtensionWindowLayoutInfoBackend$MulticastConsumer;", "Landroidx/core/util/Consumer;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "value", "Lja/u;", "accept", "Landroidx/window/layout/WindowLayoutInfo;", "listener", "addListener", "removeListener", "", "isEmpty", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Ljava/util/concurrent/locks/ReentrantLock;", "multicastConsumerLock", "Ljava/util/concurrent/locks/ReentrantLock;", "lastKnownValue", "Landroidx/window/layout/WindowLayoutInfo;", "", "registeredListeners", "Ljava/util/Set;", "<init>", "(Landroid/app/Activity;)V", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: ExtensionWindowLayoutInfoBackend.kt */
    private static final class MulticastConsumer implements Consumer<WindowLayoutInfo> {
        private final Activity activity;
        @GuardedBy("lock")
        private WindowLayoutInfo lastKnownValue;
        private final ReentrantLock multicastConsumerLock = new ReentrantLock();
        @GuardedBy("lock")
        private final Set<Consumer<WindowLayoutInfo>> registeredListeners = new LinkedHashSet();

        public MulticastConsumer(Activity activity2) {
            C13706o.m87929f(activity2, "activity");
            this.activity = activity2;
        }

        public final void addListener(Consumer<WindowLayoutInfo> consumer) {
            C13706o.m87929f(consumer, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                WindowLayoutInfo windowLayoutInfo = this.lastKnownValue;
                if (windowLayoutInfo != null) {
                    consumer.accept(windowLayoutInfo);
                }
                this.registeredListeners.add(consumer);
            } finally {
                reentrantLock.unlock();
            }
        }

        public final boolean isEmpty() {
            return this.registeredListeners.isEmpty();
        }

        public final void removeListener(Consumer<WindowLayoutInfo> consumer) {
            C13706o.m87929f(consumer, "listener");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.registeredListeners.remove(consumer);
            } finally {
                reentrantLock.unlock();
            }
        }

        public void accept(WindowLayoutInfo windowLayoutInfo) {
            C13706o.m87929f(windowLayoutInfo, "value");
            ReentrantLock reentrantLock = this.multicastConsumerLock;
            reentrantLock.lock();
            try {
                this.lastKnownValue = ExtensionsWindowLayoutInfoAdapter.INSTANCE.translate$window_release(this.activity, windowLayoutInfo);
                for (Consumer accept : this.registeredListeners) {
                    accept.accept(this.lastKnownValue);
                }
                C13339u uVar = C13339u.f61331a;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public ExtensionWindowLayoutInfoBackend(WindowLayoutComponent windowLayoutComponent, ConsumerAdapter consumerAdapter2) {
        C13706o.m87929f(windowLayoutComponent, "component");
        C13706o.m87929f(consumerAdapter2, "consumerAdapter");
        this.component = windowLayoutComponent;
        this.consumerAdapter = consumerAdapter2;
    }

    public void registerLayoutChangeCallback(Activity activity, Executor executor, Consumer<WindowLayoutInfo> consumer) {
        C13339u uVar;
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(executor, "executor");
        C13706o.m87929f(consumer, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
            if (multicastConsumer != null) {
                multicastConsumer.addListener(consumer);
                this.listenerToActivity.put(consumer, activity);
                uVar = C13339u.f61331a;
            } else {
                uVar = null;
            }
            if (uVar == null) {
                MulticastConsumer multicastConsumer2 = new MulticastConsumer(activity);
                this.activityToListeners.put(activity, multicastConsumer2);
                this.listenerToActivity.put(consumer, activity);
                multicastConsumer2.addListener(consumer);
                this.consumerToToken.put(multicastConsumer2, this.consumerAdapter.createSubscription(this.component, C13687e0.m87868b(WindowLayoutInfo.class), "addWindowLayoutInfoListener", "removeWindowLayoutInfoListener", activity, new C1307xa47eee96(multicastConsumer2)));
            }
            C13339u uVar2 = C13339u.f61331a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public void unregisterLayoutChangeCallback(Consumer<WindowLayoutInfo> consumer) {
        C13706o.m87929f(consumer, "callback");
        ReentrantLock reentrantLock = this.extensionWindowBackendLock;
        reentrantLock.lock();
        try {
            Activity activity = this.listenerToActivity.get(consumer);
            if (activity != null) {
                MulticastConsumer multicastConsumer = this.activityToListeners.get(activity);
                if (multicastConsumer == null) {
                    reentrantLock.unlock();
                    return;
                }
                multicastConsumer.removeListener(consumer);
                if (multicastConsumer.isEmpty()) {
                    ConsumerAdapter.Subscription remove = this.consumerToToken.remove(multicastConsumer);
                    if (remove != null) {
                        remove.dispose();
                    }
                    this.listenerToActivity.remove(consumer);
                    this.activityToListeners.remove(activity);
                }
                C13339u uVar = C13339u.f61331a;
                reentrantLock.unlock();
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
