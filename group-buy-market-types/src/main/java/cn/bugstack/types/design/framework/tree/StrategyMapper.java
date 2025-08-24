package cn.bugstack.types.design.framework.tree;

/**
 * @author Pascal
 * @Desc   策略映射器
 * @Create 2025-08-24 1:08
 */
public interface StrategyMapper<T, D, R> {

    /**
     * 获取待执行策略
     *
     * @param requestParameter 入参
     * @param dynamicContext   上下文
     * @return 返参
     * @throws Exception 异常
     */
    StrategyHandler<T, D, R> get(T requestParameter, D dynamicContext) throws Exception;

}
