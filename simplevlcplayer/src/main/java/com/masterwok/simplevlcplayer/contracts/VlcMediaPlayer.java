package com.masterwok.simplevlcplayer.contracts;

import android.view.SurfaceView;

import org.videolan.libvlc.IVLCVout;
import org.videolan.libvlc.Media;
import org.videolan.libvlc.RendererItem;

import java.io.FileDescriptor;

public interface VlcMediaPlayer
        extends MediaPlayer {

    IVLCVout getVout();

    void setMedia(FileDescriptor fileDescriptor);

    void attachSurfaces(
            SurfaceView surfaceMedia,
            SurfaceView surfaceSubtitles,
            IVLCVout.OnNewVideoLayoutListener layoutListener
    );

    void detachSurfaces();

    void setRendererItem(RendererItem rendererItem);

    void setVolume(int volume);

    RendererItem getSelectedRendererItem();

    void setAspectRatio(String aspectRatio);

    void setScale(float scale);

    Media.VideoTrack getCurrentVideoTrack();

    Media getMedia();
}
