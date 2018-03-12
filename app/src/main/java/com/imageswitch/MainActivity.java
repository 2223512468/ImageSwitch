package com.imageswitch;

import android.app.Activity;
import android.os.Bundle;


/**
 * 项目主Activity。
 * 
 * @author guolin
 * @from http://blog.csdn.net/guolin_blog/article/details/17482089
 */
public class MainActivity extends Activity {

	private Image3DSwitchView imageSwitchView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		imageSwitchView = (Image3DSwitchView) findViewById(R.id.image_switch_view);
		imageSwitchView.setOnImageSwitchListener(new Image3DSwitchView.OnImageSwitchListener() {
			@Override
			public void onImageSwitch(int currentImage) {
				// Log.d("TAG", "current image is " + currentImage);
			}
		});
		imageSwitchView.setCurrentImage(1);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		imageSwitchView.clear();
	}

}
