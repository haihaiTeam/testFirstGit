package com.thread;

import java.text.ParseException;
import java.util.Date;

import com.haidilao.hicloud.utils.TimeUtil;

public class Test {

	public static void main(String[] args) {
		try {
			System.out.println(TimeUtil.toString(new Date(), "yyyy-MM-dd HH:mm:ss"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}
