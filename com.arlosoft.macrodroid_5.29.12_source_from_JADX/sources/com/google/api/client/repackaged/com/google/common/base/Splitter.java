package com.google.api.client.repackaged.com.google.common.base;

import com.google.api.client.repackaged.com.google.common.annotations.Beta;
import com.google.api.client.repackaged.com.google.common.annotations.GwtCompatible;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@GwtCompatible
public final class Splitter {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final CharMatcher f52637a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final boolean f52638b;

    /* renamed from: c */
    private final Strategy f52639c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final int f52640d;

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.Splitter$2 */
    final class C108652 implements Strategy {

        /* renamed from: a */
        final /* synthetic */ String f52643a;

        /* renamed from: b */
        public SplittingIterator mo60615a(Splitter splitter, CharSequence charSequence) {
            return new SplittingIterator(splitter, charSequence) {
                /* renamed from: e */
                public int mo60617e(int i) {
                    return i + C108652.this.f52643a.length();
                }

                /* renamed from: g */
                public int mo60618g(int i) {
                    int length = C108652.this.f52643a.length();
                    int length2 = this.f52652d.length() - length;
                    while (i <= length2) {
                        int i2 = 0;
                        while (i2 < length) {
                            if (this.f52652d.charAt(i2 + i) != C108652.this.f52643a.charAt(i2)) {
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
    }

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.Splitter$3 */
    final class C108673 implements Strategy {

        /* renamed from: a */
        final /* synthetic */ Pattern f52645a;

        /* renamed from: b */
        public SplittingIterator mo60615a(Splitter splitter, CharSequence charSequence) {
            final Matcher matcher = this.f52645a.matcher(charSequence);
            return new SplittingIterator(splitter, charSequence) {
                /* renamed from: e */
                public int mo60617e(int i) {
                    return matcher.end();
                }

                /* renamed from: g */
                public int mo60618g(int i) {
                    if (matcher.find(i)) {
                        return matcher.start();
                    }
                    return -1;
                }
            };
        }
    }

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.Splitter$4 */
    final class C108694 implements Strategy {

        /* renamed from: a */
        final /* synthetic */ int f52648a;

        /* renamed from: b */
        public SplittingIterator mo60615a(Splitter splitter, CharSequence charSequence) {
            return new SplittingIterator(splitter, charSequence) {
                /* renamed from: e */
                public int mo60617e(int i) {
                    return i;
                }

                /* renamed from: g */
                public int mo60618g(int i) {
                    int i2 = i + C108694.this.f52648a;
                    if (i2 < this.f52652d.length()) {
                        return i2;
                    }
                    return -1;
                }
            };
        }
    }

    /* renamed from: com.google.api.client.repackaged.com.google.common.base.Splitter$5 */
    class C108715 implements Iterable<String> {

        /* renamed from: a */
        final /* synthetic */ CharSequence f52650a;

        /* renamed from: c */
        final /* synthetic */ Splitter f52651c;

        public Iterator<String> iterator() {
            return this.f52651c.m72491h(this.f52650a);
        }

        public String toString() {
            Joiner h = Joiner.m72455h(", ");
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            StringBuilder c = h.mo60602c(sb, this);
            c.append(']');
            return c.toString();
        }
    }

    @Beta
    public static final class MapSplitter {
    }

    private static abstract class SplittingIterator extends AbstractIterator<String> {

        /* renamed from: d */
        final CharSequence f52652d;

        /* renamed from: f */
        final CharMatcher f52653f;

        /* renamed from: g */
        final boolean f52654g;

        /* renamed from: o */
        int f52655o = 0;

        /* renamed from: p */
        int f52656p;

        protected SplittingIterator(Splitter splitter, CharSequence charSequence) {
            this.f52653f = splitter.f52637a;
            this.f52654g = splitter.f52638b;
            this.f52656p = splitter.f52640d;
            this.f52652d = charSequence;
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public String mo60564a() {
            int i;
            int i2 = this.f52655o;
            while (true) {
                int i3 = this.f52655o;
                if (i3 == -1) {
                    return (String) mo60565b();
                }
                int g = mo60618g(i3);
                if (g == -1) {
                    g = this.f52652d.length();
                    this.f52655o = -1;
                } else {
                    this.f52655o = mo60617e(g);
                }
                int i4 = this.f52655o;
                if (i4 == i2) {
                    int i5 = i4 + 1;
                    this.f52655o = i5;
                    if (i5 >= this.f52652d.length()) {
                        this.f52655o = -1;
                    }
                } else {
                    while (i2 < g && this.f52653f.mo60572f(this.f52652d.charAt(i2))) {
                        i2++;
                    }
                    while (i > i2 && this.f52653f.mo60572f(this.f52652d.charAt(i - 1))) {
                        g = i - 1;
                    }
                    if (!this.f52654g || i2 != i) {
                        int i6 = this.f52656p;
                    } else {
                        i2 = this.f52655o;
                    }
                }
            }
            int i62 = this.f52656p;
            if (i62 == 1) {
                i = this.f52652d.length();
                this.f52655o = -1;
                while (i > i2 && this.f52653f.mo60572f(this.f52652d.charAt(i - 1))) {
                    i--;
                }
            } else {
                this.f52656p = i62 - 1;
            }
            return this.f52652d.subSequence(i2, i).toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public abstract int mo60617e(int i);

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public abstract int mo60618g(int i);
    }

    private interface Strategy {
        /* renamed from: a */
        Iterator<String> mo60615a(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(Strategy strategy) {
        this(strategy, false, CharMatcher.f52592o, Integer.MAX_VALUE);
    }

    /* renamed from: e */
    public static Splitter m72489e(char c) {
        return m72490f(CharMatcher.m72393e(c));
    }

    /* renamed from: f */
    public static Splitter m72490f(final CharMatcher charMatcher) {
        Preconditions.m72472e(charMatcher);
        return new Splitter(new Strategy() {
            /* renamed from: b */
            public SplittingIterator mo60615a(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) {
                    /* access modifiers changed from: package-private */
                    /* renamed from: e */
                    public int mo60617e(int i) {
                        return i + 1;
                    }

                    /* access modifiers changed from: package-private */
                    /* renamed from: g */
                    public int mo60618g(int i) {
                        return charMatcher.mo60571d(this.f52652d, i);
                    }
                };
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public Iterator<String> m72491h(CharSequence charSequence) {
        return this.f52639c.mo60615a(this, charSequence);
    }

    @Beta
    /* renamed from: g */
    public List<String> mo60614g(CharSequence charSequence) {
        Preconditions.m72472e(charSequence);
        Iterator<String> h = m72491h(charSequence);
        ArrayList arrayList = new ArrayList();
        while (h.hasNext()) {
            arrayList.add(h.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private Splitter(Strategy strategy, boolean z, CharMatcher charMatcher, int i) {
        this.f52639c = strategy;
        this.f52638b = z;
        this.f52637a = charMatcher;
        this.f52640d = i;
    }
}
