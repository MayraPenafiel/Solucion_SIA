package com.example.subastainversaapp.api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.List;


public class Apis {
    private static HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY);

//    public static Retrofit getInstance() {
//        Retrofit.Builder builder = new Retrofit.Builder().baseUrl("http://192.168.1.116:9090") //revisar y cambiar al ip de tu localhost
//                .addConverterFactory(GsonConverterFactory.create())
//                .client(new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build());
//        return builder.build();
//
//    }

    public static Retrofit getInstance() {
        Retrofit.Builder builder = new Retrofit.Builder().baseUrl("http://"+getIPAddress()+":9090") //revisar y cambiar al ip de tu localhost
                .addConverterFactory(GsonConverterFactory.create())
                .client(new OkHttpClient.Builder().addInterceptor(httpLoggingInterceptor).build());
        return builder.build();

    }
    public static String getIPAddress() {
        try {
            List<NetworkInterface> interfaces = Collections.list(NetworkInterface.getNetworkInterfaces());
            for (NetworkInterface intf : interfaces) {
                List<InetAddress> addrs = Collections.list(intf.getInetAddresses());
                for (InetAddress addr : addrs) {
                    if (!addr.isLoopbackAddress()) {
                        String sAddr = addr.getHostAddress();
                        //boolean isIPv4 = InetAddressUtils.isIPv4Address(sAddr);
                        boolean isIPv4 = sAddr.indexOf(':')<0;
                        if (isIPv4)
                            return sAddr;
                    }
                }
            }
        } catch (Exception ignored) { } // for now eat exceptions
        return "";
    }

}
