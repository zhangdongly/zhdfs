package com.zd.zhdfs.domain;

/**
 * <p>项目名称：zhdfs</p>
 * <p>包名称：  com.zd.zhdfs.domain</p>
 * <p>类名称：  ZUrl</p>
 * <p>类描述：  资源说明</p>
 * <p>创建人：  wyzhangdong</p>
 * <p>创建日期：2017/4/10 </p>
 * <p>修改人:</p>
 * <p>修改日期</p>
 * <p>修改备注</p>
 * <p>@version V1.0 </p>
 * <p>@author wyzhangdong</p>
 * <p>@see</p>
 */
public class ZUrl {

    private String url;

    /**
     * 网络信息，用于block的区分与选取
     */
    private String netInfo;


    //该资源总的block数
    private int totalBlock;

    //该资源已使用的block数
    private int usedBlock;

}
