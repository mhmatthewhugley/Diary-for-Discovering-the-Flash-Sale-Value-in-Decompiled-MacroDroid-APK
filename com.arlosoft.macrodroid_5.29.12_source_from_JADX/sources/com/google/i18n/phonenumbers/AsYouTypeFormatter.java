package com.google.i18n.phonenumbers;

import com.google.i18n.phonenumbers.Phonemetadata;
import java.util.regex.Pattern;

public class AsYouTypeFormatter {

    /* renamed from: a */
    private static final Phonemetadata.PhoneMetadata f56055a = new Phonemetadata.PhoneMetadata().mo64390H("NA");

    /* renamed from: b */
    private static final Pattern f56056b = Pattern.compile("\\[([^\\[\\]])*\\]");

    /* renamed from: c */
    private static final Pattern f56057c = Pattern.compile("\\d(?=[^,}][^,}])");

    /* renamed from: d */
    private static final Pattern f56058d = Pattern.compile("[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*(\\$\\d[-x‐-―−ー－-／  ­​⁠　()（）［］.\\[\\]/~⁓∼～]*)+");

    /* renamed from: e */
    private static final Pattern f56059e = Pattern.compile("[- ]");

    /* renamed from: f */
    private static final Pattern f56060f = Pattern.compile(" ");
}
