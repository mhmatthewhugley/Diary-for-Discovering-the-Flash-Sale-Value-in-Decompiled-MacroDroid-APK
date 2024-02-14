package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.util.Iterator;

@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Splitter {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharMatcher f4198a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f4199b;

    /* renamed from: c */
    private final Strategy f4200c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f4201d;

    /* renamed from: com.google.common.base.Splitter$4 */
    class C17714 implements Strategy {

        /* renamed from: a */
        final /* synthetic */ int f4208a;

        /* renamed from: b */
        public SplittingIterator mo22239a(Splitter splitter, CharSequence charSequence) {
            return new SplittingIterator(splitter, charSequence) {
                /* renamed from: e */
                public int mo22241e(int i) {
                    return i;
                }

                /* renamed from: g */
                public int mo22242g(int i) {
                    int i2 = i + C17714.this.f4208a;
                    if (i2 < this.f4212d.length()) {
                        return i2;
                    }
                    return -1;
                }
            };
        }
    }

    @Beta
    public static final class MapSplitter {
    }

    private static abstract class SplittingIterator extends AbstractIterator<String> {

        /* renamed from: d */
        final CharSequence f4212d;

        /* renamed from: f */
        final CharMatcher f4213f;

        /* renamed from: g */
        final boolean f4214g;

        /* renamed from: o */
        int f4215o = 0;

        /* renamed from: p */
        int f4216p;

        protected SplittingIterator(Splitter splitter, CharSequence charSequence) {
            this.f4213f = splitter.f4198a;
            this.f4214g = splitter.f4199b;
            this.f4216p = splitter.f4201d;
            this.f4212d = charSequence;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String mo22086a() {
            int i;
            int i2 = this.f4215o;
            while (true) {
                int i3 = this.f4215o;
                if (i3 == -1) {
                    return (String) mo22087b();
                }
                int g = mo22242g(i3);
                if (g == -1) {
                    g = this.f4212d.length();
                    this.f4215o = -1;
                } else {
                    this.f4215o = mo22241e(g);
                }
                int i4 = this.f4215o;
                if (i4 == i2) {
                    int i5 = i4 + 1;
                    this.f4215o = i5;
                    if (i5 > this.f4212d.length()) {
                        this.f4215o = -1;
                    }
                } else {
                    while (i2 < g && this.f4213f.mo22108o(this.f4212d.charAt(i2))) {
                        i2++;
                    }
                    while (i > i2 && this.f4213f.mo22108o(this.f4212d.charAt(i - 1))) {
                        g = i - 1;
                    }
                    if (!this.f4214g || i2 != i) {
                        int i6 = this.f4216p;
                    } else {
                        i2 = this.f4215o;
                    }
                }
            }
            int i62 = this.f4216p;
            if (i62 == 1) {
                i = this.f4212d.length();
                this.f4215o = -1;
                while (i > i2 && this.f4213f.mo22108o(this.f4212d.charAt(i - 1))) {
                    i--;
                }
            } else {
                this.f4216p = i62 - 1;
            }
            return this.f4212d.subSequence(i2, i).toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract int mo22241e(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public abstract int mo22242g(int i);
    }

    private interface Strategy {
        /* renamed from: a */
        Iterator<String> mo22239a(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(Strategy strategy) {
        this(strategy, false, CharMatcher.m5180s(), Integer.MAX_VALUE);
    }

    /* renamed from: f */
    public static Splitter m5427f(char c) {
        return m5428g(CharMatcher.m5176k(c));
    }

    /* renamed from: g */
    public static Splitter m5428g(final CharMatcher charMatcher) {
        Preconditions.m5392s(charMatcher);
        return new Splitter(new Strategy() {
            /* renamed from: b */
            public SplittingIterator mo22239a(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) {
                    /* access modifiers changed from: package-private */
                    /* renamed from: e */
                    public int mo22241e(int i) {
                        return i + 1;
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: g */
                    public int mo22242g(int i) {
                        return CharMatcher.this.mo22107j(this.f4212d, i);
                    }
                };
            }
        });
    }

    /* renamed from: h */
    private static Splitter m5429h(final CommonPattern commonPattern) {
        Preconditions.m5385l(!commonPattern.mo22120b("").mo22117d(), "The pattern may not match the empty string: %s", commonPattern);
        return new Splitter(new Strategy() {
            /* renamed from: b */
            public SplittingIterator mo22239a(Splitter splitter, CharSequence charSequence) {
                final CommonMatcher b = CommonPattern.this.mo22120b(charSequence);
                return new SplittingIterator(this, splitter, charSequence) {
                    /* renamed from: e */
                    public int mo22241e(int i) {
                        return b.mo22114a();
                    }

                    /* renamed from: g */
                    public int mo22242g(int i) {
                        if (b.mo22116c(i)) {
                            return b.mo22118e();
                        }
                        return -1;
                    }
                };
            }
        });
    }

    /* renamed from: i */
    public static Splitter m5430i(final String str) {
        Preconditions.m5378e(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return m5427f(str.charAt(0));
        }
        return new Splitter(new Strategy() {
            /* renamed from: b */
            public SplittingIterator mo22239a(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) {
                    /* renamed from: e */
                    public int mo22241e(int i) {
                        return i + str.length();
                    }

                    /* renamed from: g */
                    public int mo22242g(int i) {
                        int length = str.length();
                        int length2 = this.f4212d.length() - length;
                        while (i <= length2) {
                            int i2 = 0;
                            while (i2 < length) {
                                if (this.f4212d.charAt(i2 + i) != str.charAt(i2)) {
                                    i++;
                                } else {
                                    i2++;
                                }
                            }
                            return i;
                        }
                        return -1;
                    }
                };
            }
        });
    }

    @GwtIncompatible
    /* renamed from: j */
    public static Splitter m5431j(String str) {
        return m5429h(Platform.m5363a(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public Iterator<String> m5432l(CharSequence charSequence) {
        return this.f4200c.mo22239a(this, charSequence);
    }

    /* renamed from: e */
    public Splitter mo22235e() {
        return new Splitter(this.f4200c, true, this.f4198a, this.f4201d);
    }

    /* renamed from: k */
    public Iterable<String> mo22236k(final CharSequence charSequence) {
        Preconditions.m5392s(charSequence);
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                return Splitter.this.m5432l(charSequence);
            }

            public String toString() {
                Joiner i = Joiner.m5314i(", ");
                StringBuilder sb = new StringBuilder();
                sb.append('[');
                StringBuilder c = i.mo22178c(sb, this);
                c.append(']');
                return c.toString();
            }
        };
    }

    /* renamed from: m */
    public Splitter mo22237m() {
        return mo22238n(CharMatcher.m5183w());
    }

    /* renamed from: n */
    public Splitter mo22238n(CharMatcher charMatcher) {
        Preconditions.m5392s(charMatcher);
        return new Splitter(this.f4200c, this.f4199b, charMatcher, this.f4201d);
    }

    private Splitter(Strategy strategy, boolean z, CharMatcher charMatcher, int i) {
        this.f4200c = strategy;
        this.f4199b = z;
        this.f4198a = charMatcher;
        this.f4201d = i;
    }
}
