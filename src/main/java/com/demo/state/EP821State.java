package com.demo.state;
import com.demo.context.Context;

/**
 * 编辑模式状态
 *
 * @author
 *
 */
public class EP821State implements IState {
    /**
     * 状态转换
     */
    public void convertState(Context context, int mode) {
        if (mode == Context.MODE_751) {
            context.changeState(new EV751State());
        }
        if (mode == Context.MODE_682) {
            context.changeState(new EP682State());
        }
    }

    public void poc(Context context) {
        System.out.println("EP821State-POC");
    }

    public void voip(Context context) {
        System.out.println("EP821State-voip");
    }

    public void video(Context context) {
        System.out.println("EP821State-video");
    }

    public void emergency(Context context) {
        System.out.println("EP821State-emergency");
    }

}
