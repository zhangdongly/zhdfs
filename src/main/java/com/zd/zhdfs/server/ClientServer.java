package com.zd.zhdfs.server;

import com.zd.zhdfs.domain.BlockFile;

/**
 * <p>项目名称：zhdfs</p>
 * <p>包名称：  com.zd.zhdfs.domain</p>
 * <p>类名称：  ClientServer</p>
 * <p>类描述：  //hdfs的Client的实现类。
 *          此类只负责简单的文件块的管理和读写</p>
 * <p>创建人：  wyzhangdong</p>
 * <p>创建日期：2017/4/10 </p>
 * <p>修改人:</p>
 * <p>修改日期</p>
 * <p>修改备注</p>
 * <p>@version V1.0 </p>
 * <p>@author wyzhangdong</p>
 * <p>@see</p>
 */
public class ClientServer implements Server {
    public BlockFile read(long blockId) {
        BlockFile blockFile=new BlockFile();
        blockFile.setBlockId(blockId);
        return null;
    }

    public boolean write(BlockFile blockFile) {
        return false;
    }

    public boolean removeBlock(long blockId) {
        return false;
    }

    public boolean isActive() {
        return false;
    }
}
