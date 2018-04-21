package com.tedu.market.service;

import com.tedu.market.dao.GoodsVarArrayDao;
import com.tedu.market.vo.Goods;

public class GetGoods {

	public Goods[] getGoods() {

		GoodsVarArrayDao gvad = new GoodsVarArrayDao();
		return gvad.getGoods();

	}

}
