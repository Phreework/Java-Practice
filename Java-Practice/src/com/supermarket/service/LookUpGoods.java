package com.supermarket.service;

import com.supermarket.data.GoodsDao;

public class LookUpGoods {
	public void lookUpGoods() {
		GoodsDao gd = new GoodsDao();
		gd.lookAllGoods();
	}
}
