package androidx.window.embedding;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import androidx.webkit.ProxyConfig;
import androidx.window.C1302R;
import androidx.window.core.ExperimentalWindowApi;
import androidx.window.embedding.ActivityRule;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C13706o;
import org.apache.commons.p353io.FilenameUtils;

@Metadata(mo71667d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J%\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001fH\u0000¢\u0006\u0002\b J \u0010!\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\u001fH\u0002¨\u0006#"}, mo71668d2 = {"Landroidx/window/embedding/SplitRuleParser;", "", "()V", "buildClassName", "Landroid/content/ComponentName;", "pkg", "", "clsSeq", "", "defaultMinWidth", "", "resources", "Landroid/content/res/Resources;", "parseActivityFilter", "Landroidx/window/embedding/ActivityFilter;", "context", "Landroid/content/Context;", "parser", "Landroid/content/res/XmlResourceParser;", "parseSplitActivityRule", "Landroidx/window/embedding/ActivityRule;", "parseSplitPairFilter", "Landroidx/window/embedding/SplitPairFilter;", "parseSplitPairRule", "Landroidx/window/embedding/SplitPairRule;", "parseSplitPlaceholderRule", "Landroidx/window/embedding/SplitPlaceholderRule;", "parseSplitRules", "", "Landroidx/window/embedding/EmbeddingRule;", "staticRuleResourceId", "", "parseSplitRules$window_release", "parseSplitXml", "splitResourceId", "window_release"}, mo71669k = 1, mo71670mv = {1, 7, 1}, mo71672xi = 48)
@ExperimentalWindowApi
/* compiled from: SplitRuleParser.kt */
public final class SplitRuleParser {
    private final ComponentName buildClassName(String str, CharSequence charSequence) {
        if (charSequence != null) {
            if (!(charSequence.length() == 0)) {
                String obj = charSequence.toString();
                if (obj.charAt(0) == '.') {
                    return new ComponentName(str, str + obj);
                }
                int Z = C15177w.m93681Z(obj, '/', 0, false, 6, (Object) null);
                if (Z > 0) {
                    str = obj.substring(0, Z);
                    C13706o.m87928e(str, "this as java.lang.String…ing(startIndex, endIndex)");
                    obj = obj.substring(Z + 1);
                    C13706o.m87928e(obj, "this as java.lang.String).substring(startIndex)");
                }
                if (C13706o.m87924a(obj, ProxyConfig.MATCH_ALL_SCHEMES) || C15177w.m93681Z(obj, FilenameUtils.EXTENSION_SEPARATOR, 0, false, 6, (Object) null) >= 0) {
                    return new ComponentName(str, obj);
                }
                return new ComponentName(str, str + FilenameUtils.EXTENSION_SEPARATOR + obj);
            }
        }
        throw new IllegalArgumentException("Activity name must not be null");
    }

    private final float defaultMinWidth(Resources resources) {
        return (((float) 600) * resources.getDisplayMetrics().density) + 0.5f;
    }

    private final ActivityFilter parseActivityFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C1302R.styleable.ActivityFilter, 0, 0);
        String string = obtainStyledAttributes.getString(C1302R.styleable.ActivityFilter_activityName);
        String string2 = obtainStyledAttributes.getString(C1302R.styleable.ActivityFilter_activityAction);
        String packageName = context.getApplicationContext().getPackageName();
        C13706o.m87928e(packageName, "packageName");
        return new ActivityFilter(buildClassName(packageName, string), string2);
    }

    private final ActivityRule parseSplitActivityRule(Context context, XmlResourceParser xmlResourceParser) {
        return new ActivityRule.Builder(C13627z0.m87806d()).setAlwaysExpand(context.getTheme().obtainStyledAttributes(xmlResourceParser, C1302R.styleable.ActivityRule, 0, 0).getBoolean(C1302R.styleable.ActivityRule_alwaysExpand, false)).build();
    }

    private final SplitPairFilter parseSplitPairFilter(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C1302R.styleable.SplitPairFilter, 0, 0);
        String string = obtainStyledAttributes.getString(C1302R.styleable.SplitPairFilter_primaryActivityName);
        String string2 = obtainStyledAttributes.getString(C1302R.styleable.SplitPairFilter_secondaryActivityName);
        String string3 = obtainStyledAttributes.getString(C1302R.styleable.SplitPairFilter_secondaryActivityAction);
        String packageName = context.getApplicationContext().getPackageName();
        C13706o.m87928e(packageName, "packageName");
        return new SplitPairFilter(buildClassName(packageName, string), buildClassName(packageName, string2), string3);
    }

    private final SplitPairRule parseSplitPairRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C1302R.styleable.SplitPairRule, 0, 0);
        float f = obtainStyledAttributes.getFloat(C1302R.styleable.SplitPairRule_splitRatio, 0.5f);
        int i = C1302R.styleable.SplitPairRule_splitMinWidth;
        Resources resources = context.getResources();
        C13706o.m87928e(resources, "context.resources");
        int dimension = (int) obtainStyledAttributes.getDimension(i, defaultMinWidth(resources));
        int i2 = C1302R.styleable.SplitPairRule_splitMinSmallestWidth;
        Resources resources2 = context.getResources();
        C13706o.m87928e(resources2, "context.resources");
        int dimension2 = (int) obtainStyledAttributes.getDimension(i2, defaultMinWidth(resources2));
        int i3 = obtainStyledAttributes.getInt(C1302R.styleable.SplitPairRule_splitLayoutDirection, 3);
        return new SplitPairRule(C13627z0.m87806d(), obtainStyledAttributes.getInt(C1302R.styleable.SplitPairRule_finishPrimaryWithSecondary, 0), obtainStyledAttributes.getInt(C1302R.styleable.SplitPairRule_finishSecondaryWithPrimary, 1), obtainStyledAttributes.getBoolean(C1302R.styleable.SplitPairRule_clearTop, false), dimension, dimension2, f, i3);
    }

    private final SplitPlaceholderRule parseSplitPlaceholderRule(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(xmlResourceParser, C1302R.styleable.SplitPlaceholderRule, 0, 0);
        String string = obtainStyledAttributes.getString(C1302R.styleable.SplitPlaceholderRule_placeholderActivityName);
        boolean z = obtainStyledAttributes.getBoolean(C1302R.styleable.SplitPlaceholderRule_stickyPlaceholder, false);
        int i = obtainStyledAttributes.getInt(C1302R.styleable.SplitPlaceholderRule_finishPrimaryWithSecondary, 1);
        float f = obtainStyledAttributes.getFloat(C1302R.styleable.SplitPlaceholderRule_splitRatio, 0.5f);
        int i2 = C1302R.styleable.SplitPlaceholderRule_splitMinWidth;
        Resources resources = context.getResources();
        C13706o.m87928e(resources, "context.resources");
        int dimension = (int) obtainStyledAttributes.getDimension(i2, defaultMinWidth(resources));
        int i3 = C1302R.styleable.SplitPlaceholderRule_splitMinSmallestWidth;
        Resources resources2 = context.getResources();
        C13706o.m87928e(resources2, "context.resources");
        int dimension2 = (int) obtainStyledAttributes.getDimension(i3, defaultMinWidth(resources2));
        int i4 = obtainStyledAttributes.getInt(C1302R.styleable.SplitPlaceholderRule_splitLayoutDirection, 3);
        String packageName = context.getApplicationContext().getPackageName();
        C13706o.m87928e(packageName, "packageName");
        ComponentName buildClassName = buildClassName(packageName, string);
        Set d = C13627z0.m87806d();
        Intent component = new Intent().setComponent(buildClassName);
        C13706o.m87928e(component, "Intent().setComponent(pl…eholderActivityClassName)");
        return new SplitPlaceholderRule(d, component, z, i, dimension, dimension2, f, i4);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0061, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        r4 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00ae, code lost:
        r5 = r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Set<androidx.window.embedding.EmbeddingRule> parseSplitXml(android.content.Context r9, int r10) {
        /*
            r8 = this;
            android.content.res.Resources r0 = r9.getResources()
            r1 = 0
            android.content.res.XmlResourceParser r10 = r0.getXml(r10)     // Catch:{ NotFoundException -> 0x00f2 }
            java.lang.String r0 = "resources.getXml(splitResourceId)"
            kotlin.jvm.internal.C13706o.m87928e(r10, r0)     // Catch:{ NotFoundException -> 0x00f2 }
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            int r2 = r10.getDepth()
            int r3 = r10.next()
            r4 = r1
            r5 = r4
            r6 = r5
        L_0x001e:
            r7 = 1
            if (r3 == r7) goto L_0x00f1
            r7 = 3
            if (r3 != r7) goto L_0x002a
            int r3 = r10.getDepth()
            if (r3 <= r2) goto L_0x00f1
        L_0x002a:
            int r3 = r10.getEventType()
            r7 = 2
            if (r3 != r7) goto L_0x00eb
            java.lang.String r3 = r10.getName()
            java.lang.String r7 = "split-config"
            boolean r3 = kotlin.jvm.internal.C13706o.m87924a(r7, r3)
            if (r3 == 0) goto L_0x003f
            goto L_0x00eb
        L_0x003f:
            java.lang.String r3 = r10.getName()
            if (r3 == 0) goto L_0x00e5
            int r7 = r3.hashCode()
            switch(r7) {
                case 511422343: goto L_0x00b0;
                case 520447504: goto L_0x009c;
                case 1579230604: goto L_0x007a;
                case 1793077963: goto L_0x0064;
                case 2050988213: goto L_0x004e;
                default: goto L_0x004c;
            }
        L_0x004c:
            goto L_0x00e5
        L_0x004e:
            java.lang.String r7 = "SplitPlaceholderRule"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0058
            goto L_0x00e5
        L_0x0058:
            androidx.window.embedding.SplitPlaceholderRule r3 = r8.parseSplitPlaceholderRule(r9, r10)
            r0.add(r3)
            r4 = r1
            r5 = r4
        L_0x0061:
            r6 = r3
            goto L_0x00e5
        L_0x0064:
            java.lang.String r7 = "ActivityRule"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x006e
            goto L_0x00e5
        L_0x006e:
            androidx.window.embedding.ActivityRule r3 = r8.parseSplitActivityRule(r9, r10)
            r0.add(r3)
            r5 = r1
            r6 = r5
        L_0x0077:
            r4 = r3
            goto L_0x00e5
        L_0x007a:
            java.lang.String r7 = "SplitPairFilter"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x0083
            goto L_0x00e5
        L_0x0083:
            if (r5 == 0) goto L_0x0094
            androidx.window.embedding.SplitPairFilter r3 = r8.parseSplitPairFilter(r9, r10)
            r0.remove(r5)
            androidx.window.embedding.SplitPairRule r3 = r5.plus$window_release(r3)
            r0.add(r3)
            goto L_0x00ae
        L_0x0094:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Found orphaned SplitPairFilter outside of SplitPairRule"
            r9.<init>(r10)
            throw r9
        L_0x009c:
            java.lang.String r7 = "SplitPairRule"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x00a5
            goto L_0x00e5
        L_0x00a5:
            androidx.window.embedding.SplitPairRule r3 = r8.parseSplitPairRule(r9, r10)
            r0.add(r3)
            r4 = r1
            r6 = r4
        L_0x00ae:
            r5 = r3
            goto L_0x00e5
        L_0x00b0:
            java.lang.String r7 = "ActivityFilter"
            boolean r3 = r3.equals(r7)
            if (r3 != 0) goto L_0x00b9
            goto L_0x00e5
        L_0x00b9:
            if (r4 != 0) goto L_0x00c6
            if (r6 == 0) goto L_0x00be
            goto L_0x00c6
        L_0x00be:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r10 = "Found orphaned ActivityFilter"
            r9.<init>(r10)
            throw r9
        L_0x00c6:
            androidx.window.embedding.ActivityFilter r3 = r8.parseActivityFilter(r9, r10)
            if (r4 == 0) goto L_0x00d7
            r0.remove(r4)
            androidx.window.embedding.ActivityRule r3 = r4.plus$window_release(r3)
            r0.add(r3)
            goto L_0x0077
        L_0x00d7:
            if (r6 == 0) goto L_0x00e5
            r0.remove(r6)
            androidx.window.embedding.SplitPlaceholderRule r3 = r6.plus$window_release(r3)
            r0.add(r3)
            goto L_0x0061
        L_0x00e5:
            int r3 = r10.next()
            goto L_0x001e
        L_0x00eb:
            int r3 = r10.next()
            goto L_0x001e
        L_0x00f1:
            return r0
        L_0x00f2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.embedding.SplitRuleParser.parseSplitXml(android.content.Context, int):java.util.Set");
    }

    public final Set<EmbeddingRule> parseSplitRules$window_release(Context context, int i) {
        C13706o.m87929f(context, "context");
        return parseSplitXml(context, i);
    }
}
