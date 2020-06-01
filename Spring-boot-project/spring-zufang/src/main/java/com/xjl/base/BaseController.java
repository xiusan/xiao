package com.xjl.base;


import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import lombok.extern.slf4j.Slf4j;

 /**
  *
  * @Author xiaojinlu1990@163.com
  * @Description  基类
  * @Date 2020/5/24 19:29
  * @Param
  * @return
  **/
@Slf4j
public class BaseController {

	/*protected HttpSession getCurrentSession() {
		return getRequest().getSession();
	}

	protected SessionUser getSessionUser() {
		HttpServletRequest httpRequest = getRequest();
		return (SessionUser) 对httpRequest.getSession().getAttribute(ApiConstants.SESSION_USER_KEY);
	}

	protected HttpServletRequest getRequest() {
		return ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest();
	}

	protected String getRemoteIp() {
		HttpServletRequest request = getRequest();
		// 主站 ，请求时，附带IP, 其他各端，则从nginx请求IP
		if (!StringUtils.isEmpty(request.getParameter("clientIP"))) {
			return request.getParameter("clientIP");
		}
		String ip = request.getHeader("x-forwarded-for");
		log.info("获取客户端ip地址为{}",ip);
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getHeader("WL-Proxy-Client-IP");
		}
		if (ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)) {
			ip = request.getRemoteAddr();
		}
		*//*
		 * 对于获取到多ip的情况下，找到公网ip.
		 *//*
		if (null != ip && !ip.contains("unknown") && ip.indexOf(",") > 0) {
			String[] ipsz = ip.split(",");
			*//*
			 * 如果多ip都是内网ip，则取第一个ip.
			 *//*
			ip = ipsz[0].trim();
		}
		if (null != ip && ip.contains("unknown")){
			ip =ip.replaceAll("unknown,", "");
			ip = ip.trim();
		}
		if ("".equals(ip) || null == ip){
			ip = "127.0.0.1";
		}
		log.info("截取后ip地址为{}",ip);
		return ip;
	}
*/
	/** *
	 * 返回值字段为null做转换工具
	 * @author 
	 * @param obj
	 * @date
	 * @return  java.lang.String
	 */
	protected String toJsonString(Object obj) {
		return JSONObject.toJSONString(obj, SerializerFeature.WriteNullStringAsEmpty,

				SerializerFeature.WriteNullBooleanAsFalse, SerializerFeature.WriteNullListAsEmpty,

				SerializerFeature.WriteNullNumberAsZero);
	}

/*	*//** *
	 * 获取token中的请求信息
	 * @author 
	 * @date
	  * @param
	 * @return MobileCommonParam
	 *//*
	protected MobileCommonParam getAppCommonParam() {
		HttpServletRequest request = getRequest();

		String token = request.getHeader("token");
		AssertUtil.assertNotIsEmpty(token,"token不能为空");

		String platform = request.getHeader("platform");
		String deviceType = request.getHeader("deviceType");
		String systemVersion = request.getHeader("systemVersion");
		String tmcVersion = request.getHeader("tmcVersion");
		AssertUtil.assertNotNull(tmcVersion, ApiAssertCode.ILLEGAL_ACCESS,null);
		try {
			platform=new String (platform.getBytes("iso8859-1"),"utf-8");
			deviceType=new String (deviceType.getBytes("iso8859-1"),"utf-8");
			systemVersion=new String (systemVersion.getBytes("iso8859-1"),"utf-8");
		} catch (Exception e){
			LogUtil.encError(log, "获取header参数失败 {}", e);
		}

		try {
			tmcVersion=new String (tmcVersion.getBytes("iso8859-1"),"utf-8");
		} catch (Exception e){
			AssertUtil.assertNotNull(null, ApiAssertCode.ILLEGAL_ACCESS,null);
		}

		//获取缓存数据
		Object obj = RedisUtil.get(ApiConstants.MOBILE_REDIS_TOKEN_KEY+":"+token);
		if (StringUtils.isEmpty(obj)) {
			//throw new ApiException(ApiResultCode.NO_AUTH);
			AssertUtil.assertNull(token, ApiAssertCode.TOKEN_INVALID,null);
			return new MobileCommonParam();
		} else {
			MobileCommonParam cacheCommon = (MobileCommonParam)obj;
			cacheCommon.setPlatform(platform);
			cacheCommon.setDeviceType(deviceType);
			cacheCommon.setSystemVersion(systemVersion);
			cacheCommon.setTmcVersion(tmcVersion);
			return cacheCommon;
		}
	}

	*//** *
	 * 校验token类型，拦截不可预定的类型
	 * @author 
	 * @date
	  * @param
	 * @return void
	 *//*
	protected void checkUserType(){

		MobileCommonParam appCommonParam = this.getAppCommonParam();
		if(!ObjectUtils.isEmpty(appCommonParam)){
			if(null != appCommonParam.getType() && !MobileConstants.token_type.USER.equals(appCommonParam.getType())){
				AssertUtil.assertTrue(false, ApiAssertCode.APPLICATION_NOTNULL, null);
			}
		}
	}*/

}
