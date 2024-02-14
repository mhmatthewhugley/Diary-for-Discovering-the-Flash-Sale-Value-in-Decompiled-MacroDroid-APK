package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.CharMatcher;
import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.errorprone.annotations.Immutable;
import org.apache.commons.p353io.FilenameUtils;

@GwtCompatible
@Immutable
@ElementTypesAreNonnullByDefault
public final class InternetDomainName {

    /* renamed from: b */
    private static final CharMatcher f53067b = CharMatcher.m5173d(".。．｡");

    /* renamed from: c */
    private static final Splitter f53068c = Splitter.m5427f(FilenameUtils.EXTENSION_SEPARATOR);

    /* renamed from: d */
    private static final Joiner f53069d = Joiner.m5313h(FilenameUtils.EXTENSION_SEPARATOR);

    /* renamed from: e */
    private static final CharMatcher f53070e;

    /* renamed from: f */
    private static final CharMatcher f53071f;

    /* renamed from: g */
    private static final CharMatcher f53072g;

    /* renamed from: h */
    private static final CharMatcher f53073h;

    /* renamed from: a */
    private final String f53074a;

    static {
        CharMatcher d = CharMatcher.m5173d("-_");
        f53070e = d;
        CharMatcher h = CharMatcher.m5175h('0', '9');
        f53071f = h;
        CharMatcher u = CharMatcher.m5175h('a', 'z').mo22113u(CharMatcher.m5175h('A', 'Z'));
        f53072g = u;
        f53073h = h.mo22113u(u).mo22113u(d);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InternetDomainName) {
            return this.f53074a.equals(((InternetDomainName) obj).f53074a);
        }
        return false;
    }

    public int hashCode() {
        return this.f53074a.hashCode();
    }

    public String toString() {
        return this.f53074a;
    }
}
