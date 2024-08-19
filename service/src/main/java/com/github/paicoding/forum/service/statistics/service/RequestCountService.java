package com.github.wucoding.forum.service.statistics.service;

import com.github.wucoding.forum.api.model.vo.statistics.dto.StatisticsDayDTO;
import com.github.wucoding.forum.service.statistics.repository.entity.RequestCountDO;

import java.util.List;

/**
 * 微信搜索「小闲屋」，回复 Java
 *
 * @author 小闲屋
 *    5/24/23
 */
public interface RequestCountService {
    RequestCountDO getRequestCount(String host);

    void insert(String host);

    void incrementCount(Long id);

    Long getPvTotalCount();

    List<StatisticsDayDTO> getPvUvDayList(Integer day);
}
