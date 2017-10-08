package com.cc11001100.sqlinject.demo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author CC11001100
 * @date 2017/10/7 3:07
 * @email CC11001100@qq.com
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDto {

    private Integer code;

    private String message;

    private Object data;

    public static ResponseDto successMessage(String message){
        return new ResponseDto(ConstantRepo.SUCCESS_CODE, message, null);
    }

    public static ResponseDto successData(Object data){
        return new ResponseDto(ConstantRepo.SUCCESS_CODE, null, data);
    }

    public static ResponseDto success(String message, Object data){
        return new ResponseDto(ConstantRepo.SUCCESS_CODE, message, data);
    }

    public static ResponseDto errorMessage(String message){
        return new ResponseDto(ConstantRepo.SUCCESS_CODE, message, null);
    }

    public static ResponseDto errorData(Object data){
        return new ResponseDto(ConstantRepo.SUCCESS_CODE, null, data);
    }

    public static ResponseDto error(String message, Object data){
        return new ResponseDto(ConstantRepo.SUCCESS_CODE, message, data);
    }

    public ResponseDto() {
    }

    public ResponseDto(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
