package androidx.window.embedding;

import android.app.Activity;
import android.content.Intent;
import android.view.WindowMetrics;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.core.PredicateAdapter;
import androidx.window.extensions.embedding.ActivityRule;
import androidx.window.extensions.embedding.ActivityStack;
import androidx.window.extensions.embedding.EmbeddingRule;
import androidx.window.extensions.embedding.SplitInfo;
import androidx.window.extensions.embedding.SplitPairRule;
import androidx.window.extensions.embedding.SplitPlaceholderRule;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13687e0;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\tJ\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bJ\u0016\u0010\u000f\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0003J\u0016\u0010\u0012\u001a\u00020\u00012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u000bH\u0003J\u0016\u0010\u0013\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH\u0003J\u001c\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0002J\u0016\u0010\u001c\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u000bH\u0003J\u0010\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001fH\u0003J\u001c\u0010 \u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\"2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0003J\u001c\u0010#\u001a\u00020$2\u0006\u0010\u0018\u001a\u00020%2\n\u0010\u001a\u001a\u0006\u0012\u0002\b\u00030\u001bH\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, mo71668d2 = {"Landroidx/window/embedding/EmbeddingAdapter;", "", "predicateAdapter", "Landroidx/window/core/PredicateAdapter;", "(Landroidx/window/core/PredicateAdapter;)V", "translate", "Landroidx/window/embedding/SplitInfo;", "splitInfo", "Landroidx/window/extensions/embedding/SplitInfo;", "", "splitInfoList", "", "Landroidx/window/extensions/embedding/EmbeddingRule;", "rules", "Landroidx/window/embedding/EmbeddingRule;", "translateActivityIntentPredicates", "splitPairFilters", "Landroidx/window/embedding/SplitPairFilter;", "translateActivityPairPredicates", "translateActivityPredicates", "activityFilters", "Landroidx/window/embedding/ActivityFilter;", "translateActivityRule", "Landroidx/window/extensions/embedding/ActivityRule;", "rule", "Landroidx/window/embedding/ActivityRule;", "predicateClass", "Ljava/lang/Class;", "translateIntentPredicates", "translateParentMetricsPredicate", "splitRule", "Landroidx/window/embedding/SplitRule;", "translateSplitPairRule", "Landroidx/window/extensions/embedding/SplitPairRule;", "Landroidx/window/embedding/SplitPairRule;", "translateSplitPlaceholderRule", "Landroidx/window/extensions/embedding/SplitPlaceholderRule;", "Landroidx/window/embedding/SplitPlaceholderRule;", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
@ExperimentalWindowApi
/* compiled from: EmbeddingAdapter.kt */
public final class EmbeddingAdapter {
    private final PredicateAdapter predicateAdapter;

    public EmbeddingAdapter(PredicateAdapter predicateAdapter2) {
        C13706o.m87929f(predicateAdapter2, "predicateAdapter");
        this.predicateAdapter = predicateAdapter2;
    }

    private final SplitInfo translate(SplitInfo splitInfo) {
        boolean z;
        ActivityStack primaryActivityStack = splitInfo.getPrimaryActivityStack();
        C13706o.m87928e(primaryActivityStack, "splitInfo.primaryActivityStack");
        boolean z2 = false;
        try {
            z = primaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused) {
            z = false;
        }
        List activities = primaryActivityStack.getActivities();
        C13706o.m87928e(activities, "primaryActivityStack.activities");
        ActivityStack activityStack = new ActivityStack(activities, z);
        ActivityStack secondaryActivityStack = splitInfo.getSecondaryActivityStack();
        C13706o.m87928e(secondaryActivityStack, "splitInfo.secondaryActivityStack");
        try {
            z2 = secondaryActivityStack.isEmpty();
        } catch (NoSuchMethodError unused2) {
        }
        List activities2 = secondaryActivityStack.getActivities();
        C13706o.m87928e(activities2, "secondaryActivityStack.activities");
        return new SplitInfo(activityStack, new ActivityStack(activities2, z2), splitInfo.getSplitRatio());
    }

    private final Object translateActivityIntentPredicates(Set<SplitPairFilter> set) {
        return this.predicateAdapter.buildPairPredicate(C13687e0.m87868b(Activity.class), C13687e0.m87868b(Intent.class), new EmbeddingAdapter$translateActivityIntentPredicates$1(set));
    }

    private final Object translateActivityPairPredicates(Set<SplitPairFilter> set) {
        Class<Activity> cls = Activity.class;
        return this.predicateAdapter.buildPairPredicate(C13687e0.m87868b(cls), C13687e0.m87868b(cls), new EmbeddingAdapter$translateActivityPairPredicates$1(set));
    }

    private final Object translateActivityPredicates(Set<ActivityFilter> set) {
        return this.predicateAdapter.buildPredicate(C13687e0.m87868b(Activity.class), new EmbeddingAdapter$translateActivityPredicates$1(set));
    }

    private final ActivityRule translateActivityRule(ActivityRule activityRule, Class<?> cls) {
        ActivityRule build = ActivityRule.Builder.class.getConstructor(new Class[]{cls, cls}).newInstance(new Object[]{translateActivityPredicates(activityRule.getFilters()), translateIntentPredicates(activityRule.getFilters())}).setShouldAlwaysExpand(activityRule.getAlwaysExpand()).build();
        C13706o.m87928e(build, "ActivityRuleBuilder::cla…and)\n            .build()");
        return build;
    }

    private final Object translateIntentPredicates(Set<ActivityFilter> set) {
        return this.predicateAdapter.buildPredicate(C13687e0.m87868b(Intent.class), new EmbeddingAdapter$translateIntentPredicates$1(set));
    }

    private final Object translateParentMetricsPredicate(SplitRule splitRule) {
        return this.predicateAdapter.buildPredicate(C13687e0.m87868b(WindowMetrics.class), new EmbeddingAdapter$translateParentMetricsPredicate$1(splitRule));
    }

    private final SplitPairRule translateSplitPairRule(SplitPairRule splitPairRule, Class<?> cls) {
        SplitPairRule.Builder finishSecondaryWithPrimary = SplitPairRule.Builder.class.getConstructor(new Class[]{cls, cls, cls}).newInstance(new Object[]{translateActivityPairPredicates(splitPairRule.getFilters()), translateActivityIntentPredicates(splitPairRule.getFilters()), translateParentMetricsPredicate(splitPairRule)}).setSplitRatio(splitPairRule.getSplitRatio()).setLayoutDirection(splitPairRule.getLayoutDirection()).setShouldClearTop(splitPairRule.getClearTop()).setFinishPrimaryWithSecondary(splitPairRule.getFinishPrimaryWithSecondary()).setFinishSecondaryWithPrimary(splitPairRule.getFinishSecondaryWithPrimary());
        C13706o.m87928e(finishSecondaryWithPrimary, "SplitPairRuleBuilder::cl…nishSecondaryWithPrimary)");
        SplitPairRule build = finishSecondaryWithPrimary.build();
        C13706o.m87928e(build, "builder.build()");
        return build;
    }

    private final SplitPlaceholderRule translateSplitPlaceholderRule(SplitPlaceholderRule splitPlaceholderRule, Class<?> cls) {
        SplitPlaceholderRule.Builder finishPrimaryWithSecondary = SplitPlaceholderRule.Builder.class.getConstructor(new Class[]{Intent.class, cls, cls, cls}).newInstance(new Object[]{splitPlaceholderRule.getPlaceholderIntent(), translateActivityPredicates(splitPlaceholderRule.getFilters()), translateIntentPredicates(splitPlaceholderRule.getFilters()), translateParentMetricsPredicate(splitPlaceholderRule)}).setSplitRatio(splitPlaceholderRule.getSplitRatio()).setLayoutDirection(splitPlaceholderRule.getLayoutDirection()).setSticky(splitPlaceholderRule.isSticky()).setFinishPrimaryWithSecondary(splitPlaceholderRule.getFinishPrimaryWithSecondary());
        C13706o.m87928e(finishPrimaryWithSecondary, "SplitPlaceholderRuleBuil…nishPrimaryWithSecondary)");
        SplitPlaceholderRule build = finishPrimaryWithSecondary.build();
        C13706o.m87928e(build, "builder.build()");
        return build;
    }

    public final Set<EmbeddingRule> translate(Set<? extends EmbeddingRule> set) {
        SplitPairRule splitPairRule;
        C13706o.m87929f(set, "rules");
        Class<?> predicateClassOrNull$window_release = this.predicateAdapter.predicateClassOrNull$window_release();
        if (predicateClassOrNull$window_release == null) {
            return C13627z0.m87806d();
        }
        ArrayList arrayList = new ArrayList(C13616u.m87774u(set, 10));
        for (EmbeddingRule embeddingRule : set) {
            if (embeddingRule instanceof SplitPairRule) {
                splitPairRule = translateSplitPairRule((SplitPairRule) embeddingRule, predicateClassOrNull$window_release);
            } else if (embeddingRule instanceof SplitPlaceholderRule) {
                splitPairRule = translateSplitPlaceholderRule((SplitPlaceholderRule) embeddingRule, predicateClassOrNull$window_release);
            } else if (embeddingRule instanceof ActivityRule) {
                splitPairRule = translateActivityRule((ActivityRule) embeddingRule, predicateClassOrNull$window_release);
            } else {
                throw new IllegalArgumentException("Unsupported rule type");
            }
            arrayList.add((EmbeddingRule) splitPairRule);
        }
        return C13566b0.m87407K0(arrayList);
    }

    public final List<SplitInfo> translate(List<? extends SplitInfo> list) {
        C13706o.m87929f(list, "splitInfoList");
        ArrayList arrayList = new ArrayList(C13616u.m87774u(list, 10));
        for (SplitInfo translate : list) {
            arrayList.add(translate(translate));
        }
        return arrayList;
    }
}
