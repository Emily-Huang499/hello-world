package com.emily.dao;

import com.emily.domain.Goods;

public interface GoodsDao {
    int updateGoods(Goods goods);
    Goods selectGoods(Integer id);
}
