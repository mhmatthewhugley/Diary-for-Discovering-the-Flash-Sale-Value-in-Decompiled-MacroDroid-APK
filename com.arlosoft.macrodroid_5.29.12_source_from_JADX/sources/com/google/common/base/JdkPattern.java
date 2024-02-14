package com.google.common.base;

import com.google.common.annotations.GwtIncompatible;
import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
final class JdkPattern extends CommonPattern implements Serializable {
    private static final long serialVersionUID = 0;
    private final Pattern pattern;

    private static final class JdkMatcher extends CommonMatcher {

        /* renamed from: a */
        final Matcher f4165a;

        JdkMatcher(Matcher matcher) {
            this.f4165a = (Matcher) Preconditions.m5392s(matcher);
        }

        /* renamed from: a */
        public int mo22114a() {
            return this.f4165a.end();
        }

        /* renamed from: b */
        public boolean mo22115b() {
            return this.f4165a.find();
        }

        /* renamed from: c */
        public boolean mo22116c(int i) {
            return this.f4165a.find(i);
        }

        /* renamed from: d */
        public boolean mo22117d() {
            return this.f4165a.matches();
        }

        /* renamed from: e */
        public int mo22118e() {
            return this.f4165a.start();
        }
    }

    JdkPattern(Pattern pattern2) {
        this.pattern = (Pattern) Preconditions.m5392s(pattern2);
    }

    /* renamed from: a */
    public int mo22119a() {
        return this.pattern.flags();
    }

    /* renamed from: b */
    public CommonMatcher mo22120b(CharSequence charSequence) {
        return new JdkMatcher(this.pattern.matcher(charSequence));
    }

    /* renamed from: c */
    public String mo22121c() {
        return this.pattern.pattern();
    }

    public String toString() {
        return this.pattern.toString();
    }
}
