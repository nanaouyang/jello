package com.zzf.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zzf.entity.Favorite;
import com.zzf.service.FavoriteService;
import com.zzf.mapper.FavoriteMapper;
import com.zzf.vo.Labels;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class FavoriteServiceImpl extends ServiceImpl<FavoriteMapper, Favorite>
implements FavoriteService{
    @Autowired
    FavoriteMapper favoriteMapper;
    @Override
    public List<Favorite> selectFavorites() {
        return favoriteMapper.selectFavorites();
    }

    @Override
    public List<Labels> selectTags() {
        return favoriteMapper.selectTags();
    }
}




