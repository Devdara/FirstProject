package xiness.std.first.service;

import java.util.List;

import xiness.std.first.vo.UserVO;

public interface UserService {

	public List<UserVO> selectAllUser();
	public List<UserVO> selectAdmin(String sName);
	public int insertId(String id);
}