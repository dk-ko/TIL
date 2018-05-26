package net.skhu.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.skhu.dto.Article;
import net.skhu.mapper.ArticleMapper;
import net.skhu.model.Pagination;
import net.skhu.model.ArticleModel;
import net.skhu.model.Option;

@Service
public class ArticleService {
	@Autowired ArticleMapper articleMapper;
	
	public Article findOne(int id) {
		return articleMapper.findOne(id);
	}

	public List<Article> findAll(Pagination pagination){
		int count = articleMapper.count(pagination);
		pagination.setRecordCount(count);
		return articleMapper.findAll(pagination);
	}
	
	public void update(ArticleModel a) {
		articleMapper.update(a.getId(), a.getTitle(), a.getBody());
	}
	
	public int insertArticle(ArticleModel a, int boardId, int userId) {
		Article last = articleMapper.findTopByBoardIdOrderByNoDesc(boardId);
		int no = (last == null) ? 1: last.getNo() + 1;
		System.out.println(no);
		
		Article article = new Article();
		article.setBoardId(boardId);
		article.setUserId(userId);
		article.setWriteTime(new Date());
		article.setNo(no);
		article.setTitle(a.getTitle());
		article.setBody(a.getBody());
		articleMapper.insert(article);
		System.out.println(article.getId());
		return article.getId();
	}
	
	public void delete(int id) {
		articleMapper.delete(id);
	}
	
	public Option[] getOrderByOptions() {
		return ArticleMapper.orderBy;
	}
	
	public Option[] getSearchByOptions() {
		return ArticleMapper.searchBy;
	}
}
