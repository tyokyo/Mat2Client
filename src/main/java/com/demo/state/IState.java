package com.demo.state;
import com.demo.context.Context;
/**
 *
 * 状态接口
 *
 * @author
 *
 */
public interface IState {
    /**
     * 状态转换
     *
     * @param context
     * @param mode
     */
    public void convertState(Context context, int mode);
    /**
     * 保存方法
     *
     * @param context
     */
    public void poc(Context context);
    /**
     * 修改方法
     *
     * @param context
     */
    public void voip(Context context);
    /**
     * 新增方法
     *
     * @param context
     */
    public void video(Context context);
    /**
     * 查看方法
     *
     * @param context
     */
    public void emergency(Context context);
}