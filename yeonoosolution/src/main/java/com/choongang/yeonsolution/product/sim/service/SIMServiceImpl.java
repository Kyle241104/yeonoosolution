package com.choongang.yeonsolution.product.sim.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.choongang.yeonsolution.product.sim.dao.SIMDao;
import com.choongang.yeonsolution.product.sim.domain.StInDto;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SIMServiceImpl implements SIMService {
	private final SIMDao simDao;
	@Override
	public List<StInDto> stInList() {return simDao.findStIn(); }

}
