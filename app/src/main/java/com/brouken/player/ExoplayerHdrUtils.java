package com.brouken.player;

import androidx.media3.exoplayer.source.MediaSourceFactory;

import com.suyashbelekar.exoplayerhdrutils.exoplayer.source.HdrCompatMediaSourceFactory;
import com.suyashbelekar.exoplayerhdrutils.video.transformers.DoviStrategy;
import com.suyashbelekar.exoplayerhdrutils.video.transformers.Hdr10PlusStrategy;
import com.suyashbelekar.exoplayerhdrutils.video.transformers.TransformStrategy;

public class ExoplayerHdrUtils {
    public static HdrCompatMediaSourceFactory hdrCompatMediaSourceFactory(MediaSourceFactory mediaSourceFactory) {
        return new HdrCompatMediaSourceFactory(mediaSourceFactory, new TransformStrategy(
                DoviStrategy.CONVERT_TO_P8,
                DoviStrategy.CONVERT_TO_P8,
                Hdr10PlusStrategy.DISCARD
        ));
    }
}
