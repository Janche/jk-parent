package cn.itcast.service.impl;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.dao.BaseDao;
import cn.itcast.domain.ExtCproduct;
import cn.itcast.service.ExtCproductService;
import cn.itcast.util.Page;
@Service
@Transactional
public class ExtCproductServiceImpl implements ExtCproductService {
	@Resource
	private BaseDao baseDao;

	@Override
	public List<ExtCproduct> find(String hql, Class<ExtCproduct> entityClass, Object[] params) {
		// TODO Auto-generated method stub
		return baseDao.find(hql, entityClass, params);
	}

	@Override
	public ExtCproduct get(Class<ExtCproduct> entityClass, Serializable id) {
		// TODO Auto-generated method stub
		return baseDao.get(entityClass, id);
	}

	@Override
	public Page<ExtCproduct> findPage(String hql, Page<ExtCproduct> page, Class<ExtCproduct> entityClass, Object[] params) {
		// TODO Auto-generated method stub
		return baseDao.findPage(hql, page, entityClass, params);
	}

	@Override
	public void saveOrUpdate(ExtCproduct entity) {
		// 新增
		baseDao.saveOrUpdate(entity);
	}

	@Override
	public void saveOrUpdateAll(Collection<ExtCproduct> entitys) {
		// TODO Auto-generated method stub
		baseDao.saveOrUpdateAll(entitys);
	}

	@Override
	public void deleteById(Class<ExtCproduct> entityClass, Serializable id) {
		
		baseDao.deleteById(entityClass, id);	// 删除模块信息
	}

	@Override
	public void delete(Class<ExtCproduct> entityClass, Serializable[] ids) {
		for (Serializable id : ids) {
			this.deleteById(ExtCproduct.class, id);
		}
	}


}
