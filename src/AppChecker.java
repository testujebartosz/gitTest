public class AppChecker {

    public static void main(String[] args) {

        AndroidApp android = new AndroidApp("Cucumber", "v2021-fe", "Europie");

        android.appInfo();
        android.runAndroid();
        android.Availability();

        System.out.println();

        IphoneApp iphone = new IphoneApp("Pomodoro", "v1.21-fe", "US");

        iphone.appInfo();
        iphone.runIphone();
        iphone.Availability();


    }
}
