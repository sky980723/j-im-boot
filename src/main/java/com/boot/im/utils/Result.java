package com.boot.im.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author sky
 * @Date 2023/8/21 14:37
 * @Description TODO
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Result<T> {

	private int code;

	private String message;

	private T data;
}

