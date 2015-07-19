import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.WindowManager;

import com.readystatesoftware.systembartint.SystemBarTintManager;

/**
 * Created by Wannes2 on 18/07/2015.
 */

/**
 * Static class containing utility functions used across the application
 */
public class AppUtils {

    public static void setTitleBarTint(Activity ac){
        if(android.os.Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT
                && android.os.Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP){

            ac.getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            SystemBarTintManager tintManager = new SystemBarTintManager(ac);
            tintManager.setStatusBarTintEnabled(true);
            tintManager.setNavigationBarTintEnabled(false);
            tintManager.setStatusBarTintDrawable(ac.getResources().getDrawable(R.drawable.kitkat_status_bar));
        }
    }
    
}
