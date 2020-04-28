package com.offon.ctrl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("Simulationrequest")
public class Simulationrequest {
	@RequestMapping("HttpTest")
	public String HttpTest() throws IOException{
		
		    String json ="ssss123";
		    InputStream is = null;
	        BufferedReader br = null;
	        String result = null;// 返回结果字符串
		String lj = "http://172.16.115.246:8080/TAreainfo/load";
		URL url = new URL(lj);
		HttpURLConnection  connection = (HttpURLConnection) url.openConnection();
		OutputStreamWriter wr = new OutputStreamWriter(connection.getOutputStream());
		wr.write(json);
		wr.flush();
		connection.setRequestMethod("POST");
		// 设置连接主机服务器的超时时间：15000毫秒
		connection.setConnectTimeout(15000);
        // 设置读取远程返回的数据时间：60000毫秒
		connection.setReadTimeout(60000);
        connection.connect();
		  if (connection.getResponseCode() == 200) {
              is = connection.getInputStream();
              // 封装输入流is，并指定字符集
              br = new BufferedReader(new InputStreamReader(is, "UTF-8"));
              // 存放数据
              StringBuffer sbf = new StringBuffer();
              String temp = null;
              while ((temp = br.readLine()) != null) {
                  sbf.append(temp);
                  sbf.append("\r\n");
              }
              result = sbf.toString();
              br.close();
          }

      return result;
	}

}
