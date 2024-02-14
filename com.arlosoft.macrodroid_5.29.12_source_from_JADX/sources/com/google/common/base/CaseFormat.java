package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Objects;
import org.apache.commons.cli.HelpFormatter;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public enum CaseFormat {
    LOWER_HYPHEN(CharMatcher.m5176k('-'), HelpFormatter.DEFAULT_OPT_PREFIX) {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public String mo22091e(CaseFormat caseFormat, String str) {
            if (caseFormat == CaseFormat.LOWER_UNDERSCORE) {
                return str.replace('-', '_');
            }
            if (caseFormat == CaseFormat.UPPER_UNDERSCORE) {
                return Ascii.m5149e(str.replace('-', '_'));
            }
            return CaseFormat.super.mo22091e(caseFormat, str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public String mo22093i(String str) {
            return Ascii.m5147c(str);
        }
    },
    LOWER_UNDERSCORE(CharMatcher.m5176k('_'), "_") {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public String mo22091e(CaseFormat caseFormat, String str) {
            if (caseFormat == CaseFormat.LOWER_HYPHEN) {
                return str.replace('_', '-');
            }
            if (caseFormat == CaseFormat.UPPER_UNDERSCORE) {
                return Ascii.m5149e(str);
            }
            return CaseFormat.super.mo22091e(caseFormat, str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public String mo22093i(String str) {
            return Ascii.m5147c(str);
        }
    },
    LOWER_CAMEL(CharMatcher.m5175h('A', 'Z'), "") {
        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public String mo22092g(String str) {
            return Ascii.m5147c(str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public String mo22093i(String str) {
            return CaseFormat.m5153f(str);
        }
    },
    UPPER_CAMEL(CharMatcher.m5175h('A', 'Z'), "") {
        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public String mo22093i(String str) {
            return CaseFormat.m5153f(str);
        }
    },
    UPPER_UNDERSCORE(CharMatcher.m5176k('_'), "_") {
        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public String mo22091e(CaseFormat caseFormat, String str) {
            if (caseFormat == CaseFormat.LOWER_HYPHEN) {
                return Ascii.m5147c(str.replace('_', '-'));
            }
            if (caseFormat == CaseFormat.LOWER_UNDERSCORE) {
                return Ascii.m5147c(str);
            }
            return CaseFormat.super.mo22091e(caseFormat, str);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public String mo22093i(String str) {
            return Ascii.m5149e(str);
        }
    };
    
    private final CharMatcher wordBoundary;
    private final String wordSeparator;

    private static final class StringConverter extends Converter<String, String> implements Serializable {
        private static final long serialVersionUID = 0;
        private final CaseFormat sourceFormat;
        private final CaseFormat targetFormat;

        public boolean equals(Object obj) {
            if (!(obj instanceof StringConverter)) {
                return false;
            }
            StringConverter stringConverter = (StringConverter) obj;
            if (!this.sourceFormat.equals(stringConverter.sourceFormat) || !this.targetFormat.equals(stringConverter.targetFormat)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public String mo22095d(String str) {
            return this.targetFormat.mo22094j(this.sourceFormat, str);
        }

        public int hashCode() {
            return this.sourceFormat.hashCode() ^ this.targetFormat.hashCode();
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public String mo22096e(String str) {
            return this.sourceFormat.mo22094j(this.targetFormat, str);
        }

        public String toString() {
            String valueOf = String.valueOf(this.sourceFormat);
            String valueOf2 = String.valueOf(this.targetFormat);
            StringBuilder sb = new StringBuilder(valueOf.length() + 14 + valueOf2.length());
            sb.append(valueOf);
            sb.append(".converterTo(");
            sb.append(valueOf2);
            sb.append(")");
            return sb.toString();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public static String m5153f(String str) {
        if (str.isEmpty()) {
            return str;
        }
        char d = Ascii.m5148d(str.charAt(0));
        String c = Ascii.m5147c(str.substring(1));
        StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 1);
        sb.append(d);
        sb.append(c);
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo22091e(CaseFormat caseFormat, String str) {
        StringBuilder sb = null;
        int i = 0;
        int i2 = -1;
        while (true) {
            i2 = this.wordBoundary.mo22107j(str, i2 + 1);
            if (i2 == -1) {
                break;
            }
            if (i == 0) {
                sb = new StringBuilder(str.length() + (caseFormat.wordSeparator.length() * 4));
                sb.append(caseFormat.mo22092g(str.substring(i, i2)));
            } else {
                Objects.requireNonNull(sb);
                sb.append(caseFormat.mo22093i(str.substring(i, i2)));
            }
            sb.append(caseFormat.wordSeparator);
            i = this.wordSeparator.length() + i2;
        }
        if (i == 0) {
            return caseFormat.mo22092g(str);
        }
        Objects.requireNonNull(sb);
        sb.append(caseFormat.mo22093i(str.substring(i)));
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public String mo22092g(String str) {
        return mo22093i(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public abstract String mo22093i(String str);

    /* renamed from: j */
    public final String mo22094j(CaseFormat caseFormat, String str) {
        Preconditions.m5392s(caseFormat);
        Preconditions.m5392s(str);
        return caseFormat == this ? str : mo22091e(caseFormat, str);
    }

    private CaseFormat(CharMatcher charMatcher, String str) {
        this.wordBoundary = charMatcher;
        this.wordSeparator = str;
    }
}
