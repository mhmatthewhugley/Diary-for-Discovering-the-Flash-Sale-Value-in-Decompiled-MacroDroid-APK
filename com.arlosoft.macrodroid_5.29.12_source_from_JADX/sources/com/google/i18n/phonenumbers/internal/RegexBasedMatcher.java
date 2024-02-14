package com.google.i18n.phonenumbers.internal;

import com.google.i18n.phonenumbers.RegexCache;

public final class RegexBasedMatcher implements MatcherApi {

    /* renamed from: a */
    private final RegexCache f56203a = new RegexCache(100);

    private RegexBasedMatcher() {
    }

    /* renamed from: a */
    public static MatcherApi m78951a() {
        return new RegexBasedMatcher();
    }
}
