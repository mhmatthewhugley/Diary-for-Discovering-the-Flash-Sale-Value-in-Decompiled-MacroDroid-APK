package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;

@Metadata(mo71667d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0014J\b\u0010\u0019\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u001a"}, mo71668d2 = {"Landroidx/window/embedding/SplitPairFilter;", "", "primaryActivityName", "Landroid/content/ComponentName;", "secondaryActivityName", "secondaryActivityIntentAction", "", "(Landroid/content/ComponentName;Landroid/content/ComponentName;Ljava/lang/String;)V", "getPrimaryActivityName", "()Landroid/content/ComponentName;", "getSecondaryActivityIntentAction", "()Ljava/lang/String;", "getSecondaryActivityName", "equals", "", "other", "hashCode", "", "matchesActivityIntentPair", "primaryActivity", "Landroid/app/Activity;", "secondaryActivityIntent", "Landroid/content/Intent;", "matchesActivityPair", "secondaryActivity", "toString", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
@ExperimentalWindowApi
/* compiled from: SplitPairFilter.kt */
public final class SplitPairFilter {
    private final ComponentName primaryActivityName;
    private final String secondaryActivityIntentAction;
    private final ComponentName secondaryActivityName;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SplitPairFilter(android.content.ComponentName r18, android.content.ComponentName r19, java.lang.String r20) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            java.lang.String r3 = "primaryActivityName"
            kotlin.jvm.internal.C13706o.m87929f(r1, r3)
            java.lang.String r3 = "secondaryActivityName"
            kotlin.jvm.internal.C13706o.m87929f(r2, r3)
            r17.<init>()
            r0.primaryActivityName = r1
            r0.secondaryActivityName = r2
            r3 = r20
            r0.secondaryActivityIntentAction = r3
            java.lang.String r7 = r18.getPackageName()
            java.lang.String r3 = "primaryActivityName.packageName"
            kotlin.jvm.internal.C13706o.m87928e(r7, r3)
            java.lang.String r14 = r18.getClassName()
            java.lang.String r1 = "primaryActivityName.className"
            kotlin.jvm.internal.C13706o.m87928e(r14, r1)
            java.lang.String r15 = r19.getPackageName()
            java.lang.String r1 = "secondaryActivityName.packageName"
            kotlin.jvm.internal.C13706o.m87928e(r15, r1)
            java.lang.String r13 = r19.getClassName()
            java.lang.String r1 = "secondaryActivityName.className"
            kotlin.jvm.internal.C13706o.m87928e(r13, r1)
            int r1 = r7.length()
            r16 = 1
            r12 = 0
            if (r1 != 0) goto L_0x004a
            r1 = 1
            goto L_0x004b
        L_0x004a:
            r1 = 0
        L_0x004b:
            if (r1 != 0) goto L_0x005a
            int r1 = r15.length()
            if (r1 != 0) goto L_0x0055
            r1 = 1
            goto L_0x0056
        L_0x0055:
            r1 = 0
        L_0x0056:
            if (r1 != 0) goto L_0x005a
            r1 = 1
            goto L_0x005b
        L_0x005a:
            r1 = 0
        L_0x005b:
            if (r1 == 0) goto L_0x013f
            int r1 = r14.length()
            if (r1 != 0) goto L_0x0065
            r1 = 1
            goto L_0x0066
        L_0x0065:
            r1 = 0
        L_0x0066:
            if (r1 != 0) goto L_0x0075
            int r1 = r13.length()
            if (r1 != 0) goto L_0x0070
            r1 = 1
            goto L_0x0071
        L_0x0070:
            r1 = 0
        L_0x0071:
            if (r1 != 0) goto L_0x0075
            r1 = 1
            goto L_0x0076
        L_0x0075:
            r1 = 0
        L_0x0076:
            if (r1 == 0) goto L_0x0133
            java.lang.String r11 = "*"
            r10 = 2
            r9 = 0
            boolean r1 = kotlin.text.C15177w.m93663N(r7, r11, r12, r10, r9)
            if (r1 == 0) goto L_0x0098
            r3 = 0
            r4 = 0
            r5 = 6
            r6 = 0
            java.lang.String r2 = "*"
            r1 = r7
            int r1 = kotlin.text.C15177w.m93682a0(r1, r2, r3, r4, r5, r6)
            int r2 = r7.length()
            int r2 = r2 + -1
            if (r1 != r2) goto L_0x0096
            goto L_0x0098
        L_0x0096:
            r1 = 0
            goto L_0x0099
        L_0x0098:
            r1 = 1
        L_0x0099:
            java.lang.String r2 = "Wildcard in package name is only allowed at the end."
            if (r1 == 0) goto L_0x0129
            boolean r1 = kotlin.text.C15177w.m93663N(r14, r11, r12, r10, r9)
            if (r1 == 0) goto L_0x00c3
            r1 = 0
            r3 = 0
            r4 = 6
            r5 = 0
            java.lang.String r6 = "*"
            r8 = r14
            r7 = r9
            r9 = r6
            r6 = 2
            r10 = r1
            r1 = r11
            r11 = r3
            r3 = 0
            r12 = r4
            r4 = r13
            r13 = r5
            int r5 = kotlin.text.C15177w.m93682a0(r8, r9, r10, r11, r12, r13)
            int r8 = r14.length()
            int r8 = r8 + -1
            if (r5 != r8) goto L_0x00c1
            goto L_0x00c8
        L_0x00c1:
            r12 = 0
            goto L_0x00c9
        L_0x00c3:
            r7 = r9
            r1 = r11
            r4 = r13
            r3 = 0
            r6 = 2
        L_0x00c8:
            r12 = 1
        L_0x00c9:
            java.lang.String r5 = "Wildcard in class name is only allowed at the end."
            if (r12 == 0) goto L_0x011f
            boolean r8 = kotlin.text.C15177w.m93663N(r15, r1, r3, r6, r7)
            if (r8 == 0) goto L_0x00e9
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.lang.String r9 = "*"
            r8 = r15
            int r8 = kotlin.text.C15177w.m93682a0(r8, r9, r10, r11, r12, r13)
            int r9 = r15.length()
            int r9 = r9 + -1
            if (r8 != r9) goto L_0x00e7
            goto L_0x00e9
        L_0x00e7:
            r12 = 0
            goto L_0x00ea
        L_0x00e9:
            r12 = 1
        L_0x00ea:
            if (r12 == 0) goto L_0x0115
            boolean r1 = kotlin.text.C15177w.m93663N(r4, r1, r3, r6, r7)
            if (r1 == 0) goto L_0x0108
            r10 = 0
            r11 = 0
            r12 = 6
            r13 = 0
            java.lang.String r9 = "*"
            r8 = r4
            int r1 = kotlin.text.C15177w.m93682a0(r8, r9, r10, r11, r12, r13)
            int r2 = r4.length()
            int r2 = r2 + -1
            if (r1 != r2) goto L_0x0106
            goto L_0x0108
        L_0x0106:
            r16 = 0
        L_0x0108:
            if (r16 == 0) goto L_0x010b
            return
        L_0x010b:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r5.toString()
            r1.<init>(r2)
            throw r1
        L_0x0115:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x011f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r5.toString()
            r1.<init>(r2)
            throw r1
        L_0x0129:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x0133:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Activity class name must not be empty."
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        L_0x013f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Package name must not be empty"
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitPairFilter.<init>(android.content.ComponentName, android.content.ComponentName, java.lang.String):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairFilter)) {
            return false;
        }
        SplitPairFilter splitPairFilter = (SplitPairFilter) obj;
        return C13706o.m87924a(this.primaryActivityName, splitPairFilter.primaryActivityName) && C13706o.m87924a(this.secondaryActivityName, splitPairFilter.secondaryActivityName) && C13706o.m87924a(this.secondaryActivityIntentAction, splitPairFilter.secondaryActivityIntentAction);
    }

    public final ComponentName getPrimaryActivityName() {
        return this.primaryActivityName;
    }

    public final String getSecondaryActivityIntentAction() {
        return this.secondaryActivityIntentAction;
    }

    public final ComponentName getSecondaryActivityName() {
        return this.secondaryActivityName;
    }

    public int hashCode() {
        int hashCode = ((this.primaryActivityName.hashCode() * 31) + this.secondaryActivityName.hashCode()) * 31;
        String str = this.secondaryActivityIntentAction;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean matchesActivityIntentPair(Activity activity, Intent intent) {
        C13706o.m87929f(activity, "primaryActivity");
        C13706o.m87929f(intent, "secondaryActivityIntent");
        ComponentName componentName = activity.getComponentName();
        MatcherUtils matcherUtils = MatcherUtils.INSTANCE;
        if (!matcherUtils.areComponentsMatching$window_release(componentName, this.primaryActivityName) || !matcherUtils.areComponentsMatching$window_release(intent.getComponent(), this.secondaryActivityName)) {
            return false;
        }
        String str = this.secondaryActivityIntentAction;
        if (str == null || C13706o.m87924a(str, intent.getAction())) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (matchesActivityIntentPair(r6, r7) != false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean matchesActivityPair(android.app.Activity r6, android.app.Activity r7) {
        /*
            r5 = this;
            java.lang.String r0 = "primaryActivity"
            kotlin.jvm.internal.C13706o.m87929f(r6, r0)
            java.lang.String r0 = "secondaryActivity"
            kotlin.jvm.internal.C13706o.m87929f(r7, r0)
            androidx.window.embedding.MatcherUtils r0 = androidx.window.embedding.MatcherUtils.INSTANCE
            android.content.ComponentName r1 = r6.getComponentName()
            android.content.ComponentName r2 = r5.primaryActivityName
            boolean r1 = r0.areComponentsMatching$window_release(r1, r2)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0028
            android.content.ComponentName r1 = r7.getComponentName()
            android.content.ComponentName r4 = r5.secondaryActivityName
            boolean r0 = r0.areComponentsMatching$window_release(r1, r4)
            if (r0 == 0) goto L_0x0028
            r0 = 1
            goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            android.content.Intent r1 = r7.getIntent()
            if (r1 == 0) goto L_0x0043
            if (r0 == 0) goto L_0x0041
            android.content.Intent r7 = r7.getIntent()
            java.lang.String r0 = "secondaryActivity.intent"
            kotlin.jvm.internal.C13706o.m87928e(r7, r0)
            boolean r6 = r5.matchesActivityIntentPair(r6, r7)
            if (r6 == 0) goto L_0x0041
            goto L_0x0042
        L_0x0041:
            r2 = 0
        L_0x0042:
            r0 = r2
        L_0x0043:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitPairFilter.matchesActivityPair(android.app.Activity, android.app.Activity):boolean");
    }

    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.primaryActivityName + ", secondaryActivityName=" + this.secondaryActivityName + ", secondaryActivityAction=" + this.secondaryActivityIntentAction + '}';
    }
}
