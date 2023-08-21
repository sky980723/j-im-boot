package com.boot.im.service.processor.impl;

import com.boot.im.service.processor.IUserService;
import com.boot.im.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @Author sky
 * @Date 2023/8/21 13:58
 * @Description TODO
 */
@Service
@Slf4j
public class UserService implements IUserService {

	@Override
	public Result getUserById(Integer id) {
		log.info("id = {}", id);

		return Result.builder()
				.code(0)
				.message("测试")
				.build();
	}
}

