package com.tedu.market.vo;

public class Goods {
//编号，数量，价格，名称
	private int goodsNum;
	private int goodsAmount;
	private double goodsPrice;
	private String goodsName;
	public Goods(int num, int amount, double price, String name) {
		this.goodsNum = num;
		this.goodsAmount = amount;
		this.goodsPrice = price;
		this.goodsName = name;
	}
	public int getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}
	public int getGoodsAmount() {
		return goodsAmount;
	}
	public void setGoodsAmount(int goodsAmount) {
		this.goodsAmount = goodsAmount;
	}
	public double getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	@Override
	public String toString() {
		return "Goods [goodsNum=" + goodsNum + ", goodsAmount=" + goodsAmount + ", goodsPrice=" + goodsPrice
				+ ", goodsName=" + goodsName + "]";
	}
	
}
