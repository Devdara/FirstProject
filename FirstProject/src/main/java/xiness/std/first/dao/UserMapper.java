package xiness.std.first.dao;

import java.util.List;

import xiness.std.first.vo.UserVO;

public interface UserMapper {

	public List<UserVO> selectAllUser();
	public List<UserVO> selectAdmin(String sName);
	public int insertId(String id);
	
}//