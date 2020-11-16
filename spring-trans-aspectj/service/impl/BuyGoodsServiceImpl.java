package com.emily.service.impl;

import com.emily.dao.GoodsDao;
import com.emily.dao.SaleDao;
import com.emily.domain.Goods;
import com.emily.domain.Sale;
import com.emily.excep.NotEnoughException;
import com.emily.service.BuyGoodsService;

public class BuyGoodsServiceImpl implements BuyGoodsService {
    private SaleDao saleDao;
    private GoodsDao goodsDao;
    @Override
    public void buy(Integer goodsId, Integer nums) {
        System.out.println("=====buy方法的开始======");
        Sale sale = new Sale();
        sale.setGid(goodsId);
        sale.setNums(nums);
        saleDao.insertSale(sale);

        Goods goods = goodsDao.selectGoods(goodsId);
        if (goods == null){
            throw new NullPointerException("编号是" + goodsId+"，商品不存在");
        }else if (goods.getAmount() < nums){
            throw new NotEnoughException("编号是" + goodsId+"，商品库存不足");
        }
        Goods buyGoods = new Goods();
        buyGoods.setId(goodsId);
        buyGoods.setAmount(nums);
        goodsDao.updateGoods(buyGoods);
        System.out.println("=====buy方法的完成======");
    }

    public SaleDao getSaleDao() {
        return saleDao;
    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public GoodsDao getGoodsDao() {
        return goodsDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
