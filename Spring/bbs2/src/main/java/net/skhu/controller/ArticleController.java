package net.skhu.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import net.skhu.mapper.BoardMapper;
import net.skhu.model.ArticleModel;
import net.skhu.model.Pagination;
import net.skhu.service.ArticleService;

@Controller
@RequestMapping("article")
public class ArticleController {
	@Autowired ArticleService articleService;
	@Autowired BoardMapper boardMapper;
	
	@RequestMapping("list")
	public String list(Pagination pagination, Model model) {
		System.out.println("list");
		model.addAttribute("board", boardMapper.findOne(pagination.getBd()));
		model.addAttribute("list", articleService.findAll(pagination));
		model.addAttribute("orderBy",articleService.getOrderByOptions());
		model.addAttribute("searchBy",articleService.getSearchByOptions());
		return "article/list";
	}
	
	@RequestMapping("view")
	public String view(@RequestParam("id") int id, Pagination pagination, Model model) {
		model.addAttribute("article", articleService.findOne(id));
		model.addAttribute("board", boardMapper.findOne(pagination.getBd()));
		return "article/view";
	}
	
	@RequestMapping(value="edit", method=RequestMethod.GET)
	public String edit(@RequestParam("id") int id, Pagination pagination, Model model) {
		model.addAttribute("board", boardMapper.findOne(pagination.getBd()));
		model.addAttribute("articleModel", articleService.findOne(id));
		return "article/edit";
	}
	
	@Transactional
	@RequestMapping(value="edit", method=RequestMethod.POST)
	public String edit(@Valid ArticleModel a, BindingResult bindingResult, Pagination pagination, Model model) {
		if(bindingResult.hasErrors()) {
			model.addAttribute("board", boardMapper.findOne(pagination.getBd()));
			return "article/edit";
		}
		articleService.update(a);
		return "redirect:view?id="+a.getId()+"&"+pagination.getQueryString();
	}
	
	@RequestMapping(value="create", method=RequestMethod.GET)
	public String create(Pagination pagination, Model model) {
		model.addAttribute("board", boardMapper.findOne(pagination.getBd()));
		model.addAttribute("articleModel", new ArticleModel());
		return "article/edit";
	}
	
	@Transactional
	@RequestMapping(value="create", method=RequestMethod.POST)
	public String create(@Valid ArticleModel a, BindingResult bindingResult, Pagination pagination, Model model) {
		if(bindingResult.hasErrors()) {
			model.addAttribute("board", boardMapper.findOne(pagination.getBd()));
			return "article/edit";
		}
		int id=articleService.insertArticle(a, pagination.getBd(), 1);
		model.addAttribute("board", boardMapper.findOne(pagination.getBd()));
		model.addAttribute("articleModel", a);
		return "redirect:view?id=" + id + "&" + pagination.getQueryString();
	}
	
	@RequestMapping(value="delete", method=RequestMethod.GET)
	public String delete(@RequestParam("id") int id, Pagination pagination, Model model) {
		articleService.delete(id);
		return "redirect:list?"+pagination.getQueryString();
	}

}
