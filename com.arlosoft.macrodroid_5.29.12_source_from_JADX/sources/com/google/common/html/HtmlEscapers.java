package com.google.common.html;

import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class HtmlEscapers {

    /* renamed from: a */
    private static final Escaper f17608a = Escapers.m29222a().mo36794b('\"', "&quot;").mo36794b('\'', "&#39;").mo36794b('&', "&amp;").mo36794b('<', "&lt;").mo36794b('>', "&gt;").mo36795c();

    private HtmlEscapers() {
    }
}
