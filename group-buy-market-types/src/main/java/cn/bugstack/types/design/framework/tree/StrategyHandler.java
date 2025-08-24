package cn.bugstack.types.design.framework.tree;

/**
 * @author Pascal
 * @description 受理策略处理
 * T 入参类型
 * D 上下文参数
 * R 返参类型
 * @Create 2025-08-24 1:08
 */
public interface StrategyHandler<T, D, R> {

    StrategyHandler DEFAULT = (T, D) -> null;

    R apply(T requestParameter, D dynamicContext) throws Exception;

}
