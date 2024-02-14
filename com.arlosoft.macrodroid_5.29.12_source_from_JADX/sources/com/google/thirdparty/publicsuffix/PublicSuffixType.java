package com.google.thirdparty.publicsuffix;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;

@GwtCompatible
@Beta
public enum PublicSuffixType {
    PRIVATE(':', ','),
    REGISTRY('!', '?');
    
    private final char innerNodeCode;
    private final char leafNodeCode;

    private PublicSuffixType(char c, char c2) {
        this.innerNodeCode = c;
        this.leafNodeCode = c2;
    }

    /* renamed from: d */
    static PublicSuffixType m81647d(char c) {
        for (PublicSuffixType publicSuffixType : values()) {
            if (publicSuffixType.mo65553e() == c || publicSuffixType.mo65554f() == c) {
                return publicSuffixType;
            }
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("No enum corresponding to given code: ");
        sb.append(c);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public char mo65553e() {
        return this.innerNodeCode;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public char mo65554f() {
        return this.leafNodeCode;
    }
}
