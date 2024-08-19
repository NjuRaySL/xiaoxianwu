package com.github.wucoding.forum.service.article.conveter;

import com.github.wucoding.forum.api.model.vo.article.ColumnArticleReq;
import com.github.wucoding.forum.api.model.vo.article.SearchColumnArticleReq;
import com.github.wucoding.forum.service.article.repository.entity.ColumnArticleDO;
import com.github.wucoding.forum.service.article.repository.params.ColumnArticleParams;
import com.github.wucoding.forum.service.article.repository.params.SearchColumnArticleParams;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ColumnArticleStructMapper {
    ColumnArticleStructMapper INSTANCE = Mappers.getMapper( ColumnArticleStructMapper.class );

    SearchColumnArticleParams toSearchParams(SearchColumnArticleReq req);

    ColumnArticleParams toParams(ColumnArticleReq req);

    ColumnArticleDO reqToDO(ColumnArticleReq req);
}
