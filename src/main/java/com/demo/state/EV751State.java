package com.demo.state;
import com.demo.context.Context;

/**
 * 编辑模式状态
 *
 * @author
 *
 */
public class EV751State implements IState {
    /**
     * 状态转换
     */
    public void convertState(Context context, int mode) {
        if (mode == Context.MODE_821) {
            context.changeState(new EP821State());
        }
        if (mode == Context.MODE_682) {
            context.changeState(new EP682State());
        }
    }

    public void poc(Context context) {
        System.out.println("POC");
    }

    public void voip(Context context) {
        System.out.println("voip");
    }

    public void video(Context context) {
        System.out.println("video");
    }

    public void emergency(Context context) {
        System.out.println("emergency");
    }

}
