package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzawj {

    /* renamed from: A */
    private static final int f26027A = zzbar.m42991g("sosn");

    /* renamed from: B */
    private static final int f26028B = zzbar.m42991g("tvsh");

    /* renamed from: C */
    private static final int f26029C = zzbar.m42991g("----");

    /* renamed from: D */
    private static final String[] f26030D = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Negerpunk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop"};

    /* renamed from: a */
    private static final int f26031a = zzbar.m42991g("nam");

    /* renamed from: b */
    private static final int f26032b = zzbar.m42991g("trk");

    /* renamed from: c */
    private static final int f26033c = zzbar.m42991g("cmt");

    /* renamed from: d */
    private static final int f26034d = zzbar.m42991g("day");

    /* renamed from: e */
    private static final int f26035e = zzbar.m42991g("ART");

    /* renamed from: f */
    private static final int f26036f = zzbar.m42991g("too");

    /* renamed from: g */
    private static final int f26037g = zzbar.m42991g("alb");

    /* renamed from: h */
    private static final int f26038h = zzbar.m42991g("com");

    /* renamed from: i */
    private static final int f26039i = zzbar.m42991g("wrt");

    /* renamed from: j */
    private static final int f26040j = zzbar.m42991g("lyr");

    /* renamed from: k */
    private static final int f26041k = zzbar.m42991g("gen");

    /* renamed from: l */
    private static final int f26042l = zzbar.m42991g("covr");

    /* renamed from: m */
    private static final int f26043m = zzbar.m42991g("gnre");

    /* renamed from: n */
    private static final int f26044n = zzbar.m42991g("grp");

    /* renamed from: o */
    private static final int f26045o = zzbar.m42991g("disk");

    /* renamed from: p */
    private static final int f26046p = zzbar.m42991g("trkn");

    /* renamed from: q */
    private static final int f26047q = zzbar.m42991g("tmpo");

    /* renamed from: r */
    private static final int f26048r = zzbar.m42991g("cpil");

    /* renamed from: s */
    private static final int f26049s = zzbar.m42991g("aART");

    /* renamed from: t */
    private static final int f26050t = zzbar.m42991g("sonm");

    /* renamed from: u */
    private static final int f26051u = zzbar.m42991g("soal");

    /* renamed from: v */
    private static final int f26052v = zzbar.m42991g("soar");

    /* renamed from: w */
    private static final int f26053w = zzbar.m42991g("soaa");

    /* renamed from: x */
    private static final int f26054x = zzbar.m42991g("soco");

    /* renamed from: y */
    private static final int f26055y = zzbar.m42991g("rtng");

    /* renamed from: z */
    private static final int f26056z = zzbar.m42991g("pgap");

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0035 A[Catch:{ all -> 0x01d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c A[Catch:{ all -> 0x01d3 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzaxg m42659a(com.google.android.gms.internal.ads.zzbak r13) {
        /*
            int r0 = r13.mo42317c()
            int r1 = r13.mo42319e()
            int r0 = r0 + r1
            int r1 = r13.mo42319e()
            int r2 = r1 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = "und"
            java.lang.String r4 = "TCON"
            java.lang.String r5 = "MetadataUtil"
            r6 = 0
            r7 = 169(0xa9, float:2.37E-43)
            if (r2 == r7) goto L_0x01d6
            int r2 = f26043m     // Catch:{ all -> 0x01d3 }
            r7 = -1
            if (r1 != r2) goto L_0x0045
            int r1 = m42660b(r13)     // Catch:{ all -> 0x01d3 }
            if (r1 <= 0) goto L_0x0032
            java.lang.String[] r2 = f26030D     // Catch:{ all -> 0x01d3 }
            int r3 = r2.length     // Catch:{ all -> 0x01d3 }
            r3 = 148(0x94, float:2.07E-43)
            if (r1 > r3) goto L_0x0032
            int r1 = r1 + r7
            r1 = r2[r1]     // Catch:{ all -> 0x01d3 }
            goto L_0x0033
        L_0x0032:
            r1 = r6
        L_0x0033:
            if (r1 == 0) goto L_0x003c
            com.google.android.gms.internal.ads.zzaxp r2 = new com.google.android.gms.internal.ads.zzaxp     // Catch:{ all -> 0x01d3 }
            r2.<init>(r4, r6, r1)     // Catch:{ all -> 0x01d3 }
            r6 = r2
            goto L_0x0041
        L_0x003c:
            java.lang.String r1 = "Failed to parse standard genre code"
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d3 }
        L_0x0041:
            r13.mo42336v(r0)
            return r6
        L_0x0045:
            int r2 = f26045o     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x0053
            java.lang.String r2 = "TPOS"
            com.google.android.gms.internal.ads.zzaxp r1 = m42662d(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x0053:
            int r2 = f26046p     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x0061
            java.lang.String r2 = "TRCK"
            com.google.android.gms.internal.ads.zzaxp r1 = m42662d(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x0061:
            int r2 = f26047q     // Catch:{ all -> 0x01d3 }
            r4 = 1
            r8 = 0
            if (r1 != r2) goto L_0x0071
            java.lang.String r2 = "TBPM"
            com.google.android.gms.internal.ads.zzaxn r1 = m42661c(r1, r2, r13, r4, r8)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x0071:
            int r2 = f26048r     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x007f
            java.lang.String r2 = "TCMP"
            com.google.android.gms.internal.ads.zzaxn r1 = m42661c(r1, r2, r13, r4, r4)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x007f:
            int r2 = f26042l     // Catch:{ all -> 0x01d3 }
            r9 = 4
            if (r1 != r2) goto L_0x00db
            int r1 = r13.mo42319e()     // Catch:{ all -> 0x01d3 }
            int r2 = r13.mo42319e()     // Catch:{ all -> 0x01d3 }
            int r3 = com.google.android.gms.internal.ads.zzavw.f25867F0     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x00d2
            int r2 = r13.mo42319e()     // Catch:{ all -> 0x01d3 }
            int r2 = com.google.android.gms.internal.ads.zzavw.m42633a(r2)     // Catch:{ all -> 0x01d3 }
            r3 = 13
            r4 = 14
            if (r2 != r3) goto L_0x00a1
            java.lang.String r3 = "image/jpeg"
            goto L_0x00a9
        L_0x00a1:
            if (r2 != r4) goto L_0x00a8
            java.lang.String r3 = "image/png"
            r2 = 14
            goto L_0x00a9
        L_0x00a8:
            r3 = r6
        L_0x00a9:
            if (r3 != 0) goto L_0x00c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d3 }
            r1.<init>()     // Catch:{ all -> 0x01d3 }
            java.lang.String r3 = "Unrecognized cover art flags: "
            r1.append(r3)     // Catch:{ all -> 0x01d3 }
            r1.append(r2)     // Catch:{ all -> 0x01d3 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x01d3 }
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d3 }
            goto L_0x00d7
        L_0x00c0:
            r13.mo42337w(r9)     // Catch:{ all -> 0x01d3 }
            int r1 = r1 + -16
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x01d3 }
            r13.mo42331q(r2, r8, r1)     // Catch:{ all -> 0x01d3 }
            com.google.android.gms.internal.ads.zzaxj r1 = new com.google.android.gms.internal.ads.zzaxj     // Catch:{ all -> 0x01d3 }
            r4 = 3
            r1.<init>(r3, r6, r4, r2)     // Catch:{ all -> 0x01d3 }
            r6 = r1
            goto L_0x00d7
        L_0x00d2:
            java.lang.String r1 = "Failed to parse cover art attribute"
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d3 }
        L_0x00d7:
            r13.mo42336v(r0)
            return r6
        L_0x00db:
            int r2 = f26049s     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x00e9
            java.lang.String r2 = "TPE2"
            com.google.android.gms.internal.ads.zzaxp r1 = m42663e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x00e9:
            int r2 = f26050t     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x00f7
            java.lang.String r2 = "TSOT"
            com.google.android.gms.internal.ads.zzaxp r1 = m42663e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x00f7:
            int r2 = f26051u     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x0105
            java.lang.String r2 = "TSO2"
            com.google.android.gms.internal.ads.zzaxp r1 = m42663e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x0105:
            int r2 = f26052v     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x0113
            java.lang.String r2 = "TSOA"
            com.google.android.gms.internal.ads.zzaxp r1 = m42663e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x0113:
            int r2 = f26053w     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x0121
            java.lang.String r2 = "TSOP"
            com.google.android.gms.internal.ads.zzaxp r1 = m42663e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x0121:
            int r2 = f26054x     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x012f
            java.lang.String r2 = "TSOC"
            com.google.android.gms.internal.ads.zzaxp r1 = m42663e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x012f:
            int r2 = f26055y     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x013d
            java.lang.String r2 = "ITUNESADVISORY"
            com.google.android.gms.internal.ads.zzaxn r1 = m42661c(r1, r2, r13, r8, r8)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x013d:
            int r2 = f26056z     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x014b
            java.lang.String r2 = "ITUNESGAPLESS"
            com.google.android.gms.internal.ads.zzaxn r1 = m42661c(r1, r2, r13, r8, r4)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x014b:
            int r2 = f26027A     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x0159
            java.lang.String r2 = "TVSHOWSORT"
            com.google.android.gms.internal.ads.zzaxp r1 = m42663e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x0159:
            int r2 = f26028B     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x0167
            java.lang.String r2 = "TVSHOW"
            com.google.android.gms.internal.ads.zzaxp r1 = m42663e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x0167:
            int r2 = f26029C     // Catch:{ all -> 0x01d3 }
            if (r1 != r2) goto L_0x027f
            r1 = r6
            r2 = r1
            r4 = -1
            r5 = -1
        L_0x016f:
            int r8 = r13.mo42317c()     // Catch:{ all -> 0x01d3 }
            if (r8 >= r0) goto L_0x01a9
            int r8 = r13.mo42317c()     // Catch:{ all -> 0x01d3 }
            int r10 = r13.mo42319e()     // Catch:{ all -> 0x01d3 }
            int r11 = r13.mo42319e()     // Catch:{ all -> 0x01d3 }
            r13.mo42337w(r9)     // Catch:{ all -> 0x01d3 }
            int r12 = com.google.android.gms.internal.ads.zzavw.f25863D0     // Catch:{ all -> 0x01d3 }
            if (r11 != r12) goto L_0x018f
            int r10 = r10 + -12
            java.lang.String r1 = r13.mo42329o(r10)     // Catch:{ all -> 0x01d3 }
            goto L_0x016f
        L_0x018f:
            int r12 = com.google.android.gms.internal.ads.zzavw.f25865E0     // Catch:{ all -> 0x01d3 }
            if (r11 != r12) goto L_0x019a
            int r10 = r10 + -12
            java.lang.String r2 = r13.mo42329o(r10)     // Catch:{ all -> 0x01d3 }
            goto L_0x016f
        L_0x019a:
            int r12 = com.google.android.gms.internal.ads.zzavw.f25867F0     // Catch:{ all -> 0x01d3 }
            if (r11 != r12) goto L_0x019f
            r5 = r10
        L_0x019f:
            if (r11 == r12) goto L_0x01a2
            goto L_0x01a3
        L_0x01a2:
            r4 = r8
        L_0x01a3:
            int r10 = r10 + -12
            r13.mo42337w(r10)     // Catch:{ all -> 0x01d3 }
            goto L_0x016f
        L_0x01a9:
            java.lang.String r8 = "com.apple.iTunes"
            boolean r1 = r8.equals(r1)     // Catch:{ all -> 0x01d3 }
            if (r1 == 0) goto L_0x01cf
            java.lang.String r1 = "iTunSMPB"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x01d3 }
            if (r1 == 0) goto L_0x01cf
            if (r4 != r7) goto L_0x01bc
            goto L_0x01cf
        L_0x01bc:
            r13.mo42336v(r4)     // Catch:{ all -> 0x01d3 }
            r1 = 16
            r13.mo42337w(r1)     // Catch:{ all -> 0x01d3 }
            int r5 = r5 + -16
            java.lang.String r1 = r13.mo42329o(r5)     // Catch:{ all -> 0x01d3 }
            com.google.android.gms.internal.ads.zzaxl r6 = new com.google.android.gms.internal.ads.zzaxl     // Catch:{ all -> 0x01d3 }
            r6.<init>(r3, r2, r1)     // Catch:{ all -> 0x01d3 }
        L_0x01cf:
            r13.mo42336v(r0)
            return r6
        L_0x01d3:
            r1 = move-exception
            goto L_0x02a8
        L_0x01d6:
            r2 = 16777215(0xffffff, float:2.3509886E-38)
            r2 = r2 & r1
            int r7 = f26033c     // Catch:{ all -> 0x01d3 }
            if (r2 != r7) goto L_0x020c
            int r2 = r13.mo42319e()     // Catch:{ all -> 0x01d3 }
            int r4 = r13.mo42319e()     // Catch:{ all -> 0x01d3 }
            int r7 = com.google.android.gms.internal.ads.zzavw.f25867F0     // Catch:{ all -> 0x01d3 }
            if (r4 != r7) goto L_0x01fb
            r1 = 8
            r13.mo42337w(r1)     // Catch:{ all -> 0x01d3 }
            int r2 = r2 + -16
            java.lang.String r1 = r13.mo42329o(r2)     // Catch:{ all -> 0x01d3 }
            com.google.android.gms.internal.ads.zzaxl r6 = new com.google.android.gms.internal.ads.zzaxl     // Catch:{ all -> 0x01d3 }
            r6.<init>(r3, r1, r1)     // Catch:{ all -> 0x01d3 }
            goto L_0x0208
        L_0x01fb:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzavw.m42635c(r1)     // Catch:{ all -> 0x01d3 }
            java.lang.String r2 = "Failed to parse comment attribute: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x01d3 }
            android.util.Log.w(r5, r1)     // Catch:{ all -> 0x01d3 }
        L_0x0208:
            r13.mo42336v(r0)
            return r6
        L_0x020c:
            int r3 = f26031a     // Catch:{ all -> 0x01d3 }
            if (r2 == r3) goto L_0x029e
            int r3 = f26032b     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x0216
            goto L_0x029e
        L_0x0216:
            int r3 = f26038h     // Catch:{ all -> 0x01d3 }
            if (r2 == r3) goto L_0x0294
            int r3 = f26039i     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x021f
            goto L_0x0294
        L_0x021f:
            int r3 = f26034d     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x022d
            java.lang.String r2 = "TDRC"
            com.google.android.gms.internal.ads.zzaxp r1 = m42663e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x022d:
            int r3 = f26035e     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x023b
            java.lang.String r2 = "TPE1"
            com.google.android.gms.internal.ads.zzaxp r1 = m42663e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x023b:
            int r3 = f26036f     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x0249
            java.lang.String r2 = "TSSE"
            com.google.android.gms.internal.ads.zzaxp r1 = m42663e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x0249:
            int r3 = f26037g     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x0257
            java.lang.String r2 = "TALB"
            com.google.android.gms.internal.ads.zzaxp r1 = m42663e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x0257:
            int r3 = f26040j     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x0265
            java.lang.String r2 = "USLT"
            com.google.android.gms.internal.ads.zzaxp r1 = m42663e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x0265:
            int r3 = f26041k     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x0271
            com.google.android.gms.internal.ads.zzaxp r1 = m42663e(r1, r4, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x0271:
            int r3 = f26044n     // Catch:{ all -> 0x01d3 }
            if (r2 != r3) goto L_0x027f
            java.lang.String r2 = "TIT1"
            com.google.android.gms.internal.ads.zzaxp r1 = m42663e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x027f:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzavw.m42635c(r1)     // Catch:{ all -> 0x01d3 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d3 }
            r2.<init>()     // Catch:{ all -> 0x01d3 }
            java.lang.String r3 = "Skipped unknown metadata entry: "
            r2.append(r3)     // Catch:{ all -> 0x01d3 }
            r2.append(r1)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r6
        L_0x0294:
            java.lang.String r2 = "TCOM"
            com.google.android.gms.internal.ads.zzaxp r1 = m42663e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x029e:
            java.lang.String r2 = "TIT2"
            com.google.android.gms.internal.ads.zzaxp r1 = m42663e(r1, r2, r13)     // Catch:{ all -> 0x01d3 }
            r13.mo42336v(r0)
            return r1
        L_0x02a8:
            r13.mo42336v(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzawj.m42659a(com.google.android.gms.internal.ads.zzbak):com.google.android.gms.internal.ads.zzaxg");
    }

    /* renamed from: b */
    private static int m42660b(zzbak zzbak) {
        zzbak.mo42337w(4);
        if (zzbak.mo42319e() == zzavw.f25867F0) {
            zzbak.mo42337w(8);
            return zzbak.mo42321g();
        }
        Log.w("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    /* renamed from: c */
    private static zzaxn m42661c(int i, String str, zzbak zzbak, boolean z, boolean z2) {
        int b = m42660b(zzbak);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b < 0) {
            Log.w("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzavw.m42635c(i)));
            return null;
        } else if (z) {
            return new zzaxp(str, (String) null, Integer.toString(b));
        } else {
            return new zzaxl("und", str, Integer.toString(b));
        }
    }

    /* renamed from: d */
    private static zzaxp m42662d(int i, String str, zzbak zzbak) {
        int e = zzbak.mo42319e();
        if (zzbak.mo42319e() == zzavw.f25867F0 && e >= 22) {
            zzbak.mo42337w(10);
            int j = zzbak.mo42324j();
            if (j > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(j);
                String sb2 = sb.toString();
                int j2 = zzbak.mo42324j();
                if (j2 > 0) {
                    sb2 = sb2 + "/" + j2;
                }
                return new zzaxp(str, (String) null, sb2);
            }
        }
        Log.w("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzavw.m42635c(i)));
        return null;
    }

    /* renamed from: e */
    private static zzaxp m42663e(int i, String str, zzbak zzbak) {
        int e = zzbak.mo42319e();
        if (zzbak.mo42319e() == zzavw.f25867F0) {
            zzbak.mo42337w(8);
            return new zzaxp(str, (String) null, zzbak.mo42329o(e - 16));
        }
        Log.w("MetadataUtil", "Failed to parse text attribute: ".concat(zzavw.m42635c(i)));
        return null;
    }
}
