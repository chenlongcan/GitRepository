package com.test.demo;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

public class HttpTest {
	
	public static void httpTest() throws ClientProtocolException, IOException {
		List<NameValuePair> params = new ArrayList<NameValuePair>(); 
		params.add(new BasicNameValuePair("key","value"));
		String url = "http://apitest.zaif.org:9080/debtapi/debtShare.do?_t=json";
		HttpPost httpPost = new HttpPost(url);
		httpPost.setEntity(new UrlEncodedFormEntity(params,"utf-8"));
		HttpClient httpClient = new DefaultHttpClient();
		//返回httpResponse
		HttpResponse httpResponse = httpClient.execute(httpPost);
		
		if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
			
		}
		
	}
	
	private static boolean ifFileIsExists(String url) throws IOException{
		 URL fileUrl = new URL(url);
	     HttpURLConnection connection = (HttpURLConnection)fileUrl.openConnection();
	     
	     if (connection.getResponseCode() != HttpURLConnection.HTTP_OK){
	    	System.out.println("ifFileExists(String url)----文件不存在");
	    	 
	    	 return false;
	     }
	     
	     return true;	     
	}
	
	
	public static void main(String[] args) {
		
		try {
//			if(ifFileIsExists("https://file.52touzi.cn/file/show/58ed8a91e4b0facbd7461767")){
//				System.out.println("true");
//			}else{
//				System.out.println("false");
//			}
			System.out.println("sssssssssssssssssssssssssssssssssssssssssssssssss");
			System.out.println("sssssssssssssssssssssssssssssssssssssssssssssssss");
			System.out.println("sssssssssssssssssssssssssssssssssssssssssssssssss");
			
			System.out.println("sssssssssssssssssssssssssssssssssssssssssssssssss");
			System.out.println("sssssssssssssssssssssssssssssssssssssssssssssssss");

			System.out.println("sssssssssssssssssssssssssssssssssssssssssssssssss");

			sfsdf
//			
//			URL fileUrl = new URL("");
//		    HttpURLConnection connection = (HttpURLConnection)fileUrl.openConnection();
//		     
//		    if (connection.getResponseCode() == HttpURLConnection.HTTP_OK){
//		    	System.out.println("true");
//		    	InputStream in = connection.getInputStream();
//		    	OutputStream out = new FileOutputStream("D:"+File.separator+"测试"+File.separator+"test.jpg");
//		    	int content = 0;
//		    	byte[] data = new byte[1024];
//		    	while((content = in.read(data)) != -1){
//		    		out.write(data);
//		    		System.out.println("读取数据。。。。。。");
//		    	}
//		    	System.out.println("读取完毕！！！！！！！！！！！！！！");
//		    	
//		    	in.close();
//		    	out.flush();
//		    	out.close();
//		    	
//		    	
//		    }else{
//		    	System.out.println("false");
//		    }
			
			
			
			
			
			final String url = "https://file.52touzi.cn/file/show/58ed8a91e4b0facbd7461767";
			HttpPost httpPost = new HttpPost(url);
			HttpClient httpClient = new DefaultHttpClient();
			HttpResponse response = httpClient.execute(httpPost);
			response.getEntity().writeTo(new BufferedOutputStream(new FileOutputStream("D:"+File.separator+"测试"+File.separator+"test2.jpg")));
			
		     
		} catch (IOException e) {	
			e.printStackTrace();
			
		}
		
		
		
	}
	
	
	
	
	
}
