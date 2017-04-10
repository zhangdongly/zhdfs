package com.zd.zhdfs.domain;

import java.nio.Buffer;
import java.util.List;

/**
 * <p>项目名称：hdfs</p>
 * <p>包名称：  com.zd.zhdfs.domain</p>
 * <p>类名称：  BlockFile</p>
 * <p>类描述：  //类职责详细说明</p>
 * <p>创建人：  wyzhangdong</p>
 * <p>创建日期：2017/4/10 </p>
 * <p>修改人:</p>
 * <p>修改日期</p>
 * <p>修改备注</p>
 * <p>@version V1.0 </p>
 * <p>@author wyzhangdong</p>
 * <p>@see</p>
 */
public class BlockFile {

    //id号
    private long blockId;

    //对应文件流
    private Buffer buffer;

    //block对应的网络资源信息
    private List<ZUrl> urlList;

    public long getBlockId() {
        return blockId;
    }

    public void setBlockId(long blockId) {
        this.blockId = blockId;
    }

    public Buffer getBuffer() {
        return buffer;
    }

    public void setBuffer(Buffer buffer) {
        this.buffer = buffer;
    }

    public List<ZUrl> getUrlList() {
        return urlList;
    }

    public void setUrlList(List<ZUrl> urlList) {
        this.urlList = urlList;
    }

    @Override
    public String toString() {
        return "BlockFile{" +
                "blockId=" + blockId +
                ", buffer=" + buffer +
                ", urlList=" + urlList +
                '}';
    }
}
