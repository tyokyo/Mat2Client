package com.demo.context;
import com.demo.state.IState;
/**
 * 上下文环境
 *
 * @author
 *
 */
public class Context {
    // EP820
    public static final int MODE_821 = 821;
    // EP682
    public static final int MODE_682 = 682;
    // EV751
    public static final int MODE_751 = 751;

    // 当前状态
    private IState state;
    // 改变状态
    public void changeState(IState state) {
        this.state = state;
    }
    /**
     * 运行
     *
     * @param mode
     */
    public void doWork(int mode) {
        System.out.println("-----------------");
        this.state.convertState(this, mode);
        this.state.poc(this);
        this.state.emergency(this);
        this.state.voip(this);
        this.state.video(this);
        System.out.println("-----------------");
    }
    public void doWork() {
        System.out.println("-----------------");
        this.state.poc(this);
        this.state.emergency(this);
        this.state.voip(this);
        this.state.video(this);
        System.out.println("-----------------");
    }
}