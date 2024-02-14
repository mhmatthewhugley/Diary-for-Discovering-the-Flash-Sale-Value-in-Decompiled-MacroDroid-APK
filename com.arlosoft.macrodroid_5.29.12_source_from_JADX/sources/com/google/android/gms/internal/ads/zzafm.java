package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
final class zzafm {
    @VisibleForTesting

    /* renamed from: a */
    static final String[] f24298a = {"Blues", "Classic Rock", "Country", "Dance", "Disco", "Funk", "Grunge", "Hip-Hop", "Jazz", "Metal", "New Age", "Oldies", "Other", "Pop", "R&B", "Rap", "Reggae", "Rock", "Techno", "Industrial", "Alternative", "Ska", "Death Metal", "Pranks", "Soundtrack", "Euro-Techno", "Ambient", "Trip-Hop", "Vocal", "Jazz+Funk", "Fusion", "Trance", "Classical", "Instrumental", "Acid", "House", "Game", "Sound Clip", "Gospel", "Noise", "AlternRock", "Bass", "Soul", "Punk", "Space", "Meditative", "Instrumental Pop", "Instrumental Rock", "Ethnic", "Gothic", "Darkwave", "Techno-Industrial", "Electronic", "Pop-Folk", "Eurodance", "Dream", "Southern Rock", "Comedy", "Cult", "Gangsta", "Top 40", "Christian Rap", "Pop/Funk", "Jungle", "Native American", "Cabaret", "New Wave", "Psychadelic", "Rave", "Showtunes", "Trailer", "Lo-Fi", "Tribal", "Acid Punk", "Acid Jazz", "Polka", "Retro", "Musical", "Rock & Roll", "Hard Rock", "Folk", "Folk-Rock", "National Folk", "Swing", "Fast Fusion", "Bebob", "Latin", "Revival", "Celtic", "Bluegrass", "Avantgarde", "Gothic Rock", "Progressive Rock", "Psychedelic Rock", "Symphonic Rock", "Slow Rock", "Big Band", "Chorus", "Easy Listening", "Acoustic", "Humour", "Speech", "Chanson", "Opera", "Chamber Music", "Sonata", "Symphony", "Booty Bass", "Primus", "Porn Groove", "Satire", "Slow Jam", "Club", "Tango", "Samba", "Folklore", "Ballad", "Power Ballad", "Rhythmic Soul", "Freestyle", "Duet", "Punk Rock", "Drum Solo", "A capella", "Euro-House", "Dance Hall", "Goa", "Drum & Bass", "Club-House", "Hardcore", "Terror", "Indie", "BritPop", "Afro-Punk", "Polsk Punk", "Beat", "Christian Gangsta Rap", "Heavy Metal", "Black Metal", "Crossover", "Contemporary Christian", "Christian Rock", "Merengue", "Salsa", "Thrash Metal", "Anime", "Jpop", "Synthpop", "Abstract", "Art Rock", "Baroque", "Bhangra", "Big beat", "Breakbeat", "Chillout", "Downtempo", "Dub", "EBM", "Eclectic", "Electro", "Electroclash", "Emo", "Experimental", "Garage", "Global", "IDM", "Illbient", "Industro-Goth", "Jam Band", "Krautrock", "Leftfield", "Lounge", "Math Rock", "New Romantic", "Nu-Breakz", "Post-Punk", "Post-Rock", "Psytrance", "Shoegaze", "Space Rock", "Trop Rock", "World Music", "Neoclassical", "Audiobook", "Audio theatre", "Neue Deutsche Welle", "Podcast", "Indie-Rock", "G-Funk", "Dubstep", "Garage Rock", "Psybient"};

    /* renamed from: b */
    public static final /* synthetic */ int f24299b = 0;

    /* JADX WARNING: Unknown top exception splitter block from list: {B:136:0x018d=Splitter:B:136:0x018d, B:224:0x029d=Splitter:B:224:0x029d} */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.internal.ads.zzbp m41275a(com.google.android.gms.internal.ads.zzef r12) {
        /*
            int r0 = r12.mo45235k()
            int r1 = r12.mo45237m()
            int r0 = r0 + r1
            int r1 = r12.mo45237m()
            int r2 = r1 >> 24
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r3 = "TCON"
            r4 = 16777215(0xffffff, float:2.3509886E-38)
            r5 = 1684108385(0x64617461, float:1.6635614E22)
            java.lang.String r6 = "MetadataUtil"
            r7 = 0
            r8 = 169(0xa9, float:2.37E-43)
            if (r2 == r8) goto L_0x01e6
            r8 = 253(0xfd, float:3.55E-43)
            if (r2 != r8) goto L_0x0026
            goto L_0x01e6
        L_0x0026:
            r2 = 1735291493(0x676e7265, float:1.1260334E24)
            r8 = -1
            if (r1 != r2) goto L_0x004f
            int r1 = m41276b(r12)     // Catch:{ all -> 0x021b }
            if (r1 <= 0) goto L_0x003c
            r2 = 192(0xc0, float:2.69E-43)
            if (r1 > r2) goto L_0x003c
            java.lang.String[] r2 = f24298a     // Catch:{ all -> 0x021b }
            int r1 = r1 + r8
            r1 = r2[r1]     // Catch:{ all -> 0x021b }
            goto L_0x003d
        L_0x003c:
            r1 = r7
        L_0x003d:
            if (r1 == 0) goto L_0x0046
            com.google.android.gms.internal.ads.zzadl r2 = new com.google.android.gms.internal.ads.zzadl     // Catch:{ all -> 0x021b }
            r2.<init>(r3, r7, r1)     // Catch:{ all -> 0x021b }
            r7 = r2
            goto L_0x004b
        L_0x0046:
            java.lang.String r1 = "Failed to parse standard genre code"
            com.google.android.gms.internal.ads.zzdw.m48255e(r6, r1)     // Catch:{ all -> 0x021b }
        L_0x004b:
            r12.mo45230f(r0)
            return r7
        L_0x004f:
            r2 = 1684632427(0x6469736b, float:1.7225632E22)
            if (r1 != r2) goto L_0x005e
            java.lang.String r1 = "TPOS"
            com.google.android.gms.internal.ads.zzadl r1 = m41278d(r2, r1, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x005e:
            r2 = 1953655662(0x74726b6e, float:7.6825853E31)
            if (r1 != r2) goto L_0x006d
            java.lang.String r1 = "TRCK"
            com.google.android.gms.internal.ads.zzadl r1 = m41278d(r2, r1, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x006d:
            r2 = 1953329263(0x746d706f, float:7.5247484E31)
            r3 = 1
            r9 = 0
            if (r1 != r2) goto L_0x007e
            java.lang.String r1 = "TBPM"
            com.google.android.gms.internal.ads.zzadd r1 = m41277c(r2, r1, r12, r3, r9)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x007e:
            r2 = 1668311404(0x6370696c, float:4.434815E21)
            if (r1 != r2) goto L_0x008d
            java.lang.String r1 = "TCMP"
            com.google.android.gms.internal.ads.zzadd r1 = m41277c(r2, r1, r12, r3, r3)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x008d:
            r2 = 1668249202(0x636f7672, float:4.4173067E21)
            if (r1 != r2) goto L_0x00e5
            int r1 = r12.mo45237m()     // Catch:{ all -> 0x021b }
            int r2 = r12.mo45237m()     // Catch:{ all -> 0x021b }
            if (r2 != r5) goto L_0x00dc
            int r2 = r12.mo45237m()     // Catch:{ all -> 0x021b }
            r2 = r2 & r4
            r3 = 13
            r4 = 14
            if (r2 != r3) goto L_0x00aa
            java.lang.String r3 = "image/jpeg"
            goto L_0x00b2
        L_0x00aa:
            if (r2 != r4) goto L_0x00b1
            java.lang.String r3 = "image/png"
            r2 = 14
            goto L_0x00b2
        L_0x00b1:
            r3 = r7
        L_0x00b2:
            if (r3 != 0) goto L_0x00c9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x021b }
            r1.<init>()     // Catch:{ all -> 0x021b }
            java.lang.String r3 = "Unrecognized cover art flags: "
            r1.append(r3)     // Catch:{ all -> 0x021b }
            r1.append(r2)     // Catch:{ all -> 0x021b }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x021b }
            com.google.android.gms.internal.ads.zzdw.m48255e(r6, r1)     // Catch:{ all -> 0x021b }
            goto L_0x00e1
        L_0x00c9:
            r2 = 4
            r12.mo45231g(r2)     // Catch:{ all -> 0x021b }
            int r1 = r1 + -16
            byte[] r2 = new byte[r1]     // Catch:{ all -> 0x021b }
            r12.mo45226b(r2, r9, r1)     // Catch:{ all -> 0x021b }
            com.google.android.gms.internal.ads.zzaco r1 = new com.google.android.gms.internal.ads.zzaco     // Catch:{ all -> 0x021b }
            r4 = 3
            r1.<init>(r3, r7, r4, r2)     // Catch:{ all -> 0x021b }
            r7 = r1
            goto L_0x00e1
        L_0x00dc:
            java.lang.String r1 = "Failed to parse cover art attribute"
            com.google.android.gms.internal.ads.zzdw.m48255e(r6, r1)     // Catch:{ all -> 0x021b }
        L_0x00e1:
            r12.mo45230f(r0)
            return r7
        L_0x00e5:
            r2 = 1631670868(0x61415254, float:2.2288462E20)
            if (r1 != r2) goto L_0x00f4
            java.lang.String r1 = "TPE2"
            com.google.android.gms.internal.ads.zzadl r1 = m41279e(r2, r1, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x00f4:
            r2 = 1936682605(0x736f6e6d, float:1.8969706E31)
            if (r1 != r2) goto L_0x0103
            java.lang.String r1 = "TSOT"
            com.google.android.gms.internal.ads.zzadl r1 = m41279e(r2, r1, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x0103:
            r2 = 1936679276(0x736f616c, float:1.8965681E31)
            if (r1 != r2) goto L_0x0112
            java.lang.String r1 = "TSO2"
            com.google.android.gms.internal.ads.zzadl r1 = m41279e(r2, r1, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x0112:
            r2 = 1936679282(0x736f6172, float:1.8965689E31)
            if (r1 != r2) goto L_0x0121
            java.lang.String r1 = "TSOA"
            com.google.android.gms.internal.ads.zzadl r1 = m41279e(r2, r1, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x0121:
            r2 = 1936679265(0x736f6161, float:1.8965668E31)
            if (r1 != r2) goto L_0x0130
            java.lang.String r1 = "TSOP"
            com.google.android.gms.internal.ads.zzadl r1 = m41279e(r2, r1, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x0130:
            r2 = 1936679791(0x736f636f, float:1.8966304E31)
            if (r1 != r2) goto L_0x013f
            java.lang.String r1 = "TSOC"
            com.google.android.gms.internal.ads.zzadl r1 = m41279e(r2, r1, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x013f:
            r2 = 1920233063(0x72746e67, float:4.84146E30)
            if (r1 != r2) goto L_0x014e
            java.lang.String r1 = "ITUNESADVISORY"
            com.google.android.gms.internal.ads.zzadd r1 = m41277c(r2, r1, r12, r9, r9)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x014e:
            r2 = 1885823344(0x70676170, float:2.8643533E29)
            if (r1 != r2) goto L_0x0160
            r1 = 1885823344(0x70676170, float:2.8643533E29)
            java.lang.String r2 = "ITUNESGAPLESS"
            com.google.android.gms.internal.ads.zzadd r1 = m41277c(r1, r2, r12, r9, r3)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x0160:
            r2 = 1936683886(0x736f736e, float:1.8971255E31)
            if (r1 != r2) goto L_0x0172
            r1 = 1936683886(0x736f736e, float:1.8971255E31)
            java.lang.String r2 = "TVSHOWSORT"
            com.google.android.gms.internal.ads.zzadl r1 = m41279e(r1, r2, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x0172:
            r2 = 1953919848(0x74767368, float:7.810338E31)
            if (r1 != r2) goto L_0x0184
            r1 = 1953919848(0x74767368, float:7.810338E31)
            java.lang.String r2 = "TVSHOW"
            com.google.android.gms.internal.ads.zzadl r1 = m41279e(r1, r2, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x0184:
            r2 = 757935405(0x2d2d2d2d, float:9.8439425E-12)
            if (r1 != r2) goto L_0x029d
            r1 = r7
            r2 = r1
            r3 = -1
            r4 = -1
        L_0x018d:
            int r6 = r12.mo45235k()     // Catch:{ all -> 0x021b }
            if (r6 >= r0) goto L_0x01c8
            int r6 = r12.mo45235k()     // Catch:{ all -> 0x021b }
            int r9 = r12.mo45237m()     // Catch:{ all -> 0x021b }
            int r10 = r12.mo45237m()     // Catch:{ all -> 0x021b }
            r11 = 4
            r12.mo45231g(r11)     // Catch:{ all -> 0x021b }
            r11 = 1835360622(0x6d65616e, float:4.4368658E27)
            if (r10 != r11) goto L_0x01af
            int r9 = r9 + -12
            java.lang.String r1 = r12.mo45221E(r9)     // Catch:{ all -> 0x021b }
            goto L_0x018d
        L_0x01af:
            r11 = 1851878757(0x6e616d65, float:1.7441594E28)
            if (r10 != r11) goto L_0x01bb
            int r9 = r9 + -12
            java.lang.String r2 = r12.mo45221E(r9)     // Catch:{ all -> 0x021b }
            goto L_0x018d
        L_0x01bb:
            if (r10 != r5) goto L_0x01be
            r4 = r9
        L_0x01be:
            if (r10 == r5) goto L_0x01c1
            goto L_0x01c2
        L_0x01c1:
            r3 = r6
        L_0x01c2:
            int r9 = r9 + -12
            r12.mo45231g(r9)     // Catch:{ all -> 0x021b }
            goto L_0x018d
        L_0x01c8:
            if (r1 == 0) goto L_0x01e2
            if (r2 == 0) goto L_0x01e2
            if (r3 != r8) goto L_0x01cf
            goto L_0x01e2
        L_0x01cf:
            r12.mo45230f(r3)     // Catch:{ all -> 0x021b }
            r3 = 16
            r12.mo45231g(r3)     // Catch:{ all -> 0x021b }
            int r4 = r4 + -16
            java.lang.String r3 = r12.mo45221E(r4)     // Catch:{ all -> 0x021b }
            com.google.android.gms.internal.ads.zzadf r7 = new com.google.android.gms.internal.ads.zzadf     // Catch:{ all -> 0x021b }
            r7.<init>(r1, r2, r3)     // Catch:{ all -> 0x021b }
        L_0x01e2:
            r12.mo45230f(r0)
            return r7
        L_0x01e6:
            r2 = r1 & r4
            r4 = 6516084(0x636d74, float:9.130979E-39)
            if (r2 != r4) goto L_0x021e
            int r2 = r12.mo45237m()     // Catch:{ all -> 0x021b }
            int r3 = r12.mo45237m()     // Catch:{ all -> 0x021b }
            if (r3 != r5) goto L_0x020a
            r1 = 8
            r12.mo45231g(r1)     // Catch:{ all -> 0x021b }
            int r2 = r2 + -16
            java.lang.String r1 = r12.mo45221E(r2)     // Catch:{ all -> 0x021b }
            com.google.android.gms.internal.ads.zzacw r7 = new com.google.android.gms.internal.ads.zzacw     // Catch:{ all -> 0x021b }
            java.lang.String r2 = "und"
            r7.<init>(r2, r1, r1)     // Catch:{ all -> 0x021b }
            goto L_0x0217
        L_0x020a:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzaex.m41222b(r1)     // Catch:{ all -> 0x021b }
            java.lang.String r2 = "Failed to parse comment attribute: "
            java.lang.String r1 = r2.concat(r1)     // Catch:{ all -> 0x021b }
            com.google.android.gms.internal.ads.zzdw.m48255e(r6, r1)     // Catch:{ all -> 0x021b }
        L_0x0217:
            r12.mo45230f(r0)
            return r7
        L_0x021b:
            r1 = move-exception
            goto L_0x02cd
        L_0x021e:
            r4 = 7233901(0x6e616d, float:1.0136854E-38)
            if (r2 == r4) goto L_0x02c3
            r4 = 7631467(0x74726b, float:1.0693963E-38)
            if (r2 != r4) goto L_0x022a
            goto L_0x02c3
        L_0x022a:
            r4 = 6516589(0x636f6d, float:9.131686E-39)
            if (r2 == r4) goto L_0x02b9
            r4 = 7828084(0x777274, float:1.0969482E-38)
            if (r2 != r4) goto L_0x0236
            goto L_0x02b9
        L_0x0236:
            r4 = 6578553(0x646179, float:9.218516E-39)
            if (r2 != r4) goto L_0x0245
            java.lang.String r2 = "TDRC"
            com.google.android.gms.internal.ads.zzadl r1 = m41279e(r1, r2, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x0245:
            r4 = 4280916(0x415254, float:5.998841E-39)
            if (r2 != r4) goto L_0x0254
            java.lang.String r2 = "TPE1"
            com.google.android.gms.internal.ads.zzadl r1 = m41279e(r1, r2, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x0254:
            r4 = 7630703(0x746f6f, float:1.0692892E-38)
            if (r2 != r4) goto L_0x0263
            java.lang.String r2 = "TSSE"
            com.google.android.gms.internal.ads.zzadl r1 = m41279e(r1, r2, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x0263:
            r4 = 6384738(0x616c62, float:8.946924E-39)
            if (r2 != r4) goto L_0x0272
            java.lang.String r2 = "TALB"
            com.google.android.gms.internal.ads.zzadl r1 = m41279e(r1, r2, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x0272:
            r4 = 7108978(0x6c7972, float:9.9618E-39)
            if (r2 != r4) goto L_0x0281
            java.lang.String r2 = "USLT"
            com.google.android.gms.internal.ads.zzadl r1 = m41279e(r1, r2, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x0281:
            r4 = 6776174(0x67656e, float:9.495442E-39)
            if (r2 != r4) goto L_0x028e
            com.google.android.gms.internal.ads.zzadl r1 = m41279e(r1, r3, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x028e:
            r3 = 6779504(0x677270, float:9.500109E-39)
            if (r2 != r3) goto L_0x029d
            java.lang.String r2 = "TIT1"
            com.google.android.gms.internal.ads.zzadl r1 = m41279e(r1, r2, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x029d:
            java.lang.String r1 = com.google.android.gms.internal.ads.zzaex.m41222b(r1)     // Catch:{ all -> 0x021b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x021b }
            r2.<init>()     // Catch:{ all -> 0x021b }
            java.lang.String r3 = "Skipped unknown metadata entry: "
            r2.append(r3)     // Catch:{ all -> 0x021b }
            r2.append(r1)     // Catch:{ all -> 0x021b }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x021b }
            com.google.android.gms.internal.ads.zzdw.m48251a(r6, r1)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r7
        L_0x02b9:
            java.lang.String r2 = "TCOM"
            com.google.android.gms.internal.ads.zzadl r1 = m41279e(r1, r2, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x02c3:
            java.lang.String r2 = "TIT2"
            com.google.android.gms.internal.ads.zzadl r1 = m41279e(r1, r2, r12)     // Catch:{ all -> 0x021b }
            r12.mo45230f(r0)
            return r1
        L_0x02cd:
            r12.mo45230f(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafm.m41275a(com.google.android.gms.internal.ads.zzef):com.google.android.gms.internal.ads.zzbp");
    }

    /* renamed from: b */
    private static int m41276b(zzef zzef) {
        zzef.mo45231g(4);
        if (zzef.mo45237m() == 1684108385) {
            zzef.mo45231g(8);
            return zzef.mo45243s();
        }
        zzdw.m48255e("MetadataUtil", "Failed to parse uint8 attribute value");
        return -1;
    }

    @Nullable
    /* renamed from: c */
    private static zzadd m41277c(int i, String str, zzef zzef, boolean z, boolean z2) {
        int b = m41276b(zzef);
        if (z2) {
            b = Math.min(1, b);
        }
        if (b < 0) {
            zzdw.m48255e("MetadataUtil", "Failed to parse uint8 attribute: ".concat(zzaex.m41222b(i)));
            return null;
        } else if (z) {
            return new zzadl(str, (String) null, Integer.toString(b));
        } else {
            return new zzacw("und", str, Integer.toString(b));
        }
    }

    @Nullable
    /* renamed from: d */
    private static zzadl m41278d(int i, String str, zzef zzef) {
        int m = zzef.mo45237m();
        if (zzef.mo45237m() == 1684108385 && m >= 22) {
            zzef.mo45231g(10);
            int w = zzef.mo45247w();
            if (w > 0) {
                StringBuilder sb = new StringBuilder();
                sb.append(w);
                String sb2 = sb.toString();
                int w2 = zzef.mo45247w();
                if (w2 > 0) {
                    sb2 = sb2 + "/" + w2;
                }
                return new zzadl(str, (String) null, sb2);
            }
        }
        zzdw.m48255e("MetadataUtil", "Failed to parse index/count attribute: ".concat(zzaex.m41222b(i)));
        return null;
    }

    @Nullable
    /* renamed from: e */
    private static zzadl m41279e(int i, String str, zzef zzef) {
        int m = zzef.mo45237m();
        if (zzef.mo45237m() == 1684108385) {
            zzef.mo45231g(8);
            return new zzadl(str, (String) null, zzef.mo45221E(m - 16));
        }
        zzdw.m48255e("MetadataUtil", "Failed to parse text attribute: ".concat(zzaex.m41222b(i)));
        return null;
    }
}
