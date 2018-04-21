package com.tedu.market.service;

import com.tedu.market.dao.GoodsVarArrayDao;
import com.tedu.market.view.GoodsManage;

public class LookUpGoods {

	public void lookUpGoods() {

		GoodsVarArrayDao gvad = new GoodsVarArrayDao();
		gvad.lookUp();

		GoodsManage gm = new GoodsManage();
		gm.goodsMenu();
	}

}
