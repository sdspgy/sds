package com.pgy.sds.common;

import com.pgy.sds.model.ErrorEnum;
import lombok.Data;

/**
 * Author:   taoyuzhu
 * Date:     2019-07-10 10:34
 * Description:
 */
@Data
public class MyException extends RuntimeException{

	private String msg;
	private int code = 500;

	public MyException(){
		super(ErrorEnum.UNKNOWN.getMsg());
		this.msg=ErrorEnum.UNKNOWN.getMsg();
	}


	public MyException(ErrorEnum eEnum,Throwable e){
		super(eEnum.getMsg(),e);
		this.msg=eEnum.getMsg();
		this.code=eEnum.getCode();
	}

	public MyException(ErrorEnum eEnum){
		this.msg=eEnum.getMsg();
		this.code=eEnum.getCode();
	}

	public MyException(String exception){
		this.msg=exception;
	}

}

