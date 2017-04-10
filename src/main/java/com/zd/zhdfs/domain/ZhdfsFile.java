package com.zd.zhdfs.domain;

import java.util.List;

/**
 * <p>项目名称：zhdfs</p>
 * <p>包名称：  com.zd.zhdfs.domain</p>
 * <p>类名称：  ZhdfsFile</p>
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
public class ZhdfsFile {

    private String fileName;

    //文件内容，用多个有序的buffer存存储，
    // 减少copy
    private List<BlockFile> fileBuffer;

    //当前读到第几个文件块了。
    private int currentIndex;

    //当前文件块的位置
    private int indexLoc;

    //总的文件读取位置
    private int allLoc;

    //是否已复制拷贝完成
    private boolean isComplete;

}
