package cn.wch.ch34xuartdriver;

import android.app.Application;

public class MyApp extends Application {
	public static CH34xUARTDriver driver;// 需要将CH34x的驱动类写在APP类下面，使得帮助类的生命周期与整个应用程序的生命周期是相同的
}
