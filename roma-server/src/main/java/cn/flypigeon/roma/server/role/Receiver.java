package cn.flypigeon.roma.server.role;

import cn.flypigeon.roma.util.network.SocketAdaptor;

import java.net.Socket;

/**
 * Created by htf on 2020/9/28.
 */
public class Receiver extends SocketAdaptor {

    public Receiver(Socket socket) {
        super(socket);
    }

}
