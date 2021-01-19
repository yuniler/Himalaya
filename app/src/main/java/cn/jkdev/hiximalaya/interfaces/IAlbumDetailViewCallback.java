package cn.jkdev.hiximalaya.interfaces;

import com.ximalaya.ting.android.opensdk.model.album.Album;
import com.ximalaya.ting.android.opensdk.model.track.Track;

import java.util.List;

public interface IAlbumDetailViewCallback {
    /**
     * 专辑详情内容加载出来了。
     * 更新列表
     */
    void onDetailListLoaded(List<Track> tracks);

    /**
     * 网络错误
     */
    void onNetworkError(int errorCode, String errorMsg);

    /**
     * 把album传给UI使用
     * @param album
     */
    void onAlbumLoaded(Album album);

    /**
     * 加载更多结果
     *  @param size
     */
    void onLoaderMoreFinished(int size);

    /**
     *  下拉加载更多结果
     * @param size size > 0 表示加载成功， 否则加载失败
     */
    void onRefreshFinished(int size);

}
