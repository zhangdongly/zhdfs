package com.zd.zhdfs.domain;

import java.util.List;

/**
 * <p>项目名称：zhdfs</p>
 * <p>包名称：  com.zd.zhdfs.domain</p>
 * <p>类名称：  ZhdfsContext</p>
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
public class ZhdfsContext {

    //当前目录
    private ZhdfsFolder currentFolder;

    //已删除目录，此目录用于保存已删除的文件，
    //在空间不够的情况下会根据策略进行删除
    private ZhdfsFolder removeFolder;

    //当前hdfs系统所有的client列表
    private List<ZUrl> clientList;


}
