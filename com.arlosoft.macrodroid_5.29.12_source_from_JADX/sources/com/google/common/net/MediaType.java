package com.google.common.net;

import androidx.webkit.ProxyConfig;
import com.arlosoft.macrodroid.data.HomeTile;
import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Ascii;
import com.google.common.base.CharMatcher;
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.errorprone.annotations.Immutable;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.nio.charset.Charset;
import java.util.Map;
import org.apache.commons.p353io.IOUtils;

@GwtCompatible
@ElementTypesAreNonnullByDefault
@Immutable
public final class MediaType {

    /* renamed from: A */
    public static final MediaType f53075A = m73501e("text", "vcard");

    /* renamed from: A0 */
    public static final MediaType f53076A0 = m73500d("application", "jose");

    /* renamed from: B */
    public static final MediaType f53077B = m73501e("text", "vnd.wap.wml");

    /* renamed from: B0 */
    public static final MediaType f53078B0 = m73500d("application", "jose+json");

    /* renamed from: C */
    public static final MediaType f53079C = m73501e("text", "xml");

    /* renamed from: C0 */
    public static final MediaType f53080C0 = m73501e("application", "json");

    /* renamed from: D */
    public static final MediaType f53081D = m73501e("text", "vtt");

    /* renamed from: D0 */
    public static final MediaType f53082D0 = m73501e("application", "manifest+json");

    /* renamed from: E */
    public static final MediaType f53083E = m73500d("image", "bmp");

    /* renamed from: E0 */
    public static final MediaType f53084E0 = m73500d("application", "vnd.google-earth.kml+xml");

    /* renamed from: F */
    public static final MediaType f53085F = m73500d("image", "x-canon-crw");

    /* renamed from: F0 */
    public static final MediaType f53086F0 = m73500d("application", "vnd.google-earth.kmz");

    /* renamed from: G */
    public static final MediaType f53087G = m73500d("image", "gif");

    /* renamed from: G0 */
    public static final MediaType f53088G0 = m73500d("application", "mbox");

    /* renamed from: H */
    public static final MediaType f53089H = m73500d("image", "vnd.microsoft.icon");

    /* renamed from: H0 */
    public static final MediaType f53090H0 = m73500d("application", "x-apple-aspen-config");

    /* renamed from: I */
    public static final MediaType f53091I = m73500d("image", "jpeg");

    /* renamed from: I0 */
    public static final MediaType f53092I0 = m73500d("application", "vnd.ms-excel");

    /* renamed from: J */
    public static final MediaType f53093J = m73500d("image", "png");

    /* renamed from: J0 */
    public static final MediaType f53094J0 = m73500d("application", "vnd.ms-outlook");

    /* renamed from: K */
    public static final MediaType f53095K = m73500d("image", "vnd.adobe.photoshop");

    /* renamed from: K0 */
    public static final MediaType f53096K0 = m73500d("application", "vnd.ms-powerpoint");

    /* renamed from: L */
    public static final MediaType f53097L = m73501e("image", "svg+xml");

    /* renamed from: L0 */
    public static final MediaType f53098L0 = m73500d("application", "msword");

    /* renamed from: M */
    public static final MediaType f53099M = m73500d("image", "tiff");

    /* renamed from: M0 */
    public static final MediaType f53100M0 = m73500d("application", "dash+xml");

    /* renamed from: N */
    public static final MediaType f53101N = m73500d("image", "webp");

    /* renamed from: N0 */
    public static final MediaType f53102N0 = m73500d("application", "wasm");

    /* renamed from: O */
    public static final MediaType f53103O = m73500d("image", "heif");

    /* renamed from: O0 */
    public static final MediaType f53104O0 = m73500d("application", "x-nacl");

    /* renamed from: P */
    public static final MediaType f53105P = m73500d("image", "jp2");

    /* renamed from: P0 */
    public static final MediaType f53106P0 = m73500d("application", "x-pnacl");

    /* renamed from: Q */
    public static final MediaType f53107Q = m73500d("audio", "mp4");

    /* renamed from: Q0 */
    public static final MediaType f53108Q0 = m73500d("application", "octet-stream");

    /* renamed from: R */
    public static final MediaType f53109R = m73500d("audio", "mpeg");

    /* renamed from: R0 */
    public static final MediaType f53110R0 = m73500d("application", "ogg");

    /* renamed from: S */
    public static final MediaType f53111S = m73500d("audio", "ogg");

    /* renamed from: S0 */
    public static final MediaType f53112S0 = m73500d("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");

    /* renamed from: T */
    public static final MediaType f53113T = m73500d("audio", "webm");

    /* renamed from: T0 */
    public static final MediaType f53114T0 = m73500d("application", "vnd.openxmlformats-officedocument.presentationml.presentation");

    /* renamed from: U */
    public static final MediaType f53115U = m73500d("audio", "l16");

    /* renamed from: U0 */
    public static final MediaType f53116U0 = m73500d("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");

    /* renamed from: V */
    public static final MediaType f53117V = m73500d("audio", "l24");

    /* renamed from: V0 */
    public static final MediaType f53118V0 = m73500d("application", "vnd.oasis.opendocument.graphics");

    /* renamed from: W */
    public static final MediaType f53119W = m73500d("audio", HomeTile.TILE_TYPE_BASIC);

    /* renamed from: W0 */
    public static final MediaType f53120W0 = m73500d("application", "vnd.oasis.opendocument.presentation");

    /* renamed from: X */
    public static final MediaType f53121X = m73500d("audio", "aac");

    /* renamed from: X0 */
    public static final MediaType f53122X0 = m73500d("application", "vnd.oasis.opendocument.spreadsheet");

    /* renamed from: Y */
    public static final MediaType f53123Y = m73500d("audio", "vorbis");

    /* renamed from: Y0 */
    public static final MediaType f53124Y0 = m73500d("application", "vnd.oasis.opendocument.text");

    /* renamed from: Z */
    public static final MediaType f53125Z = m73500d("audio", "x-ms-wma");

    /* renamed from: Z0 */
    public static final MediaType f53126Z0 = m73501e("application", "opensearchdescription+xml");

    /* renamed from: a0 */
    public static final MediaType f53127a0 = m73500d("audio", "x-ms-wax");

    /* renamed from: a1 */
    public static final MediaType f53128a1 = m73500d("application", "pdf");

    /* renamed from: b0 */
    public static final MediaType f53129b0 = m73500d("audio", "vnd.rn-realaudio");

    /* renamed from: b1 */
    public static final MediaType f53130b1 = m73500d("application", "postscript");

    /* renamed from: c0 */
    public static final MediaType f53131c0 = m73500d("audio", "vnd.wave");

    /* renamed from: c1 */
    public static final MediaType f53132c1 = m73500d("application", "protobuf");

    /* renamed from: d0 */
    public static final MediaType f53133d0 = m73500d("video", "mp4");

    /* renamed from: d1 */
    public static final MediaType f53134d1 = m73501e("application", "rdf+xml");

    /* renamed from: e0 */
    public static final MediaType f53135e0 = m73500d("video", "mpeg");

    /* renamed from: e1 */
    public static final MediaType f53136e1 = m73501e("application", "rtf");

    /* renamed from: f0 */
    public static final MediaType f53137f0 = m73500d("video", "ogg");

    /* renamed from: f1 */
    public static final MediaType f53138f1 = m73500d("application", "font-sfnt");

    /* renamed from: g */
    private static final ImmutableListMultimap<String, String> f53139g = ImmutableListMultimap.m27339G("charset", Ascii.m5147c(Charsets.f4139c.name()));

    /* renamed from: g0 */
    public static final MediaType f53140g0 = m73500d("video", "quicktime");

    /* renamed from: g1 */
    public static final MediaType f53141g1 = m73500d("application", "x-shockwave-flash");

    /* renamed from: h */
    private static final CharMatcher f53142h = CharMatcher.m5174f().mo22103b(CharMatcher.m5179n().mo22111r()).mo22103b(CharMatcher.m5178m(' ')).mo22103b(CharMatcher.m5181t("()<>@,;:\\\"/[]?="));

    /* renamed from: h0 */
    public static final MediaType f53143h0 = m73500d("video", "webm");

    /* renamed from: h1 */
    public static final MediaType f53144h1 = m73500d("application", "vnd.sketchup.skp");

    /* renamed from: i */
    private static final CharMatcher f53145i = CharMatcher.m5174f().mo22103b(CharMatcher.m5181t("\"\\\r"));

    /* renamed from: i0 */
    public static final MediaType f53146i0 = m73500d("video", "x-ms-wmv");

    /* renamed from: i1 */
    public static final MediaType f53147i1 = m73501e("application", "soap+xml");

    /* renamed from: j */
    private static final CharMatcher f53148j = CharMatcher.m5173d(" \t\r\n");

    /* renamed from: j0 */
    public static final MediaType f53149j0 = m73500d("video", "x-flv");

    /* renamed from: j1 */
    public static final MediaType f53150j1 = m73500d("application", "x-tar");

    /* renamed from: k */
    private static final Map<MediaType, MediaType> f53151k = Maps.m28058A();

    /* renamed from: k0 */
    public static final MediaType f53152k0 = m73500d("video", "3gpp");

    /* renamed from: k1 */
    public static final MediaType f53153k1 = m73500d("application", "font-woff");

    /* renamed from: l */
    public static final MediaType f53154l = m73500d(ProxyConfig.MATCH_ALL_SCHEMES, ProxyConfig.MATCH_ALL_SCHEMES);

    /* renamed from: l0 */
    public static final MediaType f53155l0 = m73500d("video", "3gpp2");

    /* renamed from: l1 */
    public static final MediaType f53156l1 = m73500d("application", "font-woff2");

    /* renamed from: m */
    public static final MediaType f53157m = m73500d("text", ProxyConfig.MATCH_ALL_SCHEMES);

    /* renamed from: m0 */
    public static final MediaType f53158m0 = m73501e("application", "xml");

    /* renamed from: m1 */
    public static final MediaType f53159m1 = m73501e("application", "xhtml+xml");

    /* renamed from: n */
    public static final MediaType f53160n = m73500d("image", ProxyConfig.MATCH_ALL_SCHEMES);

    /* renamed from: n0 */
    public static final MediaType f53161n0 = m73501e("application", "atom+xml");

    /* renamed from: n1 */
    public static final MediaType f53162n1 = m73501e("application", "xrd+xml");

    /* renamed from: o */
    public static final MediaType f53163o = m73500d("audio", ProxyConfig.MATCH_ALL_SCHEMES);

    /* renamed from: o0 */
    public static final MediaType f53164o0 = m73500d("application", "x-bzip2");

    /* renamed from: o1 */
    public static final MediaType f53165o1 = m73500d("application", "zip");

    /* renamed from: p */
    public static final MediaType f53166p = m73500d("video", ProxyConfig.MATCH_ALL_SCHEMES);

    /* renamed from: p0 */
    public static final MediaType f53167p0 = m73501e("application", "dart");

    /* renamed from: p1 */
    public static final MediaType f53168p1 = m73500d("font", "collection");

    /* renamed from: q */
    public static final MediaType f53169q = m73500d("application", ProxyConfig.MATCH_ALL_SCHEMES);

    /* renamed from: q0 */
    public static final MediaType f53170q0 = m73500d("application", "vnd.apple.pkpass");

    /* renamed from: q1 */
    public static final MediaType f53171q1 = m73500d("font", "otf");

    /* renamed from: r */
    public static final MediaType f53172r = m73500d("font", ProxyConfig.MATCH_ALL_SCHEMES);

    /* renamed from: r0 */
    public static final MediaType f53173r0 = m73500d("application", "vnd.ms-fontobject");

    /* renamed from: r1 */
    public static final MediaType f53174r1 = m73500d("font", "sfnt");

    /* renamed from: s */
    public static final MediaType f53175s = m73501e("text", "cache-manifest");

    /* renamed from: s0 */
    public static final MediaType f53176s0 = m73500d("application", "epub+zip");

    /* renamed from: s1 */
    public static final MediaType f53177s1 = m73500d("font", "ttf");

    /* renamed from: t */
    public static final MediaType f53178t = m73501e("text", "css");

    /* renamed from: t0 */
    public static final MediaType f53179t0 = m73500d("application", "x-www-form-urlencoded");

    /* renamed from: t1 */
    public static final MediaType f53180t1 = m73500d("font", "woff");

    /* renamed from: u */
    public static final MediaType f53181u = m73501e("text", "csv");

    /* renamed from: u0 */
    public static final MediaType f53182u0 = m73500d("application", "pkcs12");

    /* renamed from: u1 */
    public static final MediaType f53183u1 = m73500d("font", "woff2");

    /* renamed from: v */
    public static final MediaType f53184v = m73501e("text", "html");

    /* renamed from: v0 */
    public static final MediaType f53185v0 = m73500d("application", "binary");

    /* renamed from: v1 */
    private static final Joiner.MapJoiner f53186v1 = Joiner.m5314i("; ").mo22185l("=");

    /* renamed from: w */
    public static final MediaType f53187w = m73501e("text", "calendar");

    /* renamed from: w0 */
    public static final MediaType f53188w0 = m73500d("application", "geo+json");

    /* renamed from: x */
    public static final MediaType f53189x = m73501e("text", "plain");

    /* renamed from: x0 */
    public static final MediaType f53190x0 = m73500d("application", "x-gzip");

    /* renamed from: y */
    public static final MediaType f53191y = m73501e("text", "javascript");

    /* renamed from: y0 */
    public static final MediaType f53192y0 = m73500d("application", "hal+json");

    /* renamed from: z */
    public static final MediaType f53193z = m73501e("text", "tab-separated-values");

    /* renamed from: z0 */
    public static final MediaType f53194z0 = m73501e("application", "javascript");

    /* renamed from: a */
    private final String f53195a;

    /* renamed from: b */
    private final String f53196b;

    /* renamed from: c */
    private final ImmutableListMultimap<String, String> f53197c;
    @LazyInit

    /* renamed from: d */
    private String f53198d;
    @LazyInit

    /* renamed from: e */
    private int f53199e;
    @LazyInit

    /* renamed from: f */
    private Optional<Charset> f53200f;

    private static final class Tokenizer {
    }

    private MediaType(String str, String str2, ImmutableListMultimap<String, String> immutableListMultimap) {
        this.f53195a = str;
        this.f53196b = str2;
        this.f53197c = immutableListMultimap;
    }

    /* renamed from: b */
    private static MediaType m73498b(MediaType mediaType) {
        f53151k.put(mediaType, mediaType);
        return mediaType;
    }

    /* renamed from: c */
    private String m73499c() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f53195a);
        sb.append('/');
        sb.append(this.f53196b);
        if (!this.f53197c.isEmpty()) {
            sb.append("; ");
            f53186v1.mo22189b(sb, Multimaps.m28274e(this.f53197c, C10916a.f53208a).mo34445i());
        }
        return sb.toString();
    }

    /* renamed from: d */
    private static MediaType m73500d(String str, String str2) {
        MediaType b = m73498b(new MediaType(str, str2, ImmutableListMultimap.m27338F()));
        b.f53200f = Optional.m5351a();
        return b;
    }

    /* renamed from: e */
    private static MediaType m73501e(String str, String str2) {
        MediaType b = m73498b(new MediaType(str, str2, f53139g));
        b.f53200f = Optional.m5352d(Charsets.f4139c);
        return b;
    }

    /* renamed from: f */
    private static String m73502f(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 16);
        sb.append('\"');
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == 13 || charAt == '\\' || charAt == '\"') {
                sb.append(IOUtils.DIR_SEPARATOR_WINDOWS);
            }
            sb.append(charAt);
        }
        sb.append('\"');
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ String m73503g(String str) {
        return (!f53142h.mo22109p(str) || str.isEmpty()) ? m73502f(str) : str;
    }

    /* renamed from: h */
    private Map<String, ImmutableMultiset<String>> m73504h() {
        return Maps.m28075R(this.f53197c.mo34430w(), C10917b.f53209a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof MediaType)) {
            return false;
        }
        MediaType mediaType = (MediaType) obj;
        if (!this.f53195a.equals(mediaType.f53195a) || !this.f53196b.equals(mediaType.f53196b) || !m73504h().equals(mediaType.m73504h())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        int i = this.f53199e;
        if (i != 0) {
            return i;
        }
        int b = Objects.m5350b(this.f53195a, this.f53196b, m73504h());
        this.f53199e = b;
        return b;
    }

    public String toString() {
        String str = this.f53198d;
        if (str != null) {
            return str;
        }
        String c = m73499c();
        this.f53198d = c;
        return c;
    }
}
