package com.zd.zhdfs.server;/**
 * 软件版权：京东金融
 * 系统名称：zhdfs
 * 文件名称：Server
 * 版本变更记录（可选）：修改日期2017/4/10 15:51，修改人wyzhangdong，工单号（手填），
 * 修改描述（手填）
 */

import com.zd.zhdfs.domain.BlockFile;

/**
 * <p>项目名称：zhdfs</p>
 * <p>包名称：  com.zd.zhdfs.server</p>
 * <p>接口名称: Server</p>
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
public interface Server {

    /**
     * 读取文件
     * @param blockId
     * @return
     */
    public BlockFile read(long blockId);


    /**
     * 写文件
     * @param blockFile
     * @return
     */
    public boolean write(BlockFile blockFile) ;


    /**
     * 删除block
     * @param blockId
     * @return
     */
    public boolean removeBlock(long blockId);



    //用于心跳和自检反馈
    public boolean isActive();
}
