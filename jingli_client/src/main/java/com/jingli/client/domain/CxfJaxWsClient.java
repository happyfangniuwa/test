package com.jingli.client.domain;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.jingli.client.stub.DacOrderStateUpdateRequest;
import com.jingli.client.stub.DacOrderStateUpdateResponse;
import com.jingli.client.stub.DacOrderStateUpdateSrv;


public class CxfJaxWsClient {

	public static void main(String[] args) {
		
		//webservice 22222222222222
		//33333333333333
		
		JaxWsProxyFactoryBean proxyFactory=new JaxWsProxyFactoryBean();
		
		proxyFactory.setAddress("http://localhost:8080/jingli-elutong/services/updateInterface");
		
		proxyFactory.setServiceClass(DacOrderStateUpdateSrv.class);
		
		DacOrderStateUpdateSrv ma=(DacOrderStateUpdateSrv)proxyFactory.create();
		
		DacOrderStateUpdateRequest request = new DacOrderStateUpdateRequest();
		request.setAuthenticator("王涛");
		request.setTimeStamp("小明");
		request.setUserName("小鹏");
		
		DacOrderStateUpdateResponse process = ma.process(request);
		String message = process.getMessage();
		String result = process.getResult();
		System.out.println(message);
		System.out.println(result);

	}

}
