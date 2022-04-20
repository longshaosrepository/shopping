package com.bidding.utils;

import com.bidding.model.ResponseData;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public ResponseData defaultErrorHandler(HttpServletRequest request, Exception e) throws Exception{
        ResponseData responseData = new ResponseData();
        responseData.setMessage(e.getMessage());
        if(e instanceof org.springframework.web.servlet.NoHandlerFoundException){
            responseData.setCode(404);
        }else {
            responseData.setCode(500);
        }
        responseData.setData(null);
        responseData.setStatus(false);
        return responseData;
    }
}
