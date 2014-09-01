/**
 * 
 */
package com.spg.configcenter.bean;

import java.io.Serializable;
import java.sql.Timestamp;

/**
 * 项目名称：configcenter
 * 
 * @description:
 * 
 * @author Administrator
 * 
 * @create_time：2014年7月15日 下午7:09:22
 * 
 * @version V1.0.0
 * 
 */
public class SessionInfo implements Serializable
{
	/**
	* {变量说明}
	*/
	private static final long serialVersionUID = -3096940172740604230L;

	private Long id;

	private String ip;

	private int port;

	private Timestamp requestTime;

	private UserInfo userInfo;

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getIp()
	{
		return ip;
	}

	public void setIp(String ip)
	{
		this.ip = ip;
	}

	public int getPort()
	{
		return port;
	}

	public void setPort(int port)
	{
		this.port = port;
	}

	public Timestamp getRequestTime()
	{
		return requestTime;
	}

	public void setRequestTime(Timestamp requestTime)
	{
		this.requestTime = requestTime;
	}

	public UserInfo getUserInfo()
	{
		return userInfo;
	}

	public void setUserInfo(UserInfo userInfo)
	{
		this.userInfo = userInfo;
	}

	@Override
	public String toString()
	{
		return "SessionInfo [id=" + id + ", ip=" + ip + ", port=" + port
				+ ", requestTime=" + requestTime + ", userInfo=" + userInfo
				+ "]";
	}

}
