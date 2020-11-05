package com.api.jello.dao;

import com.api.jello.entity.Keep;
import com.api.jello.vo.BillVO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author cc
 */
@Repository
public interface KeepDao extends BaseMapper<Keep> {
    BigDecimal getBalance();

    List<BillVO> getBillTime(@Param("time") String time);

    List<Keep> getOutlay();

    List<Keep> listKeeps();
}
