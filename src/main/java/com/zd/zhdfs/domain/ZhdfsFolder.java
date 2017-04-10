package com.zd.zhdfs.domain;

import java.util.List;

/**
 * <p>项目名称：zhdfs</p>
 * <p>包名称：  com.zd.zhdfs.domain</p>
 * <p>类名称：  ZhdfsFolder</p>
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
public class ZhdfsFolder {

    String folderName;

    //当前目录下的文件
    private List<ZhdfsFile> fileList;

    //当前目录下的目录
    private List<ZhdfsFolder>  folderList;
}
