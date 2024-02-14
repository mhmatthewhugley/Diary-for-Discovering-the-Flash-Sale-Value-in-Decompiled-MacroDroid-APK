package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.escape.Escaper;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class UrlEscapers {

    /* renamed from: a */
    private static final Escaper f53205a = new PercentEscaper("-_.*", true);

    /* renamed from: b */
    private static final Escaper f53206b = new PercentEscaper("-._~!$'()*,;&=@:+", false);

    /* renamed from: c */
    private static final Escaper f53207c = new PercentEscaper("-._~!$'()*,;&=@:+/?", false);

    private UrlEscapers() {
    }
}
