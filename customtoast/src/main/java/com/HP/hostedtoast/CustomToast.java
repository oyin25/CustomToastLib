package com.HP.hostedtoast;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.airbnb.lottie.LottieAnimationView;
import com.HP.hostedtoast.R; // Adjust if your package name is different

public class CustomToast {

    public static void showInfo(Context context, String message) {
        show(context, message, "info.json", 0xFFB2CCD6);
    }

    public static void showSuccess(Context context, String message) {
        show(context, message, "success.json", 0xFFD2F8C2);
    }

    public static void showWarning(Context context, String message) {
        show(context, message, "warning.json", 0xFFFFE0B2);
    }

    private static void show(Context context, String message, String lottieAsset, int backgroundColor) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View customView = inflater.inflate(R.layout.custom_toast, null);

        TextView toastText = customView.findViewById(R.id.toast_text);
        toastText.setText(message);

        LinearLayout linear = customView.findViewById(R.id.toast_linear);
        LottieAnimationView lot = customView.findViewById(R.id.lottie);

        lot.setAnimation(lottieAsset);
        lot.playAnimation();

        GradientDrawable background = new GradientDrawable();
        background.setCornerRadius(20);
        background.setColor(backgroundColor);
        linear.setBackground(background);
        linear.setElevation(8f);

        Toast toast = new Toast(context);
        toast.setGravity(Gravity.TOP, 0, 100);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(customView);
        toast.show();
    }
}