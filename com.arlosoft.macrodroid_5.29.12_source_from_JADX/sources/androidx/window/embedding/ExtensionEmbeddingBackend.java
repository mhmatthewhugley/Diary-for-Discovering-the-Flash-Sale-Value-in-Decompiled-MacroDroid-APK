package androidx.window.embedding;

import android.app.Activity;
import androidx.annotation.GuardedBy;
import androidx.annotation.VisibleForTesting;
import androidx.core.util.Consumer;
import androidx.window.core.ConsumerAdapter;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.core.PredicateAdapter;
import androidx.window.embedding.EmbeddingCompat;
import androidx.window.embedding.EmbeddingInterfaceCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.C13695i;
import kotlin.jvm.internal.C13706o;
import p297ja.C13339u;

@Metadata(mo71666bv = {}, mo71667d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 /2\u00020\u0001:\u0003/01B\u0013\b\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b.\u0010\u001fJ\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016J,\u0010\u0013\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\u001c\u0010\u0015\u001a\u00020\u00062\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\u000fH\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u0018\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u000bH\u0016R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR&\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0006X\u0004¢\u0006\u0012\n\u0004\b\"\u0010#\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%R\u0018\u0010)\u001a\u00060(R\u00020\u00008\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030+8\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u00062"}, mo71668d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend;", "Landroidx/window/embedding/EmbeddingBackend;", "", "Landroidx/window/embedding/EmbeddingRule;", "getSplitRules", "rules", "Lja/u;", "setSplitRules", "rule", "registerRule", "unregisterRule", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Landroidx/core/util/Consumer;", "", "Landroidx/window/embedding/SplitInfo;", "callback", "registerSplitListenerForActivity", "consumer", "unregisterSplitListenerForActivity", "", "isSplitSupported", "isActivityEmbedded", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "embeddingExtension", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "getEmbeddingExtension", "()Landroidx/window/embedding/EmbeddingInterfaceCompat;", "setEmbeddingExtension", "(Landroidx/window/embedding/EmbeddingInterfaceCompat;)V", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "splitChangeCallbacks", "Ljava/util/concurrent/CopyOnWriteArrayList;", "getSplitChangeCallbacks", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getSplitChangeCallbacks$annotations", "()V", "Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "splitInfoEmbeddingCallback", "Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "Ljava/util/concurrent/CopyOnWriteArraySet;", "splitRules", "Ljava/util/concurrent/CopyOnWriteArraySet;", "<init>", "Companion", "EmbeddingCallbackImpl", "SplitListenerWrapper", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
@ExperimentalWindowApi
/* compiled from: ExtensionEmbeddingBackend.kt */
public final class ExtensionEmbeddingBackend implements EmbeddingBackend {
    public static final Companion Companion = new Companion((C13695i) null);
    private static final String TAG = "EmbeddingBackend";
    /* access modifiers changed from: private */
    public static volatile ExtensionEmbeddingBackend globalInstance;
    /* access modifiers changed from: private */
    public static final ReentrantLock globalLock = new ReentrantLock();
    @VisibleForTesting
    @GuardedBy("globalLock")
    private EmbeddingInterfaceCompat embeddingExtension;
    private final CopyOnWriteArrayList<SplitListenerWrapper> splitChangeCallbacks = new CopyOnWriteArrayList<>();
    private final EmbeddingCallbackImpl splitInfoEmbeddingCallback;
    private final CopyOnWriteArraySet<EmbeddingRule> splitRules;

    @Metadata(mo71667d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\u0006J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u0017\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, mo71668d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$Companion;", "", "()V", "TAG", "", "globalInstance", "Landroidx/window/embedding/ExtensionEmbeddingBackend;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "getInstance", "initAndVerifyEmbeddingExtension", "Landroidx/window/embedding/EmbeddingInterfaceCompat;", "isExtensionVersionSupported", "", "extensionVersion", "", "(Ljava/lang/Integer;)Z", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
    /* compiled from: ExtensionEmbeddingBackend.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C13695i iVar) {
            this();
        }

        private final EmbeddingInterfaceCompat initAndVerifyEmbeddingExtension() {
            ClassLoader classLoader;
            try {
                EmbeddingCompat.Companion companion = EmbeddingCompat.Companion;
                if (!isExtensionVersionSupported(companion.getExtensionApiLevel()) || !companion.isEmbeddingAvailable() || (classLoader = EmbeddingBackend.class.getClassLoader()) == null) {
                    return null;
                }
                return new EmbeddingCompat(companion.embeddingComponent(), new EmbeddingAdapter(new PredicateAdapter(classLoader)), new ConsumerAdapter(classLoader));
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to load embedding extension: ");
                sb.append(th);
                return null;
            }
        }

        public final ExtensionEmbeddingBackend getInstance() {
            if (ExtensionEmbeddingBackend.globalInstance == null) {
                ReentrantLock access$getGlobalLock$cp = ExtensionEmbeddingBackend.globalLock;
                access$getGlobalLock$cp.lock();
                try {
                    if (ExtensionEmbeddingBackend.globalInstance == null) {
                        ExtensionEmbeddingBackend.globalInstance = new ExtensionEmbeddingBackend(ExtensionEmbeddingBackend.Companion.initAndVerifyEmbeddingExtension());
                    }
                    C13339u uVar = C13339u.f61331a;
                } finally {
                    access$getGlobalLock$cp.unlock();
                }
            }
            ExtensionEmbeddingBackend access$getGlobalInstance$cp = ExtensionEmbeddingBackend.globalInstance;
            C13706o.m87926c(access$getGlobalInstance$cp);
            return access$getGlobalInstance$cp;
        }

        @VisibleForTesting
        public final boolean isExtensionVersionSupported(Integer num) {
            return num != null && num.intValue() >= 1;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016R*\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo71668d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$EmbeddingCallbackImpl;", "Landroidx/window/embedding/EmbeddingInterfaceCompat$EmbeddingCallbackInterface;", "", "Landroidx/window/embedding/SplitInfo;", "splitInfo", "Lja/u;", "onSplitInfoChanged", "lastInfo", "Ljava/util/List;", "getLastInfo", "()Ljava/util/List;", "setLastInfo", "(Ljava/util/List;)V", "<init>", "(Landroidx/window/embedding/ExtensionEmbeddingBackend;)V", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: ExtensionEmbeddingBackend.kt */
    public final class EmbeddingCallbackImpl implements EmbeddingInterfaceCompat.EmbeddingCallbackInterface {
        private List<SplitInfo> lastInfo;

        public EmbeddingCallbackImpl() {
        }

        public final List<SplitInfo> getLastInfo() {
            return this.lastInfo;
        }

        public void onSplitInfoChanged(List<SplitInfo> list) {
            C13706o.m87929f(list, "splitInfo");
            this.lastInfo = list;
            Iterator<SplitListenerWrapper> it = ExtensionEmbeddingBackend.this.getSplitChangeCallbacks().iterator();
            while (it.hasNext()) {
                it.next().accept(list);
            }
        }

        public final void setLastInfo(List<SplitInfo> list) {
            this.lastInfo = list;
        }
    }

    @Metadata(mo71666bv = {}, mo71667d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r¢\u0006\u0004\b\u0014\u0010\u0015J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR#\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, mo71668d2 = {"Landroidx/window/embedding/ExtensionEmbeddingBackend$SplitListenerWrapper;", "", "", "Landroidx/window/embedding/SplitInfo;", "splitInfoList", "Lja/u;", "accept", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "Landroidx/core/util/Consumer;", "callback", "Landroidx/core/util/Consumer;", "getCallback", "()Landroidx/core/util/Consumer;", "lastValue", "Ljava/util/List;", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Landroidx/core/util/Consumer;)V", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1})
    /* compiled from: ExtensionEmbeddingBackend.kt */
    public static final class SplitListenerWrapper {
        private final Activity activity;
        private final Consumer<List<SplitInfo>> callback;
        private final Executor executor;
        private List<SplitInfo> lastValue;

        public SplitListenerWrapper(Activity activity2, Executor executor2, Consumer<List<SplitInfo>> consumer) {
            C13706o.m87929f(activity2, "activity");
            C13706o.m87929f(executor2, "executor");
            C13706o.m87929f(consumer, "callback");
            this.activity = activity2;
            this.executor = executor2;
            this.callback = consumer;
        }

        /* access modifiers changed from: private */
        /* renamed from: accept$lambda-1  reason: not valid java name */
        public static final void m101283accept$lambda1(SplitListenerWrapper splitListenerWrapper, List list) {
            C13706o.m87929f(splitListenerWrapper, "this$0");
            C13706o.m87929f(list, "$splitsWithActivity");
            splitListenerWrapper.callback.accept(list);
        }

        public final void accept(List<SplitInfo> list) {
            C13706o.m87929f(list, "splitInfoList");
            ArrayList arrayList = new ArrayList();
            for (T next : list) {
                if (((SplitInfo) next).contains(this.activity)) {
                    arrayList.add(next);
                }
            }
            if (!C13706o.m87924a(arrayList, this.lastValue)) {
                this.lastValue = arrayList;
                this.executor.execute(new C1306c(this, arrayList));
            }
        }

        public final Consumer<List<SplitInfo>> getCallback() {
            return this.callback;
        }
    }

    @VisibleForTesting
    public ExtensionEmbeddingBackend(EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
        EmbeddingCallbackImpl embeddingCallbackImpl = new EmbeddingCallbackImpl();
        this.splitInfoEmbeddingCallback = embeddingCallbackImpl;
        EmbeddingInterfaceCompat embeddingInterfaceCompat2 = this.embeddingExtension;
        if (embeddingInterfaceCompat2 != null) {
            embeddingInterfaceCompat2.setEmbeddingCallback(embeddingCallbackImpl);
        }
        this.splitRules = new CopyOnWriteArraySet<>();
    }

    @VisibleForTesting
    public static /* synthetic */ void getSplitChangeCallbacks$annotations() {
    }

    public final EmbeddingInterfaceCompat getEmbeddingExtension() {
        return this.embeddingExtension;
    }

    public final CopyOnWriteArrayList<SplitListenerWrapper> getSplitChangeCallbacks() {
        return this.splitChangeCallbacks;
    }

    public Set<EmbeddingRule> getSplitRules() {
        return this.splitRules;
    }

    public boolean isActivityEmbedded(Activity activity) {
        C13706o.m87929f(activity, "activity");
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            return embeddingInterfaceCompat.isActivityEmbedded(activity);
        }
        return false;
    }

    public boolean isSplitSupported() {
        return this.embeddingExtension != null;
    }

    public void registerRule(EmbeddingRule embeddingRule) {
        C13706o.m87929f(embeddingRule, "rule");
        if (!this.splitRules.contains(embeddingRule)) {
            this.splitRules.add(embeddingRule);
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat != null) {
                embeddingInterfaceCompat.setSplitRules(this.splitRules);
            }
        }
    }

    public void registerSplitListenerForActivity(Activity activity, Executor executor, Consumer<List<SplitInfo>> consumer) {
        C13706o.m87929f(activity, "activity");
        C13706o.m87929f(executor, "executor");
        C13706o.m87929f(consumer, "callback");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            if (this.embeddingExtension == null) {
                consumer.accept(C13614t.m87748j());
                return;
            }
            SplitListenerWrapper splitListenerWrapper = new SplitListenerWrapper(activity, executor, consumer);
            this.splitChangeCallbacks.add(splitListenerWrapper);
            if (this.splitInfoEmbeddingCallback.getLastInfo() != null) {
                List<SplitInfo> lastInfo = this.splitInfoEmbeddingCallback.getLastInfo();
                C13706o.m87926c(lastInfo);
                splitListenerWrapper.accept(lastInfo);
            } else {
                splitListenerWrapper.accept(C13614t.m87748j());
            }
            C13339u uVar = C13339u.f61331a;
            reentrantLock.unlock();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void setEmbeddingExtension(EmbeddingInterfaceCompat embeddingInterfaceCompat) {
        this.embeddingExtension = embeddingInterfaceCompat;
    }

    public void setSplitRules(Set<? extends EmbeddingRule> set) {
        C13706o.m87929f(set, "rules");
        this.splitRules.clear();
        this.splitRules.addAll(set);
        EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
        if (embeddingInterfaceCompat != null) {
            embeddingInterfaceCompat.setSplitRules(this.splitRules);
        }
    }

    public void unregisterRule(EmbeddingRule embeddingRule) {
        C13706o.m87929f(embeddingRule, "rule");
        if (this.splitRules.contains(embeddingRule)) {
            this.splitRules.remove(embeddingRule);
            EmbeddingInterfaceCompat embeddingInterfaceCompat = this.embeddingExtension;
            if (embeddingInterfaceCompat != null) {
                embeddingInterfaceCompat.setSplitRules(this.splitRules);
            }
        }
    }

    public void unregisterSplitListenerForActivity(Consumer<List<SplitInfo>> consumer) {
        C13706o.m87929f(consumer, "consumer");
        ReentrantLock reentrantLock = globalLock;
        reentrantLock.lock();
        try {
            Iterator<SplitListenerWrapper> it = this.splitChangeCallbacks.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                SplitListenerWrapper next = it.next();
                if (C13706o.m87924a(next.getCallback(), consumer)) {
                    this.splitChangeCallbacks.remove(next);
                    break;
                }
            }
            C13339u uVar = C13339u.f61331a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
