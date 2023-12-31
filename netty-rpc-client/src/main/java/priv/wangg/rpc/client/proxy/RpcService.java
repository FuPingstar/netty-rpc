package priv.wangg.rpc.client.proxy;

import priv.wangg.rpc.client.handler.RpcFuture;

public interface RpcService<T, P, FN extends SerializableFunction> {

    RpcFuture call(String funcName, Object... args) throws Exception;

    RpcFuture call(FN fn, Object... args) throws Exception;
}
