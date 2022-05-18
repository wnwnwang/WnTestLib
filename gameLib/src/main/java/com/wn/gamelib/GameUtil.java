package com.wn.gamelib;

import android.content.Context;
import android.widget.Toast;

/**
 * Copyright (C), 2015/6/12, 日照安泰科技发展有限公司
 * Author: wangning
 * Date: 2022/5/18
 * Description:
 * <p>
 * </p>
 * History:
 * <author>      <time>      <version>      <desc>
 * 作者姓名       修改时间     版本号         描述
 */
public class GameUtil {

    public static void showGame(Context context) {
        Toast.makeText(context, "game toast", Toast.LENGTH_SHORT).show();
    }
}
